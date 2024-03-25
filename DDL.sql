drop schema if exists spring;
drop user if exists 'user'@'localhost';

create schema spring;
create user 'user'@'localhost' identified by 'pass123';
grant select, insert, delete, update on spring.* to user@'localhost';
use spring;

create table log (
    id bigint unsigned not null auto_increment,
    entrada_saida boolean not null,
    data_registro datetime not null,
    primary key (id)
);

insert into log (entrada_saida, data_registro)
values (1, '2023-08-01 19:10'), -- Entrada
       (0, '2023-08-01 20:30'); -- Saída
