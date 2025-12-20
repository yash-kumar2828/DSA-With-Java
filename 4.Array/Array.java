
import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int size=input.nextInt();
        System.out.println("Enter the value of array");
        int arr[]=new int[size];
        
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }

        System.out.println("The value of array:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}