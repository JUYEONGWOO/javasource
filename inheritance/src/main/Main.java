package main;
import common.Date;
import common.Department;
import employee.RegularEmployee;
import employee.SalesEmployee;
import employee.TemporaryEmployee;

public class Main {

	public static void main(String[] args) {

		Date joindate1 = new Date(2020,10,10);
		Date joindate2 = new Date(2020,10,11);
		Date joindate3 = new Date(2020,10,12);
		
		RegularEmployee re = new RegularEmployee("주영우", "한국" , "010-비밀", joindate1, 3000000);
		re.displayEmployee();
		System.out.printf("급여는 : %f 입니다.\n", re.payCheck());
		TemporaryEmployee te = new TemporaryEmployee("진현주", "한국" , "010-비밀", joindate1, 10000);
		te.displayEmployee();
		te.setWorkHours(172);
		System.out.printf("급여는 : %f 입니다.\n", te.payCheck());
		SalesEmployee se = new SalesEmployee("김다은", "한국" , "010-비밀", joindate1, 2000000, 0.01);
		se.displayEmployee();
		se.setSales(10000000);
		System.out.printf("급여는 : %f 입니다.\n", se.payCheck());
		System.out.println();
		Department dp = new Department();
		dp.addEmployee(te);
		dp.addEmployee(se);
		dp.display();

		RegularEmployee a = new RegularEmployee("이름","한국", "00",joindate1, 2000);
		RegularEmployee b = new RegularEmployee("이름","한국", "00",joindate1, 3000);
		if(a == b)
			System.out.println("==");
		else
			System.out.println("!=");
		if(a.equals(b))
			System.out.println("==");
		else
			System.out.println("!=");
	}

}
