package pkg1;

public class Student 
{
	public String Calculation(float marks,float maxmarks)
	{
		float per=100*(marks/maxmarks);
	    String grade=null;
	    if(per<50){ grade="C";}
	    if(per>=50&&per<80){ grade="B";}
	    if(per>=80){ grade="A";}
		
		return "percentage is"+per+"grade is"+grade;
	}
		
}
