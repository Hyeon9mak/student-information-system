package studentinfo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CourseSession {

    static final String NEWLINE = System.getProperty("line.separator"); // 모든 시스템(OS)에 맞춰 개행
    static final String ROSTER_REPORT_HEADER = "Student" + NEWLINE + "-" + NEWLINE;
    static final String ROSTER_REPORT_FOOTER = NEWLINE + "# students = ";


    private String department;
    private String number;
    private ArrayList<Student> students = new ArrayList<Student>();
    private Date startDate;

    public CourseSession(String department, String number, Date startDate) {
        this.department = department;
        this.number = number;
        this.startDate = startDate;
    }

    public String getDepartment() {
        return department;
    }

    public String getNumber() {
        return number;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public void enroll(Student student) {
        students.add(student);
    }

    public Student get(int index) {
        return students.get(index);
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        int numberOfDays = 16 * 7 - 3;  // weeks * days per week - 3 days
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }

    public String getRosterReport() {
        StringBuilder buffer = new StringBuilder();

        buffer.append(ROSTER_REPORT_HEADER);

        Student student = students.get(0);
        buffer.append(student.getName());
        buffer.append(NEWLINE);

        student = students.get(1);
        buffer.append(student.getName());
        buffer.append(NEWLINE);

        buffer.append(ROSTER_REPORT_FOOTER + students.size() + NEWLINE);

        return buffer.toString();
    }
}
