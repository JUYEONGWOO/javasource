package employee;
import common.Date;

public class RegularEmployee extends Employee {
	protected double salary;
	
	public RegularEmployee(String name, String address, String telno, Date joindate, double salary) {
		super(name, address, telno, joindate);
		this.salary = salary;
	}
	
	public void dispayRegularEmployee() {

		System.out.println("�̸� : "+ getName() + " �ּ� : "+ getAddress() + " ��ȭ��ȣ :" + getTelno() + " �Ի��� : " + getJoindate() + " �޿� : " + payCheck());
	
	}
	
	

	public double payCheck() {
		return salary;
	}



}
