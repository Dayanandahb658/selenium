package com.tutorials.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

@Test
public class Demo7 {
	public static final int WAIT_Time = 15;
	public static final int IMPLICIT_WAIT_Time = 15;
	public static XSSFWorkbook Workbook = null;
	//private static final int CellType = 0;
	//private static final int STRING = 0;

	public static String Sample2() {
		Date S1 = new Date();
		// String email = S1.toString().replaceFirst(" ","_").replaceFirst(":","_");
		String email = S1.toString().replace(" ", "_").replace(":", "_");
		return "namma" + email + "@gmail.com";

	}

	public static Object[][] getTestdata(String sheetname) {
		// Properties
		File excel = new File(System.getProperty("user.dir") + "\\src\\main\\java\\testdata\\seleniumTestdata.xlsx");
		
		try {
			FileInputStream fisexcel = new FileInputStream(excel);
			 Workbook = new XSSFWorkbook(fisexcel);
		} catch (Throwable e) {
			e.printStackTrace();

		}

		XSSFSheet sheet = Workbook.getSheet(sheetname);
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rows][cols];
		
		for (int i = 0; i < rows; i++)
		{
			XSSFRow row = sheet.getRow(i+1);
			for (int j = 0; j < cols; j++) {
			XSSFCell cell = row.getCell(j);
			org.apache.poi.ss.usermodel.CellType cellType = cell.getCellType();

			switch (cellType) {
			case STRING:
				data[i][j] = cell.getStringCellValue();
				break;
			case NUMERIC:
				data[i][j] = Integer.toString((int) cell.getNumericCellValue());
				break;
			}

		}
		}
		return data;
	}
}

	

