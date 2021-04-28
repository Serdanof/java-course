package oopIntro;

public class Product {

	// constructor
	// 1 constructor �al��mak zorunda, bu yap�da birden fazla constructor varsa
	// yaln�zca 1'i �al���r
	// this --> ilgili class
	// encapsulation
	// getter --> reader
	// setter --> writer
	// final, sadece constructor'da set edilebilir demek.
	// private, sadece bu class'ta eri�ilebilir demek.
	// ger�ek projede �nce field tan�mla, sonra private hale getir.

	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;

	public Product() {

	}

	public Product(int id, String name, double unitPrice, String detail, double discount,
			double unitPriceAfterDiscount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - (this.unitPrice * this.discount / 100);
	}

}