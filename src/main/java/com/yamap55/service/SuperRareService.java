package com.yamap55.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yamap55.domain.SuperRare;
import com.yamap55.repository.SuperRareRepository;

@Service
@Transactional
public class SuperRareService {

	@Autowired
	SuperRareRepository superRareRepository;

	public List<SuperRare> findAll() {
		return superRareRepository.findAll();
	}

}
