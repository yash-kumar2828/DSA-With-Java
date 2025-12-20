
import java.util.Scanner;

public class SumOfArray{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the value of array:");
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("The value of array");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        System.out.println("\nThe sum of array is:"+sum);
    }
}




