package TypeCastingExercise;
//Implicit-Widening
public class TCExerciseOne {

	public static void main(String[] args) {
		
		int intValue = 10;
        float floatValue = 20.5f;
        double doubleValue = 30.75;
        
        long value=(long)intValue;
        double value1=(double)floatValue;
        long value2 = (long) doubleValue;
        
        System.out.println(value);
        System.out.println(value1);
        System.out.println(value2);
        System.out.println("*******************************");
        
	}

}
