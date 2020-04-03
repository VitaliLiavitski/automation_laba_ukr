package com.solvd;

import com.solvd.animal.Animal;
import com.solvd.animal.Type;
import com.solvd.creator.Creator;

public class Executor {

	public static void   main(String[] args) {

		Creator  creator = new Creator();
		
		
		Animal qq = creator.createAnimal(Type.PET);
		
//		creator.createAnimal(Type.)
	
//		System.out.println(qq.getAge());
		
//		System.out.println(Type.WILD.getValue());
//		
//		System.out.println(Type.WILD);

	}

}