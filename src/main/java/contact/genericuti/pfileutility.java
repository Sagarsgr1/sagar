package contact.genericuti;

import java.io.FileInputStream;
import java.util.Properties;

public class pfileutility {
	public String readDataFroomPropertyFile(String key) throws Throwable {
		FileInputStream fisp=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Vtiger\\src\\main\\resources\\cmndt.properties");
		Properties p=new Properties();
		p.load(fisp);
		return p.getProperty(key);
	}
}
