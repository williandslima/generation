CREATE DATABASE db_curso_da_minha_vida;

USE db_curso_da_minha_vida;

CREATE TABLE tb_categorias(
id bigint AUTO_INCREMENT,
nome varchar (255) NOT NULL,
descricao varchar(255),
PRIMARY KEY (id)
);

CREATE TABLE tb_cursos(
id bigint AUTO_INCREMENT,
nome varchar(255) NOT NULL,
preco DECIMAL (8,2),
duracao INT,
PRIMARY KEY (id),
categoria_id bigint, 
FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id)
);


INSERT INTO tb_categorias (nome, descricao)
VALUES ("Creche", "Educacao infantil ");

INSERT INTO tb_categorias (nome, descricao)
VALUES ("Pre-Escola", "Educacao infantil ");

INSERT INTO tb_categorias (nome, descricao)
VALUES ("Ensino Fundamental", "Ensino basico");

INSERT INTO tb_categorias (nome, descricao)
VALUES ("Ensino medio", "Ensino basico");

INSERT INTO tb_categorias (nome, descricao)
VALUES ("Ensino superior", "Ensino superior");

INSERT INTO tb_cursos (nome, preco, duracao, categoria_id)
VALUES ("Recreacao", 300, 2, 1);

INSERT INTO tb_cursos (nome, preco, duracao, categoria_id)
VALUES ("ABC Inicial", 450, 2, 2);

INSERT INTO tb_cursos (nome, preco, duracao, categoria_id)
VALUES ("Matematica", 550, 3, 3);

INSERT INTO tb_cursos (nome, preco, duracao, categoria_id)
VALUES ("Portugues", 600, 3, 3);

INSERT INTO tb_cursos (nome, preco, duracao, categoria_id)
VALUES ("Ingles", 1100, 3, 4);

INSERT INTO tb_cursos (nome, preco, duracao, categoria_id)
VALUES ("Espanhol", 900, 2, 5);

INSERT INTO tb_cursos (nome, preco, duracao, categoria_id)
VALUES ("Ed. Artistica", 200, 2, 2);

INSERT INTO tb_cursos (nome, preco, duracao, categoria_id)
VALUES ("Tec. Redes de Computadores", 1500, 2, 5);

SELECT * FROM tb_cursos WHERE preco > 500;

SELECT * FROM tb_cursos WHERE preco BETWEEN 600 AND 1000;

SELECT * FROM tb_cursos WHERE nome LIKE "%t%";

SELECT * FROM tb_cursos INNER JOIN tb_categorias
ON tb_cursos.categoria_id = tb_categorias.id;

SELECT * FROM tb_cursos INNER JOIN tb_categorias
ON tb_cursos.categoria_id = tb_categorias.id
WHERE tb_categorias.nome = "Ensino Fundamental";



