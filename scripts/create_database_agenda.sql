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

CREATE TABLE tb_tipousuario(
	id INT PRIMARY KEY AUTO_INCREMENT,
    descricao VARCHAR(20) NOT NULL
);

INSERT INTO tb_tipousuario(descricao) VALUES('Administrador');
INSERT INTO tb_tipousuario(descricao) VALUES('Convidado');
INSERT INTO tb_tipousuario(descricao) VALUES('Usuario');

ALTER TABLE tb_usuario ADD COLUMN id_tipousuario INT;

UPDATE tb_usuario SET id_tipousuario = 1 WHERE id = 1;
UPDATE tb_usuario SET id_tipousuario = 2 WHERE id = 4;

ALTER TABLE tb_usuario ADD CONSTRAINT fk_tipousuario FOREIGN KEY(id_tipousuario) REFERENCES tb_tipousuario(id);
