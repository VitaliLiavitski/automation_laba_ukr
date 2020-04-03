package com.solvd.animal.pets;

import com.solvd.animal.Animal;

public class Cat extends Animal implements IPets {
	
	private String voice = "May";
	
	
	private int count = 0;

	public Cat() {

	}

	public Cat(int age, String name) {
		super(age, name);
	}
	
	
	public void setVoice(String value) {
		this.voice = value;
	}
	
	public String getVoice() {
		return voice;
	}
	
	@Override
	public void voice() {
		count++;
		System.out.println(count + " May");
	}


	@Override
	public String getInfoPet() {
		String ageStr = String.valueOf(getAge());
		String infoPet = "Cat: " + ageStr + " " + getName();
		return infoPet;
	}
	
}
