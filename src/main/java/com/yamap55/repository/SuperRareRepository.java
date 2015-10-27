package com.yamap55.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yamap55.domain.SuperRare;

public interface SuperRareRepository extends JpaRepository<SuperRare, Integer>{

	@Query("select x from SuperRare x order by x.id")
	List<SuperRare> findAllOrderById();
}
