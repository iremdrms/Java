import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz..");
        int a = input.nextInt();

        for (int i=1;i<=a;i++)
        {
            for (int j = 1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
