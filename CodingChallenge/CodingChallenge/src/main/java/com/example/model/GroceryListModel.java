package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grocery_list")
public class GroceryListModel {

	@Id
	@Column(name="list_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int list_id;
	
	@Column(name="list_owner")
	private String list_owner;
	
	public int getList_id() {
		return list_id;
	}
	public void setList_id(int list_id) {
		this.list_id = list_id;
	}
	public String getList_owner() {
		return list_owner;
	}
	public void setList_owner(String list_owner) {
		this.list_owner = list_owner;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + list_id;
		result = prime * result + ((list_owner == null) ? 0 : list_owner.hashCode());
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
		GroceryListModel other = (GroceryListModel) obj;
		if (list_id != other.list_id)
			return false;
		if (list_owner == null) {
			if (other.list_owner != null)
				return false;
		} else if (!list_owner.equals(other.list_owner))
			return false;
		return true;
	}
	public GroceryListModel(int list_id, String list_owner) {
		super();
		this.list_id = list_id;
		this.list_owner = list_owner;
	}
	public GroceryListModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "GroceryListModel [list_id=" + list_id + ", list_owner=" + list_owner + "]";
	}
	
	
}
