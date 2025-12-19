
import java.util.Scanner;

public class AllEven{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=input.nextInt();
        System.out.println("All even number 1 to"+num );
        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}