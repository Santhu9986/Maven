package test;

import org.testng.annotations.Test;

public class JenkinsTest {
	
	@Test(groups = "smoke")
	public void jenkinsTest()
	{
		System.out.println("Jenkins Test");
	}

}
