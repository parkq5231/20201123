package com.yedam.db;

public class department {
	private int departmentId;
	private String departmentName;
	private int managerId;
	private int locationId;
	//setter,getter
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	//메소드2
	public void showDeptInfo() {
		System.out.println("부서번호: "+departmentId+", 부서명: "+", 매니저번호: "+managerId+", 지역번호: "+locationId);
	}
}
