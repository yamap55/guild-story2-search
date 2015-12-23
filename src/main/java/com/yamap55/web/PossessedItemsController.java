package com.yamap55.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yamap55.domain.PossessedItem;
import com.yamap55.domain.SkillMaster;
import com.yamap55.service.ItemMasterService;
import com.yamap55.service.PossessedItemsService;
import com.yamap55.service.SkillMasterService;
import com.yamap55.service.SuperRareMasterService;

@Controller
@RequestMapping("")
public class PossessedItemsController {

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

		List<SkillMaster> skills = skillMasterService.findAll();
		model.addAttribute("skills", skills);

		return "list";
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	String create(@Validated ListForm form, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return list(model);
		}
//		Customer customer = new Customer();
//		BeanUtils.copyProperties(form, customer);
//		customerService.create(customer);
		return "redirect:/";
	}
}
