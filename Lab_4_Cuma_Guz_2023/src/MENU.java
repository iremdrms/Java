import java.util.Scanner;

public class MENU {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int option=0;
        do{
            System.out.println("Hypotenuse:1 , isMultiple:2 , isEven:3 , squareofAsteriks:4 , Exit:6");
            option = input.nextInt();

            switch (option)
            {
                case 1 :
                    System.out.println(MENU.hypotenuse(input));
                    break;
                case 2 :
                    System.out.println(MENU.isMultiple(input));
                    break;
                case 3 :
                    System.out.println(MENU.isEven(input));
                    break;
                case 4 :
                    squareOfAsteriks(input);
                    break;

            }






        }while(option!=6);




    }

    public static void squareOfAsteriks (Scanner input)
    {
        System.out.println("bir sayi gir:");
        int a = input.nextInt();
        System.out.println("karakter gir:");
        char fill = input.next().charAt(0);


        for (int i=1; i<=a; i++)
        {
            for (int j=1; j<=a; j++)
            {
                System.out.print(fill);
            }
            System.out.println();
        }
    }
    public static double hypotenuse(Scanner input)
    {

        System.out.println("kenarlari giriniz: ");
        int a = input.nextInt();
        int b = input.nextInt();

        double result = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        return result;

    }
    public static boolean isMultiple(Scanner input)
    {
        System.out.println("2 tane sayi gir: ");
        int b=input.nextInt();
        int a = input.nextInt();
        //if (b%a==0) {
        //   return true;
        //}
        //else
        //return false;

        return b%a==0 ? true:false;
    }
    public static boolean isEven(Scanner input)
    {
        System.out.println("bir sayi giriniz: ");
        int num = input.nextInt();
        return num%2==0?true:false;
    }
}
