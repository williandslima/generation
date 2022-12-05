USE db_GETBOOK;

INSERT INTO tb_temas (categoria, genero) 
VALUES ('teste','teste2');

INSERT INTO tb_usuario ( foto,nome,senha,usuario) 
VALUES ('AAAAA','WILLIAN', '12345678', 'WILLIAN');

INSERT INTO tb_postagens ( autor,descricao,foto,titulo_livro,tema_id,usuario_id) 
VALUES ('Qualquer','Descricao tal tal', 'foto tal tal' , 'titulo tal tal', 1,1);

SELECT * FROM tb_postagens;

SELECT * FROM tb_produtos;