package com.yamap55.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yamap55.domain.ItemMaster;
import com.yamap55.domain.PossessedItem;
import com.yamap55.domain.SuperRareMaster;
import com.yamap55.service.ItemMasterService;
import com.yamap55.service.PossessedItemsService;
import com.yamap55.service.SuperRareMasterService;
import com.yamap55.util.Shogo;

@Controller
@RequestMapping("")
public class PossessedItemsController {

	@Autowired
	PossessedItemsService possessedItemsService;

	@Autowired
	SuperRareMasterService superRareMasterService;

	@Autowired
	ItemMasterService itemMasterService;

	@RequestMapping(method = RequestMethod.GET)
	String list(Model model) {
		List<PossessedItem> possessedItems = possessedItemsService.findAll();
		model.addAttribute("possessedItems", possessedItems);

		List<SuperRareMaster> superRares = superRareMasterService.findAll();
		model.addAttribute("superRares", superRares);
		return "list";
	}


	// 新規追加
	@RequestMapping(value = "create", method = RequestMethod.GET)
	String create(Model model) {

		// TODO IDを直指定。
		ItemMaster itemMaster = itemMasterService.findToId(50);
		SuperRareMaster superRareMaster = superRareMasterService.findToId(33);
		PossessedItem possessedItem = new PossessedItem();
		possessedItem.setItemMaster(itemMaster);
		possessedItem.setSuperRareMaster(superRareMaster);
		possessedItem.setShogo(Shogo.KOWARETA);

		possessedItemsService.create(possessedItem);
		return list(model);
	}
}
