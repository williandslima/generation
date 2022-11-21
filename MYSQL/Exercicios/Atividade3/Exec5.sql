CREATE DATABASE db_construindo_vidas;

USE db_construindo_vidas;

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
VALUES ("Hidraulica", "Cano, cola, etcs");

INSERT INTO tb_categorias (nome, descricao)
VALUES ("Pintura", "Tinta, Pincel, Rolo, etcs");

INSERT INTO tb_categorias (nome, descricao)
VALUES ("Acessorios", "Tabua de passar, Ventilador, Mesa, Etcs ");

INSERT INTO tb_categorias (nome, descricao)
VALUES ("Eletrica", "Canduite, fita isolante, fio, etcs");

INSERT INTO tb_categorias (nome, descricao)
VALUES ("Fundacao", "Ferragem, arame, cimento etcs");

--
INSERT INTO tb_produtos (nome, preco, quantidade, categoria_id)
VALUES ("Cano PVC 3/4", 5, 100, 1);

INSERT INTO tb_produtos (nome, preco, quantidade, categoria_id)
VALUES ("Gabinete da Pia", 450, 5, 3);

INSERT INTO tb_produtos (nome, preco, quantidade, categoria_id)
VALUES ("Fio 4mm", 90, 10, 4);

INSERT INTO tb_produtos (nome, preco, quantidade, categoria_id)
VALUES ("Arame cozido", 30, 1000, 5);

INSERT INTO tb_produtos (nome, preco, quantidade, categoria_id)
VALUES ("Tinta amarela", 190, 10, 2);

INSERT INTO tb_produtos (nome, preco, quantidade, categoria_id)
VALUES ("Pincel", 3, 60, 2);

INSERT INTO tb_produtos (nome, preco, quantidade, categoria_id)
VALUES ("Cola de cano", 4.5, 40, 1);

INSERT INTO tb_produtos (nome, preco, quantidade, categoria_id)
VALUES ("Fita isolante", 3.20, 15, 4);

--
SELECT * FROM tb_produtos ORDER BY quantidade;

SELECT * FROM tb_produtos WHERE preco > 100;

SELECT * FROM tb_produtos WHERE preco BETWEEN 70 AND 150;

SELECT * FROM tb_produtos WHERE nome LIKE "%C%";

SELECT * FROM tb_produtos INNER JOIN tb_categorias
ON tb_produtos.categoria_id = tb_categorias.id
ORDER BY tb_produtos.preco;

SELECT * FROM tb_produtos INNER JOIN tb_categorias
ON tb_produtos.categoria_id = tb_categorias.id
WHERE tb_categorias.nome = "Hidraulica";



