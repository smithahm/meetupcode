package com.interview.codazen;

import java.util.Collections;

public class Main {
	public static void main(String[] args) {

		Course c = new Course();
		c.addStudent(new Student("Smitha", "HM", 29));
		c.addStudent(new Student("Smith", "HM", 28));
		c.addStudent(new Student("Sundri", "HM", 19));
		c.addStudent(new Student("Hello", "H", 39));
		c.addStudent(new Student("Smith", "HM", 49));
		Collections.sort(c.getStudentsEnrolled());
		Course c1 = new Course();
		c1.addStudent(new Student("Smitha", "HM", 29));
		c1.addStudent(new Student("Smith", "HM", 28));
		c1.addStudent(new Student("Sundri", "HM", 19));
		c1.addStudent(new Student("Smi", "HM", 39));
		c1.addStudent(new Student("Smit", "HM", 49));
		Collections.sort(c1.getStudentsEnrolled());
		Course c2 = new Course();
		System.out.println(findCommonStudents(c1, c));
		System.out.println(findCommonStudents(c1, c2));
	}

	public static int findCommonStudents(Course c1, Course c2) {
		int result = 0;
		int pointer1 = 0, pointer2 = 0;
		// If any one of the course has no students then result will be 0
		if (c1 == null && c2 == null)
			return result;
		while (pointer1 < c1.getCourseSize() && pointer2 < c2.getCourseSize()) {
			// If null value is added to any of the course list then that entry
			// will be skipped
			if (c1.getStudentsEnrolled().get(pointer1) == null || c2.getStudentsEnrolled().get(pointer2) == null) {
				if (c2.getStudentsEnrolled().get(pointer2) == null)
					pointer2++;
				else
					pointer1++;
				continue;
			}
			if (c1.getStudentsEnrolled().get(pointer1).compareTo(c2.getStudentsEnrolled().get(pointer2)) == 0) {
				result++;
				pointer1++;
				pointer2++;
			} else if (c1.getStudentsEnrolled().get(pointer1).compareTo(c2.getStudentsEnrolled().get(pointer2)) > 0) {
				pointer2++;
			} else {
				pointer1++;
			}
		}
		return result;

	}

}
