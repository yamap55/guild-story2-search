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
@Table(name = "items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PossessedItem {

	@Id
	@GeneratedValue
	private int id;

	@Column(name = "super_rare_id")
	private int superRareId;

	@Column
	private int shogo;

	@Column(name = "item_id")
	private String itemId;

	@Column
	private String memo;

	private Item item;

	private SuperRare superRare;
}
