package sibandiibprograms;

public class SIB_IIB_ProgramJuly13 
{
	static
	{
		System.out.println("Static initialization block");  //SIB
	}
	{
		System.out.println("Instance initialization block");  //IIB
	}
    public static void main(String[] args) 
    {
       System.out.println("Main Method");
       new SIB_IIB_ProgramJuly13();
	}
}
