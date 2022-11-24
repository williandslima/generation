package com.generation.blogpessoal.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins = "*", allowedHeaders = "*") // busca em qualquer servidor se o back tiver diferents
public class PostagemController {

	@Autowired // ingecao de dependencia
	private PostagemRepository postagemRepository;

	@GetMapping
	public ResponseEntity<List<Postagem>> getAll() { // resposta HTTP

		return ResponseEntity.ok(postagemRepository.findAll());
		// Select tb postagens

	}

	// puxa o id e mostra somente ele
	@GetMapping("/{id}") // em chaves mostra somente daquele atributo
	public ResponseEntity<Postagem> getById(@PathVariable Long id) {

		/*
		 * Optional<Postagem> buscaPostagem = postagemRepository.findById(id);
		 * 
		 * if (buscaPostagem.isPresent()) return ResponseEntity.ok(buscaPostagem.get());
		 * else return ResponseEntity.notFound().build();
		 */

		return postagemRepository.findById(id)
				.map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.notFound().build());

		// select * from tb_postagens WHERE id = 1

	}

	// busca pelo titulo
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Postagem>> getByTitulo(@PathVariable String titulo) { // resposta HTTP

		return ResponseEntity.ok(postagemRepository.findAllByTituloContainingIgnoreCase(titulo));
		// Select tb postagens

	}

	// postar
	@PostMapping
	public ResponseEntity<Postagem> postPostagem(@Valid @RequestBody Postagem postagem) {
		return ResponseEntity.status(HttpStatus.CREATED).body(postagemRepository.save(postagem));

	}

	// atualizar
	@PutMapping
	public ResponseEntity<Postagem> putPostagem(@Valid @RequestBody Postagem postagem) {

		//return ResponseEntity.status(HttpStatus.OK).body(postagemRepository.save(postagem));
		
		return postagemRepository.findById(postagem.getId()) // retorna o id se ele for ok
				.map(resposta -> ResponseEntity.status(HttpStatus.OK) /// salva mensagem
						.body(postagemRepository.save(postagem))) /// do corpo da mensagem
				.orElse(ResponseEntity.notFound().build()); // se nao for ok manda esta mensagem
		
		
	}

	
	
	// deletar
	@ResponseStatus
	@DeleteMapping("/{id}")
	public void deletePostagem(@PathVariable Long id) {
		
		
		Optional <Postagem> recebePostagem = postagemRepository.findById(id);
				
		if (recebePostagem.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		
		postagemRepository.deleteById(id);
		
		
		
	}

}
