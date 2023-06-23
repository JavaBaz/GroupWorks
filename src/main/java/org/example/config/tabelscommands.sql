create table user_table
(
    id          serial primary key,
    name        varchar(50) not null,
    username    varchar(50) not null unique ,
    password    varchar(50) not null
);
create table admin_table
(
    id          serial primary key,
    username    varchar(50) not null unique ,
    password    varchar(50) not null
);
create table fruit_table
(
    id         serial primary key,
    name       varchar(50) not null,
    description varchar(150) not null,
    existence  boolean not null,
    inventory  int    not null,
    price      int    not null
);
create table order_table
(
    id     serial primary key,
    user_id int references user_table (id) not null ,
    fruit_id int references fruit_table (id) not null ,
    status varchar(50) not null,
    amount int not null
);
