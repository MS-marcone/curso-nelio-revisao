package com.Kalutech.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.Kalutech.curso.entities.Category;
import com.Kalutech.curso.repositories.CategoryRepository;
import com.Kalutech.curso.services.exceptions.DataBaseException;
import com.Kalutech.curso.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	
	public Category insert(Category obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataBaseException(e.getMessage());
		}
	}

	public Category update(Long id, Category obj) {
		try {
		Category entity = repository.getReferenceById(id);
		updatedata(entity, obj);
		return repository.save(entity);
		} catch( EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}

	}

	private void updatedata(Category entity, Category obj) {
		entity.setName(obj.getName());
		

	}

}
