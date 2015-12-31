package com.yamap55.web;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yamap55.domain.ItemMaster;
import com.yamap55.domain.PossessedItem;
import com.yamap55.domain.SkillMaster;
import com.yamap55.domain.SuperRareMaster;
import com.yamap55.service.ItemMasterService;
import com.yamap55.service.PossessedItemsService;
import com.yamap55.service.SkillMasterService;
import com.yamap55.service.SuperRareMasterService;

@Controller
@RequestMapping("")
public class ListSearchController {

	@ModelAttribute
	ListForm setUpForm() {
		return new ListForm();
	}

	@Autowired
	PossessedItemsService possessedItemsService;

	@Autowired
	SuperRareMasterService superRareMasterService;

	@Autowired
	ItemMasterService itemMasterService;

	@Autowired
	SkillMasterService skillMasterService;

	@RequestMapping(method = RequestMethod.GET)
	String list(Model model) {
		List<PossessedItem> possessedItems = possessedItemsService.findAll();
		model.addAttribute("possessedItems", possessedItems);

		return "list";
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	String search(ListForm form, BindingResult result, Model model) {

		if (form.getSearchType() == null || form.getSearchKey() == null) {
			return "list";
		} else switch (form.getSearchType()) {
		case "1":
			List<ItemMaster> items = itemMasterService.findByNameContains(form.getSearchKey());
			model.addAttribute("infos", items);
			break;
		case "2":
			List<SuperRareMaster> SuperRares = superRareMasterService.findByNameContains(form.getSearchKey());
			model.addAttribute("infos", SuperRares);
			break;
		case "3":
			List<SkillMaster> skills = skillMasterService.findByNameContains(form.getSearchKey());
			model.addAttribute("skills", skills);
			break;
		default :
			model.addAttribute("skills", Collections.EMPTY_LIST);
			break;
		}
		return "list";
	}
}
