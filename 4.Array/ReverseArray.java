
public class ReverseArray {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(+arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        System.out.println("The array is:");
        printArray(arr);
        int i = 0, j = n - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        System.out.println("The reverse array is:");
        printArray(arr);
    }
}
