package com.solvd;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

import com.solvd.animal.pets.Cat;
import com.solvd.animal.pets.Cow;
import com.solvd.exceptions.CrazyException;

public class Executor {

	public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Before try-catch");
		
		
		try {
			int x = scanner.nextInt();
			throw new CrazyException();
			
		} catch (CrazyException e) {
			
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("finally!");
		}
		
		System.out.println("After try-catch");
		
	}
	
	
	public static void remove(Set<Cat> cats, String name) {
		
		for(Cat cat : cats) {
			if(cat.getName().equals(name)) {
				cats.remove(cat);
			}
		}
	}

	public static void initCow(int count, Storage storage) throws IOException {
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