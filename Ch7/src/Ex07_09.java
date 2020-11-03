import java.util.Scanner;

public class Ex07_09 {

	public static void main(String[] args) {
		int i;
		int total=0;
		for(i = 1; i <= 100; i++) {
			total += i;
			if(total >= 1000)
				break;
		}
		System.out.print("1~100의 합에서 최초로 1000이넘는 위치는 ? :"+ i);

	}

}
