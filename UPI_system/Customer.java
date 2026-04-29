package UPI_system;

public class Customer {

	private int AccNo;
	private String Cname;
	private double balance;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int accNo, String cname, double balance) {
		super();
		AccNo = accNo;
		Cname = cname;
		this.balance = balance;
	}

	public int getAccNo() {
		return AccNo;
	}

	public void setAccNo(int accNo) {
		AccNo = accNo;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [AccNo=" + AccNo + ", Cname=" + Cname + ", balance=" + balance + "]";
	}

}
