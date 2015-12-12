package com.yamap55.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "item_skill")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemSkill {

	@Id
	@GeneratedValue
	private int id;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private ItemMaster itemMaster;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private SkillMaster skillMaster;
}
