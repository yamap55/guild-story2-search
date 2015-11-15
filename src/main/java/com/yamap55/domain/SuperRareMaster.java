package com.yamap55.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "m_super_rare")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SuperRareMaster {

	@Id
	@GeneratedValue
	private int id;

	@Column(nullable = false)
	private String name;

	@Column
	private String ability;

	@Column
	private String pronunciation;
}