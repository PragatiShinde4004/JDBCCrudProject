package com.js.product;

public class UpdateProduct {
	public static void main(String[] args) {
		Product p= new Product();
		p.setName("pen");
		p.setBrand("cello");
		p.setPrice(10);
		p.setQuantity(15);
		
		ProductCrud pc = new ProductCrud();
		pc.updateProduct(1,p);
		
	}

}
