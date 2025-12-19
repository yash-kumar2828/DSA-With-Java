
import java.util.Scanner;

class AbsoluteValue{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=input.nextInt();
        if(num>=0){
            System.out.println("number is :"+num);
        }else{
            System.out.println("number is :"+(-num));
        }
    }
}