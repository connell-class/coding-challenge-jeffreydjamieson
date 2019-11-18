package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.GroceryListDao;
import com.example.model.GroceryListModel;

public class GroceryListService {

	@Autowired
	private GroceryListDao gld;

	public Iterable<GroceryListModel> findAll() {
		return gld.findAll();
	}
	
	public void save(GroceryListModel list) {
		gld.save(list);
	}

	public void delete(GroceryListModel list) {
		gld.delete(list);
	}
	
	
}
