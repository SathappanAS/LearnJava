package StackMemory;

public class Testing {

	public void m1() {
		System.out.println("m1 method");
		int i=10;
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		int i=20;
		m3();
	}
	
	public void m3() {
		System.out.println("m3 method");
		int i=30;
	}
	
	
	public static void main(String[] args) {
		Testing tr=new Testing();
		tr.m1();
	}
}