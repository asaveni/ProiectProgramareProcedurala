package main;

public class testanimal {

	public static void main(String[] args) {
		Animal dog = new Animal("blue","white",1);
		Animal cat = new Animal("tom");
		Animal horse = new Animal();
		
		System.out.println(" First animal is a " + dog.getTipAnimal() + ", " + dog.getCuloare() + " color ," + " and "+ dog.getVarsta() + " years old.");
		System.out.println();
		
		cat.setCuloare("red");
		System.out.println(" Second animal is a " + cat.getTipAnimal());
		System.out.println(" Second animal has " + cat.getCuloare() + " color");
		System.out.println();
		
		System.out.println(" First animal is a " + horse.getTipAnimal() + ", " + horse.getCuloare() + " color ," + " and "+ horse.getVarsta() + " years old.");
		horse.setTipAnimal("shark");
		horse.setCuloare("green");
		horse.setVarsta(8);
		System.out.println(" First animal is a " + horse.getTipAnimal() + ", " + horse.getCuloare() + " color ," + " and "+ horse.getVarsta() + " years old.");
		
	}

}