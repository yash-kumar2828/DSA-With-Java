class SelectionSort{
    public static void ascendingOrder(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=arr[i];
            int minIndex=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }

    }
    public static void descendingOrder(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int max=arr[i];
            int maxIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>max){
                    max=arr[j];
                    maxIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[maxIndex];
            arr[maxIndex]=temp;
        }
    }    
    public static void main(String[] args) {
        int[] arr={12,1,-3,-5,10,23,11,20};
        System.out.println("Original array:");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        ascendingOrder(arr);
        System.out.println("Selection sort using ascending order:");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        descendingOrder(arr);
        System.out.println("Selection sort using descending order:");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}