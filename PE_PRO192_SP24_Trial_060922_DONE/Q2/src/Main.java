
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        
        System.out.print("Enter price: ");
        int price = sc.nextInt();
        
        Coffee y = new Coffee(name, size);
        SpecCoffee x = new SpecCoffee(name, size, price);
        
        System.out.println("1. Test toString()");
        System.out.println("2. Test setData()");
        System.out.println("3. Test getValue()");
        
        
        int choice;
        System.out.print("Enter TC(1,2,3): ");
        choice = sc.nextInt();
        
        if(choice == 1) {
            System.out.println("\nOUTPUT:");
            System.out.println(y.toString());
            System.out.println(x.toString());
        }
        
        if(choice == 2) {
            System.out.println("\nOUTPUT:");
            x.setData();
            System.out.println(x.getName() + ", " + x.getSize());
        }
        
        if(choice == 3) {
            System.out.println("\nOUTPUT");
            System.out.println(x.getValue());
        }
    }
}
