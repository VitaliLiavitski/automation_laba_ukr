package com.solvd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.solvd.animal.Animal;
import com.solvd.animal.pets.Cat;
import com.solvd.animal.pets.Cow;
import com.solvd.animal.pets.Dog;

public class Storage {
	
	
	List<Cow> listCows;
	List<Dog> listDogs;
	
	Set<Cat>  setOfCats;
	
	List< ? extends Animal> listOfAnimal;
	
	public Storage() {
		listCows  = new ArrayList<Cow>();
		listDogs  = new LinkedList<Dog>();
		
		setOfCats = new HashSet<Cat>();
		
		listOfAnimal = new ArrayList<>();
	}
	
	
	public void printInfoStorage(Collection<?> list) {
		for(Object ls : list) {
			System.out.println("===== " + ls.toString());
		}
	}
	
	public void printInfoStorage(Map<Integer, ?> map, Integer number) {
		System.out.println(map.get(number));
	}
	

	public void setCat(Cat cat) {
		setOfCats.add(cat);
	}
	
	public Set<Cat> getSetOfCats(){
		return setOfCats;
	}
	
	public void setCow(Cow cow) {
		listCows.add(cow);
	}
	
	public void removeCow(int index) {
		listCows.remove(index);
	}
	
	public List<Cow> getListCows(){
		return listCows;
	}
	
	
	public void setDog(Dog dog) {
		listDogs.add(dog);
	}
	
	public List<Dog> getListDogs(){
		return listDogs;
	}

}
