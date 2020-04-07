package com.solvd;

import java.util.HashMap;
import java.util.Map;

import com.solvd.animal.pets.Cat;
import com.solvd.animal.pets.Cow;

public class Executor {

	public static void main(String[] args) {

		Storage storage = new Storage();

		initCow(4, storage);

		printResults(storage);
		
		System.out.println(storage.getListCows().get(0) == storage.getListCows().get(1));
		
		
		Cat cat = new Cat(2, "barsik");
		
		Cat cat2 = cat;
		
		Cat cat1 = new Cat(3, "pushistik");
		
		storage.setCat(cat);
		storage.setCat(cat2);
		storage.setCat(cat1);
		
		System.out.println("=====================");
		for(Cat catt : storage.getSetOfCats()) {
			System.out.println(catt.getInfoPet());
		}
		
		
		
		Map<String, Integer> map  = new HashMap<>();
		
		map.put("Abc", 90);
		map.put("java", 14);
		
		
		Map<String, Map<String, Integer>> crazyMap  = new HashMap<>();
		
		crazyMap.put("puper", map);
//		
		System.out.println("=====================");
		System.out.println("=====================");
		System.out.println("=====================");
//		
//		System.out.println(map.get("java"));
		
		System.out.println(crazyMap.get("puper"));
		
		System.out.println(crazyMap.get("puper").get("Abc"));
		
	}

	public static void initCow(int count, Storage storage) {
		int age = 10;
		for (int i = 0; i < count; i++) {
			String name = "Burenka" + i;
			Cow cow = new Cow(age++, name);
			storage.setCow(cow);
			Cow cow1 = cow;
			storage.setCow(cow1);
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