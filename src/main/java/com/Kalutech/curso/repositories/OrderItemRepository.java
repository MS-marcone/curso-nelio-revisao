package com.Kalutech.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Kalutech.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	

}
