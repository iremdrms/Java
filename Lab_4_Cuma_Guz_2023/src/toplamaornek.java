import java.util.Scanner;

public class toplamaornek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sayilari giriniz: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(isMultiple(a,b));
        System.out.println(isMultiple(a,b)==true?b+" is Multiple of "+a : b+ " is not Multiple of " +a);


    }
    public static boolean isMultiple(int a,int b)
    {
        //if (b%a==0) {
        //   return true;
        //}
        //else
        //return false;

        return b%a==0 ? true:false;
    }
}
