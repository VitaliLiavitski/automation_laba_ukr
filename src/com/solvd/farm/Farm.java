package com.solvd.farm;

import com.solvd.animal.pets.IPets;

public class Farm {
	
	private IPets pet;

	private IPets pet2;

	private IPets pet3;

	private IPets pet4;
	
	
	public void setPet(IPets pet) {
		this.pet = pet;
	}
	
	public IPets getPet() {
		return this.pet;
	}

}
