package com.js.product;


public class SaveProduct {
	public static void main(String[]args) 
	{
		Product p = new Product();
		p.setId(1);
		p.setName("pencil");
		p.setBrand("Nataraj");
		p.setQuantity(10);
		p.setPrice(5);
		
		ProductCrud pc = new ProductCrud();
		pc.saveProduct(p);
		System.out.println("inserted");
		
	}

}
