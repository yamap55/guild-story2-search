package com.yamap55.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yamap55.domain.SuperRareMaster;

public interface SuperRareMasterRepository extends JpaRepository<SuperRareMaster, Integer>{

	@Query("select x from SuperRareMaster x order by x.id")
	List<SuperRareMaster> findAllOrderById();
}
