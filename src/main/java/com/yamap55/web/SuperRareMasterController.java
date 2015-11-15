package com.yamap55.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yamap55.domain.SuperRareMaster;
import com.yamap55.service.SuperRareMasterService;

@Controller
@RequestMapping("")
public class SuperRareMasterController {

	@Autowired
	SuperRareMasterService superRareMasterService;

	@RequestMapping(method = RequestMethod.GET)
	String list(Model model) {
		List<SuperRareMaster> superRares = superRareMasterService.findAll();
		model.addAttribute("superRares", superRares);
		return "list";
	}

}
