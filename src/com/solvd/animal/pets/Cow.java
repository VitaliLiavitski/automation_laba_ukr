package com.solvd.animal.pets;

import com.solvd.animal.Animal;

public class Cow extends Animal implements IPets {

	
	public static int count;
	
	
	public Cow(){
	}
	
	public Cow(int age, String name) {
		super(age, name);
		count++;
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
	
	public static void printInfoClass() {
		System.out.println("====" +count + "======");
	}
	

}
