CREATE TABLE m_super_rare(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(30), ability VARCHAR(500), pronunciation VARCHAR(30));
CREATE TABLE m_item(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(30), pronunciation VARCHAR(30));
CREATE TABLE super_rare(id INT PRIMARY KEY AUTO_INCREMENT, super_rare_id INT, shogo INT, item_id VARCHAR(30), memo VARCHAR(30));
