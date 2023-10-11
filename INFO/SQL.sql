CREATE DATABASE demo_db;



CREATE TABLE  IF NOT EXISTS clients (
id INTEGER NOT NULL AUTO_INCREMENT,
first_name VARCHAR (128) NOT NULL,
last_name VARCHAR (128) NOT NULL,
phone VARCHAR (128) NOT NULL,
PRIMARY KEY (id)


INSERT INTO clients (first_name,last_name,phone) VALUES ('Ta','Lin','0667894556')
INSERT INTO clients (first_name,last_name,phone) VALUES ('Mike','Tomson','0667894556')
INSERT INTO clients (first_name,last_name,phone) VALUES ('Tyson','Fury','0667894556')
INSERT INTO clients (first_name,last_name,phone) VALUES ('Nate','Roby','0667894556')
INSERT INTO clients (first_name,last_name,phone) VALUES ('Dwyane','Wade','0667894556')
);