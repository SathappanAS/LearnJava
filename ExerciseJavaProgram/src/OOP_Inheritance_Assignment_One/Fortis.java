package OOP_Inheritance_Assignment_One;

public class Fortis  extends Hospital{

	public void prescribeMeidcation() {
		System.out.println("Child Class Fortis -----prescribeMeidcation");
	}
	
	@Override
	public void treatPaitent() {
		System.out.println("Child Class Fortis ------treatPaitent");
	}
	
	@Override
	public void dischargePatient() {
		System.out.println("Child Class Fortis -----dischargePatient");
	}
}
