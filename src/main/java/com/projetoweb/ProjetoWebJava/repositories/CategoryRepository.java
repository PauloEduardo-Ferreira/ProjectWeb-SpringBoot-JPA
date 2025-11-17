package com.projetoweb.ProjetoWebJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.ProjetoWebJava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
