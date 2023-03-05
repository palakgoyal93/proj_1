package proj_1;

public class factorial {

	public static void main(String[] args)
	{
		int n=7; 
		int m=n; 
		for(int i=n-1; i>=1; i--) 
		{
			m = (m*i); 
		}
		System.out.print(m);
	}


}
