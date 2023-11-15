public class GradeBook2 {

    private String courseName;

    public void setCourseName(String courseName)
    {
        this.courseName=courseName;
    }
    public String getCourseName()
    {
        return courseName;
    }
    public void displayMessage()
    {
        System.out.println("Welcome to the gradebook for " + getCourseName());
    }
}
