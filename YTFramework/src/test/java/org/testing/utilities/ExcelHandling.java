package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling 
{
	public static void ReadCell(int r, int c) throws IOException
	{
		File f = new File("../xlsx/data.xlsx");
		FileInputStream fs = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sh = wb.getSheetAt(0);
		int row = sh.getPhysicalNumberOfRows();
		if(r<=row)
		{
			XSSFRow xr = sh.getRow(r-1);
			int cell = xr.getPhysicalNumberOfCells();
			if(c<=cell)
			{
				XSSFCell cl = xr.getCell(c-1);
				System.out.println("Desired data is " + cl.getStringCellValue());
			}
			else System.out.println("Enter a correct cell number");
			
		}
		else System.out.println("Enter a correct row number");
		
	}
	
	public static void ReadRow(int row) throws IOException
	{
		File f = new File("../xlsx/data.xlsx");
		FileInputStream fs = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sh = wb.getSheetAt(0);
	    XSSFRow rw = sh.getRow(row);
	    int cl = rw.getPhysicalNumberOfCells();
	    int j =0;
	    while(j<cl)
	    {
	    	XSSFCell cel = rw.getCell(j);
	    	System.out.println(cel.toString());
	    	j++;
	    	
	    }
	}
	
    public static void RowRange(int initialrow, int endrow) throws IOException
    {
    	int i = 0; 
    	File f = new File("../xlsx/data.xlsx");
    	FileInputStream fis = new FileInputStream(f);
    	XSSFWorkbook wb = new XSSFWorkbook(fis);
    	XSSFSheet sh = wb.getSheetAt(0);
    	int row = sh.getPhysicalNumberOfRows();
    	if(initialrow>=0 && endrow<=row )
    	{
    	while(initialrow<=endrow)
    	{
    	XSSFRow xr = sh.getRow(initialrow-1); 
    	int cell = xr.getPhysicalNumberOfCells();
    	while(i<cell)
    	{
    		XSSFCell xc = xr.getCell(i);
    		System.out.print(xc.toString()+" | ");
    		i++;
    	}
    	i=0;
    	initialrow++;
    	System.out.println();
    	}
    	}
    	else
    	System.out.println("Enter a correct range");
    }

}
