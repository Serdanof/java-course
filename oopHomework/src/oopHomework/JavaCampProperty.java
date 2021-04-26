package oopHomework;

public class JavaCampProperty {

	// constructor
	public JavaCampProperty() {
		System.out.println("Bu e�itimler alan� i�in bir constructor blokudur.");
	}

	public JavaCampProperty(int id, String name, String detail, String creator, double coursePrice) {
		this();
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.creator = creator;
		this.coursePrice = coursePrice;
	}

	int id;
	String name;
	String detail;
	String creator;
	double coursePrice;
}
