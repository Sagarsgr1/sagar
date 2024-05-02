package com.vtiger.genericutilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility3 {
public String readDataFromExcelFile(String Sheetname,int rownum,int cellnum ) throws Throwable {
	FileInputStream fise=new FileInputStream("");
	return WorkbookFactory.create(fise).getSheet(Sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
}
}
