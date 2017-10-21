package edu.bcas.inheritance2;

public class AnimalDemo {
public static void main(String[] args) {
	Animal anm = new Animal();
	System.out.println();
	Bird bird = new Bird();
	
	bird.sleep();
	bird.eat();
	Dog dog = new Dog();
	dog.sleep();
	dog.eat();
	
	
	
	
	
	
	System.out.println("***********");
	Animal anm1 = new Animal("Rex");
	
	System.out.println();
	
	Bird bird1 = new Bird("Rio");
	Dog dog1 = new Dog("pete");
	System.out.println("----------------------------------------------");
	//or do this type
	
	Animal dog2=new Dog();
	Animal bird2=new Bird();
	
	
	dog2.eat();
	dog2.sleep();
	
	
	bird2.eat();
	bird2.sleep();
	
	}
}
