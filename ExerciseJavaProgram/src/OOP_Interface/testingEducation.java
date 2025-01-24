package OOP_Interface;

public class testingEducation {

	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("-------TOP/UP Casting--------");
		System.out.println();
		
		
		//Child class object can be referred by parent interface reference variable
		//new IIMA() - child class object
		//USEducation us - parent interface reference variable
		USEducation us=new IIMA();
		us.MS();
		us.phd();
		us.fee();
		
		System.out.println();
		System.out.println("---------------------");
		//Child class object reference name
		SRM sm=new SRM();
		sm.MS();
		sm.phd();
		
		sm.BE();
		sm.BS();
		sm.BSC();
		
		sm.EduinDental();
		sm.EduinMBBS();
		sm.EduinOrotho();
		
		sm.fee();
		
		
	
	}

}
