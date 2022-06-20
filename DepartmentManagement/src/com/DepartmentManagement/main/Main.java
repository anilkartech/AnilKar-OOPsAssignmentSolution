package com.DepartmentManagement.main;

import com.DepartmentManagement.child.AdminDepartment;
import com.DepartmentManagement.child.HRDepartment;
import com.DepartmentManagement.child.TechDepartment;

public class Main {

	public static void main(String[] args) {
		HRDepartment HRDept = new HRDepartment();
		AdminDepartment adminDept = new AdminDepartment();
		TechDepartment techDept = new TechDepartment();

		// Admin Department
		System.out.println("Welcome to " + adminDept.departmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());
		System.out.println();
		System.out.println();

		// HR Department
		System.out.println("Welcome to " + HRDept.departmentName());
		System.out.println(HRDept.doActivity());
		System.out.println(HRDept.getTodaysWork());
		System.out.println(HRDept.getWorkDeadline());
		System.out.println(HRDept.isTodayAHoliday());
		System.out.println();
		System.out.println();

		// Tech Department
		System.out.println("Welcome to " + techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());
	}

}
