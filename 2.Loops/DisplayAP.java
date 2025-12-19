
import java.util.Scanner;

public class DisplayAP{
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=input.nextInt();
        System.out.println("display the AP:");
        for(int i=1;i<=2*n-1;i+=2){
            System.out.print(i+" ");
        }
    }
}