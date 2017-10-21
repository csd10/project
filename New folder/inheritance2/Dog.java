package edu.bcas.inheritance2;


public class Dog extends Animal {
	
		public Dog() {
			System.out.println("A new Dog has been created !!");
		}
		
		public Dog(String name) {
			super (name);
			System.out.println("A new Dog has been created with " +name+"!!");
		}
		@Override
		public void sleep() {
			System.out.println("A Dog is sleep.....");
		}
		@Override
		public void eat() {
			System.out.println("A Dog is eat.....");
		}
	



}
