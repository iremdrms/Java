import java.util.Scanner;

public class KitapTest {

    public static void main(String[] args) {

        Kitap kitapObj = new Kitap("Çalıkuşu",150);
        for(int i=0;i<14;i++)
        {
            if (i%2==0)
            {
                kitapObj.gitIleri();
            }
            else
            {
                kitapObj.gitGeri();
            }
        }

        System.out.println("Kitabin bitmesi icin geriye kalan sayfa sayisi: "+(kitapObj.getSayfaSayisi()- kitapObj.getSuankiSayfa()));

        Kitap kitapObj2 = new Kitap();
        Scanner input = new Scanner(System.in);
        System.out.print("Kitap adi giriniz: ");
        kitapObj2.setAd(input.next());

        do {
            System.out.print("Kitabin sayfa sayisini giriniz: ");
            kitapObj2.setSayfaSayisi(input.nextInt());

        }while(kitapObj2.getSayfaSayisi()%10!=0);

        if (kitapObj2.getSayfaSayisi()%10==0)
        {
            System.out.println("Tesekkür ederiz sayın kullanici, sonunda kitabi basima verecegiz :)");
        }









    }



}
