package com.Kalutech.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Kalutech.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
