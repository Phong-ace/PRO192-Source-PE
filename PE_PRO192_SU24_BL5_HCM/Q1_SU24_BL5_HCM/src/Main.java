
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Profession x = null;
        
        System.out.println("1.Test Default constructor");
        System.out.println("2.Test Parameterized constructor");
        System.out.println("3.Test Getter or Setter");
        System.out.print("Enter your choice(1-3):");
        int choice = Integer.parseInt(sc.nextLine());
        
        switch(choice) {
            case 1:
                x = new Profession();
                System.out.println("\nOUTPUT:");
                System.out.println(x);
                break;
                
            case 2:
                System.out.print("Enter name:");
                String name = sc.nextLine();
                
                System.out.print("Enter age:");
                int age = sc.nextInt();
                sc.nextLine();
                
                System.out.print("Enter major:");
                String major = sc.nextLine();
                
                x = new Profession(name, age, major);
                System.out.println("\nOUTPUT:");
                System.out.println(x.toString());
                break;
                
            case 3:
                System.out.print("Enter name:");
                name = sc.nextLine();
                x = new Profession();
                System.out.println("\nOUTPUT");
                
                x.setName(name);
                System.out.println(x.toString());
                break;
                
            case 4:
                System.out.println("");
                
        }
        
    }
}
