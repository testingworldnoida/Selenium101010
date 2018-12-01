package testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_001 {

	@BeforeMethod(alwaysRun=true)
	public void strBr()
	{
		System.out.println("Browser Start");
	}
	
	
	@AfterMethod(alwaysRun=true)
	public void endBr()
	{
		System.out.println("Browser End");
	}
	
	
	@Test(groups={"Smoke","P1"})
	public void tc001()
	{
		System.out.println("Smoke, P1");
	}

	
	@Test(groups={"Sanity"})
	public void tc002()
	{
		System.out.println("Sanity");
	}
}

