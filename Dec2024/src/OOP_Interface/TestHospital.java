package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
	
		FortisHospital fh= new FortisHospital();
		fh.cardioServices();
		fh.entServices();
		fh.pediaServices();
		fh.physioServices();
		fh.emergencySercies();
		fh.dentalServices();
		fh.medialTraining();
		fh.optTraining();
		fh.medicalRD();
		fh.CovidVaccine();
		fh.medicalPolicy();
		// USMedical us = new USMedical();
		// Interface - can not create the object of the Interface
		
		System.out.println("   ");
		System.out.println("---------Top Casting--------------");
		System.out.println("   ");
		
	
		//top casting:
		//child class object can be referred by parent interface ref variable: Yes
		USMedical us = new FortisHospital();
		us.dentalServices();
		us.entServices();
		us.orthoServices();
		us.physioServices();
		us.emergencySercies();	
		us.CovidVaccine();
		USMedical.billing();
		us.medicalPolicy();
		//down casting: NA
		
		System.out.println("------");
		
		UKMedical uk = new FortisHospital();
		uk.oncologyServices();
		uk.pediaServices();
		uk.emergencySercies();	
		uk.CovidVaccine();
		
		
		//interface to inteface casting, we can do (very popular interview question)
		USMedical usa=new FortisHospital();
		UKMedical ukm=(UKMedical)(usa); //screenshot in selenium ; javascript 
		ukm.oncologyServices();
		ukm.pediaServices();
		ukm.CovidVaccine();
		usa.dentalServices();
		usa.entServices();

		
		
		
		
		
		
		
		
	}
}
