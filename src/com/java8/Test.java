package com.java8;

import java.util.*;

public class Test {

	public static void main(String[] args) {

		List<Product> products = Arrays.asList(new Product(1, "Laptop", "Electronics", 55000, 5),
				new Product(2, "Smartphone", "Electronics", 56000, 10),
				new Product(3, "Refrigerator", "Home Appliance", 30000, 2),
				new Product(4, "TV", "Electronics", 57000, 3), new Product(5, "Microwave", "Home Appliance", 10000, 4),
				new Product(6, "Mixer", "Kitchen", 3000, 15), new Product(7, "Headphones", "Electronics", 2500, 25),
				new Product(8, "Chair", "Furniture", 1500, 20), new Product(9, "Table", "Furniture", 3500, 10),
				new Product(10, "Fan", "Home Appliance", 2000, 2));

		Operation operation = new Operation(products);

		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n========= Product Menu =========");
			System.out.println("1. Show All Products");
			System.out.println("2. Show Costly Products (Price > 10000)");
			System.out.println("3. Product Names in Uppercase");
			System.out.println("4. Sort by Price ASC");
			System.out.println("5. Sort by Price DESC");
			System.out.println("6. Group By Category");
			System.out.println("7. Total Inventory Value");
			System.out.println("8. Show Electronics Products");
			System.out.println("9. Max Price Product");
			System.out.println("10. Second Max Price Product");
			System.out.println("11. Show Name and Price");
			System.out.println("12. Costly and Cheap Partition");
			System.out.println("13. Need to Buy Electronics (Qty <= 3)");
			System.out.println("14. Top 3 Expensive Products");
			System.out.println("15. First 3 Products");
			System.out.println("16. Highest Among First 3 Products");
			System.out.println("17. Find Product by ID");
			System.out.println("18. Total Inventory Quantity");
			System.out.println("19. Total Inventory Value using Reduce");
			System.out.println("20. Concatenate All Product Names");
			System.out.println("21. Show All Names as Array");
			System.out.println("22. Discount on above 50000");
			System.out.println("23 Products of Qty");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				operation.showAllProducts();
				break;
			case 2:
				operation.showCostlyProductsAbove(10000);
				break;
			case 3:
				operation.showProductNamesInUppercase();
				break;
			case 4:
				operation.sortByPriceAsc();
				break;
			case 5:
				operation.sortByPriceDesc();
				break;
			case 6:
				operation.groupByCategory();
				break;
			case 7:
				operation.totalInventoryValue();
				break;
			case 8:
				operation.showElectronicsProducts();
				break;
			case 9:
				operation.maxPriceProduct();
				break;
			case 10:
				operation.secondMaxPriceProduct();
				break;
			case 11:
				operation.showNameAndPrice();
				break;
			case 12:
				operation.showCostlyAndCheap();
				break;
			case 13:
				operation.showElectronicsToBuy();
				break;
			case 14:
				operation.topNExpensive(3);
				break;
			case 15:
				operation.firstN(3);
				break;
			case 16:
				operation.firstNExpensive(3);
				break;
			case 17:
				System.out.print("Enter Product ID: ");
				int id = sc.nextInt();
				operation.findProductById(id);
				break;
			case 18:
				operation.totalInventoryQuantity();
				break;
			case 19:
				operation.totalCostWithReduce();
				break;
			case 20:
				operation.concatenateNames();
				break;
			case 21:
				operation.showNameArray();
				break;

			case 22: {
				operation.discount_3000();
				break;
			}
			case 23: {
				operation.longestProductName();
				break;
			}
			case 0:
				System.out.println("Terminatiing...");
				break;
			default:
				System.out.println("Invalid choice! Try again.");

			}

		} while (choice != 0);

		sc.close();
	}
}
