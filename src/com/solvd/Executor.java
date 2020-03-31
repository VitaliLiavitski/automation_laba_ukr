package com.solvd;

import com.solvd.animal.pets.Cat;
import com.solvd.animal.pets.Cow;
import com.solvd.animal.pets.Dog;
import com.solvd.animal.pets.IPets;
import com.solvd.animal.pets.Kitty;
import com.solvd.animal.wilds.Fox;
import com.solvd.animal.wilds.IWildAnimal;
import com.solvd.farm.Farm;

public class Executor {

	public static void main(String[] args) {
		
		
		IPets cat = new Cat(3, "Pushitik");
		IPets dog = new Dog(1, "Rex");
		
		Farm farm = new Farm();
		
		farm.setPet(cat);
		
		System.out.println("Farm: "  + farm.getPet().getInfoPet());
		
		farm.setPet(dog);
		
		System.out.println("Farm: "  + farm.getPet().getInfoPet());
		
		IPets cow = new Cow(4, "Burenka");
		
		
		farm.setPet(cow);
		
		System.out.println("Farm: "  + farm.getPet().getInfoPet());
		
//		IWildAnimal fox = new Fox(2, "Ruzhay");
		
		
		
//		 Cat cat = new Cat(2, "Tom");
//		 
//		 cat.voice();
//		 cat.voice();
//		 cat.voice();
//		 cat.voice();
//		 cat.voice();
//		 
//		 
//		
//		System.out.println("===================");
//		
//		
//		cat.voice(2);
//		
//		System.out.println("===================");
//		
//		
////		Fox fox  = new Fox(2, "Ruzhay");
////		fox.voice();
////		
////		
//		System.out.println("===================");
//		
//		Kitty kitty = new Kitty();
//		
//		kitty.voice();
//		
//		kitty.voice(999);
//		
//		kitty.voice(9.4);
	}

}
