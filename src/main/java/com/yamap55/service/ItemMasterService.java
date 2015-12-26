package com.yamap55.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yamap55.domain.ItemMaster;
import com.yamap55.repository.ItemMasterRepository;

@Service
@Transactional
public class ItemMasterService {

	@Autowired
	ItemMasterRepository itemMasterRepository;

	public List<ItemMaster> findAll() {
		return itemMasterRepository.findAll();
	}

	public ItemMaster findById(int id) {
		return itemMasterRepository.getOne(id);
	}

	public ItemMaster findByName(String name) {
		return itemMasterRepository.findByName(name);
	}

	public List<ItemMaster> findByNameContains(String name) {
		return itemMasterRepository.findByNameContains(name);
	}
}
