
import java.util.Scanner;

public class TernaryStatement{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=input.nextInt();
        System.out.println(age>=18?"you can vote":"you can not vote");
    }
}