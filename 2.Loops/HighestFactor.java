
import java.util.Scanner;

public class HighestFactor{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=input.nextInt();
        // int hf=1;
        System.out.println("The highest factor of "+n+" is:");
        for(int i=n-1;i>=1;i--){
            if(n%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}