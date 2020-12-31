package sis.studentinfo;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

    public void testCreate() {
        final String firstStudentName = "Hyeon Gu";
        Student student = new Student(firstStudentName);
        assertEquals(firstStudentName, student.getName());

        final String secondStudentName = "Dong Hyeon";
        Student secondStudent = new Student(secondStudentName);
        assertEquals(secondStudentName, secondStudent.getName());
    }

    public void testBadStatic() {
        Student studentA = new Student("a");
        assertEquals("a", studentA.getName());
        Student studentB = new Student("b");
        assertEquals("b", studentB.getName());
        assertEquals("a", studentA.getName());
    }
}