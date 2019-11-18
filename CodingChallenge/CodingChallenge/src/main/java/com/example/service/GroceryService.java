package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.GroceryDao;
import com.example.model.GroceryModel;

@Service
public class GroceryService {
	
	@Autowired
	private GroceryDao gd;
	
	public Iterable<GroceryModel> getAll(){
		return gd.findAll();
	}
	
	public GroceryModel save(GroceryModel item){
		return gd.save(item);
	}

	public void delete(GroceryModel item) {
		gd.delete(item);
	}
}
