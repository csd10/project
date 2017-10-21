package edu.bcas.inheritance;

public class Box {
	private double width, height, depth ;
	
	
	
	public Box() {
		width=-1;
		height=-1;
		depth =-1;
		
	}



	public Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public Box(double length ) {
		width= height= depth= length;
	}
	public Box (Box obj) {
		width = obj.width;
		height = obj.height;
		depth = obj.depth;
	}
	public double volume () {
		return width * height* depth;
	}
	
}
	
	
