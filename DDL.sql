drop schema if exists spring;
drop user if exists 'user'@'localhost';
create schema spring;
create user 'user'@'localhost' identified by 'pass123';
grant select, insert, delete, update on spring.* to user@'localhost';
use spring;

create table log (
    log_id bigint unsigned not null auto_increment,
    dataEntrada datetime not null,
    dataSaida datetime not null,
    primary key (log_id)
);

insert into log (dataEntrada, dataSaida)
values ('2023-08-01 19:10', '2023-08-01 20:30');
