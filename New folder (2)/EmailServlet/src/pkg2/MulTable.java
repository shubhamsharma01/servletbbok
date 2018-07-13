package pkg2;

public class MulTable 
{
	public String Display(int startno,int stopno)
	{
		String st=null;
		for(int j=startno;j<=stopno;j++)
		{
			for(int i=1;i<=10;i++)
			{
				st=(j+" "+"*"+" "+i+" "+"="+(j*i)+"\n");
			}			
		}
		return st;
	}
}
