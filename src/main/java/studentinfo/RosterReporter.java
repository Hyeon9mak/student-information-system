package studentinfo;

public class RosterReporter {

    static final String NEWLINE = System.getProperty("line.separator"); // 모든 시스템(OS)에 맞춰 개행
    static final String ROSTER_REPORT_HEADER = "Student" + NEWLINE + "-" + NEWLINE;
    static final String ROSTER_REPORT_FOOTER = NEWLINE + "# students = ";

    private final CourseSession session;

    RosterReporter(CourseSession session) {
        this.session = session;
    }
    
    String getReport() {
        StringBuilder buffer = new StringBuilder();

        buffer.append(ROSTER_REPORT_HEADER);

        for (Student student : session.getAllStudents()) {
            buffer.append(student.getName());
            buffer.append(NEWLINE);
        }

        buffer.append(ROSTER_REPORT_FOOTER + session.getAllStudents().size() + NEWLINE);

        return buffer.toString();
    }
}
