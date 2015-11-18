package com.yamap55.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.yamap55.domain.ItemMaster;
import com.yamap55.domain.PossessedItem;
import com.yamap55.domain.SuperRareMaster;
import com.yamap55.service.ItemMasterService;
import com.yamap55.service.PossessedItemsService;
import com.yamap55.service.SuperRareMasterService;

@RestController
@RequestMapping("api/possessedItem")
public class PossessedItemRestController {

	@Autowired
	PossessedItemsService possessedItemsService;

	@Autowired
	SuperRareMasterService superRareMasterService;

	@Autowired
	ItemMasterService itemMasterService;

	// 新規追加
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	PossessedItem create(@RequestBody PossessedItem possessedItem) {
		ItemMaster itemMaster = itemMasterService.findToId(possessedItem.getItemMaster().getId());
		SuperRareMaster superRareMaster = superRareMasterService.findToId(possessedItem.getSuperRareMaster().getId());
		possessedItem.setItemMaster(itemMaster);
		possessedItem.setSuperRareMaster(superRareMaster);
		PossessedItem item = possessedItemsService.create(possessedItem);
		return item;
	}
}
