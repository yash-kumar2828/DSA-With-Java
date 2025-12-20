
import java.util.Scanner;

public class ArithmaticOperator{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to simple calculator:");
            System.out.println("Enter first number:");
            int a=input.nextInt();
            System.out.println("Enter second number:");
            int b=input.nextInt();
            System.out.println("Your choices are:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus");
            System.out.println("Enter your choice:");
            int choice=input.nextInt();
            if(choice==1){
                System.out.println(a+"+"+b+"="+(a+b));
            }
            else if(choice==2){
                System.out.println(a+"-"+b+"="+(a-b));
            }
            else if(choice==3){
                System.out.println(a+"*"+b+"="+(a*b));
            }
            else if(choice==4){
                System.out.println(a+"/"+b+"="+(a/b));
            }
            else if(choice==5){
                System.out.println(a+"%"+b+"="+(a%b));
            }
            else{
                System.out.println("Invalid choice");
            }
    }
}