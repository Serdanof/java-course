package oopIntro;

public class Product {

	// constructor
	// 1 constructor �al��mak zorunda, bu yap�da birden fazla constructor varsa yaln�zca 1'i �al���r
	public Product() {
		System.out.println("Ben �al��t�m");
	}

	public Product(int id, String name, double unitPrice, String detail) {
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}

	int id;
	String name;
	double unitPrice;
	String detail;

}
