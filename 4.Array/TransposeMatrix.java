
import java.util.Scanner;

class TransposeMatrix{
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
        

        // Transpose condition 
        for(int i=0;i<row;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        System.out.println("The transpose matrix is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}