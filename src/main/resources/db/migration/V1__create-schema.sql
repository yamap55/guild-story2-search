CREATE TABLE m_super_rare(id INT PRIMARY KEY, name VARCHAR(50), pronunciation VARCHAR(50));
CREATE TABLE m_item(id INT PRIMARY KEY, name VARCHAR(50), pronunciation VARCHAR(50));
CREATE TABLE items(id INT PRIMARY KEY AUTO_INCREMENT, super_rare_master_id INT, shogo INT, item_master_id INT, memo VARCHAR(50));
CREATE TABLE m_skill(id INT PRIMARY KEY, name VARCHAR(50), skill_type VARCHAR(50));
CREATE TABLE item_skill(id INT PRIMARY KEY AUTO_INCREMENT, item_master_id INT, skill_master_id INT);
CREATE TABLE super_rare_skill(id INT PRIMARY KEY AUTO_INCREMENT, super_rare_id INT, skill_master_id INT);
