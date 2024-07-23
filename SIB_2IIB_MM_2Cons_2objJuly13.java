package sibandiibprograms;

public class SIB_2IIB_MM_2Cons_2objJuly13 //what happens when we have 2 IIB's and 2 Constructors with one constructor is para and other one is non-para
{
	static
	{
		System.out.println("Static initialization block");  //SIB
	}
	{
		System.out.println("Instance initialization block");  //IIB
	}
	{
		System.out.println("Instance initialization block 1");  //IIB 1
	}
	SIB_2IIB_MM_2Cons_2objJuly13()
	{
		System.out.println("Constructor"); //Constructor - non-para
	}
	SIB_2IIB_MM_2Cons_2objJuly13(int a)
	{
		System.out.println("Constructor 1"); //Constructor 1 - para
	}
    public static void main(String[] args) 
    {
       System.out.println("Main Method");
       new SIB_2IIB_MM_2Cons_2objJuly13();
       new SIB_2IIB_MM_2Cons_2objJuly13(100);
	}
}
