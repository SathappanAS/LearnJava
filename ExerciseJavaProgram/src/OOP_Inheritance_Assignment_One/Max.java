package OOP_Inheritance_Assignment_One;

public class Max extends Hospital{

	public void conductTest() {
		System.out.println("Child Class Max -----conductTest");
	}
	
	@Override
	public void treatPaitent() {
		System.out.println("Child Class Max ------treatPaitent");
	}
	
	@Override
	public void dischargePatient() {
		System.out.println("Child Class Max -----dischargePatient");
	}
	
}
