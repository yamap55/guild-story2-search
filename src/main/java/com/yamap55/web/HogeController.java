package com.yamap55.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yamap55.service.SuperRareService;

@Controller
@RequestMapping("m_super_rare")
public class HogeController {

	@Autowired
	SuperRareService superRareService;

}
