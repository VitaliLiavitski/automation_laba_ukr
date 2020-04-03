package com.solvd.creator;

import com.solvd.animal.Animal;
import com.solvd.animal.Type;

public class Creator {

	public Animal createAnimal(Type type) {

		Animal animal = null;

		switch (type) {
		case WILD:
			animal = new Animal(2, "pop");
			break;

		case PET:
			animal = new Animal(12, "Sharik");
			break;

		default:
			System.out.println("please use correct type!");
			break;
		}

		return animal;

	}

}
