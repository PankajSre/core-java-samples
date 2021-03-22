package com.cts.training.modifiers;

public class StaticDemo {
//	static int salary = 50000;
//	int pin = 10092;
	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		
		System.out.println("Age: "+ user1.age); //20
		System.out.println("ID: "+ user1.id); // 101
        
		user2.id = 201;
		user3.age = 30;
		System.out.println("-----------------------");
		System.out.println("Age: "+ user3.age); // 30
		System.out.println("ID: "+ user3.id); // 101
		
		user3.id = 301;
		user1.age = 40;
		
		System.out.println("-----------------------");
		System.out.println("Age: "+ user2.age); // 20 40
		System.out.println("ID: "+ user2.id); // 201 201
		
		User.display();

	}

}

class User {

	int id = 101;
	static int age = 20;

	public static void display() {
		User u = new User();
		System.out.println(u.id);
	}
}