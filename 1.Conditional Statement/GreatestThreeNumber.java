
import java.util.Scanner;

class GreatestThreeNumber{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1=input.nextInt();
        System.out.println("Enter second number:");
        int n2=input.nextInt();
        System.out.println("Enter third number:");
        int n3=input.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println(n1+" is a greatest number");
        }else if(n2>n1 && n2>n3){
            System.out.println(n2+" is a greatest number");
        }else if(n3>n1 && n3>n2){
            System.out.println(n3+" is a greater number");
        }else{
            System.out.println("all number are equal");
        }
    }
}