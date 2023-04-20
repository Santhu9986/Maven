package test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class WriteProperty {

	@Test
	public void write() throws IOException {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("./Data/commonData.properties");
		p.load(fis);
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("url"));

//		FileOutputStream fos = new FileOutputStream("./Data/commonData.properties");
//		p.setProperty("browser", "firefox");
//		p.store(fos, null);
	}

}
