package io.narayana.ochaloup;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@javax.persistence.Entity
public class Entity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	String Name = null;

	/*
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	*/

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}
}
