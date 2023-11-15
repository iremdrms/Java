import java.util.Scanner;

public class Examples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        /*for (int i = a; i<=b; i++)
        {
            System.out.println(i+ " ");
        }*/

        int sum=0;
        for (int i = 2;i<=20; i+=2)
        {
            sum +=i;
        }
        System.out.println("Result: "+sum);
    }
}
