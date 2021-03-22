package com.cts.training.modifiers;

interface Human {
	public abstract void sleep();

	void eats();

	void walks();
}

interface Rohit extends Human {
	public double height();
}

class Men implements Rohit {
	public void sleep() {
		System.out.println("Sleeps for 8 Hrs");
	}

	public void eats() {
		System.out.println("They are Only Vegitarian");
	}

	public void walks() {
		System.out.println("Walks in the Morning and Evening");
	}

	public double height() {
		return 180;
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Men men = new Men();
		men.sleep();
	}

}
