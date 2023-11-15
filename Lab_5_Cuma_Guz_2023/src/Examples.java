import java.util.Random;
import java.util.Scanner;

public class Examples {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random r = new Random();

        // generate random number between 0 and 10

        //Examples object = new Examples();

       // object.generateRandomDoubleMatrix(r);
        //object.generateRandomNumber(r);

        //generateRandomDoubleMatrix(r);
        //generateRandomNumber(r);
        findProbabilityHeadTail(r,input);

    }

    public static void generateRandomNumber (Random r)
    {


        // generate random number between 0 and 10
        for (int i=0;i<14;i++)
        {
            System.out.print(r.nextInt(10)+ " ");
        }

    }

    public static void generateRandomDoubleMatrix(Random r)
    {
        int a=0;
        //forla da olurdu
        while (a<2) {

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(r.nextInt(6) + " ");
                }
                System.out.println();
            }

            System.out.println();
            a++;

        }

    }

    public static void findProbabilityHeadTail(Random r,Scanner input)
    {
        System.out.println("tekrar sayisini giriniz: ");
        int a = input.nextInt();
        int randomNumber,countHead=0, countTail=0;
        for (int i=0;i<a;i++)
        {
            randomNumber=r.nextInt(2);
            if (randomNumber==1)
                countHead++;
            else
                countTail++;

        }

        System.out.println("Number of Head: "+(double)countHead/a +"\nNumber of Tail:"+(double)countTail/a);
    }

    //bunu kullaıcı girişli yap
}
