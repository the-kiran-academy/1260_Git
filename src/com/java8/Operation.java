package com.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Operation {

	private List<Product> products;

	public Operation(List<Product> products) {
		this.products = products;
	}

	public void showAllProducts() {
		products.forEach(System.out::println);
	}

	public void showCostlyProductsAbove(double price) {
		products.stream().filter(p -> p.price > price).forEach(System.out::println);
	}

	public void showProductNamesInUppercase() {
		products.stream().map(p -> p.name.toUpperCase()).forEach(System.out::println);
	}

	public void sortByPriceAsc() {
		products.stream().sorted(Comparator.comparingDouble(Product::getPrice)).forEach(System.out::println);
	}

	public void sortByPriceDesc() {
		products.stream().sorted(Comparator.comparingDouble(Product::getPrice).reversed()).forEach(System.out::println);
	}

	public void groupByCategory() {
		products.stream().collect(Collectors.groupingBy(Product::getCategory))
				.forEach((cat, list) -> System.out.println(cat + " total item  = " + list.size()));
	}

	public void totalInventoryValue() {
		double totalAmount = products.stream().mapToDouble(p -> p.quantity * p.price).sum();
		System.out.println("Total Inventory Value = " + totalAmount);
	}

	public void showElectronicsProducts() {
		products.stream().filter(p -> "Electronics".equals(p.category)).forEach(System.out::println);
	}

	public void maxPriceProduct() {
		products.stream().max(Comparator.comparingDouble(p -> p.price)).ifPresent(System.out::println);
	}

	public void secondMaxPriceProduct() {
		products.stream().sorted(Comparator.comparingDouble(Product::getPrice).reversed()).skip(1).findFirst()
				.ifPresent(p -> System.out.println("Second Max : " + p));
	}

	public void showNameAndPrice() {
		Map<String, Double> namePrice = products.stream()
				.collect(Collectors.toMap(Product::getName, Product::getPrice));
		namePrice.forEach((name, price) -> System.out.println(name + "  " + price));
	}

	public void showCostlyAndCheap() {
		Map<Boolean, List<Product>> map = products.stream().collect(Collectors.partitioningBy(p -> p.price > 10000));
		map.forEach((key, list) -> System.out.println((key ? "Costly " : "Cheap ") + list));
	}

	public void showElectronicsToBuy() {
		products.stream().filter(p -> p.quantity <= 3 && p.category.equals("Electronics")).forEach(System.out::println);
	}

	public void topNExpensive(int n) {
		products.stream().sorted(Comparator.comparingDouble(Product::getPrice).reversed()).limit(n)
				.forEach(System.out::println);
	}

	public void firstN(int n) {
		products.stream().limit(n).forEach(System.out::println);
	}

	public void firstNExpensive(int n) {
		products.stream().limit(n).sorted(Comparator.comparingDouble(Product::getPrice).reversed()).limit(1).findFirst()
				.ifPresent(System.out::println);
	}

	public void findProductById(int id) {
		Optional<Product> ps = products.stream().filter(pr -> pr.id == id).findFirst();
		if (ps.isPresent()) {
			System.out.println(ps.get());
		} else {
			System.out.println("Not Found");
		}
	}

	public void totalInventoryQuantity() {
		int totalQuantity = products.stream().map(Product::getQuantity).reduce(0, Integer::sum);
		System.out.println("Total Quantity = " + totalQuantity);
	}

	public void totalCostWithReduce() {
		Double totalCost = products.stream().map(p -> p.quantity * p.price).reduce(0d, Double::sum);
		System.out.println("Total Inventory Value = " + totalCost);
	}

	public void concatenateNames() {
		String names = products.stream().map(p -> p.name).reduce("", (n1, n2) -> n1 + "," + n2);
		System.out.println(names);
	}

	public void showNameArray() {
		String[] array = products.stream().map(p -> p.name).toArray(String[]::new);
		for (String s : array) {
			System.out.println(s);
		}
	}

	public void discount_3000() {
		System.out.println("Original Price");

		products.stream().filter(p -> p.price > 50000).forEach(System.out::println);

		System.out.println("After Discount ");
		products.stream().filter(p -> p.price > 50000)
				.map(p -> new Product(p.id, p.name, p.category, p.price - 3000, p.quantity))
				.forEach(System.out::println);
		;
	}

	public void longestProductName() {
		String longest = products.stream().map(Product::getName).reduce((p1, p2) -> p1.length() > p2.length() ? p1 : p2)
				.get();
		
		System.out.println(longest);
	}

}
