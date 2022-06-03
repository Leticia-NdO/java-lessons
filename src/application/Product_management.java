package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Product;

public class Product_management {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = scanner.nextInt();

        Product x = new Product(name, price, quantity);  // com o construtor personalizado, evita-se a criação de um produto vazio

        System.out.printf("Product data: " + x);


        System.out.println("Enter the number of products to be added in stock:");
        x.addProducts(scanner.nextInt());

        System.out.printf("Updated data: " + x);

        System.out.println("Enter the number of products to be removed from stock:");
        x.removeProducts(scanner.nextInt());
        
        System.out.printf("Updated data: " + x + "\n");

        scanner.close();
    }
}

