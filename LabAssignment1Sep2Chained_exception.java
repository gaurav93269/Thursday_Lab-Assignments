/*Q1: Write a program to create the chained exception 
where one exception describes the cause of another exception.
*/

public class LabAssignment1Sep2Chained_exception 
{
    public static void main(String[] args) 
    {
         // TODO Auto-generated method stub
     try
    { 

      NumberFormatException obj = new NumberFormatException(" Exception"); 

      obj.initCause(new NullPointerException(" Actual cause of the exception")); 

      throw obj; 
    } 

    catch(NumberFormatException obj) 
    { 

      System.out.println(obj); 
      System.out.println(obj.getCause()); 
    } 
  
}

}
