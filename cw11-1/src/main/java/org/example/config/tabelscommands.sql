CREATE DATABASE cw11;


CREATE TABLE user_table
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(50) NOT NULL,
    username    VARCHAR(50) NOT NULL UNIQUE ,
    password    VARCHAR(50) NOT NULL
);


CREATE TABLE admin_table
(
    id            serial primary key,
    username      varchar(50) not null unique ,
    password      varchar(50) not null
);


CREATE TABLE fruit_table
(
    id            SERIAL PRIMARY KEY,
    name          VARCHAR(50) NOT NULL,
    description   VARCHAR(150) NOT NULL,
    existence     BOOLEAN NOT NULL,
    inventory     INT    NOT NULL,
    price         INT    NOT NULL
);


CREATE TABLE order_table
(
    id           SERIAL PRIMARY KEY,
    user_id      int references user_table (id) not null ,
    fruit_id     int references fruit_table (id) not null ,
    status       varchar(50) not null,
    amount       int not null
);
