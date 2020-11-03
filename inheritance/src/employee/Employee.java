package employee;
import common.Date;

public class Employee {

	private String name;
	private String address;
	private String telno;
	private Date joindate;
	
	public Employee(String name, String address, String telno, Date joindate) {
		this.name = name;
		this.address = address;
		this.telno = telno;
		this.joindate = joindate;
	}
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		
		return (this.name == e.name)&&(this.address == e.address)  ;
	}
	public void displayEmployee() {
		System.out.println("이름 : "+ getName() + " 주소 : "+ getAddress() + " 전화번호 :" + getTelno() + " 입사일 : " + getJoindate());
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
	public String getTelno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	public double payCheck() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
