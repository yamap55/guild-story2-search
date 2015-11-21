package com.yamap55.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yamap55.domain.ItemMaster;

public interface ItemMasterRepository extends JpaRepository<ItemMaster, Integer>{

	@Query("select x from ItemMaster x where x.name = :name")
	ItemMaster findByName(@Param("name")  String name);
}
