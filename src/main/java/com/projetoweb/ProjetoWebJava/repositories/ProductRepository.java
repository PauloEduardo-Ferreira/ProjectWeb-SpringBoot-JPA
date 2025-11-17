package com.projetoweb.ProjetoWebJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.ProjetoWebJava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
