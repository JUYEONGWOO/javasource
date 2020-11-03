package employee;
import common.Date;

public class RegularEmployee extends Employee {
	protected double salary;
	
	public RegularEmployee(String name, String address, String telno, Date joindate, double salary) {
		super(name, address, telno, joindate);
		this.salary = salary;
	}
	
	public void dispayRegularEmployee() {

		System.out.println("이름 : "+ getName() + " 주소 : "+ getAddress() + " 전화번호 :" + getTelno() + " 입사일 : " + getJoindate() + " 급여 : " + payCheck());
	
	}
	
	

	public double payCheck() {
		return salary;
	}



}
