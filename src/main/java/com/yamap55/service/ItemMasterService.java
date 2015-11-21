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
	ItemMasterRepository ItemMasterRepository;

	public List<ItemMaster> findAll() {
		return ItemMasterRepository.findAll();
	}

	public ItemMaster findById(int id) {
		return ItemMasterRepository.getOne(id);
	}

	public ItemMaster findByName(String name) {
		return ItemMasterRepository.findByName(name);
	}
}
