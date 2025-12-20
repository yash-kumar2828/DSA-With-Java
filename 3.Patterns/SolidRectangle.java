
import java.util.Scanner;

public class SolidRectangle{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no of row:");
        int row=input.nextInt();
        System.out.println("Enter the no. of column");
        int col=input.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("* ");
            }
            System.err.println();
        }
    }
}