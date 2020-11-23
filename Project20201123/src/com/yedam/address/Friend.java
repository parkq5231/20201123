package com.yedam.address;

public class Friend {
	private String name;
	private String phone;

	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	// method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	//method2
	public void showFriendInfo() {
		System.out.println("이름: " + this.name + " 연락처: " + this.phone);
	}

}// end of class