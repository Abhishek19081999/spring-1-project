package com.shoppingcart.app.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shoppingcart.app.controller.ProductController;
import com.shoppingcart.app.exception.ProductNotFoundException;
import com.shoppingcart.app.model.Product;

@Controller
public class ProductMain {
	@Autowired
	private ProductController productController;
	
	public void productRun() {
		System.out.println("\n Product Entity records :");
		addProducts(createProducts());
	}

	//method to add Product
	private void addProducts(List<Product> products) {
		for(Product product : products) {
			try {
				productController.addProduct(product);
			} 
			catch (ProductNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//method to create List of Product
	private List<Product> createProducts(){
		List<Product> products = new ArrayList<Product>();
		
		Product p1 = new  Product("SUDHA Lassii",null, "SUDHA becomes Jharkhand and Bihar's"
		 		+ "Largest Milk Processor", "Ashini Distributes","Sudha "
		 		+ "Lassii is refreshing drink based natural drink.",189L,
		 		40.08,40.08, null);
		 
		Product p2 = new Product("Calvin Klein Jeans", null, "CK leads the scale down of"
			 		+ " fashion seasons", "sounddeluxestore", "CK", 500L, 200.08, 125.00, null);
			 
		Product p3 = new Product("ASUS Laptop", null, "ASUS becomes world famous for"
			 		+ " gadgets", "Multi-Vendor", "ASUS laptop is well known for power and performance.",
			 		190L, 65000.09, 70080.90, null);
			 
		Product p4 = new Product("Woodland Jacket", null, "Free Size", "indiaMART", "Woodland is"
			 		+ " well known for shoes and apparels", 156L, 2000.08, 2529.07, null);
			
		Product p5 = new Product("Woodland Shoes", null, "Free size", "indiaMART", "Woodland is"
			 		+ " well known for shoes and apparels", 600L, 1000.08, 1500.07, null);
			
		Product p6 = new Product("Asus smartphone", null, "combination of power ,performance and smoothbess",
					"Flipkart"," well known for Pc's and smartphones", 156L, 600.08, 750.07, null);
			
		Product p7 = new Product("CK Shirt", null, "All occasion shirts", "versace",
					"CK leads the scale down of fashion seasons", 156L, 2000.08, 2529.07, null);
			
		Product p8 = new  Product("SUDHA rabdii",null, "SUDHA becomes jharkhand and buhar's Largest"
					+ " Milk Processor", "Ashini Distributes","SUDHA Rabdii is"
					+ " sweet dessert based natural ingredients.",50L,10.08,20.08, null);
	
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		products.add(p7);
		products.add(p8);
		
		return products;
	}

}
