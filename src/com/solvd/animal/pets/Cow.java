package com.solvd.animal.pets;

import com.solvd.animal.Animal;

public class Cow extends Animal implements IPets {

	
	
	public Cow(){
		
	}
	
	public Cow(int age, String name) {
		super(age, name);
	}
	
	
	@Override
	public String getInfoPet() {
		
		String ageStr = String.valueOf(getAge());
		String infoPet = "Cow: "+ ageStr + " " + getName();
		return infoPet;
	}

	@Override
	public String toString() {
		return getName();
	}
	

}
