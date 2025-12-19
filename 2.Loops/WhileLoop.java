
import java.util.Scanner;

public class WhileLoop{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter positive number:");
        int num=input.nextInt();
        System.out.println("The table of "+num);
        int i=1;
        while (i<=10) { 
            System.out.println(num+"*"+i+"="+num*i);
            i++;
        }
    }
}