package sis.studentinfo;

public class Student {

    static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;

    private final String name;
    private int credits;

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
}