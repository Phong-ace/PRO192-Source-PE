
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String maker;
        int price;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maker: ");
        maker = sc.nextLine();

        System.out.print("Enter price: ");
        price = sc.nextInt();

        Cake cake = new Cake(maker, price);

        int choice;
        System.out.println("1. Test getMaker()");
        System.out.println("2. Test setPrice()");
        System.out.print("Enter TC(1 or 2): ");
        choice = sc.nextInt();

        if(choice == 1) {
            System.out.println("\nOUTPUT");
            System.out.println(cake.getMaker());
        }
        
        if(choice == 2){
            System.out.print("Enter new price: ");
            price = sc.nextInt();
            Cake newCake = new Cake(maker, price);
            newCake.setPrice(price);
            System.out.println("\nOUTPUT");
            System.out.println(newCake.getPrice());
        }

    }
}
