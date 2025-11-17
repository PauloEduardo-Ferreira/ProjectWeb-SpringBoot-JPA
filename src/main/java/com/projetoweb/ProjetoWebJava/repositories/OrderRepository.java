package com.projetoweb.ProjetoWebJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.ProjetoWebJava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
