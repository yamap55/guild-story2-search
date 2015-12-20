package com.yamap55.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yamap55.domain.SkillMaster;
import com.yamap55.repository.SkillMasterRepository;

@Service
@Transactional
public class SkillMasterService {

	@Autowired
	SkillMasterRepository skillMasterRepository;

	public SkillMaster findByName(String name) {
		return skillMasterRepository.findBySkillName(name);
	}

	public List<SkillMaster> findAll() {
		return skillMasterRepository.findAll();
	}
}
