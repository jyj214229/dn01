package com.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Order {
	private String id;
	private User user;
	private List<Item> items;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", user=" + user + ", items=" + items + "]";
	}
	public Order(String id, User user, List<Item> items) {
		super();
		this.id = id;
		this.user = user;
		this.items = items;
	}
	public Order() {
		super();
	}
	
}