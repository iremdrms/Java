import java.util.Random;
import java.util.Scanner;

public class soru2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int [] firstArray= new int[7];
        fillArrayRandomNumber(firstArray,random);
        System.out.println();

        int [] secondArray = new int[7];
        fillSecondArray(secondArray,input);
    }

    public static void fillArrayRandomNumber(int[] firstArray, Random random)
    {
        for (int i =0; i<firstArray.length;i++)
        {
            firstArray[i]=random.nextInt(11);
            System.out.print(firstArray[i]+" ");

        }

    }

    public static void fillSecondArray(int[] secondArray,Scanner input)
    {
        System.out.print("Bir sayi giriniz: ");
        int a = input.nextInt();
        for (int i=0; i<secondArray.length;i++)
        {
            secondArray[i]=a*(i+1);
            System.out.print(secondArray[i]+ " ");
        }
    }

}

