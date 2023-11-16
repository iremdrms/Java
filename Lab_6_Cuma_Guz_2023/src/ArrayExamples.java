public class ArrayExamples {

    public static void main(String[] args) {

        //int [] myArray = {5,7,14};
        //int i = countEvenNumber(myArray);
        //System.out.println(i);


        //displayArray(myArray);


        /*for (int value:myArray)
        {
            System.out.println(value+" ");
        }*/

        //int [] newArray =assigntArray(myArray);
        //displayArray(newArray);
        int[] thirdArray = {1,4,7,9,8,14,10,3};
        createNewArray(thirdArray);

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
    public static int countEvenNumber(int[] array)
    {
        int count=0;
        for (int i=0;i<array.length;i++)
        {
            if (array[i]%2==0)
            {
                count++;
            }
        }
        return count;
    }

    public static void createNewArray(int[] myArray)
    {
        int[] evenArray = new int[countEvenNumber(myArray)];
        int indexEven =0;
        for (int i=0;i<myArray.length;i++)
        {
            if (myArray[i]%2==0)
            {
                evenArray[indexEven]=myArray[i];
                indexEven++;
            }
        }
        displayArray(evenArray);

    }
}
