package com.yamap55.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yamap55.domain.SuperRare;
import com.yamap55.service.SuperRareService;

@RestController
@RequestMapping("api/super_rare")
public class SuperRaraRestController {

	@Autowired
	SuperRareService superRareService;

	@RequestMapping(method = RequestMethod.GET)
	List<SuperRare> getCustomers() {
		List<SuperRare> superRares = superRareService.findAll();
		return superRares;
	}
}