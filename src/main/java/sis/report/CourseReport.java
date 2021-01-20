package sis.report;

import static sis.report.ReportConstant.NEWLINE;

import java.util.ArrayList;
import java.util.Collections;
import sis.studentinfo.CourseSession;

public class CourseReport {

    private final ArrayList<CourseSession> sessions = new ArrayList<CourseSession>();

    public void add(CourseSession session) {
        sessions.add(session);
    }

    public String text() {
        Collections.sort(sessions);
        StringBuilder builder = new StringBuilder();
        for (CourseSession session : sessions) {
            builder.append(session.getDepartment() + " " + session.getNumber() + NEWLINE);
        }
        return builder.toString();
    }
}
