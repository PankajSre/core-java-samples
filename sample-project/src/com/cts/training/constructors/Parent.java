package com.cts.training.constructors;

public class Parent extends Object {

	Parent() {
		super();
		System.out.println("1");
	}

	Parent(int a) {
		this();
		System.out.println("2");
	}

	// IIB
	{
		System.out.println("3");
	}
}
class Child extends Parent {
	Child() {
		this(10,2);
		System.out.println("4");
	}
	
	Child(int a, int b){
		super(20);
		System.out.println("5");
	}
	
	{
		System.out.println("6");
	}
}