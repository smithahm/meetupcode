package com.interview.codazen;

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class CourseTest extends TestCase {

	private Course c1 = new Course();
	private Course c2 = new Course();
	private Course c3 = new Course();
	private Course c4 = new Course();
	private Course c5 = new Course();

	@Before
	protected void setUp() {
		c1.addStudent(new Student("Smitha", "HM", 29));
		c1.addStudent(new Student("Smith", "HM", 28));
		c1.addStudent(new Student("Sundri", "HM", 19));
		c1.addStudent(new Student("Hello", "H", 39));
		c1.addStudent(new Student("Smith", "HM", 49));
		c2.addStudent(new Student("Smitha", "HM", 29));
		c2.addStudent(new Student("Smith", "HM", 28));
		c2.addStudent(new Student("Sundri", "HM", 19));
		c2.addStudent(new Student("Smi", "HM", 39));
		c2.addStudent(new Student("Smit", "HM", 49));
		c4.addStudent(new Student("Albert", "Einstein", 45));
		c4.addStudent(new Student("Newton", "Law", 35));
		c4.addStudent(new Student("Tom", "Jerry", 45));
		c5.addStudent(new Student("Newton", "Law", 35));
		c5.addStudent(new Student("Tom", "Jerry", 45));
	}

	@Test
	public void testSorting() {
		System.out.println("Before sorting");
		assertEquals("Smitha", c1.getStudentsEnrolled().get(0).getFirstName());
		Collections.sort(c1.getStudentsEnrolled());
		System.out.println("After sorting");
		assertEquals("Hello", c1.getStudentsEnrolled().get(0).getFirstName());
	}

	@Test
	public void testFindMatches() {
		assertEquals(3, Main.findCommonStudents(c1, c2));
		assertEquals(0, Main.findCommonStudents(c2, c3));
		assertEquals(0, Main.findCommonStudents(c4, c2));
		assertEquals(2, Main.findCommonStudents(c4, c5));
	}

}
