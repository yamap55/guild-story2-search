package com.yamap55.web;

import java.util.List;

import com.yamap55.domain.ItemMaster;
import com.yamap55.domain.SkillMaster;
import com.yamap55.domain.SuperRareMaster;

import lombok.Data;

@Data
public class ListForm {
	private String searchKey;
	private String searchType = "3";
	private List<ItemMaster> items;
	private List<SuperRareMaster> superRares;
	private List<SkillMaster> skills;
}
