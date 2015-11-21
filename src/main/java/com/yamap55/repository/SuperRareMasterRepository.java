package com.yamap55.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yamap55.domain.SuperRareMaster;

public interface SuperRareMasterRepository extends JpaRepository<SuperRareMaster, Integer>{

	@Query("select x from SuperRareMaster x where x.name = :name")
	SuperRareMaster findByName(@Param("name")  String name);
}
