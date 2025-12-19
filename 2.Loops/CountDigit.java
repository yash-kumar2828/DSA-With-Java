
import java.util.Scanner;

public class CountDigit{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=input.nextInt();
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println("the number of digit  is: "+count);
    }
}