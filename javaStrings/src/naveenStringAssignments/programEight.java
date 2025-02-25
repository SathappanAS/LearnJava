package naveenStringAssignments;
/*Write a method which gives an index of (-1) if string is not available. . it should return integer. if String is present, then it should return the specific index.*/
public class programEight{

	public int isStringPresent(String str , String searchStr)
	{
		int index=0;
		if(str.contains(searchStr))
		{
			System.out.println(str.length());
			index=str.indexOf(searchStr);
			return(index);
		}
		else
		{
			index=-1;
			return index;
		}
		
	}
	
	public static void main(String[] args) {
		programEight f= new programEight();
		System.out.println("Index of searched string is : "+ f.isStringPresent("Hello World", "W"));
		

	}

}
