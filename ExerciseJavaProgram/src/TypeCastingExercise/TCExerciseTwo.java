package TypeCastingExercise;

public class TCExerciseTwo {

	public static void main(String[] args) {
		
		double doubleValue=45.75;
		float floatValue=30.5f;
		long longvalue=100000000000L;
		
		float value1=(float)doubleValue;
		short value2=(short)floatValue;
		int value3=(int)longvalue;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
