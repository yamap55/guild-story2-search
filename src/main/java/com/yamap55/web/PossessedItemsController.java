package com.yamap55.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yamap55.domain.PossessedItem;
import com.yamap55.service.PossessedItemsService;

@Controller
@RequestMapping("aa")
public class PossessedItemsController {

	@Autowired
	PossessedItemsService possessedItemsService;

	@RequestMapping(method = RequestMethod.GET)
	String list(Model model) {
		List<PossessedItem> possessedItems = possessedItemsService.findAll();
		model.addAttribute("possessedItems", possessedItems);
		return "list";
	}
}
