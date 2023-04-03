package test;
import org.testng.annotations.Test;

public class MavenTest1 {
	@Test(groups = "smoke")
	public void TS_01Test()
	{
		System.out.println("----TS_01---");
	}
	
	@Test(groups = "regression")
	public void TS_02Test()
	{
		System.out.println("----TS_02---");
	}

}
