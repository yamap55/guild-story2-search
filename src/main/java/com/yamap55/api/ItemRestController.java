package com.yamap55.api;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yamap55.domain.ItemMaster;
import com.yamap55.service.ItemMasterService;

import lombok.Data;

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

	@RequestMapping(method = RequestMethod.GET, value = "findOne")
	Item getItemById(@RequestParam int id) {
		ItemMaster itemMaster = ItemService.findById(id);
		Item item = new Item();
		BeanUtils.copyProperties(itemMaster, item);

		List<Skill> skills = itemMaster.getSkillMasters().stream().map(skill -> new Skill(skill.getId(), skill.getName())).collect(Collectors.toList());
		item.setSkills(skills);
		return item;
	}

	@RequestMapping(method = RequestMethod.POST, value = "existsByName")
	boolean existsByName(@RequestBody String name) {
		ItemMaster master = ItemService.findByName(name);
		return master != null;
	}

	@Data
	class Item {
		private int id;

		private String name;

		private String pronunciation;

		private String type;

		private String typeInfo;

		private String dropLocation;

		private int price;

		private int attack;

		private int dexterity;

		private int defense;

		private int evasion;

		private int magicAttack;

		private int magicDefense;

		private double critical;

		private double attackCount;

		private int maxHp;

		private int trapRelease;

		private int magicRecovery;

		private List<Skill> skills;
	}

	@Data
	class Skill {
		Skill() {}

		Skill(int id, String name) {
			this.id = id;
			this.name = name;
		}
		private int id;

		private String name;
	}
}
