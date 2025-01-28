
public class Car {
	String model;
	int price;
	int milage;
	public Car(String model, int price, int milage) {
		super();
		this.model = model;
		this.price = price;
		this.milage = milage;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + ", milage=" + milage + "]";
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
