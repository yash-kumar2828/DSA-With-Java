
import java.util.Scanner;

class Rotate{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.err.println("Always enter the square matrix");
        System.out.println("Enter the no of row:");
        int row=input.nextInt();
        System.out.println("Enter the no of column:");
        int col=input.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter the value of array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println("The original matrix is :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // Transpose the matrix 
        for(int i=0;i<row;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }


        System.out.println("Rotate 90 degree:");
        for(int i=0;i<row;i++){
            int startCol=0;
            int endCol=row-1;
            while(startCol<endCol){
                int temp=arr[i][startCol];
                arr[i][startCol]=arr[i][endCol];
                arr[i][endCol]=temp;
                startCol++;
                endCol--;
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}