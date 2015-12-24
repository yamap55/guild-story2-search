package com.yamap55.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yamap55.domain.SkillMaster;

public interface SkillMasterRepository extends JpaRepository<SkillMaster, Integer>{

	@Query("select x from SkillMaster x where x.name = :skillName")
	SkillMaster findBySkillName(@Param("skillName")  String skillName);

	List<SkillMaster> findByNameStartingWith(String skillName);
}
