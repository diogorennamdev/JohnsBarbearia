create database if not exists JohnsBarbearia;
use JohnsBarbearia;
create table if not exists usuario(
  CPF_usuario varchar(11) primary key NOT NULL,
  nome_usuario varchar (30),
  email_usuario varchar (30) NOT NULL,
  senha_usuario varchar (90),
  tipo_usuario varchar (15)
  );
create table if not exists Agendamento(
  nome_cliente varchar (20) primary key NOT NULL,
  data_agendamento DATE,
  servico varchar (30),
  valor_servico varchar (20) 
  );
