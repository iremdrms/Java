import java.util.Random;

public class soru2 {

    public static void main(String[] args) {

        int[] Arr1 = new int[3];
        int[] Arr2 = new int[3];
        int[][] Multi= new int[3][3];

        int[] list= {1,5,4,3,7};

        Random random = new Random();

        for (int i=0; i<3;i++)
        {
            Arr1[i]=list[random.nextInt(5)];
            Arr2[i]=list[random.nextInt(5)];
        }

        for (int i =0; i<3 ; i++)
        {
            Multi[i][0]=Arr1[i];
            Multi[i][1]=Arr2[i];
            Multi[i][2] =Arr1[i]*Arr2[i];
        }

        System.out.println("3X1lik iki ayrı dizi oluşturuldu.");
        System.out.println("1. dizi: ");
        for (int i = 0;i<3;i++)
        {
            System.out.println(Arr1[i]);
        }
        System.out.println("2. dizi: ");
        for (int i = 0;i<3;i++)
        {
            System.out.println(Arr2[i]);
        }
        System.out.println("Yeni dizi:");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(Multi[i][j]+" ");
            }
            System.out.println();
        }


    }

}
