package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.GroceryModel;

@Repository
public interface GroceryDao extends CrudRepository<GroceryModel, Integer>{

}
