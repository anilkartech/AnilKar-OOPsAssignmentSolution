package com.DepartmentManagement.parent;

public class SuperDepartment {

	protected String departmentName() {
		return "Super Department";
	}

	protected String getTodaysWork() {
		return "No Work as of now";
	}

	protected String getWorkDeadline() {
		return "Nil";
	}

	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}
}
