
import java.util.Scanner;

public class ElseIfStatement{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1=input.nextInt();
        System.out.println("Enter second number:");
        int n2=input.nextInt();
        System.out.println("Enter third number:");
        int n3=input.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println(n1+" is a greater number");
        }else if(n2>n1 && n2>n3){
            System.out.println(n2+" is a greater number");
        }else{
            System.out.println(n3+" is a greater number");
        }
    }
}