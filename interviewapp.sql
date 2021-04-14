DROP DATABASE IF EXISTS `interviewapp`;
CREATE DATABASE  `interviewapp`
DEFAULT CHARACTER SET utf8;
USE `interviewapp`;

CREATE TABLE `interviewapp`.users(
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(30) NOT NULL,
email VARCHAR(30) NOT NULL,
company VARCHAR(20) NOT NULL
);

-- select * from users;

INSERT INTO users (name,email,company) VALUES ('Alan','alan1@gmail.com','Siemens'),
										  ('Corey','corey1@gmail.com','Repath'),
                                          ('Miller','miller1@gmail.com','Repath'),
                                          ('Evenant','evenant1@gmail.com','IBM'),
                                          ('Person','person1@gmail.com','Valve');