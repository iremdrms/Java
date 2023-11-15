public class GradeBook {

    private String courseName;

    public GradeBook (String courseName)
    {
        this.courseName=courseName;
    }
    public GradeBook()
    {

    };

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
    public void displayMessage()
    {
        System.out.printf("Coursename: %s",getCourseName());

    }

    public static void main(String[] args) {

        GradeBook gradeBookObj1 = new GradeBook("Data Structure");
        gradeBookObj1.displayMessage();
        System.out.println();
        gradeBookObj1.setCourseName("Intro Data St.");
        gradeBookObj1.displayMessage();
    }
}
