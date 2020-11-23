package com.yedam.address;

public class CompFriend extends Friend {
	private String company;
	private String department;
	

	public CompFriend(String name, String phone) {
		super(name, phone);
	}
	//getter,setter
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void showFriendInfo() {
		// super.showFriendInfo();
		System.out.println("이름: " + super.getName() + " 연락처: " +super.getPhone() +
		" 회사명: " + this.company + " 부서명: "+ this.department);
	}
	

}// end of class