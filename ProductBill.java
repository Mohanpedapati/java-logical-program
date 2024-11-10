import java.util.Scanner;

public class ProductBill {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter product number: ");
        int productNumber = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter product cost: ");
        double productCost = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double totalBill = productCost * quantity;


        System.out.println("\n--- Product Report ---");
        System.out.println("Product Number: " + productNumber);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Cost: $" + productCost);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: $" + totalBill);

    
        scanner.close();
    }
}