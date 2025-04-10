package OOP_Interface;

public class FortisHospital extends Hospital implements USMedical, UKMedical,IndianMedical {
	/*The type FortisHospital must implement the inherited abstract method */
	
	//US
	
	static final int min_fee=100;
	
	public FortisHospital() {
		super();
	}
	
	@Override
	public void dentalServices() {
		System.out.println("FH--------dentalServices");
		
	}

	@Override
	public void entServices() {
		System.out.println("FH--------entServices");
		
	}

	@Override
	public void physioServices() {
		System.out.println("FH--------physioServices");
		
	}
	
	@Override
	public void orthoServices() {
		System.out.println("FH--------orthoServices");
		
	}
	
//	@Override
//	public int test(int i,int j) {
//		return 100;
//	}
	
	//UK
	@Override
	public void oncologyServices() {
		System.out.println("FH--------oncologyServices");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("FH--------pediaServices");
		
	}
	
	//India
	@Override
	public void opticalServices() {
		System.out.println("FH--------opticalServices");
		
	}

	@Override
	public void radioServices() {
		System.out.println("FH--------radioServices");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH--------cardioServices");
		
	}
	
	//Common method from all the interface
	@Override
	public void emergencyServices() {
		System.out.println("FH--------emergencyServices");
	}
	
	//individual:
	public void medicalTraining() {
		System.out.println("FH--------medicalTraining");
	}
	
	public void optServices() {
		System.out.println("FH--------optServices");
	}

	//WHO Grandparents
	@Override
	public void CovidVaccination() {
		// TODO Auto-generated method stub
		
	}
	
	//method hiding
	public static void billing() {
		System.out.println("USM--billing");
	}
	
	@Override
	public void medicalPolicy() { //public need to be used
	System.out.println("fortisHospital--medical policy");
	}

}