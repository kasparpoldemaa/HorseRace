-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-04-27 17:47:09.872

-- tables
-- Table: horse
CREATE TABLE horse (
                       id serial  NOT NULL,
                       horse_name varchar(50)  NOT NULL,
                       horse_color varchar(50)  NOT NULL,
                       CONSTRAINT horse_pk PRIMARY KEY (id)
);

-- Table: race
CREATE TABLE race (
                      id serial  NOT NULL,
                      race_date varchar(50)  NOT NULL,
                      race_time varchar(50)  NOT NULL,
                      race_place varchar(50)  NOT NULL,
                      has_result boolean  NOT NULL,
                      CONSTRAINT race_pk PRIMARY KEY (id)
);

-- Table: race_horse
CREATE TABLE race_horse (
                            id serial  NOT NULL,
                            horse_id int  NOT NULL,
                            race_id int  NOT NULL,
                            CONSTRAINT race_horse_pk PRIMARY KEY (id)
);

-- Table: result
CREATE TABLE result (
                        id serial  NOT NULL,
                        race_id int  NOT NULL,
                        horse_id int  NOT NULL,
                        CONSTRAINT result_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: race_horse_horse (table: race_horse)
ALTER TABLE race_horse ADD CONSTRAINT race_horse_horse
    FOREIGN KEY (horse_id)
        REFERENCES horse (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: race_horse_race (table: race_horse)
ALTER TABLE race_horse ADD CONSTRAINT race_horse_race
    FOREIGN KEY (race_id)
        REFERENCES race (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- End of file.

