import java.util.Scanner;

public class Examples {

    public static void main(String[] args) {
         double total=0;
         double gradeCounter=1;
         Scanner input = new Scanner(System.in);
         double grade;

         while (gradeCounter<=10)
         {
             System.out.println("Enter the next grade: ");
             grade = input.nextDouble();
             total += grade;
             gradeCounter++;
         }

         double avg = total/gradeCounter;
        System.out.println("Average: "+avg);


    }
}
