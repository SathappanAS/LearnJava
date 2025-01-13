package methodAssignmentMore;
/*	Method with Return Value (double) and with Parameters(double[])
 * Assignment : Write a method to calculate the average of element in a double array and return the result.
 * Signature: public double calculateAverage(double[] numbers)
 */
public class programFour {
	
	public static double calculateAverage(double[] numbers) {
		double sum=0.0;
		
		for(int i=0;i<=numbers.length-1;i++) {
			sum=sum+numbers[i];
		}
		double average=sum/numbers.length;
		return average;
	}

	public static void main(String[] args) {
		double numbers[] = {2.0, 4.0, 6.0,8.0, 10.0};
		double avg=calculateAverage(numbers);
		System.out.println(avg);
	}

}
