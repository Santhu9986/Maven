package test;

import org.testng.annotations.Test;

public class MavenTest2 {
	@Test(groups = "smoke")
	public void TS_03Test()
	{
		System.out.println("----TS_03---");
	}
	
	@Test(groups = "regression")
	public void TS_04Test()
	{
		System.out.println("----TS_04---");
	}
}
