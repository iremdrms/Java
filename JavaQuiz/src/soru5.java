import java.util.Random;
import java.util.Scanner;

public class soru5 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int[][] newArray = new int[5][5];
        for (int i=0; i<5;i++)
        {
            for (int j=0; j<5;j++)
            {
                newArray[i][j] = random.nextInt(1,12);;
                System.out.print(" "+newArray[i][j]);
            }
            System.out.println();
        }
        System.out.print("Lütfen satır sayısını giriniz: ");
        int a = input.nextInt();

        for (int i= 0;i<newArray[0].length; i++)
        {
            System.out.print(" , "+faktoriyel(newArray[a-1][i]));
        }




    }

    public static int faktoriyel(int a)
    {

        int sonuc = 1;
        for (int i=a; i>0;i--)
        {
            sonuc *= i;
        }
        return sonuc;
    }

}
