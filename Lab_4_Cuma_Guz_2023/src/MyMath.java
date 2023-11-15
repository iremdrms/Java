import java.util.Scanner;

public class MyMath {
    public static void main(String[] args) {

        MyMath mathObj = new MyMath();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two sides: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();

        System.out.println(mathObj.hypotenuse(side1,side2));
    }

    public double hypotenuse(double side1 ,double side2)
    {
        double result = Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
        return result;

    }
}
