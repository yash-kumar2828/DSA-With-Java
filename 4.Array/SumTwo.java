import java.util.Arrays;

public class SumTwo {

    public static int[] twoSum(int[] arr, int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == x) {
                    return new int[]{i, j}; 
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {83, 21, 38, 69, 74, 12};
        int x = 33;
        int[] ans = twoSum(arr, x);
        System.out.println(Arrays.toString(ans)); 
    }
}

