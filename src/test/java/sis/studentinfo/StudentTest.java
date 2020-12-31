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

    public void testFullTime() {
        Student student = new Student("a");
        assertFalse(student.isFullTime());
    }

    public void testCredits() {
        Student student = new Student("a");
        assertEquals(0, student.getCredits());
        student.addCredits(3);
        assertEquals(3, student.getCredits());
        student.addCredits(4);
        assertEquals(7, student.getCredits());
    }

//    public void testBadStatic() {
//        Student studentA = new Student("a");
//        assertEquals("a", studentA.getName());
//        Student studentB = new Student("b");
//        assertEquals("b", studentB.getName());
//        assertEquals("a", studentA.getName());
//    }
}