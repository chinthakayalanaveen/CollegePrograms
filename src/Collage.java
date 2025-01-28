
public class Collage {
	String name;
	String address;
	String naac;
	int fee;
	public Collage(String name, String address, String naac, int fee) {
		super();
		this.name = name;
		this.address = address;
		this.naac = naac;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Collage [name=" + name + ", address=" + address + ", naac=" + naac + ", fee=" + fee + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNaac() {
		return naac;
	}
	public void setNaac(String naac) {
		this.naac = naac;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	

}
