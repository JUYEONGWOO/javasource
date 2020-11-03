package employee;
import common.Date;

public class SalesEmployee extends RegularEmployee {
	private double sales = 0;
	private double rate;
	public SalesEmployee(String name, String address, String telno, Date joindate, double salary, double rate) {
		super(name, address, telno, joindate, salary);
		this.rate = rate;
		}
	public void setSales(double sales) {
		this.sales = sales;
	}
	public double payCheck() {
		return super.salary + sales * rate;
	}

}
