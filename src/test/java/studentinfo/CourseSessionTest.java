package studentinfo;

import java.util.Date;
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
        assertEquals(student1, session.get(0));

        Student student2 = new Student("Dong Hyeon");
        session.enroll(student2);
        assertEquals(2, session.getNumberOfStudents());
        assertEquals(student1, session.get(0));
        assertEquals(student2, session.get(1));
    }

    public void testCourseDates(){
        int year = 103;
        int month = 0;
        int date = 6;
        Date startDate = new Date(year, month, date);

        CourseSession session = new CourseSession("ABCD", "2000", startDate);

        year = 103;
        month = 3;
        date = 25;
        Date sixteenWeeksOut = new Date(year, month, date);
        assertEquals(sixteenWeeksOut, session.getEndDate());
    }
}
