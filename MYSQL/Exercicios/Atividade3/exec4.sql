CREATE DATABASE db_cidade_das_carnes;

USE db_cidade_das_carnes;

CREATE TABLE tb_categorias(
id bigint AUTO_INCREMENT,
nome varchar (255) NOT NULL,
descricao varchar(255),
PRIMARY KEY (id)
);

CREATE TABLE tb_produtos(
id bigint AUTO_INCREMENT,
nome varchar(255) NOT NULL,
preco DECIMAL (8,2),
quantidade INT,
PRIMARY KEY (id),
categoria_id bigint, 
FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id)
);

--
INSERT INTO tb_categorias (nome, descricao)
VALUES ("Frios", "Destinado aos frios");

INSERT INTO tb_categorias (nome, descricao)
VALUES ("Peixes", "Destinado aos Peixes");

INSERT INTO tb_categorias (nome, descricao)
VALUES ("Carnes", "Destinado a carnes");

INSERT INTO tb_categorias (nome, descricao)
VALUES ("Aves", "Destinado a aves");

INSERT INTO tb_categorias (nome, descricao)
VALUES ("Nobre", "Destinado a carnes nobres");

--
INSERT INTO tb_produtos (nome, preco, quantidade, categoria_id)
VALUES ("Presunto ", 4.99 , 9, 1);

INSERT INTO tb_produtos (nome, preco, quantidade, categoria_id)
VALUES ("Sardinha", 10.99 , 5, 2);

INSERT INTO tb_produtos (nome, preco, quantidade, categoria_id)
VALUES ("Contra file", 50.99, 10, 3);

INSERT INTO tb_produtos (nome, preco, quantidade, categoria_id)
VALUES ("Frango inteiro", 11.99, 8, 4);

INSERT INTO tb_produtos (nome, preco, quantidade, categoria_id)
VALUES ("Picanha", 160.00, 2, 5);

INSERT INTO tb_produtos (nome, preco, quantidade, categoria_id)
VALUES ("Carne moida", 39.99, 10, 3);

INSERT INTO tb_produtos (nome, preco, quantidade, categoria_id)
VALUES ("Coxao Mole", 49.99, 5, 3);

INSERT INTO tb_produtos (nome, preco, quantidade, categoria_id)
VALUES ("Bife Ancho", 79.20, 15, 5);

--
SELECT * FROM tb_produtos ORDER BY preco;

SELECT * FROM tb_produtos WHERE preco > 50;

SELECT * FROM tb_produtos WHERE preco BETWEEN 50 AND 150;

SELECT * FROM tb_produtos WHERE nome LIKE "%C%";

SELECT * FROM tb_produtos INNER JOIN tb_categorias
ON tb_produtos.categoria_id = tb_categorias.id
ORDER BY tb_produtos.preco;

SELECT * FROM tb_produtos INNER JOIN tb_categorias
ON tb_produtos.categoria_id = tb_categorias.id
WHERE tb_categorias.nome = "Carnes";



