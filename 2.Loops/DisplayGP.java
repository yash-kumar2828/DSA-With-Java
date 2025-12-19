
import java.util.Scanner;

public class DisplayGP{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=input.nextInt();
        int a=1,r=2;
        System.out.println("Display the GD:");
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a=a*r;
        }
    }
}