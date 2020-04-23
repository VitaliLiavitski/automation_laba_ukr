package com.solvd;

import java.util.Set;

import com.solvd.animal.pets.Cat;
import com.solvd.animal.pets.Cow;

public class Executor {

	public static void main(String[] args)  {
		
		
//		Storage storage = new Storage();
//		Cow.count = 91;
//		initCow(10, storage);
		
		
		
		
//		storage.printInfoStorage(storage.getListCows());
		
		
		System.out.println("=======================");
		
		System.out.println(Math.pow(2, 4));
		
		
		
	}
	
	
	public static void remove(Set<Cat> cats, String name) {
		
		for(Cat cat : cats) {
			if(cat.getName().equals(name)) {
				cats.remove(cat);
			}
		}
	}

	public static void initCow(int number, Storage storage) {
		int age = 10;
		for (int i = 0; i < number; i++) {
			String name = "Burenka" + i;
			Cow cow = new Cow(age++, name);
			storage.setCow(cow);
//			Cow cow1 = cow;
//			storage.setCow(cow1);
		}
	}

	public static void execcuteWhileResult(Storage storage) {
		int i = 0;
		if (!storage.getListCows().isEmpty()) {

			while (i < storage.getListCows().size()) {

				storage.removeCow(i);
				i++;
			}
		}
	}

	public static void printResults(Storage storage) {
		for (Cow cow : storage.getListCows()) {
			System.out.println(cow.getInfoPet());
		}
	}

}