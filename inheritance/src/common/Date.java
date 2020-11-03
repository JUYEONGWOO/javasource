package common;
import java.io.PrintStream;

public class Date {
	public Date(int yy, int mm, int dd) { 
		this.year =yy; 
		this.month = mm;
		this.day = dd;
	}
	public void finalize() { }
	// 메서드
	public void setDate(int yy, int mm, int dd) { }
	public int getYear() { 
		return year;
	}
	public int getMonth() { 
		return month;
	}
	public int getDay() {
		return day;
	}
	
	@Override
	public String toString() {
		
		return String.format("%4d-%2d-%2d", year, month, day);
	}
	public void displayDate() { }
	// 필드
	private int year;
	private int month;
	private int day;
}
