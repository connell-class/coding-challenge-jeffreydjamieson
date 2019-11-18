package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="grocery_item")
public class GroceryModel {

	@Id
	private int grocery_id;
	
	@Column(name="grocery_desc")
	private String grocery_desc;
	
	@Column(name="grocery_type")
	private String grocery_type;
	
	@Column(name="list_id")
	private int list_id;
	
	public int getGrocery_id() {
		return grocery_id;
	}
	public void setGrocery_id(int grocery_id) {
		this.grocery_id = grocery_id;
	}
	public String getGrocery_desc() {
		return grocery_desc;
	}
	public void setGrocery_desc(String grocery_desc) {
		this.grocery_desc = grocery_desc;
	}
	public String getGrocery_type() {
		return grocery_type;
	}
	public void setGrocery_type(String grocery_type) {
		this.grocery_type = grocery_type;
	}
	public int getList_id() {
		return list_id;
	}
	public void setList_id(int list_id) {
		this.list_id = list_id;
	}
	public GroceryModel(String grocery_desc, String grocery_type, int list_id) {
		super();
		this.grocery_desc = grocery_desc;
		this.grocery_type = grocery_type;
		this.list_id = list_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((grocery_desc == null) ? 0 : grocery_desc.hashCode());
		result = prime * result + grocery_id;
		result = prime * result + ((grocery_type == null) ? 0 : grocery_type.hashCode());
		result = prime * result + list_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryModel other = (GroceryModel) obj;
		if (grocery_desc == null) {
			if (other.grocery_desc != null)
				return false;
		} else if (!grocery_desc.equals(other.grocery_desc))
			return false;
		if (grocery_id != other.grocery_id)
			return false;
		if (grocery_type == null) {
			if (other.grocery_type != null)
				return false;
		} else if (!grocery_type.equals(other.grocery_type))
			return false;
		if (list_id != other.list_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "GroceryModel [grocery_id=" + grocery_id + ", grocery_desc=" + grocery_desc + ", grocery_type="
				+ grocery_type + ", list_id=" + list_id + "]";
	}
	public GroceryModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
