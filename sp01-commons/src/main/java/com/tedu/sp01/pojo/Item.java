package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
public class Item {
	private Integer id;
	private String name;
	private Integer number;
	public Integer getId() {
		return id;
	}
	
	//ÄãºÃÊÀ½ç
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", number=" + number + "]";
	}
	public Item(Integer id, String name, Integer number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
	}
	public Item() {
		super();
	}
	
}