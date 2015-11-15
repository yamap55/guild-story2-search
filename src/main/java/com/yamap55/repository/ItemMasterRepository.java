package com.yamap55.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yamap55.domain.ItemMaster;

public interface ItemMasterRepository extends JpaRepository<ItemMaster, Integer>{

	@Query("select x from ItemMaster x order by x.id")
	List<ItemMaster> findAllOrderById();
}
