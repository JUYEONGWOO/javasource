
public class Employee {
	private String name;
	String department;
	int phoneNum;
	static int count;
	public Employee(String name, String department,int phoneNum) {
		this.name = name;
		this.department = department;
		this.phoneNum = phoneNum;
		count++;
	}
	public void showInfo() {
		System.out.println("이름: "+ name + " 부서: " + department + " 전화번호 :"+phoneNum);
	}			
}

