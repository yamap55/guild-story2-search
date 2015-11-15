CREATE TABLE m_super_rare(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(30), ability VARCHAR(500), pronunciation VARCHAR(30));
CREATE TABLE m_item(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(30), pronunciation VARCHAR(30));
CREATE TABLE items(id INT PRIMARY KEY AUTO_INCREMENT, super_rare_master_id INT, shogo INT, item_master_id INT, memo VARCHAR(30));
