package com.solvd.animal.pets;

import java.util.Random;

public interface IPets {
	
	public String getInfoPet();
	
	public default String getInfoPet1() {
		return "fdsf";
	}
	
	public default  int getRandomAge() {
		Random random = new Random();
		
		return random.nextInt(10);
	}

}
