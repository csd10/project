package edu.bcas.inheritance;

public class Schooldemo {
public static void main(String[] args) {
	ClassRoomA cA= new ClassRoomA();
	ClassRoomB cB= new ClassRoomB();
	
	
	cA.printDetails();
	System.out.println("-----------------------------------------------------------------");
	System.out.println("Class Room A : Teacher "+cA.gettechname() +"\n Number of Student" + cA.getnumStu());
	System.out.println("********************************************");
	System.out.println("Class Room B : Teacher " +cB.gettechname() +"\n Number of Student" + cB.getnumStu());
	System.out.println("-----------------------------------------------------------------");
}
}
