package com.springboot.bootjpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.bootjpa.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>{
    
}
