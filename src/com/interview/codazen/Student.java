package com.interview.codazen;

public class Student implements Comparable<Student> {
	private String firstName;
	private String lastName;
	private int age;

	public Student(String fname, String lname, int a) {
		this.firstName = fname;
		this.lastName = lname;
		this.age = a;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getlastName() {
		return this.lastName;
	}

	public int getAge() {
		return this.age;
	}

	@Override
	public int compareTo(Student arg1) {
		/*
		 * Logic is to first check if firstname is same, if yes then check
		 * lastName, if both first and last name are same then check for age.
		 */

		int firstNameval = this.getFirstName().compareTo(arg1.getFirstName());
		if (firstNameval != 0)
			return firstNameval;

		int lastNameVal = this.getlastName().compareTo(arg1.getlastName());
		if (lastNameVal != 0)
			return lastNameVal;

		return this.getAge() > arg1.getAge() ? 1 : this.getAge() < arg1.getAge() ? -1 : 0;
	}

}
