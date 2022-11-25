drop database if exists bdsiscofis;
create database bdsiscofis;
use bdsiscofis;

create table usu(
id_Usu  int primary key auto_increment,
nome_Usu varchar (30),
senha_Usu varchar (30),
tipo_Usu varchar (30));

create table item(
id_Item  int primary key auto_increment,
nome_Item varchar (30),
descricao_Item varchar (30),
categoria_Item varchar (30),
especificacao_Item varchar (100));


select * from item;
select * from usu;
INSERT INTO bdsiscofis.usu (nome_Usu, senha_Usu, tipo_Usu) VALUES ('Admin', 'admin','Admin');
INSERT INTO bdsiscofis.usu (nome_Usu, senha_Usu, tipo_Usu) VALUES ('Ivan', '123','Usuario');