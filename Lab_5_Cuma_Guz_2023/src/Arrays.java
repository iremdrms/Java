import java.util.Random;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        //declare an array
        /*int [] myArray= new int[7];
        Random r = new Random();

        Scanner input = new Scanner(System.in);
        //System.out.print("Sayi giriniz: ");
        System.out.println("size ?");
        int size = input.nextInt();

        /*int[] array = new int[size];
        //fillArrayRandomNumber(array);
        fillArray(array);
        displayArray(array);

        System.out.println("Index\tValue");

        /*for (int i =0;i<=myArray.length; i++)
        {
            System.out.println(i+"\t"+myArray[i]+ " ");
        }*/

        //int[] secondArray = {14,7,5,9,124};
        //displayArray(secondArray);

        int[] newArray={5,14,7};
       // sumArray(newArray);

        //fillArray(newArray);
        //displayArray(newArray);
        fillArrayRandomNumber(newArray);
        displayArray(newArray);




    }

    public static void displayArray(int[] array)
    {

        for (int i =0;i<=array.length; i++)
        {
            System.out.println(i+"\t"+array[i]+ " ");
        }
    }

    public static void fillArrayRandomNumber(int[] newArray)
    {
        Random r =new Random();
        //i=0 newArray[0]=7,
        for (int i=0; i<newArray.length; i++)
        {
            newArray[i]=r.nextInt(6);
        }
    }

    public static void fillArray(int[] newArray)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i<newArray.length; i++)
        {
            System.out.println("Enter "+(i+1)+". element of array: ");
            newArray[i]= input.nextInt();
        }
    }

    public static void sumArray (int[] array)
    {
        int total=0;
        for (int i =0;i<array.length;i++)
            total += array[i];

        System.out.println("Total: "+total);
    }


//copy update summary
}
