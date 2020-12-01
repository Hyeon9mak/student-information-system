public class StudentTest extends junit.framework.TestCase {
    public void testCreate(){
        Student student = new Student("Hyeon Gu");
        String studentName = student.getName();
        assertEquals("Hyeon Gu", studentName);

        Student secondStudent = new Student("Dong Hyeon");
        String secondStudentName = secondStudent.getName();
        assertEquals("Dong Hyeon", secondStudentName);

        assertEquals("Hyeon Gu", student.getName());
    }
}