create database if not exists JohnsBarbearia;
use JohnsBarbearia;
create table if not exists usuario(
  CPF_usuario varchar(11) primary key NOT NULL,
  nome_usuario varchar (30),
  senha_usuario varchar (90)
  );
create table if not exists Agendamento(
  nome_cliente varchar (30) primary key NOT NULL,
  servico varchar (90),
  valor_servico varchar (20), 
  data_agendamento varchar (10),
  hora_agendamento varchar (5),
  observacao_agendamento varchar(50) 
  );
