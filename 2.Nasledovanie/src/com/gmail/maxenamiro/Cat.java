package com.gmail.maxenamiro;

public class Cat extends Animal {
	String name;

	public Cat(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat(String ration) {
		System.out.println(ration);
	}

	public void sleep(String sleep) {
		System.out.println(sleep);
	}

	public void getVoice() {
		System.out.println("мяу");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "] " + super.toString();
	}

}
