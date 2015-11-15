package com.yamap55.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yamap55.domain.ItemMaster;
import com.yamap55.service.ItemMasterService;

@RestController
@RequestMapping("api/item")
public class ItemRestController {

	@Autowired
	ItemMasterService ItemService;

	@RequestMapping(method = RequestMethod.GET)
	List<ItemMaster> getCustomers() {
		List<ItemMaster> itemMasters = ItemService.findAll();
		return itemMasters;
	}
}
