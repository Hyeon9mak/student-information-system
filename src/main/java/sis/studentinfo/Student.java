package sis.studentinfo;

import java.util.ArrayList;

public class Student {

    static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
    static final String IN_STATE = "CO";

    private final String name;
    private final ArrayList<String> grades = new ArrayList<String>();
    private int credits;
    private String state = "";

    public Student(String name) {
        this.name = name;
        this.credits = 0;
    }

    public String getName() {
        return name;
    }

    public boolean isFullTime() {
        return credits >= CREDITS_REQUIRED_FOR_FULL_TIME;
    }

    public int getCredits() {
        return credits;
    }

    public void addCredits(int credits) {
        this.credits += credits;
    }

    public boolean isInState() {
        return state.equals(Student.IN_STATE);
    }

    public void setState(String state) {
        this.state = state;
    }

    void addGrade(String grade) {
        grades.add(grade);
    }

    public double getGpa() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double total = 0.0;
        for (String grade : grades) {
            total += gradePointsFor(grade);
        }

        return total / grades.size();
    }

    private int gradePointsFor(String grade) {
        if (grade.equals("A")) { return 4; }
        if (grade.equals("B")) { return 3; }
        if (grade.equals("C")) { return 2; }
        if (grade.equals("D")) { return 1; }
        return 0;
    }
}