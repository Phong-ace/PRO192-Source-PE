
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name:");
        String name = sc.nextLine();
        
        System.out.print("Enter price:");
        double price = sc.nextDouble();
        
        System.out.print("Enter warranty:");
        int warranty = sc.nextInt();
        
        SpecCar x = new SpecCar(name, price, warranty);
        
        System.out.println("1. Test toString()");
        System.out.println("2. Test getName()");
        System.out.println("3. Test getWarranty()");
        System.out.print("Enter TC(1,2,3): ");
        int choice = sc.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("\nOUTPUT:");
                System.out.println(x.toString());
                break;
            
            case 2:
                System.out.println("\nOUTPUT");
                System.out.println(x.getName());
                break;
                
            case 3:
                System.out.println("\nOUTPUT:");
                x.getWarranty();
                System.out.println(x.getWarranty());
                break;
        }
        
    }
}
