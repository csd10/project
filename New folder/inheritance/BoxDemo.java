package edu.bcas.inheritance;

public class BoxDemo {
public static void main(String[] args) {
	BoxWeight BX1 =new BoxWeight (10, 30 ,10, 51.55);
	BoxWeight BX2 =new BoxWeight (15, 34 ,80, 21.55);
	BoxWeight BX3 =new BoxWeight (BX1);
	
	BoxWeight Mycube =new BoxWeight (2 ,5);
	BoxWeight MyClone =new BoxWeight (BX3);
	
	System.out.println("Box number 1 Volume : " +BX1.volume());
	System.out.println("Box number 1 Weight : " +BX1.weight);
	
	System.out.println("Box number 2 Volume : " +BX2.volume());
	System.out.println("Box number 2 Weight : " +BX2.weight);
	
	System.out.println("Box number 3 Volume : " +BX3.volume());
	System.out.println("Box number 3 Weight : " +BX3.weight);
	
	System.out.println("Box Mycube Volume : " +Mycube.volume());
	System.out.println("Box Mycube Weight : " +Mycube.weight);
	
	System.out.println("My Clone Volume : " +MyClone.volume());
	System.out.println("my Clone  Weight : " +MyClone.weight);
	
	
}
}
