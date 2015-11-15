package com.yamap55.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yamap55.domain.PossessedItem;

public interface PossessedItemsRepository extends JpaRepository<PossessedItem, Integer> {

	@Query("select x from PossessedItem x order by x.id")
	List<PossessedItem> findAllOrderById();
}
