package com.cts.training;

class User {
	private int id;
	private String username;
	private String password;
	private long phoneNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

class UserDriver {
	public static void main(String[] args) {

		User user = new User();
		user.setId(101);
		user.setUsername("Krishna");
		System.out.println(user.getId());
		System.out.println(user.getUsername());
	}
}
