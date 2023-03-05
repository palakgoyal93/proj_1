package my_mvn;


public class flipkart{

	public static void main(String[] args)
	{
		CromeDriver driver = new ChromeDriver();
		
	 driver.get ("http://www.google.com");
	 
	 driver.findElement(By.name ("q")).sendKeys ("java");
	 
	 driver.findElement(By.name("q")).sendkeys(Keys.Enter);
	 
	 
	}

}
