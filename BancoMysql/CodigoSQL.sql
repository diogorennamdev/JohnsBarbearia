create database if not exists JohnsBarbearia;
use JohnsBarbearia;
create table if not exists usuario(
	CPF_usuario varchar(11) NOT NULL,
	nome_usuario varchar (30),
	senha_usuario varchar (90),
	PRIMARY KEY (CPF_usuario)
  );
create table if not exists Agendamento(
	ID_agendamento int NOT NULL AUTO_INCREMENT,
	nome_cliente varchar (30),
	servico varchar (90),
	valor_servico varchar (20),
	data_agendamento varchar (10),
	hora_agendamento varchar (5),
	observacao_agendamento varchar(50),
	PRIMARY KEY (ID_agendamento)
  );
