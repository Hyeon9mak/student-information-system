package sis.report;

import static sis.report.ReportConstant.NEWLINE;

import java.util.ArrayList;
import java.util.Date;
import junit.framework.TestCase;
import sis.studentinfo.CourseSession;

public class CourseReportTest extends TestCase {

    public void testReport() {
        final Date date = new Date();
        CourseReport report = new CourseReport();
        report.add(CourseSession.create("ENGL", "101", date));
        report.add(CourseSession.create("CZEC", "200", date));
        report.add(CourseSession.create("ITAL", "410", date));

//        assertEquals("ENGL 101" + NEWLINE + "CZEC 200" + NEWLINE + "ITAL 410" + NEWLINE,
//            report.text());
        assertEquals("CZEC 200" + NEWLINE + "ENGL 101" + NEWLINE + "ITAL 410" + NEWLINE,
            report.text());
    }

    public void testSortStringsInPlace() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Heller");
        list.add("Kafka");
        list.add("Camus");
        list.add("Boyle");
        java.util.Collections.sort(list);
        assertEquals("Boyle", list.get(0));
        assertEquals("Camus", list.get(1));
        assertEquals("Heller", list.get(2));
        assertEquals("Kafka", list.get(3));
    }

    public void testComparable() {
        final Date date = new Date();
        CourseSession sessionA = CourseSession.create("CMSC", "101", date);
        CourseSession sessionB = CourseSession.create("ENGL", "101", date);
        assertTrue(sessionA.compareTo(sessionB) < 0);
        assertTrue(sessionB.compareTo(sessionA) > 0);

        CourseSession sessionC = CourseSession.create("CMSC", "101", date);
        assertEquals(0, sessionA.compareTo(sessionC));
    }
}
