
import java.util.Scanner;

public class SquareOfNumber{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=input.nextInt();
        System.out.println("Square of "+num+" is :"+(num*num));
    }
}