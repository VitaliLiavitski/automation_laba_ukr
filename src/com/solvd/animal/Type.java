package com.solvd.animal;

public enum Type {

	WILD("wild"), PET("pet");
	
	Type(String value) {
		this.value =value;
	}
	
	private String value = "111default";
	
	public String getValue() {
		return this.value;
	}
	
}
