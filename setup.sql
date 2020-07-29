CREATE database IF NOT EXISTS groceryDB;
use groceryDB;

CREATE TABLE IF NOT EXISTS grocerYDB.user_type(
	id INT AUTO_INCREMENT PRIMARY KEY,
	type VARCHAR(25),
);

CREATE TABLE IF NOT EXISTS groceryDB.user (
	user_id INT AUTO_INCREMENT PRIMARY KEY,
	user_type_id INT,
	fname VARCHAR(50) NOT NULL,
	lname VARCHAR(50) NOT NULL,
	email VARCHAR(120) NOT NULL,
	password VARCHAR(120) NOT NULL,
	phone VARCHAR(20),
	address VARCHAR(120) NOT NULL,
	city VARCHAR(50) NOT NULL,
	country VARCHAR(50) NOT NULL,
	postal_code VARCHAR(50) NOT NULL,
	FORIEGN KEY (user_type_id) REFERENCES user_type(id)
);
