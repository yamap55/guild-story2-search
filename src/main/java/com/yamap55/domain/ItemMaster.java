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
@Table(name = "m_item")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class ItemMaster {

	@Id
	@GeneratedValue
	private int id;

	@Column(nullable = false)
	private String name;

	@Column
	private String pronunciation;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
		name = "item_skill",
		joinColumns = {
			@JoinColumn(name = "item_master_id", referencedColumnName = "id")
		},
	    inverseJoinColumns = {
	    	@JoinColumn(name = "skill_master_id", referencedColumnName = "id")
		}
	)
	private List<SkillMaster> skillMasters;

	public List<String> getSkillNames() {
		return skillMasters.stream().map(emp -> emp.getName()).collect(Collectors.toList());
	}
}
