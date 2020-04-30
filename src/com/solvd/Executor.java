package com.solvd;

import java.io.File;
import java.util.Set;

import com.solvd.animal.pets.Cat;
import com.solvd.animal.pets.Cow;
import com.solvd.utils.FirstTh;

public class Executor {

	static String separator = File.separator;
	static String pathFirst = separator + "Users" + separator + "vliavitski" + separator + "Desktop" + separator + "first.properties";
	static String pathSecond = separator + "Users" + separator + "vliavitski" + separator + "Desktop" + separator + "second.properties";

	public static void main(String[] args) {
		
		
		FirstTh firstTh = new FirstTh();
		firstTh.start();
		
		System.out.println("!!!!!MAIN!!!!!");

		
//		example properties
//		WRFromProp wrfp = new WRFromProp();
//		
//		
//		System.out.println(wrfp.getValueFromProperties(pathFirst, "bird"));
//		
//		
//		System.out.println("=========");
//		
//		
//		wrfp.setValueToProperties(pathSecond, "date", "30-04-2020");
//	example
//		WrittingToFile wrt = new WrittingToFile();
//
//		wrt.writeTorFile(path, "Lesson #100500, topic InputOutputFile");
//
//		ReadingFromFile rdf = new ReadingFromFile();
//		String stringFromFile = rdf.readFromFile(path);
//		String[] arrayStr = stringFromFile.split(" ");
//
//		for (String elementStr : arrayStr) {
//
//			if ("topic".equals(elementStr)) {
//				System.out.println(elementStr);
//			}
//		}
//
//		System.out.println("============");
//		
//		for (String elementStr : arrayStr) {
//
//			System.out.println(elementStr);
//		}
	}

	
	
	
	
	
	
	
	
	
	public static void remove(Set<Cat> cats, String name) {

		for (Cat cat : cats) {
			if (cat.getName().equals(name)) {
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