package oop.polymorphism;

public class EmailLogger extends BaseLogger{
	//override kendime özel içini doldururum
	public void log(String message) {
		System.out.println("Logged to email :"+message);
		
	}
}
