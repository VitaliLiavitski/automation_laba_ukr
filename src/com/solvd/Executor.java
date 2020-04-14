package com.solvd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.solvd.animal.pets.Cat;
import com.solvd.animal.pets.Cow;
import com.solvd.animal.pets.Dog;

public class Executor {

	public static void main(String[] args) {

		Storage storage = new Storage();

		initCow(4, storage);
		
		
		storage.printInfoStorage(storage.getListCows());
		
		System.out.println("==========");
		
		Dog dog1 = new Dog(1, "pppp");
		Dog dog2 = new Dog(2, "brrr");
		Dog dog3 = new Dog(6, "lol");
		
		
		System.out.println("=====Dog==Age=====");
		System.out.println(dog1.getInfoPet());
		System.out.println(dog1.getInfoPet());
		
		storage.setDog(dog1);
		storage.setDog(dog2);
		storage.setDog(dog3);
		
//		storage.printInfoStorage(storage.getListDogs());

//		printResults(storage);
		
//		System.out.println(storage.getListCows().get(0) == storage.getListCows().get(1));
		
//		
//		Cat cat = new Cat(2, "barsik");
//		
//		Cat cat2 = cat;
//		
//		Cat cat1 = new Cat(3, "pushistik");
//		
//		
//		ArrayList listOfCats = new ArrayList<>();
//		listOfCats.add(cat);
//		listOfCats.add(cat1);
//		
//		storage.printInfoStorage(listOfCats);
//		
//		storage.setCat(cat);
//		storage.setCat(cat2);
//		storage.setCat(cat1);
//		
//		System.out.println("==Set===");
//		storage.printInfoStorage(storage.getSetOfCats());
//		
//		System.out.println("=====================");
//		for(Cat catt : storage.getSetOfCats()) {
//			System.out.println(catt.getInfoPet());
//		}
		
//		Map<Integer, String> mapStr = new HashMap<>();
//		mapStr.put(1, "java");
//		
//		Map<Integer, Cat> map1 = new HashMap<>();
//		
//		map1.put(2, cat);
//		
//		
//		Map<String, String> mapStr2 = new HashMap<>();
//		
//		System.out.println("===MapStr=====");
//		storage.printInfoStorage(mapStr2, 1);
		
//		System.out.println("===Map1=====");
//		storage.printInfoStorage(map1, 2);
		
//		Map<String, Integer> map  = new HashMap<>();
//		
//		map.put("Abc", 90);
//		map.put("java", 14);
//		
//		
//		Map<String, Map<String, Integer>> crazyMap  = new HashMap<>();
//		
//		crazyMap.put("puper", map);
////		
//		System.out.println("=====================");
//		System.out.println("=====================");
//		System.out.println("=====================");
////		
////		System.out.println(map.get("java"));
//		
//		System.out.println(crazyMap.get("puper"));
//		
//		System.out.println(crazyMap.get("puper").get("Abc"));
//		
		
		
		
		
	}
	
	
	public static void remove(Set<Cat> cats, String name) {
		
		for(Cat cat : cats) {
			if(cat.getName().equals(name)) {
				cats.remove(cat);
			}
		}
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