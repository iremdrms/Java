public class ArrayExamples {

    public static void main(String[] args) {

        int [] myArray = {5,7,14};
        //displayArray(myArray);

        /*for (int value:myArray)
        {
            System.out.println(value+" ");
        }*/

        //int [] newArray =assigntArray(myArray);
        //displayArray(newArray);
        int[] thirdArray = {1,4,7,9,8,14,10,3};

    }

    public static void displayArray(int[] myArray)
    {
        for (int i=0; i<myArray.length; i++)
        {
            System.out.println(i+"\t"+myArray[i]);
        }
    }
    public static int[] assigntArray(int[] myArray) {
        int[] secondArray = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++) {
            secondArray[i] = myArray[i] * 2;


        }
        return secondArray;

    }

    public static void createNewArray(int[] thirdArray)
    {
        int[] newArray;
        int boyut=0;

        for (int i=0; i<thirdArray.length; i++)
        {
            if (thirdArray[i]%2==0)
            {
                newArray[boyut]=thirdArray[i];
                boyut++;
            }
        }

    }
}
