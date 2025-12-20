class Sum {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 5, 6, 10};
        int target = 9;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("The sum of two number is: "+arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
