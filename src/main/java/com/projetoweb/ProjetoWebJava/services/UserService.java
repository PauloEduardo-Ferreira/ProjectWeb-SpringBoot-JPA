package com.projetoweb.ProjetoWebJava.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.projetoweb.ProjetoWebJava.entities.User;
import com.projetoweb.ProjetoWebJava.repositories.UserRepository;
import com.projetoweb.ProjetoWebJava.services.exceptions.DatabaseException;
import com.projetoweb.ProjetoWebJava.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    
    public List<User> findAll() {
        return repository.findAll();
    }
    
    public User findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));
    }
    
    public User insert(User obj) {
        return repository.save(obj);
    }
    
    public void delete(Long id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e) {
        	throw new DatabaseException(e.getMessage());
        }
    }
    
    @Transactional
    public User update(Long id, User obj) {

    	try {
        User entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));
        updateData(entity, obj);
        return repository.save(entity);
    	} catch (EntityNotFoundException e) {
    		throw new ResourceNotFoundException(id);
    	}
    }
    
    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
