package edu.bcas.inheritance2;

public class Bird extends Animal {
	public Bird() {
		System.out.println("A new bird has been created !!");
	}
	
	public Bird(String name) {
		super (name);
		System.out.println("A new bird has been created with " +name+"!!");
	}
	@Override
	public void sleep() {
		System.out.println("A bird is sleep.....");
	}
	@Override
	public void eat() {
		System.out.println("A bird is eat.....");
	}
}

