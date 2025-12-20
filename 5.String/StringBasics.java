
import java.util.Scanner;

public class StringBasics{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char[] arr={'y','a','s','h'};
        // System.out.println("Enter a name:");
        // String name=input.next();
        // System.out.println(name);

        System.out.println("Enter a name:");
        String name2=input.nextLine();
        System.out.println(name2);

        for(char ele : arr){
            System.out.print(ele);
        }

    }
}