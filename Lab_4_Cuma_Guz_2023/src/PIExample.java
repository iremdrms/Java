import java.util.Scanner;

public class PIExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Virgülden sonra istediğiniz basamak sayısı: ");
        int basamakSayisi = input.nextInt();

        double pi = calculatePi(basamakSayisi);

        System.out.println("π sayısı " + basamakSayisi + " basamakla: " + pi);
    }

    public static double calculatePi(int n) {
        double pi = 0.0;
        for (int i = 0; i < n; i++) {
            pi += (4.0 / (2 * i + 1)) * (i % 2 == 0 ? 1 : -1);
        }
        return pi;
    }
}
