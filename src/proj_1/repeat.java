package proj_1;

public class repeat {

	public static void main(String[] args) 
	{
		String str="javaprogramming";
		
			int cnt=0;
			int cnt1=0;
			int cnt2=0;
			
        for (int i=0; i<str.length(); i++)
        {
        if ('m'==str.charAt(i))
        {
        	cnt++;
        }
        	if ('a'==str.charAt(i))
        {
        	cnt1++;
        }
        	if ('r'==str.charAt(i))
        	{
        		cnt2++;
        	}
        	
        }	
				System.out.println("m is repeated for" +" "+cnt+ " " +"times");
                System.out.println("a is repeated for" + " "+cnt1+ " " +"times");
                System.out.println(cnt2);
	}

}