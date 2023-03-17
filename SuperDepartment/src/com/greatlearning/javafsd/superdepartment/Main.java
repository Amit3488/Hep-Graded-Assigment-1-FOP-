package com.greatlearning.javafsd.superdepartment;

public class Main {

	public static void main(String[] args) {

		//AdminDepartment() admin = new AdminDepartment();
		
		
		SuperDepartment department;
		
		//Creating objects for HrDepartment, TechDepartment, AdminDepartment


		department = new AdminDepartment();
		System.out.println("Welcome to " + department.departmentName());
		System.out.println(department.getTodaysWork());
		System.out.println(department.getWorkDeadline());
		System.out.println(department.isTodayAHoliday());
		System.out.println();
		
		department = new HrDepartment();
		HrDepartment doActivity = new HrDepartment();
		
		System.out.println("Welcome to " + department.departmentName());
		System.out.println(doActivity.doActivity());
		System.out.println(department.getTodaysWork());
		System.out.println(department.getWorkDeadline());
		System.out.println(department.isTodayAHoliday());
		//System.out.println("Today is a holiday" + department.isTodayAHoliday());
		//System.out.println(department.doActivity));

		//System.out.println("Do activity" + (HrDepartment)department.doActivity));
		System.out.println();;
		
		
		department = new TechDepartment();
		TechDepartment getTechStackInformation = new TechDepartment();
		
		System.out.println("Welcome to" + department.departmentName());
		System.out.println(department.getTodaysWork());
		System.out.println(department.getWorkDeadline());
		System.out.println(getTechStackInformation.getTechStackInformation());		
		System.out.println(department.isTodayAHoliday());
		//System.out.println("Tech Stack" + (TechDepartment)department.getTechStackInformation);
		System.out.println();
		
	}

}
