package com.solvd.animal.pets;

import com.solvd.animal.Animal;

public class Dog extends Animal implements IPets {

	public Dog() {

	}


	 
	public Dog(int age, String name) {
		super(age, name);
	}
			
	@Override
	public String getInfoPet() {
		String ageStr = String.valueOf(getRandomAge());
		String infoPet = "Dog: "+ ageStr + " " + getName();
		return infoPet;
	}
	
	
	@Override
	public String toString() {
		return getName();
		
	}

}
