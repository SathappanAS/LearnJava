package ClassandObjects;

public class UserObjectReferenceExample {
	
	String name;
	int age;
	String DOB;
	char gender;
	
	public static void main(String[] args) {
		UserObjectReferenceExample UserOne=new UserObjectReferenceExample();	
		UserOne.name="vijay";
		UserOne.age=50;
		UserOne.DOB="06-06-1976";
		UserOne.gender='M';
		
		UserObjectReferenceExample UserTwo=new UserObjectReferenceExample();		
		UserTwo.name="kalam";
		UserTwo.age=70;
		UserTwo.DOB="12-06-1955";
		UserTwo.gender='M';

		UserObjectReferenceExample UserThree=new UserObjectReferenceExample();
		UserThree.name="venkat";
		UserThree.age=50;
		UserThree.DOB="12-06-1970";
		UserThree.gender='M';
		
		UserObjectReferenceExample UserFour=new UserObjectReferenceExample();
		UserFour.name="lax";
		UserFour.age=35;
		UserFour.DOB="01-06-1984";
		UserFour.gender='F';
		
		System.out.println(UserOne.name + " " + UserOne.age + " " + UserOne.DOB + " " + UserOne.gender );
		System.out.println(UserTwo.name + " " + UserTwo.age + " " + UserTwo.DOB + " " + UserTwo.gender );
		System.out.println(UserThree.name + " " + UserThree.age + " " + UserThree.DOB + " " + UserThree.gender );
		System.out.println(UserFour.name + " " + UserFour.age + " " + UserFour.DOB + " " + UserFour.gender );
		
		System.out.println("**UserOne=UserTwo*");
		UserOne=UserTwo;
		
		System.out.println(UserOne.name + " " + UserOne.age + " " + UserOne.DOB + " " + UserOne.gender );
		System.out.println(UserTwo.name + " " + UserTwo.age + " " + UserTwo.DOB + " " + UserTwo.gender );
		System.out.println(UserThree.name + " " + UserThree.age + " " + UserThree.DOB + " " + UserThree.gender );
		System.out.println(UserFour.name + " " + UserFour.age + " " + UserFour.DOB + " " + UserFour.gender );
		
		System.out.println("*UserTwo=UserThree*");
		UserTwo=UserThree;
		System.out.println(UserOne.name + " " + UserOne.age + " " + UserOne.DOB + " " + UserOne.gender );
		System.out.println(UserTwo.name + " " + UserTwo.age + " " + UserTwo.DOB + " " + UserTwo.gender );
		System.out.println(UserThree.name + " " + UserThree.age + " " + UserThree.DOB + " " + UserThree.gender );
		System.out.println(UserFour.name + " " + UserFour.age + " " + UserFour.DOB + " " + UserFour.gender );
		
		
		System.out.println("*UserThree=UserFour*");
		UserThree=UserFour;
		System.out.println(UserOne.name + " " + UserOne.age + " " + UserOne.DOB + " " + UserOne.gender );
		System.out.println(UserTwo.name + " " + UserTwo.age + " " + UserTwo.DOB + " " + UserTwo.gender );
		System.out.println(UserThree.name + " " + UserThree.age + " " + UserThree.DOB + " " + UserThree.gender );
		System.out.println(UserFour.name + " " + UserFour.age + " " + UserFour.DOB + " " + UserFour.gender );
		
		System.out.println("*UserFour=UserOne*");
		UserFour=UserOne;
		System.out.println(UserOne.name + " " + UserOne.age + " " + UserOne.DOB + " " + UserOne.gender );
		System.out.println(UserTwo.name + " " + UserTwo.age + " " + UserTwo.DOB + " " + UserTwo.gender );
		System.out.println(UserThree.name + " " + UserThree.age + " " + UserThree.DOB + " " + UserThree.gender );
		System.out.println(UserFour.name + " " + UserFour.age + " " + UserFour.DOB + " " + UserFour.gender );
	}

}
