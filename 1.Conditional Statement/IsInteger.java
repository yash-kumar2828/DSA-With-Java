
import java.util.Scanner;

public class IsInteger{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        double num=input.nextDouble();
        int x=(int)num;
        if(num-x==0){
            System.out.println(x+" is an integer number");
        }else{
            System.out.println(num+" is not an integer number");
        }
    }
}