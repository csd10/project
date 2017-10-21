package edu.bcas.td;

public class TdarrayDemo {
	
	public static void main(String[] args) {
		
		int[][]studentMarks = new int[10][4];
		
	//for first student
	studentMarks[0][0] = 78;
	studentMarks[0][1] = 90;
	studentMarks[0][2] = 100;
	studentMarks[0][3] = 100;
	
	//for second student
		studentMarks[1][0] = 90;
		studentMarks[1][1] = 100;
		studentMarks[1][2] = 70;
		studentMarks[1][3] = 85;
		
		//for third student
		studentMarks[2][0] = 70;
		studentMarks[2][1] = 90;
		studentMarks[2][2] = 85;
		studentMarks[2][3] = 100;
		//for get all marks
		
		System.out.println("First student third marks" + studentMarks[0][2]);
		System.out.println("Second student first marks" + studentMarks[1][0]);
		System.out.println("Third student second marks" + studentMarks[2][1]);
		
		for (int r=0; r<10; r++) {
		for	(int c=0; c<4; c++) {
			
			System.out.println("studentMarks[ " + r + "][ " + c + " ] : "+studentMarks.length);
			
		}
		System.out.println("******************");
		}
		System.out.println(studentMarks.length);
		System.out.println(studentMarks[0].length);
	}
}


	

