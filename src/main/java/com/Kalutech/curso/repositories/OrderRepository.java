package com.Kalutech.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Kalutech.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
