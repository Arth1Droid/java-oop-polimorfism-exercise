package exercise1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import exercise1.entities.ImportedProduct;
import exercise1.entities.Product;
import exercise1.entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> products = new ArrayList<>();
		
		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i < n; i++) {
			System.out.printf("Product #%d data: \n", i + 1);
			System.out.println("Common, Used or Imported (c/u/i)");
			char option = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Price: ");
			double price = sc.nextDouble();
			
			Product communProduct = new Product(name,price);
			products.add(communProduct);
			
			if (option == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				ImportedProduct importedProduct = new ImportedProduct(name,price,customsFee);
				products.add(importedProduct);

			}
			if (option == 'u') {
				System.out.println("Manufacture Date (DD/MM/YYYY): ");
				sc.nextLine();
				Date manufactureDate = sdf.parse(sc.nextLine());
				UsedProduct usedProduct = new UsedProduct(name,price, manufactureDate);
				products.add(usedProduct);
			}
			
			
		}
		
		System.out.println("PRICE TAGS: ");
		
		for (Product product : products) {
			System.out.println(product);
		}
		

	}

}
