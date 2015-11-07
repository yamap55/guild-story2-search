package com.yamap55.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yamap55.domain.Item;
import com.yamap55.repository.ItemRepository;

@Service
@Transactional
public class ItemService {

	@Autowired
	ItemRepository ItemRepository;

	public List<Item> findAll() {
		return ItemRepository.findAll();
	}

}
