package com.Kalutech.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Kalutech.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
