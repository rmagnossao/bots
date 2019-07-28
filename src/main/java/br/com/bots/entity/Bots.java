package br.com.bots.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bots {
	
    @Id
	private String id;
	private String name;
	
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
