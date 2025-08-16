package com.nit.entity;

import org.springframework.stereotype.Component;

@Component
public class Player {
	private Long id;
	private String name;
	private Integer jearsyNumber;

	public Player() {
	}

	public Player(Long id, String name, Integer jearsyNumber) {
		this.id = id;
		this.name = name;
		this.jearsyNumber = jearsyNumber;
	}

	public Player getPlayerDetils() {
		return new Player(101L, "Rohit", 17);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getJearsyNumber() {
		return jearsyNumber;
	}

	public void setJearsyNumber(Integer jearsyNumber) {
		this.jearsyNumber = jearsyNumber;
	}
	
	
}
