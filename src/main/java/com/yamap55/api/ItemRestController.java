package com.yamap55.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yamap55.domain.Item;
import com.yamap55.service.ItemService;

@RestController
@RequestMapping("api/item")
public class ItemRestController {

	@Autowired
	ItemService ItemService;

	@RequestMapping(method = RequestMethod.GET)
	List<Item> getCustomers() {
		List<Item> items = ItemService.findAll();
		return items;
	}
}
