package sis.studentinfo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class CourseSession implements Comparable<CourseSession> {

    private static int count;
    private final String department;
    private final String number;
    private final List<Student> students = new ArrayList<Student>();
    private final Date startDate;
    private int numberOfCredits;

    private CourseSession(String department, String number, Date startDate) {
        this.department = department;
        this.number = number;
        this.startDate = startDate;
    }

    public static CourseSession create(String department, String number, Date startDate) {
        incrementCount();
        return new CourseSession(department, number, startDate);
    }

    private static void incrementCount() {
        count = count + 1;
    }

    public static void resetCount() {
        count = 0;
    }

    public static int getCount() {
        return count;
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
        student.addCredits(numberOfCredits);
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

    public List<Student> getAllStudents() {
        return students;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public int compareTo(CourseSession that) {
        int compare = this.getDepartment().compareTo(that.getDepartment());
        if (compare == 0){
            compare = this.getNumber().compareTo(that.getNumber());
        }
        return compare;
    }
}
