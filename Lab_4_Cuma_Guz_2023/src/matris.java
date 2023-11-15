import java.util.Scanner;

public class matris {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        squareOfAsteriks(a);

    }

    public static void squareOfAsteriks (int a)
    {
        for (int i = 1; i<=a; i++)
        {
            for (int j = 1; j<=a; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
