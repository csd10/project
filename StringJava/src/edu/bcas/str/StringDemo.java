package edu.bcas.str;

public class StringDemo {
public static void main(String[] args) {
	
	String str = "BCAS";
	String str1 = "BCAS CAMPUS JAFFNA";
	String str2 = "BCAS";
	char charArrary []= {'a','e','i','o','u'};
	
	System.out.println(str);
	System.out.println("String length : " + str.length());
	System.out.println(str.substring(2));
	System.out.println(str2.substring(2));
	
	System.out.println(str.charAt(2));	//A
	System.out.println(str2.charAt(1));	//C
	
	System.out.println(str.compareTo(str1));
	
	System.out.println(str2.compareToIgnoreCase(str2));
	
	System.out.println(str2.concat(str2));
	
	System.out.println(str2.contentEquals(str1));
	
	System.out.println(str.endsWith(str1));
	
	System.out.println(str1.equals(str2));
	
	System.out.println(str2.equalsIgnoreCase(str));
	
	System.out.println(str2.getBytes());
	
	System.out.println(str.copyValueOf(charArrary));
	
	System.out.println(str.copyValueOf(charArrary, 3,2));
	
	System.out.println(str.getBytes());
	
	System.out.println(str.hashCode());
	
	System.out.println(str.indexOf(3));
	
	System.out.println(str.indexOf(str2));
	
	System.out.println(str.indexOf(2,3));
	
	System.out.println(str.indexOf(str2,2));
	
	System.out.println(str.intern());
	
	System.out.println(str.lastIndexOf(1));
	
	System.out.println(str.lastIndexOf(1,2));
	
	System.out.println(str2.lastIndexOf(str));
	
	System.out.println(str2.length());
	
	System.out.println(str.matches(str1));
	
	System.out.println(str.regionMatches(0,str1,2,3));
	
	System.out.println(str2.split(str1));
	
}
}
