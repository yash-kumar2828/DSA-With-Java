
import java.util.Scanner;

public class AreaOfCircle{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a radius:");
        double r=input.nextDouble();
        double PI=3.14;
        double A=PI*r*r;
        System.out.println("The area of circle is :"+A);
    }
}