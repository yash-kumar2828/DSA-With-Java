
import java.util.Scanner;

public class VolumeOfSphere{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a radius:");
        double r=input.nextDouble();
        double PI=3.14;
        double V=4/3*(PI*r*r*r);
        System.out.println("Volume of sphere is:"+V);
    }
}