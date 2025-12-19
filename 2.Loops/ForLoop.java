
import java.util.Scanner;

public class ForLoop{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter positive number:");
        int num=input.nextInt();
        System.out.println("The table of "+num);
        for(int i=1;i<=10;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}