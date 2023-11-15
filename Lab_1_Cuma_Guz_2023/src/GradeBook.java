import java.util.Scanner;

public class GradeBook {

    public void displayMessage ()
    {
        System.out.println("Welcome to the GradeBook for Java..!");

    }

    public void displayMessage2 (String word)
    {
        // System.out.println(word);
        System.out.printf("Author:%s",word);
    }

    public static void main(String[] args) {

        //GradeBook gradeBookObject = new GradeBook();
        //gradeBookObject.displayMessage();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        GradeBook gradeBookObject = new GradeBook();
        gradeBookObject.displayMessage2(word);
    }
}
