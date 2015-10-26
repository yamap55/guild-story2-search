package com.yamap55.guild_story2_memo.domain;

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
public class SuperRare {

	@Id
	@GeneratedValue
	private int id;

	@Column(nullable = false)
	private String name;
}
