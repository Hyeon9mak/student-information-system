package sis.studentinfo;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

    private static final double GRADE_TOLERANCE = 0.05;

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

    public void testStudentStatus() {
        Student student = new Student("a");
        assertEquals(0, student.getCredits());
        assertFalse(student.isFullTime());

        student.addCredits(3);
        assertEquals(3, student.getCredits());
        assertFalse(student.isFullTime());

        student.addCredits(4);
        assertEquals(7, student.getCredits());
        assertFalse(student.isFullTime());

        student.addCredits(5);
        assertEquals(Student.CREDITS_REQUIRED_FOR_FULL_TIME, student.getCredits());
        assertTrue(student.isFullTime());
    }

    public void testInState() {
        Student student = new Student("a");
        assertFalse(student.isInState());
        student.setState(Student.IN_STATE);
        assertTrue(student.isInState());
        student.setState("MD");
        assertFalse(student.isInState());
    }

    public void testCalculateGpa() {
        Student student = new Student("a");
        assertEquals(0.0, student.getGpa(), GRADE_TOLERANCE);
        student.addGrade("A");
        assertEquals(4.0, student.getGpa(), GRADE_TOLERANCE);
        student.addGrade("B");
        assertEquals(3.5, student.getGpa(), GRADE_TOLERANCE);
        student.addGrade("C");
        assertEquals(3.0, student.getGpa(), GRADE_TOLERANCE);
        student.addGrade("D");
        assertEquals(2.5, student.getGpa(), GRADE_TOLERANCE);
        student.addGrade("F");
        assertEquals(2.0, student.getGpa(), GRADE_TOLERANCE);
    }

//    public void testBadStatic() {
//        Student studentA = new Student("a");
//        assertEquals("a", studentA.getName());
//        Student studentB = new Student("b");
//        assertEquals("b", studentB.getName());
//        assertEquals("a", studentA.getName());
//    }
}