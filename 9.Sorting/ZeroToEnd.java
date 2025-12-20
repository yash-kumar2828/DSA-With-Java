class ZeroToEnd{
    public static void main(String[] args) {
        int[] arr={0,1,2,-2,14,5,0,1,0,4,0,10};

        System.out.println("Original Array:");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]==0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp; 
                }
            }
        }
        System.out.println("Moves all zero are the end:");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}