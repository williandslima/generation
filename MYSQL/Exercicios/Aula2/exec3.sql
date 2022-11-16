CREATE DATABASE escola_wdsl;

USE escola_wdsl;

CREATE TABLE tb_alunos (
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR (255) NOT NULL,
    idade int,
    sexo VARCHAR (1),
    data_nascimento DATE,
    valor_mensalidade DECIMAL (5,2) NOT NULL,
    nota int,
    PRIMARY KEY (id)
    
);

INSERT INTO tb_alunos  (nome, idade, sexo, data_nascimento, valor_mensalidade, nota)
VALUES ("Willian Lima", "10", "M", "2012-07-04", 100.00, 7);

INSERT INTO tb_alunos  (nome, idade, sexo, data_nascimento, valor_mensalidade, nota)
VALUES ("Augusto Silva", "11", "M", "2011-04-04", 200.00, 8);

INSERT INTO tb_alunos  (nome, idade, sexo, data_nascimento, valor_mensalidade, nota)
VALUES ("Vitoria Fernandes", "13", "F", "2017-09-09", 150.00, 5);

INSERT INTO tb_alunos  (nome, idade, sexo, data_nascimento, valor_mensalidade, nota)
VALUES ("Vani Souza", "7", "F", "2015-01-15", 140.00, 3);

INSERT INTO tb_alunos  (nome, idade, sexo, data_nascimento, valor_mensalidade, nota)
VALUES ("Ivo Santos", "8", "M", "2016-12-09", 100.00, 9);

INSERT INTO tb_alunos  (nome, idade, sexo, data_nascimento, valor_mensalidade, nota)
VALUES ("Joyce Lima", "15", "F", "2006-03-25", 200.00, 2);

INSERT INTO tb_alunos  (nome, idade, sexo, data_nascimento, valor_mensalidade, nota)
VALUES ("Matheus Santos", "16", "M", "2005-02-06", 150.00, 5);

INSERT INTO tb_alunos  (nome, idade, sexo, data_nascimento, valor_mensalidade, nota)
VALUES ("Rosangela Souza", "11", "F", "2011-07-04", 390.00, 4);

SELECT * FROM tb_alunos WHERE nota > 7;

SELECT * FROM tb_alunos WHERE nota < 7;

SELECT * FROM tb_alunos;

UPDATE tb_alunos SET valor_mensalidade = 250 WHERE id = 6;

SELECT * FROM tb_alunos





