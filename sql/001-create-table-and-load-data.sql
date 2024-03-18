DROP TABLE IF EXISTS taxi_orders;

CREATE TABLE taxi_orders (
  id int unsigned AUTO_INCREMENT,
  taxi_company_id int NOT NULL,
  car_type_id int NOT NULL,
  staff_section_id int NOT NULL,
  number_of_people int unsigned NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO taxi_orders (taxi_company_id, car_type_id, staff_section_id,number_of_people) VALUES (1, 4, 1, 20);
INSERT INTO taxi_orders (taxi_company_id, car_type_id, staff_section_id,number_of_people) VALUES (1, 1, 4, 4);
INSERT INTO taxi_orders (taxi_company_id, car_type_id, staff_section_id,number_of_people) VALUES (2, 3, 2, 8);
INSERT INTO taxi_orders (taxi_company_id, car_type_id, staff_section_id,number_of_people) VALUES (3, 2, 3, 7);

DROP TABLE IF EXISTS taxi_companies;

CREATE TABLE taxi_companies (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO taxi_companies (name) VALUES ("広島タクシー");
INSERT INTO taxi_companies (name) VALUES ("広島警備");
INSERT INTO taxi_companies (name) VALUES ("広島観光");

DROP TABLE IF EXISTS car_type;

CREATE TABLE car_types (
  id int unsigned AUTO_INCREMENT,
  type VARCHAR(100) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO car_types (type) VALUES ("セダン5人乗り");
INSERT INTO car_types (type) VALUES ("ハコバン8人乗り");
INSERT INTO car_types (type) VALUES ("ハイエース10人乗り");
INSERT INTO car_types (type) VALUES ("中型バス27人乗り");


DROP TABLE IF EXISTS staff_sections;

CREATE TABLE staff_sections (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO staff_sections (name) VALUES ("大道具");
INSERT INTO staff_sections (name) VALUES ("照明");
INSERT INTO staff_sections (name) VALUES ("音響");
INSERT INTO staff_sections (name) VALUES ("特効");