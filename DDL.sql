drop schema if exists spring;
drop user if exists 'user'@'localhost';
create schema spring;
create user 'user'@'localhost' identified by 'pass123';
grant select, insert, delete, update on spring.* to user@'localhost';
use spring;

create table log (
    id bigint unsigned not null auto_increment,
    data_entrada datetime not null,
    data_saida datetime not null,
    primary key (id)
);

insert into log (data_entrada, data_saida)
values ('2023-08-01 19:10', '2023-08-01 20:30');
