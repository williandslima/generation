CREATE DATABASE db_quintanda;


USE db_quintanda;

CREATE TABLE tb_produtos (
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR (255) NOT NULL,
    quantidade INT,
    data_validade DATE,
    preco DECIMAL NOT NULL,
    PRIMARY KEY (id)
    
);

INSERT INTO tb_produtos  (nome, quantidade, data_validade, preco)
VALUES ("Tomate", 100, "2022-11-14", 1.50);

INSERT INTO tb_produtos  (nome, quantidade, data_validade, preco)
VALUES ("Maca", 10, "2022-11-14", 12.50);

INSERT INTO tb_produtos  (nome, quantidade, data_validade, preco)
VALUES ("Laranja", 200, "2022-11-14", 3.50);

INSERT INTO tb_produtos  (nome, quantidade, data_validade, preco)
VALUES ("Limao", 200, "2022-11-14", 2.90);


SELECT * FROM tb_produtos;

SELECT nome, quantidade FROM tb_produtos;

SELECT * FROM tb_produtos WHERE id = 1;

SELECT * FROM tb_produtos WHERE preco >= 2;

SELECT * FROM tb_produtos WHERE preco <= 2;

SELECT * FROM tb_produtos WHERE preco != 2;

SELECT * FROM tb_produtos WHERE preco % 2 = 0;

SELECT * FROM tb_produtos WHERE preco % 2 != 0;

SELECT * FROM tb_produtos WHERE nome = "Banana";

ALTER TABLE tb_produtos ADD descricao VARCHAR (255);

ALTER TABLE tb_produtos DROP descricao;

ALTER TABLE tb_produtos MODIFY preco decimal (6,2);

SELECT * FROM tb_produtos;

UPDATE tb_produtos SET preco = 19.00 WHERE id = 2;

DELETE FROM tb_produtos WHERE id = 2;


