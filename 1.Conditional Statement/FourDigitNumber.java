
import java.util.Scanner;

public class FourDigitNumber{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=input.nextInt();
        if(num>999 && num<10000){
            System.out.println(num+" is a four digit number");
        }else{
            System.out.println(num+" is not a four digit number");
        }
    }
}