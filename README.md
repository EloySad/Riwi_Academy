Se adjunta SQL de creacion de base de datos

CREATE DATABASE IF NOT EXISTS RiwiAcademyDB;

CREATE TABLE IF NOT EXISTS courses (
`id` INT PRIMARY KEY AUTO_INCREMENT NOT NULL UNIQUE,
`name` VARCHAR (100) UNIQUE,
`students_quantity` INT
);

CREATE TABLE IF NOT EXISTS students (
`id` INT PRIMARY KEY AUTO_INCREMENT NOT NULL UNIQUE,
`document_id` INT UNIQUE NOT NULL,
`name` VARCHAR (100),
`last_name` VARCHAR (100),
`email` VARCHAR (100) UNIQUE,
`fk_courses` INT,
`status` VARCHAR (15),
FOREIGN KEY (fk_courses) REFERENCES courses(id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS registrations (
`id` INT PRIMARY KEY AUTO_INCREMENT NOT NULL UNIQUE,
`students` INT ,
`email_students` VARCHAR (100),
`courses` INT,
FOREIGN KEY (students) REFERENCES students(id) ON DELETE CASCADE,
FOREIGN KEY (courses) REFERENCES students(fk_courses),
FOREIGN KEY (email_students) REFERENCES students(email)
);

CREATE TABLE IF NOT EXISTS grades (
`id` INT PRIMARY KEY AUTO_INCREMENT NOT NULL UNIQUE,
`students` INT,
`courses` INT,
`grades` DOUBLE NOT NULL,
`description` TEXT,
FOREIGN KEY (students) REFERENCES students(id),
FOREIGN KEY (courses) REFERENCES courses(id)
);