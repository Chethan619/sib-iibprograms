package sibandiibprograms;

public class SIB_IIB_MM_Cons_ProgramJuly13 
{
	static
	{
		System.out.println("Static initialization block");  //SIB
	}
	{
		System.out.println("Instance initialization block");  //IIB
	}
	SIB_IIB_MM_Cons_ProgramJuly13()
	{
		System.out.println("Constructor");
	}
    public static void main(String[] args) 
    {
       System.out.println("Main Method");
       new SIB_IIB_MM_Cons_ProgramJuly13();
	}
}
