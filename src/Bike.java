
public class Bike {
	String brand;
	String model;
	int price;
	int milage;
	public Bike(String brand, String model, int price, int milage) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.milage = milage;
	}
	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", model=" + model + ", price=" + price + ", milage=" + milage + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}

}
