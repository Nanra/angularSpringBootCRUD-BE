create table customer (
id bigint(20) not null primary key,
active bit(1) null,
age int(11) null,
name varchar(255) null) engine = InnoDB;