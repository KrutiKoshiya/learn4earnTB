package methods_functions;

public class Overloading {

	public static void main(String[] args)
	{
		System.out.println("This is the original main method");
		main(100);
		main(args=new String[3],args= new String[4]);
		
	}
	
	public static void main(int i)
	{
		System.out.println("This is the overloaded main method");
	}
	
	public static void main(String[]args1,String[]args2)
	{
		System.out.println("This is the overloaded main method in a different way");
	}
}
