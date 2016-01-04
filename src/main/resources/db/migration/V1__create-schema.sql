CREATE TABLE m_super_rare(id INT PRIMARY KEY, name VARCHAR(50), pronunciation VARCHAR(50));
CREATE TABLE m_item(id INT PRIMARY KEY, name VARCHAR(50), type_name VARCHAR(50), type_info VARCHAR(50), drop_location VARCHAR(50), price INT DEFAULT 0,attack INT DEFAULT 0,dexterity INT DEFAULT 0,defense INT DEFAULT 0,evasion INT DEFAULT 0,magic_attack INT DEFAULT 0,magic_defense INT DEFAULT 0,critical DOUBLE DEFAULT 0,attack_count DOUBLE DEFAULT 0,max_hp INT DEFAULT 0,trap_release INT DEFAULT 0,magic_recovery INT DEFAULT 0,pronunciation VARCHAR(50));
CREATE TABLE items(id INT PRIMARY KEY AUTO_INCREMENT, super_rare_master_id INT, shogo INT, item_master_id INT, memo VARCHAR(50));
CREATE TABLE m_skill(id INT PRIMARY KEY, name VARCHAR(50), skill_type VARCHAR(50));
CREATE TABLE item_skill(id INT PRIMARY KEY AUTO_INCREMENT, item_master_id INT, skill_master_id INT);
CREATE TABLE super_rare_skill(id INT PRIMARY KEY AUTO_INCREMENT, super_rare_id INT, skill_master_id INT);
