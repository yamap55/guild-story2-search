package com.yamap55.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yamap55.domain.SuperRareMaster;
import com.yamap55.service.SuperRareMasterService;

@RestController
@RequestMapping("api/super_rare")
public class SuperRaraRestController {

	@Autowired
	SuperRareMasterService superRareService;

	@RequestMapping(method = RequestMethod.GET)
	List<SuperRareMaster> getCustomers() {
		List<SuperRareMaster> superRareMasters = superRareService.findAll();
		return superRareMasters;
	}

	@RequestMapping(method = RequestMethod.POST, value = "existsByName")
	boolean existsByName(@RequestBody String name) {
		SuperRareMaster master = superRareService.findByName(name);
		return master != null;
	}
}