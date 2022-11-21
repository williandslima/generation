CREATE DATABASE db_rh;

USE db_rh;

CREATE TABLE tb_colaboradores (
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR (255) NOT NULL,
    cargo VARCHAR (255),
    registro int,
    data_admissao DATE,
    salario DECIMAL NOT NULL,
    PRIMARY KEY (id)
    
);

ALTER TABLE tb_colaboradores MODIFY salario decimal (5,3);


INSERT INTO tb_colaboradores  (nome, cargo, registro, data_admissao, salario)
VALUES ("Willian Lima", "Dev. Junior", "998877", "2022-07-04", 2.500);

INSERT INTO tb_colaboradores  (nome, cargo, registro, data_admissao, salario)
VALUES ("Augusto Lima", "Dev. Senior", "887755", "2000-02-03", 17.500);

INSERT INTO tb_colaboradores  (nome, cargo, registro, data_admissao, salario)
VALUES ("Ricardo Silva", "Aux. Administrativo", "999777", "2021-09-04", 1.500);

INSERT INTO tb_colaboradores  (nome, cargo, registro, data_admissao, salario)
VALUES ("Maria Emilia", "Secretaria", "996977", "2022-01-03", 1.300);

INSERT INTO tb_colaboradores  (nome, cargo, registro, data_admissao, salario)
VALUES ("Miguel Fernandes", "Diretor", "000001", "1999-05-12", 30.979);

SELECT * FROM tb_colaboradores WHERE salario > 2.000;

SELECT * FROM tb_colaboradores WHERE salario < 2.000;

UPDATE tb_colaboradores SET salario = 3.500 WHERE id = 1;

SELECT * FROM tb_colaboradores;

SELECT nome NOME FROM tb_colaboradores;






