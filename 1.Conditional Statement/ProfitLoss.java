
import java.util.Scanner;

class ProfitLoss{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter cost price:");
        int cp=input.nextInt();
        System.out.println("Enter selling price:");
        int sp=input.nextInt();
        if(sp>cp){
            System.out.println("Profit is:"+(sp-cp));
        }else if(sp==cp){
            System.out.println("No profit, No loss"+(cp-sp));
        }else{
            System.out.println("Loss");
        }
    }
}