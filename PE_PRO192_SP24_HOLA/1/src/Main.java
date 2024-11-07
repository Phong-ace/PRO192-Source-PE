
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter owner: ");
        String owner = sc.nextLine();
        
        System.out.print("Enter weight: ");
        int weight = sc.nextInt();
        
        System.out.println("1. Test getOwner()");
        System.out.println("2. Test setWeight()");
        System.out.print("Enter TC (1 or 2): ");
        
        Zebra x = new Zebra(owner, weight);
        
        int choice = Integer.parseInt(sc.nextLine());
        
        
        switch(choice){
            case 1:
                System.out.println("\nOUTPUT:");
                System.out.println(x.getOwner());
                break;
                
            case 2:
                System.out.print("Enter new weight: ");
                weight = sc.nextInt();
                System.out.println("\nOUTPUT:");
                x.setWeight(weight);
                break;
        }
    }
}
