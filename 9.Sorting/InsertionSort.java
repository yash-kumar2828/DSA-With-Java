class InsertionSort{
    public static void ascendingOrder(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void descendingOrder(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]>arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,5,4,3,2,6,7,10,2,15,5};
        System.out.println("Original array:");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        ascendingOrder(arr);        
        System.out.println("Insertion sort using ascending order:");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        descendingOrder(arr);
        System.out.println("Insertion sort using descending order:");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}