package SuperVsThisKeyword;

public class TestCar {

	public static void main(String[] args) {
		
//		BMW b = new BMW();
//		b.start();
//		//b.stop();
//		b.displaySpeed();
		
		//BMW b = new BMW(); //FIRST CALL PARTENT DEFAULT CON WILL BE CALLED THEN CHILD DEFAULT CONST WILL BE CALLED
		
		/*Very Importanct question for interview*/
		BMW b1 = new BMW(10,20);
		//	super(i);
		//  car--one param const... 10
		//  BMW--one param const... 10
		
		/*Whenever you are calling any constrctor using the super
		 * keyword ; whenever you are calling parent constrctor using a super keyword in your
		 * child class constrctor -
		 * super keyword should be always first statement in your child class constructor  
		 * */

		//Super keyword used to call child class constructor
		//this keyword used to call this own constructor
	
	}	

}