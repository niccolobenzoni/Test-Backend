create database backenddeveloper;
use backenddeveloper;

create table catalogo(
cod int primary key auto_increment,
nome varchar(50),
prezzo varchar(50)
);

insert into catalogo (nome, prezzo) values 
('birra', '3p 1s 8d'),
('marmellata', '4p 12s 5d'),
('braciola', '7p 17s 6d'),
('succo alla mela', '5p 19s 1d');

