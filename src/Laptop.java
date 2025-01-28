//pojo class
public class Laptop {
	String brand;
	String processor;
	String ram;
	int price;
	public Laptop(String brand, String processor, String ram, int price) {
		super();
		this.brand = brand;
		this.processor = processor;
		this.ram = ram;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", processor=" + processor + ", ram=" + ram + ", price=" + price + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
