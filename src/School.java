
public class School {
	String name;
	int fees;
	String address;
	@Override
	public String toString() {
		return "School [name=" + name + ", fees=" + fees + ", address=" + address + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public School(String name, int fees, String address) {
		super();
		this.name = name;
		this.fees = fees;
		this.address = address;
	}
	
}
