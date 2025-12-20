
import java.util.Scanner;

public class HollowRectangle{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no of row:");
        int row=input.nextInt();
        System.out.println("Enter the no. of column");
        int col=input.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||j==1||i==row||j==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}