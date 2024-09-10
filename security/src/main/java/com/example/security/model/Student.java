package com.example.security.model;

import lombok.Data;

@Data
public class Student {

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	private int id;
	private String name;
	private int age;
}
