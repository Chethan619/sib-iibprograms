package sibandiibprograms;

public class SIB_IIB_Cons_MMProgramJuly13 //what happens if we write the object first and then print stmt (Main Method) ??
{
	static
	{
		System.out.println("Static initialization block");  //SIB
	}
	{
		System.out.println("Instance initialization block");  //IIB
	}
	SIB_IIB_Cons_MMProgramJuly13()
	{
		System.out.println("Constructor");
	}
    public static void main(String[] args) 
    {
       new SIB_IIB_Cons_MMProgramJuly13();
       System.out.println("Main Method");
	}
}