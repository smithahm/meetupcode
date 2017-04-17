package com.interview.codazen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Course implements Comparator<Student> {
	private List<Student> students;

	public Course() {
		students = new ArrayList<Student>();
	}

	public void addStudent(Student s) {
		students.add(s);
	}

	public int getCourseSize() {
		return students.size();
	}

	public List<Student> getStudentsEnrolled() {
		return students;
	}

	@Override
	public int compare(Student arg0, Student arg1) {
		/*
		 * Logic is to first check if firstname is same, if yes then check
		 * lastName, if both first and last name are same then check for age.
		 */
		int firstNameval = arg0.getFirstName().compareTo(arg1.getFirstName());
		if (firstNameval != 0)
			return firstNameval;

		int lastNameVal = arg0.getlastName().compareTo(arg1.getlastName());
		if (lastNameVal != 0)
			return lastNameVal;

		return arg0.getAge() > arg1.getAge() ? 1 : arg0.getAge() < arg1.getAge() ? -1 : 0;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (getStudentsEnrolled().contains(o))
			return false;
		return true;
	}

}
