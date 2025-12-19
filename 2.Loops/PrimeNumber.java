
import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=input.nextInt();
        boolean flag=false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=true;
                break;
            }
        }
        if(n==1){
            System.out.println(n+" is not a prime number");
        }
        else if(flag==false){
            System.out.println(n+" is a prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }
    }
}