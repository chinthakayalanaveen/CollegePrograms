
public class SBIAccount {
	String name;
	int acctno;
	String mobile;
	int balance;
	public SBIAccount(String name, String mobile, int balance) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.balance = balance;
		this.acctno=generateAccNo();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	int generateAccNo() {
		int max=5000;
		int min=500;
		int range=max-min+1;
		int randNo=(int)(Math.random()*range)+min;
		return randNo;
	}
	@Override
	public String toString() {
		return "SBIAccount [name=" + name + ", acctno=" + acctno + ", mobile=" + mobile + ", balance=" + balance + "]";
	}
	void deposit(int amt) {
		this.balance=this.balance+amt;
		System.out.println("successfully deposited..."+amt);
	}
	void checkBalance() {
		System.out.println("avl balance--->"+this.balance);
	}

	void withdraw(int amt) {
		if (this.balance > amt) {
			this.balance = this.balance - amt;
			System.out.println("successfully withdrawn.." + amt);
		} else {
			System.out.println("insufficient ...");
		}
	}
}

