CREATE DATABASE db_agenda;

USE db_agenda;

CREATE TABLE tb_usuario(
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(40) NOT NULL,
    usuario VARCHAR(10) NOT NULL,
    senha VARCHAR(20) NOT NULL
);

INSERT INTO tb_usuario(nome, usuario, senha) VALUES('Administrador', 'admin', '12345');
INSERT INTO tb_usuario(nome, usuario, senha) VALUES('Convidado', 'convidado', '12345');
INSERT INTO tb_usuario(nome, usuario, senha) VALUES('Estagiário', 'estag', '12345');

SELECT * FROM tb_usuario;

ALTER TABLE tb_usuario ADD COLUMN foto VARCHAR(100);

UPDATE tb_usuario SET foto="images/user1.png" WHERE id=1;
UPDATE tb_usuario SET foto="images/user2.png" WHERE id=2;
UPDATE tb_usuario SET foto="images/user2.png" WHERE id=3;