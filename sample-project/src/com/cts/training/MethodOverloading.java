package com.cts.training;

class Area {
	
	public final double PI = 3.14;
	public void area(int l) {
		System.out.println("The Area of Square is : "+ (l*l));
	}
	
	public void area(int l, double b) {
		System.out.println("The Area of Rectangle is : "+ (l*b));
	}
	
	public void area(double r) {
		System.out.println("The Area of Circle is : "+ PI* r*r );
	}
	
	public void area(double b , int h) {
		System.out.println("The Area of Triangle is : "+  b*h/2);
	}
}

public class MethodOverloading {
	public static void main(String[] args) {

		Area a = new Area();
		a.area(3.0F);
	}
}
