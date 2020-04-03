package com.solvd.animal;

public class Animal {

	private int age = 0;
	private String name = "default";

	public Animal() {

	}

	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	public void voice() {
		System.out.println("default voice");
	}
	
	public void voice(int count) {
		System.out.println(count + " default voice");
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}

}
