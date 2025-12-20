
import java.util.Scanner;

public class PascalTriangle{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=input.nextInt();
        System.out.println("The pascal triangle is:");
        for(int i=0;i<=n;i++){
            for(int j=1;j<n-1;j++){
                System.out.print(" "+" ");
            }
            for(int j=0;j<=i;j++){
                int iCj=fact(i)/(fact(j)*fact(i-j));
                System.out.print(iCj+" ");
            }
            System.out.println();
        }
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