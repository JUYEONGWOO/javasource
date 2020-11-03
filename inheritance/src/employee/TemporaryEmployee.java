package employee;
import common.Date;

public class TemporaryEmployee extends Employee{
	
	private int pay4Hour;
	private int workHours;
	public TemporaryEmployee(String name, String address, String telno, Date joindate, int pay4Hour) {
		super(name, address, telno, joindate);
		this.pay4Hour = pay4Hour;
		// TODO Auto-generated constructor stub
	}
	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}
	public double payCheck() {
		return pay4Hour * workHours;
	}

}
