import java.util.Scanner;

public class toplamaornek2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        int a = input.nextInt();

        System.out.println("isEven " +isEven(a));
    }
    public static boolean isEven(int num)
    {
        return num%2==0?true:false;
    }
}
