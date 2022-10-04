create database if not exists JohnsBarbearia;
use JohnsBarbearia;
create table if not exists usuario(
  id_usuario int auto_increment primary key,
  email_usuario varchar (30) ,
  senha_usuario varchar (15),
  nome_usuario varchar (30),
  tipo_usuario varchar (15)
  );
create table if not exists Agendamento(
	nome_cliente varchar (20) NOT NULL, 
  	data_agendamento DATE,
  	servico varchar (30),
      valor_servico varchar (20) 
);




