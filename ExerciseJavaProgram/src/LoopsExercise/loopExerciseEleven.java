package LoopsExercise;
/*Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".*/
public class loopExerciseEleven {

	public static void main(String[] args) {
		int j;
		for(int i=1;i<=10;i++) {
			j=i%7;
			if(j!= 0){
				System.out.println(i);
			}
			else if (j==0) {
				System.out.println(i + " " +  "bye, see you tomorrow");
				break;
			}
		
		}

	}

}