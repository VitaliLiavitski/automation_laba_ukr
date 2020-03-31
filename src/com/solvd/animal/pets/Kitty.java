package com.solvd.animal.pets;

public class Kitty extends Cat {

	public Kitty() {

	}

	@Override
	public void voice() {
		System.out.println("piy-piy");
	}
	
	@Override
	public void voice(int count) {
		System.out.println(count + " piy-piy");
	}
	
	
	public void voice(double count) {
		System.out.println(count + " piy-piy");
		
	}

}
