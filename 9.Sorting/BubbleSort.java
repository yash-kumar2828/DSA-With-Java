
class BubbleSort {

    public static void ascendingOrder(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void descendingOrder(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 25, 4, 7, 10};
        System.out.println("Without sorting element:");
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
        System.out.println();

        ascendingOrder(arr);
        System.out.println("Bubble sort using ascending order:");
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
        
        descendingOrder(arr);
        System.out.println("Bubble sort using descending order:");
        for (int ele : arr) {
            System.out.print(ele+" ");
        }

    }
}
