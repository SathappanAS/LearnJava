package OOP_Inheritance_Assignment_One;

public class Apollo extends Hospital {

	public void performSurgery() {
		System.out.println("Child Class Apollo -----performSurgery");
	}
	
	@Override
	public void treatPaitent() {
		System.out.println("Child Class Apollo ------treatPaitent");
	}
	
	@Override
	public void dischargePatient() {
		System.out.println("Child Class Apollo -----dischargePatient");
	}
}
