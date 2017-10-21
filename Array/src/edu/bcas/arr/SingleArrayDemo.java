package edu.bcas.arr;

public class SingleArrayDemo {
	public static void main(String[] args) {
		int numArray[] = new int[10];
		numArray[0] = 7;
		numArray[1] = 2;
		numArray[2] = 1;
		numArray[3] = 5;
		numArray[4] = 6;
		numArray[5] = 1;
		numArray[6] = 10;
		
		System.out.println("size of arrays is :"+ numArray.length);
		for (int i=0; i< numArray.length; i++ ) {
			System.out.println("numArray["+i+"] =" + numArray[i]);
			
		}

	}

}
