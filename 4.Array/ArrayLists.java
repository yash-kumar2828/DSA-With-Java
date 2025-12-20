
import java.util.ArrayList;

public class ArrayLists{
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(7); a.add(4); a.add(11); a.add(15);

        ArrayList<Integer> b=new ArrayList<>();
        b.add(1); b.add(2); b.add(3);

        ArrayList<Integer> c=new ArrayList<>();
        c.add(6); c.add(4); c.add(11);

        ArrayList<Integer> d=new ArrayList<>();
        d.add(7); d.add(4); d.add(11); d.add(15); d.add(5);

        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c); arr.add(d);
        System.out.println(arr);

        // Using for loop 
        System.out.println("Using For loop:");
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
        
        // Using ForEach Loop
        System.out.println("Using ForEach Loop:");
        arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(10); arr.get(arr.size()-1).add(20);
        for(ArrayList<Integer> list : arr){
            for (int ele : list) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}