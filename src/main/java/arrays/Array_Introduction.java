package arrays;

public class Array_Introduction {

	public static void main(String[] args) {
		
		//Declaration of Array
		
		String[][] myStrings;
		
		//Creation of Array
		
		String[][] myStrings1= new String[2][2];
		
		//Initialization of Array
		
		String[][] myString2= {{"Kruti","Mansi"},{"Nancy","Kishan"}};
		
		//Retriving data from an array
		
		for(int i=0;i<myString2.length;i++)
		{
			for(int j=0;j<myString2[i].length;j++)
			{
				System.out.println(myString2[i][j]);
			}
		}
		

	}

}
