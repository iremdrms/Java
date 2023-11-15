import java.util.Random;
import java.util.Scanner;

public class Ornek {

    public static void main(String[] args) {

        Random r=new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Tekrar sayisini giriniz: ");
        int a = input.nextInt();

        Ornek object = new Ornek();
        object.YaziTura(a,r);



    }

    public void YaziTura (int a,Random r)
    {


        for (int i = 0;i<a;i++)
        {
            System.out.print(r.nextInt(2)+ " ");
        }






    }
}
