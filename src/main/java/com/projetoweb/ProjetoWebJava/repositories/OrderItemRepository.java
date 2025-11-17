package com.projetoweb.ProjetoWebJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.ProjetoWebJava.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
