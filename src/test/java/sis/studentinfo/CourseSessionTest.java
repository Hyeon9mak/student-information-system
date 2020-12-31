package sis.studentinfo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import junit.framework.TestCase;

public class CourseSessionTest extends TestCase {

    private CourseSession session;
    private Date startDate;

    public void setUp() {
        startDate = DateUtil.createDate(2003, 1, 6);
        session = new CourseSession("ENGL", "101", startDate);
    }

    public Date createDate(int year, int month, int date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, date);
        return calendar.getTime();
    }

    public void testCreate() {
        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumber());
        assertEquals(0, session.getNumberOfStudents());
        assertEquals(startDate, session.getStartDate());
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

    public void testCourseDates() {
        Date sixteenWeeksOut = DateUtil.createDate(2003, 4, 25);
        assertEquals(sixteenWeeksOut, session.getEndDate());
    }

    public void testCount() {
        CourseSession.resetCount();
        createCourseSession();
        assertEquals(1, CourseSession.getCount());
        createCourseSession();
        assertEquals(2, CourseSession.getCount());
    }

    private CourseSession createCourseSession() {
        return CourseSession.create("ENGL", "101", startDate);
    }
}
