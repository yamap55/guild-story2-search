package com.yamap55.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.yamap55.util.Shogo;

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

//	@Column(name = "super_rare_id")
//	private int superRareId;

	@Column
    @Enumerated(EnumType.ORDINAL)
    private Shogo shogo;

	@Column
	private String memo;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private ItemMaster itemMaster;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private SuperRareMaster superRareMaster;

	public String getAllName() {
		return superRareMaster.getName() + shogo.getShogoName() +  itemMaster.getName();
	}
}
