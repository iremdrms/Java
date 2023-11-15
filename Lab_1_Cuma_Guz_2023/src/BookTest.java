import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Book: ");
        String word = input.nextLine();

        Book bookObj = new Book();
        bookObj.setCourseName(word);
        bookObj.displayMessage();
    }
}
