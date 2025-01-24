package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
	
		FortisHospital fh=new FortisHospital();
		fh.dentalServices();
		fh.entServices();
		fh.physioServices();
		fh.orthoServices();
		
		fh.oncologyServices();
		fh.pediaServices();
		
		fh.opticalServices();
		fh.radioServices();
		fh.cardioServices();
		
		fh.emergencyServices();
		
		fh.medicalTraining();
		fh.optServices();
		
//Java will not allow to create interface object creation - Because interface will have  only method body(i.e abstract)
//EXAMPLE : USMedical us=new USMedical();
		
		/*Top Casting*/
		/*child class object can be referred by parent interface reference variable : Yes*/
		/*Selenium = webDrive a= new ChromeDriver();*/
		System.out.println();
		System.out.println("---Top/Up Casting-----");
		System.out.println();
		USMedical us=new FortisHospital();
		us.dentalServices();
		us.entServices();
		us.physioServices();
		us.orthoServices();
		
		//us.oncologyServices(); - Reference type check will fail
		//us.medicalTraining(); - Individual method of FortisHospital will be failed by reference type check
		
		
		us.emergencyServices();
		
		/*DownCasting*/ // We can even create parent of object creation : NOT Applicable
		
		System.out.println();
		System.out.println("---Top/Up Casting-----");
		System.out.println();
		
		UKMedical uk=new FortisHospital();
		uk.oncologyServices();
		uk.pediaServices();
		uk.emergencyServices();
		
	}
}
