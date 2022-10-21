package com.gmail.maxenamiro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat("корм", "чорний", 4, "Рижик");
		Dog dog1 = new Dog("мясо", "рудий", 12, "Мухтар");
		Veterinarian veterinar1 = new Veterinarian(" Іво Бобул ");

		System.out.println(cat1);
		cat1.eat("Їсть");
		cat1.sleep("Не спить");
		cat1.getVoice();
		System.out.println(dog1);
		dog1.eat("Не їсть");
		dog1.sleep("Не спить");
		dog1.getVoice();
		veterinar1.treatment(cat1);
	}

}
