package sis.report;

import junit.framework.TestCase;
import sis.report.RosterReporter;
import sis.studentinfo.CourseSession;
import sis.studentinfo.DateUtil;
import sis.studentinfo.Student;

public class RosterReporterTest extends TestCase {

    public void testRosterReport() {
        CourseSession session =
            new CourseSession("ENGL", "101", new DateUtil().createDate(2003, 1, 6));

        session.enroll(new Student("A"));
        session.enroll(new Student("B"));

        String rosterReport = new RosterReporter(session).getReport();

        System.out.println(rosterReport);

        assertEquals(
            RosterReporter.ROSTER_REPORT_HEADER +
                "A" + RosterReporter.NEWLINE +
                "B" + RosterReporter.NEWLINE +
                RosterReporter.ROSTER_REPORT_FOOTER +
                "2" + RosterReporter.NEWLINE, rosterReport);
    }
}
