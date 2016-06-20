package com.read.testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;


public class ReadExcelFile {
	
	public static Object getData(String column) throws IOException
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\mate1\\testdata\\mate1.com_testdata.xls");
		HSSFWorkbook wb=new HSSFWorkbook(file);
	
		HSSFSheet sheet = wb.getSheetAt(0);
		HSSFRow row=sheet.getRow(0);
		Iterator<Cell>itr = row.cellIterator();
		int count = -1;
		Object data = null;
		
		while(itr.hasNext())
		{
			count++;
			if(column.equals(itr.next().getStringCellValue()))
			{
				
				if(sheet.getRow(1).getCell(count).getCellType() == Cell.CELL_TYPE_STRING)
				{
					data = sheet.getRow(1).getCell(count).getStringCellValue();}
				else if(sheet.getRow(1).getCell(count).getCellType() == Cell.CELL_TYPE_NUMERIC)
				{
					data = sheet.getRow(1).getCell(count).getNumericCellValue();}
				else if(sheet.getRow(1).getCell(count).getCellType() == Cell.CELL_TYPE_BOOLEAN)
				{
					data = sheet.getRow(1).getCell(count).getBooleanCellValue();}
				else if(sheet.getRow(1).getCell(count).getCellType() == Cell.CELL_TYPE_BLANK)
				{
					data = "";}
				
				break;	}}
		return data;
	}

}
