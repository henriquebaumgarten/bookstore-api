package com.henrique.bookstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henrique.bookstore.domain.Categoria;
import com.henrique.bookstore.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	public Categoria findById(Integer id)
	{
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElse(null);
	}
}
