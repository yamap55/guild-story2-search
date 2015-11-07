package com.yamap55.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yamap55.domain.SuperRare;
import com.yamap55.service.SuperRareService;

@Controller
@RequestMapping("")
public class SuperRareController {

	@Autowired
	SuperRareService superRareService;

	@RequestMapping(method = RequestMethod.GET)
	String list(Model model) {
		List<SuperRare> superRares = superRareService.findAll();
		model.addAttribute("superRares", superRares);
		return "list";
	}

}
