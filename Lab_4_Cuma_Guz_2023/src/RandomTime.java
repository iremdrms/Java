import java.util.Random;
import java.util.Scanner;

public class RandomTime {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);


        int hakAdet = rnd.nextInt(10);
        int dogruAdet = 0;

        while(hakAdet != 0){
            int random1 = rnd.nextInt(10);
            int random2 = rnd.nextInt(10);
            System.out.print(random1 + " x " + random2 + " :");
            int sonuc = input.nextInt();
            if(random1*random2 != sonuc){
                hakAdet--;
                System.out.println("Yanlis yaptiniz. Kalan hakkınız :"+hakAdet);
            }else{
                dogruAdet++;
                System.out.println("Dogru bildiniz. Dogru sayiniz :"+dogruAdet);
                if(dogruAdet == 10){
                    break;
                }
            }
        }
    }
}
