
import java.util.Scanner;

public class TwoDimensionalArray{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no of row:");
        int row=input.nextInt();
        System.out.println("Enter the no of column:");
        int col=input.nextInt();
        int arr1[][]=new int[row][col];
        System.out.println("Enter the value of array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j]=input.nextInt();
            }
        }

        System.out.println("The value of first matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("enter the number you want to search:");
        int x=input.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr1[i][j]==x){
                    System.out.println(x+" is found at index "+i+","+j);
                }
            }
            System.out.println();
        }
        
    }
}