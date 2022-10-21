package com.gmail.maxenamiro;

public class Veterinarian {
	String name;

	public Veterinarian(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void treatment(Animal animal) {
		System.out.println("Ветеринар" + name + " лікую " + animal.toString());
	}

	@Override
	public String toString() {
		return "Veterinarian [name=" + name + "]";
	}
	
}
