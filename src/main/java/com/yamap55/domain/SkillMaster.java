package com.yamap55.domain;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "m_skill")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class SkillMaster {

	@Id
	@GeneratedValue
	private int id;

	@Column(nullable = false)
	private String name;

	@Column(name = "skill_type", nullable = false)
	private String skillType;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
		name = "item_skill",
		joinColumns = {
			@JoinColumn(name = "skill_master_id", referencedColumnName = "id")
		},
	    inverseJoinColumns = {
	    	@JoinColumn(name = "item_master_id", referencedColumnName = "id")
		}
	)
	private List<ItemMaster> itemMasters;

	public List<String> getItemNames() {
		return itemMasters.stream().map(emp -> emp.getName()).collect(Collectors.toList());
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
		name = "super_rare_skill",
		joinColumns = {
			@JoinColumn(name = "skill_master_id", referencedColumnName = "id")
		},
	    inverseJoinColumns = {
	    	@JoinColumn(name = "super_rare_id", referencedColumnName = "id")
		}
	)
	private List<SuperRareMaster> superRareMasters;

	public List<String> getSuperRareNames() {
		return superRareMasters.stream().map(emp -> emp.getName()).collect(Collectors.toList());
	}
}