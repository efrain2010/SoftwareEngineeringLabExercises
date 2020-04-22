package People;

import java.io.PrintStream;
import java.util.Calendar;

public class Date {
	
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public int getAge() {
		return Calendar.getInstance().get(Calendar.YEAR) - this.year;
	}
	
	public int diffInYears(Date date) {
		return (this.year - date.getYear() < 0) ? (this.year - date.getYear()) * -1 : this.year - date.getYear();
	}
	
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}
	
	public void print(PrintStream ps) {
		ps.print(String.format("%02d/%02d/%4d", this.day, this.month, this.year));
	}

}
