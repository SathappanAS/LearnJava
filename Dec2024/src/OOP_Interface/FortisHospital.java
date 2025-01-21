package OOP_Interface;

public class FortisHospital implements USMedical, UKMedical, IndianMedical{

	//india
	@Override
	public void radioServices() {
		System.out.println("FH --  radioServices");
		
	}

	@Override
	public void opticalServices() {
		System.out.println("FH --  opticalServices");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH --  cardioServices");
		
	}

	//uk
	@Override
	public void oncologyServices() {
		System.out.println("FH --  oncologyServices");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("FH --  pediaServices");
		
	}

	
	//usa
	@Override
	public void dentalServices() {
		System.out.println("FH --  dentalServices");
		
	}


	@Override
	public void entServices() {
		System.out.println("FH --  entServices");
		
	}

	@Override
	public void physioServices() {
		System.out.println("FH --  physioServices");
		
	}
	
	@Override
	public void orthoServices() {
		System.out.println("FH --  orthoServices");
		
	}
	
	
//	@Override
//	public int test(int i) {
//		return 100;
//	}
	
	//common method in all the interface:
	@Override
	public void emergencySercies() {
		System.out.println("FH --  emergencyServices");
		
	}
	
	
	
	//individual method:
	public void medialTraining() {
		System.out.println("FH------medicalTraining");
	}
	
	
	public void optTraining() {
		System.out.println("FH------optTraining");
	}

	
}