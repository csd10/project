package edu.bcas.inheritance;

public class BoxWeight extends Box{
	
	public double weight;
	
	public BoxWeight () {
		super();
		weight=-1;
		
	}
	
	public BoxWeight(BoxWeight obj) {
		super();
		weight = obj.weight;
	}

	public BoxWeight(double width, double height, double depth, double weight) {
		super(width, height , depth);
		this.weight = weight;
	}
	
	public BoxWeight (double weight, double length) {
		super (length);
		this.weight = weight;
		
	}
	
}
