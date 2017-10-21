package edu.bcas.arr;

public class StudentMarks {
	public static void main(String[] args) {
		int stuMarks[] = new int[7];
		stuMarks[1] = 87;
		stuMarks[2] = 85;
		stuMarks[3] = 90;
		stuMarks[4] = 77;
		stuMarks[5] = 92;
		stuMarks[6] = 70;
		
		System.out.println("size of arrays is :"+ stuMarks.length);
		for (int i = 0; i < stuMarks.length; i++) {
			System.out.println("stuMarks["+i+"] =" + stuMarks[i]);
			
		}
			
	}

}
