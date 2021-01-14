package sis.report;

import java.util.Date;
import junit.framework.TestCase;
import sis.studentinfo.CourseSession;
import static sis.report.ReportConstant.NEWLINE;

public class CourseReportTest extends TestCase {

    public void testReport() {
        final Date date = new Date();
        CourseReport report = new CourseReportTest();
        report.add(CourseSession.create("ENGL", "101", date));
        report.add(CourseSession.create("CZEC", "200", date));
        report.add(CourseSession.create("ITAL", "410", date));

        assertEquals("ENGL 101" + NEWLINE + "CZEC 200" + NEWLINE + "ITAL 410" + NEWLINE,
            report.text());
    }
}
