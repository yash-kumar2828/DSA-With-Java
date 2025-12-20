
import java.util.Scanner;

public class Combination{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=input.nextInt();
        System.out.println("Enter the value of r:");
        int r=input.nextInt();
        int nCr=fact(n)/(fact(r)*fact(n-r));
        System.out.println("The nCr is:"+nCr);
    }
    public static int fact(int n){
        int fact=1;
        if(n==0 || n==1){
            return 1;
        }
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}