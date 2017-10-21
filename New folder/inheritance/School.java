package edu.bcas.inheritance;

public class School {
	public String getSchoolName () {
		return "Vaddu Hindu College";
		
	}
	public String getAddress () {
		return "Jaffna";
	}
	public String getYear() {
		return "2017";
		
	}
	public void printDetails() {
		System.out.println(getSchoolName()+"\n" +getAddress() +"\n" + getYear() );
	}
}
