package com.projetoweb.ProjetoWebJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.ProjetoWebJava.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
