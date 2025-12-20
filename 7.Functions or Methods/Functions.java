
import java.util.Scanner;

public class Functions{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number:");
        double a=input.nextDouble();
        System.out.println("Enter second number:");
        double b=input.nextDouble();
        System.out.println("The power of "+a+" to the power of "+b+" is:"+Math.pow(a, b));
        System.out.println("the square root of "+a+" is:"+Math.sqrt(a));
        System.out.println("the square root of "+b+" is:"+Math.sqrt(b));
        System.out.println("the cube of "+a+" is:"+Math.cbrt(a));
        System.out.println("the cube of "+b+" is:"+Math.cbrt(b));
        System.out.println("minimum value:"+Math.min(a, b));
        System.out.println("maximum value:"+Math.max(a, b));
    }
}