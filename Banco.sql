Create Database Biblioteca;

use Biblioteca;
create table Cliente(
idCliente int not null auto_increment primary key,
nomeCliente varchar(100),
telefoneCliente varchar(30),
emailCliente varchar(20), 
enderecoCliente varchar(50),
cpfCliente varchar(50),
sexo varchar(10),
dt_nascimentoCliente varchar(10)
);

create table Livro(
idLivro int not null auto_increment primary key,
nomeLivro varchar(100),
autorLivro varchar(50),
editoraLivro varchar(100),
exemplarLivro varchar(50),
edicaoLivro varchar(30),
anoLivro varchar(4)
);

create table emprestimo(
idEmprestimo int not null auto_increment primary key,
idCliente int,
idLivro int,
dtEmprestimo varchar(4),
dtDevolucao varchar(4),
KEY `idCliente` (`idCliente`),
  CONSTRAINT `Cliente_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `Cliente` (`idCliente`),
  KEY `idLivro` (`idLivro`),
  CONSTRAINT `Livro_ibfk_1` FOREIGN KEY (`idLivro`) REFERENCES `Livro` (`idLivro`)
);

create table Multa(
idMulta int not null auto_increment primary key,
idCliente int,
descricao varchar(80),
valorMulta double,
KEY `idCliente` (`idCliente`),
  CONSTRAINT `Cliente_ibfk_Multa` FOREIGN KEY (`idCliente`) REFERENCES `Cliente` (`idCliente`)
);

create table Usuario(
idUsuario int not null auto_increment primary key,
nomeUsuario varchar(50),
loginUsuario varchar(30),
senhaUsuario varchar(50)
);



