
import java.util.Scanner;

public class Strings{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=input.next();
        System.out.println("Your name is :"+name);
        System.out.println("Length:"+name.length());

        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }

        String str1="yash";
        String str2="kumar";
        if(str1.compareTo(str2)==0){
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }


        String sentence="I am BCA 3rd year student.";
        String set=sentence.substring(12,sentence.length());
        System.out.println(set);

    }
}