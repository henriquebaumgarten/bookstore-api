package com.henrique.bookstore;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.henrique.bookstore.domain.Categoria;
import com.henrique.bookstore.domain.Livro;
import com.henrique.bookstore.repositories.CategoriaRepository;
import com.henrique.bookstore.repositories.LivroRepository;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner{
	@Autowired
	private CategoriaRepository catRep;
	@Autowired
	private LivroRepository livRep;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categoria cat1 = new Categoria(null,"Informática","Livros de TI"); 
		Livro liv1 = new Livro(null,"Clean code","Roberto 22","sem testo", cat1);
		cat1.getLivros().addAll(Arrays.asList(liv1));
		
		this.catRep.saveAll(Arrays.asList(cat1));
		this.livRep.saveAll(Arrays.asList(liv1));
	}
}
