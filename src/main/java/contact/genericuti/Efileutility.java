package contact.genericuti;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Efileutility {
	public String readDataFromExcelFile(String Sheetname,int rownum,int cellnum ) throws Throwable {
		FileInputStream fise=new FileInputStream("");
		return WorkbookFactory.create(fise).getSheet(Sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	}
}
