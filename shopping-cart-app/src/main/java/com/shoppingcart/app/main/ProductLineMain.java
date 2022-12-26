package com.shoppingcart.app.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shoppingcart.app.controller.ProductLineController;
import com.shoppingcart.app.exception.ProductLineNotFoundException;
import com.shoppingcart.app.model.ProductLine;

@Controller
public class ProductLineMain {
	
	@Autowired
	private ProductLineController productLineController;
	
	public void productLineRun() throws NumberFormatException, IOException {
		System.out.println("\n ProductLine Entity records :");
		addProductLines(createProductLines());
	}

	//method to add ProductLine
	private void addProductLines(List<ProductLine> productLines) {
		for(ProductLine productLine : productLines) {
			try {
				productLineController.addProductLine(productLine);
			} 
			catch (ProductLineNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//method to create List of ProductLine
	private List<ProductLine> createProductLines(){
		List<ProductLine> productLines = new ArrayList<ProductLine>();
		
		ProductLine pl1 = new ProductLine("The production and marketing of Table Butter under the"
				+ " brand name 'SUDHA' "
				+ "was introduced from 1st October, 1993 and the response has been encouraging. ",
				"<ol>"
				+ "<li>The marketing of Sudha brand of Ice Cream in Patna after test marketing"
				+ " in August-September, 1994, was formally launched from April, 1995</li>"
				+ "</ol>","SUDHA.jpg",null);
		
		ProductLine pl2 = new ProductLine("Calvin Klein, in full Calvin Richard Klein,"
				+ "American fashion designer noted for his womenswear, menswear,"
				+ " brands in operation today. ",
				"<ol>"
				+ "<li>jeans, cosmetics and perfumes, bed and bath linens, "
				+ "and other collections</li>"
				+ "</ol>","CALVIN.jpg",null);
		
		ProductLine pl3 = new ProductLine("ASUS is a Taiwan-based, multinational computer hardware and "
				+ "consumer electronics company that was established in 1989."
				+ "Dedicated to creating products for today's and tomorrow's smart life",
				"<ol>"
				+"<li>, ASUS is the world's No. 1 motherboard and gaming brand "
				+ "as well as a top-three consumer notebook vendor</li>"
				+"</ol>", "ASUS.jpg", null);
		
		ProductLine pl4 = new ProductLine("Woodland is a premium brand of outdoor shoes"
				+ " and apparels in India with a network of 500 exclusive stores worldwide."
				+ "  the ultimate showcase for all Woodland collections,.",
				"<ol>"
				+ "<li> The brand has presence in more than"
				+ "4800 multi-brand outlets globally.</li>"
				+"</ol>","WOODLAND.jpg", null);
	
		productLines.add(pl1);
		productLines.add(pl2);
		productLines.add(pl3);
		productLines.add(pl4);
		
		return productLines;
	}
}
