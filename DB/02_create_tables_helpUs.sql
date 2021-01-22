-- UTF8
SET NAMES utf8;
-- To use database HELPUS
USE helpus
-- Create TABLES

CREATE TABLE Customer (
    
     id INT UNSIGNED NOT NULL AUTO_INCREMENT,
     login VARCHAR(100) NOT NULL,  
     creation_date DATETIME NOT NULL,
     email VARCHAR(100) NOT NULL,
     job VARCHAR(100),
	ville VARCHAR(100),
     PRIMARY KEY(id)
 
)ENGINE=INNODB;


CREATE TABLE Category(
    
     --id INT UNSIGNED NOT NULL AUTO_INCREMENT,
     code VARCHAR(5) NOT NULL,  
     creation_date DATETIME,
     label VARCHAR(100) NOT NULL,
     PRIMARY KEY(code)

)ENGINE=INNODB;

CREATE TABLE Service (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    code CHAR (5) NOT NULL,
    label VARCHAR(160) Not NULL,
    category_code VARCHAR(5) NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_category_code FOREIGN KEY (category_code) REFERENCES Category(code) -- Foregn KEY Category ID

)ENGINE=INNODB;



-- Tables associations Service Customer
CREATE TABLE Propose_service_customer (
      
      customer_id INT UNSIGNED NOT NULL,
      service_id INT UNSIGNED NOT NULL,
      creation_date DATETIME NOT NULL,
      PRIMARY KEY(customer_id , service_id ),
      CONSTRAINT fk_customer_id FOREIGN KEY (customer_id) REFERENCES Customer(id), 
      CONSTRAINT fk_service_id FOREIGN KEY (service_id) REFERENCES Service(id) 
      
)ENGINE=INNODB;

CREATE TABLE Requeste_service_customer (
    
      id_customer INT UNSIGNED NOT NULL,
      id_service INT UNSIGNED NOT NULL,
      creation_date DATETIME NOT NULL,
      PRIMARY KEY(id_customer , id_service ),
      CONSTRAINT fk_id_customer FOREIGN KEY (id_customer) REFERENCES Customer(id),
      CONSTRAINT fk_id_service FOREIGN KEY (id_service) REFERENCES Service(id)
      
)ENGINE=INNODB;
