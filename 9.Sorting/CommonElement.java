import java.util.ArrayList;

class CommonElement {
    public static void sorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,1,5};
        int[] b = {5,2,10,7,9,11,3,1,1,5};

        sorted(a);
        for(int ele : a){
            System.out.print(ele+" ");
        }
        System.out.println();


        sorted(b);
        for(int ele : b){
            System.out.print(ele+" ");
        }
        System.out.println();

        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                ans.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println(ans);
    }
}