package OOP_Inheritance_Assignment_One;

public class TestHospital {

	public static void main(String[] args) {
		Hospital h1=new Hospital();
		System.out.println("====Parent Class Hospital===");
		h1.admitPatient(); //individal method
		h1.treatPaitent(); //individal method
		h1.dischargePatient(); //individal method
		
		
		System.out.println("====Child===Apollo Class Hospital===");
		Apollo a1=new Apollo();
		a1.admitPatient();  // inherited method
		a1.treatPaitent(); // Override method
		a1.dischargePatient(); // Override method
		a1.performSurgery(); //individal method
		
		System.out.println("====Child===Fortis Class Hospital===");
		Fortis fs=new Fortis();
		fs.admitPatient();
		fs.treatPaitent();
		fs.dischargePatient();
		fs.prescribeMeidcation();
		
		System.out.println("====Child===Max Class Hospital===");
		Max mx=new Max();
		mx.admitPatient();
		mx.treatPaitent();
		mx.dischargePatient();
		mx.conductTest();
		
		System.out.println("");
		/*Child class objec can be referred by Parent class object by reference*/
		System.out.println("===Top Casting====");
		Hospital h2=new Max();
		h2.admitPatient(); // inherited method
		h2.treatPaitent(); // Override method
		h2.dischargePatient(); // individal method
		
		//Max individual method can't be called by Reference type check will fail
	
		
	}

}
