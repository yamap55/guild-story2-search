package com.yamap55.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yamap55.domain.PossessedItem;
import com.yamap55.repository.PossessedItemsRepository;

@Service
@Transactional
public class PossessedItemsService {

	@Autowired
	PossessedItemsRepository PossessedItemsRepository;

	public List<PossessedItem> findAll() {
		return PossessedItemsRepository.findAll();
	}

}
