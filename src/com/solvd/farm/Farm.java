package com.solvd.farm;

import com.solvd.animal.pets.IPets;

public class Farm {
	
	private IPets pet;
	
	
	public void setPet(IPets pet) {
		this.pet = pet;
	}
	
	public IPets getPet() {
		return this.pet;
	}

}
