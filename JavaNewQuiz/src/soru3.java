import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen, iki sayi giriniz: ");
        int sayi1= input.nextInt();
        int sayi2= input.nextInt();

        double toplam = 0;
        for (int i=sayi1, j=1; i<=sayi2;i++,j++)
        {
            toplam+= (double)faktoriyel(j)/i;
        }
        System.out.println(toplam);


    }

    public static int faktoriyel(int sayi)
    {
        int fakt =1;
        for (int i=sayi; i>0;i--)
        {
            fakt=fakt*i;
        }
        return fakt;
    }
}
