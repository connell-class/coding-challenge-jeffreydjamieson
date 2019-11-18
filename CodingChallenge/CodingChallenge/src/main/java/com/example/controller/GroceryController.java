package com.example.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.GroceryListModel;
import com.example.model.GroceryModel;
import com.example.service.GroceryListService;
import com.example.service.GroceryService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/groceries")
public class GroceryController {
	private GroceryListService gls;
	private GroceryService gs;

	@GetMapping(value = "/grocery-lists")
	public Iterable<GroceryListModel> getLists() {
		return gls.findAll();
	}

	@PostMapping(value = "/grocery-lists")
	public boolean newList(@RequestBody GroceryListModel list) {
		try {
			gls.save(list);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@PostMapping(value = "/grocery-lists/items")
	public boolean newItem(@RequestBody GroceryModel item) {
		try {
			gs.save(item);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@DeleteMapping(value = "/grocery-lists/items/{itemId}")
	public boolean removeItem(@RequestBody GroceryModel item) {
		try {
			gs.delete(item);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@DeleteMapping(value = "/grocery-lists")
	public boolean removeList(@RequestBody GroceryListModel list) {
		try {
			gls.delete(list);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
