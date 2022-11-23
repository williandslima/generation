package com.generation.blogpessoal.repository;
//

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Postagem;

//postagem qual minha tabela
// qual minha chave primaria

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	
	

}
