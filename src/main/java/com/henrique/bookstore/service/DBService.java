package com.henrique.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henrique.bookstore.domain.Categoria;
import com.henrique.bookstore.domain.Livro;
import com.henrique.bookstore.repositories.CategoriaRepository;
import com.henrique.bookstore.repositories.LivroRepository;


@Service
public class DBService {
	@Autowired
	private CategoriaRepository catRep;
	@Autowired
	private LivroRepository livRep;
	
	public void InstacinaBaseDeDados() {	
		Categoria cat1 = new Categoria(null,"Informática","Livros de TI"); 
		Livro liv1 = new Livro(null,"Clean code","Roberto 22","sem texto", cat1);
		Livro liv2 = new Livro(null,"Clean code new","Roberto 22","sem texto", cat1);
		cat1.getLivros().addAll(Arrays.asList(liv1));
		cat1.getLivros().addAll(Arrays.asList(liv2));
		
		try {
			this.catRep.saveAll(Arrays.asList(cat1));
			this.livRep.saveAll(Arrays.asList(liv1));
			this.livRep.saveAll(Arrays.asList(liv2));
		} catch (Exception e) {
			// TODO: handle except
			System.out.println(e);
		} 
		
	}
}
