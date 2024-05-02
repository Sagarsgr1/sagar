package com.vtiger.genericutilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyfileutility2  {
public String readDataFroomPropertyFile(String key) throws Throwable {
	FileInputStream fisp=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Vtiger\\src\\test\\resources\\commondata.properties");
	Properties p=new Properties();
	p.load(fisp);
	return p.getProperty(key);
}
}
