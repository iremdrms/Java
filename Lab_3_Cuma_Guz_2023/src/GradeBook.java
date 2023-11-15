import java.util.Scanner;

public class GradeBook {

    private String courseName;

    public GradeBook()
    {};
    public GradeBook(String courseName)
    {
        this.courseName=courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayMessage()
    {
        System.out.println("Welcome to the grade book for "+getCourseName());
    }
    public void determineClassAverage()
    {
        double total=0;
        double gradeCounter=1;
        Scanner input = new Scanner(System.in);
        double grade;

        while (gradeCounter<=10)
        {
            System.out.print("Enter the next grade: ");
            grade=input.nextDouble();
            total += grade;
            gradeCounter++;
        }
        double avg = total/gradeCounter;
        System.out.println("Average: "+avg);

    }
}
