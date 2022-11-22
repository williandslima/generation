CREATE DATABASE db_curso_da_minha_vida_Correcao;

USE db_curso_da_minha_vida_Correcao;

CREATE TABLE tb_categorias(
id bigint AUTO_INCREMENT,
nome varchar (100) NOT NULL,
ativo BOOLEAN,
PRIMARY KEY (id)
);
--

INSERT INTO tb_categorias (nome, ativo) 
VALUES ("Programação", true);

INSERT INTO tb_categorias (nome, ativo) 
VALUES ("Idiomas", true);

INSERT INTO tb_categorias (nome, ativo) 
VALUES ("Gestão", true);

INSERT INTO tb_categorias (nome, ativo) 
VALUES ("Ferramentas de escritório", true);

INSERT INTO tb_categorias (nome, ativo) 
VALUES ("Marketing", true);

--


CREATE TABLE tb_cursos(
id bigint AUTO_INCREMENT,
nome varchar(100) NOT NULL,
descricao varchar (200),
turno VARCHAR (50),
preco DECIMAL (8,2),
PRIMARY KEY (id),
categoria_id bigint, 
FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id)
);

--

INSERT INTO tb_cursos (nome, descricao, turno, preco, categoria_id) 
VALUES ("Java iniciante", "curso básico", "noturno", 40, 1);

INSERT INTO tb_cursos (nome, descricao, turno, preco, categoria_id) 
VALUES ("Inglês básico", "curso introdutório", "noturno", 44, 2);

INSERT INTO tb_cursos (nome, descricao, turno, preco, categoria_id) 
VALUES ("Metodologia SCRUM", "metodologia ágil", "matutino", 34, 3);

INSERT INTO tb_cursos (nome, descricao, turno, preco, categoria_id) 
VALUES ("Pacote office", "básico do office", "matutino", 42, 4);

INSERT INTO tb_cursos (nome, descricao, turno, preco, categoria_id) 
VALUES ("Vendas", "melhorar vendas", "noturno", 60, 5);

INSERT INTO tb_cursos (nome, descricao, turno, preco, categoria_id) 
VALUES ("Javascript iniciante", "curso básico", "vespertino", 66, 1);

INSERT INTO tb_cursos (nome, descricao, turno, preco, categoria_id) 
VALUES ("Espanhol básico", "curso introdutório", "integral", 70, 2);

--

SELECT * FROM tb_categorias;

SELECT * FROM tb_cursos;

SELECT * FROM tb_cursos WHERE preco BETWEEN 3 AND 60;

SELECT * FROM tb_cursos WHERE nome LIKE "%j%";

SELECT tb_cursos.nome, descricao, turno, preco, tb_categorias.nome 
FROM tb_cursos INNER JOIN tb_categorias
ON tb_cursos.categoria_id = tb_categorias.id;

SELECT * FROM tb_cursos INNER JOIN tb_categorias
ON tb_cursos.categoria_id = tb_categorias.id
WHERE tb_categorias.nome = "Idiomas";









