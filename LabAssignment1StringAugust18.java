//Q-1 Write a program to prove that string is Immutable.
 
 public class LabAssignment1StringAugust18 
 {

	public static void main(String[] args) 
	{
	   prove1();
	   prove2();
	   
	}
	public static void prove1()
	{
		  // Before Modification in string s1 
		String S1="Gaurav";
		String S2="Gaurav";
		if(S1==S2)
		{
			System.out.println("both are pointing same object");
		}
		else
		{
			System.out.println("both are pointing diffrent object");
		}
		
		
       //After Modification in string s1 
		
		S1+="yadav";
		if(S1==S2)
		{
			System.out.println("both are pointing same object");
		}
		else
		{
			System.out.println("both are pointing diffrent object");
		}
		
	}
	public static void prove2()
		{
		String s=new String("java");
		s.concat("program");
	    System.out.println(s);
	    
	    //here after concat they are create new object 
	    s=s.concat("language");
	    System.out.println(s);
	    
		}

}
