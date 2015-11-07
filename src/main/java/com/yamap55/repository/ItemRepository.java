package com.yamap55.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yamap55.domain.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

	@Query("select x from Item x order by x.id")
	List<Item> findAllOrderById();
}
