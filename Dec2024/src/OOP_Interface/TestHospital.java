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
		
		fh.CovidVaccination();
		
		fh.medicalPolicy();
		
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
		us.CovidVaccination();
		USMedical.billing();
		FortisHospital.billing();
		fh.medicalPolicy();
		
		
		System.out.println(USMedical.min_fee);
		System.out.println(FortisHospital.min_fee); //variable can be accessed with class name and varianle name
		
		//USMedical.min_fee=100;
		
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
		
		
		System.out.println();
		System.out.println("---Top/Up Casting-----");
		System.out.println();
		
		
		//interface to interface casting:
		/*very important question*/
		/*Screenshot and JavaScriptExecutor*/
		USMedical usa=new FortisHospital(); //usa is reference variable of USMedical
		UKMedical ukm=(UKMedical)(usa); //usa reference varaible is convered into UK. Enter RHS will be UNmedical
		/*Here we are typecasting the reference varaible not object*/
		ukm.oncologyServices();
		ukm.pediaServices();	
		usa.dentalServices();
		usa.physioServices();
		
		
	}
}


//class to class = extends keyword
//class to interface = implements
//interfact to interface = extends
//one interface can have parent class (I:C) ---> Not application/Not allowed (very importanve questions)