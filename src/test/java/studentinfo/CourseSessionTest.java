package studentinfo;

import junit.framework.TestCase;
import java.util.ArrayList;

public class CourseSessionTest extends TestCase {

    private CourseSession session;

    public void setUp() {
        session = new CourseSession("ENGL", "101");
    }

    public void testCreate() {
        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumber());
        assertEquals(0, session.getNumberOfStudents());
    }

    public void testEnrolStudents() {
        Student student1 = new Student("Hyeon Gu");
        session.enroll(student1);
        assertEquals(1, session.getNumberOfStudents());
        ArrayList<Student> allStudents = session.getAllStudents();
        assertEquals(1, allStudents.size());
        assertEquals(student1, allStudents.get(0));

        Student student2 = new Student("Dong Hyeon");
        session.enroll(student2);
        assertEquals(2, session.getNumberOfStudents());
        assertEquals(2, allStudents.size());
        assertEquals(student1, allStudents.get(0));
        assertEquals(student2, allStudents.get(1));
    }
}
