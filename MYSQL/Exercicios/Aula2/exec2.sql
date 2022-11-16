CREATE DATABASE meli_food;

USE meli_food;

CREATE TABLE tb_produtos (
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR (255) NOT NULL,
    descricao VARCHAR (255),
    quantidade int,
    data_promocao DATE,
    preco DECIMAL (5,3) NOT NULL,
    PRIMARY KEY (id)
    
);

INSERT INTO tb_produtos  (nome, descricao, quantidade, data_promocao, preco)
VALUES ("Arroz", "Tipo 1", "100", "2023-07-04", 10.00);

INSERT INTO tb_produtos  (nome, descricao, quantidade, data_promocao, preco)
VALUES ("Televisao", "Samsung", "200", "2022-11-12", 2.500);

INSERT INTO tb_produtos  (nome, descricao, quantidade, data_promocao, preco)
VALUES ("Mascara", "de Pano", "1000", "2022-12-24", 3.00);

INSERT INTO tb_produtos  (nome, descricao, quantidade, data_promocao, preco)
VALUES ("MacBook", "M1", "7", "2022-11-30", 17.500);

INSERT INTO tb_produtos  (nome, descricao, quantidade, data_promocao, preco)
VALUES ("Celular", "Smartphone", "90", "2023-08-04", 1.200);

SELECT * FROM tb_produtos WHERE preco > 0.500;

SELECT * FROM tb_produtos WHERE preco < 500;

UPDATE tb_produtos SET quantidade = 500 WHERE id = 3;

SELECT * FROM tb_produtos





