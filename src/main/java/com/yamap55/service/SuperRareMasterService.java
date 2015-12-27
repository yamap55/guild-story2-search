package com.yamap55.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yamap55.domain.SuperRareMaster;
import com.yamap55.repository.SuperRareMasterRepository;

@Service
@Transactional
public class SuperRareMasterService {

	@Autowired
	SuperRareMasterRepository superRareMasterRepository;

	public List<SuperRareMaster> findAll() {
		return superRareMasterRepository.findAll();
	}

	public SuperRareMaster findById(int id) {
		return superRareMasterRepository.getOne(id);
	}

	public SuperRareMaster findByName(String name) {
		return superRareMasterRepository.findByName(name);
	}
	public List<SuperRareMaster> findByNameContains(String name) {
		return superRareMasterRepository.findByNameContains(name);
	}
}
