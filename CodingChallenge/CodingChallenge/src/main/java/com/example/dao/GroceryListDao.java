package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.model.GroceryListModel;

public interface GroceryListDao extends CrudRepository<GroceryListModel, Integer>{
	
}
