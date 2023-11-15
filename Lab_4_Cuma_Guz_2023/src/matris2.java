import java.util.Scanner;

public class matris2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("2 adet sayi giriniz: ");
        int a = input.nextInt();
        char fill = input.next().charAt(0);

        squareOfAsteriks(a,fill);

        while (true)
        {
            System.out.println("Hypotenuse:1 , isMultiple:2 , isEven:3 , squareOfAsteriks:4 , Exit:6");

            int option = input.nextInt();

            switch (option){

                case 1:
                    System.out.println();
            }
        }





    }

    public static void squareOfAsteriks (int a,char fill)
    {
        for (int i=1; i<=a; i++)
        {
            for (int j=1; j<=a; j++)
            {
                System.out.print(fill);
            }
            System.out.println();
        }
    }

    public double hypotenuse(double side1 ,double side2)
    {
        double result = Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
        return result;

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
    public static boolean isEven(int num)
    {
        return num%2==0?true:false;
    }
}
