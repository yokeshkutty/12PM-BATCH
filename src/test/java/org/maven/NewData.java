package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewData {
	public static void main(String[] args) throws IOException {
		File r=new File("C:\\Users\\monis\\workspace\\Maven\\testdata\\DATA.xlsx");
		FileInputStream f=new FileInputStream(r);
		XSSFWorkbook x=new XSSFWorkbook(f);
		XSSFSheet sheet = x.getSheet("YOGI");
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			XSSFRow r1 = sheet.getRow(i);
			for(int j=0;j<r1.getPhysicalNumberOfCells();j++) {
				XSSFCell cell = r1.getCell(j);
				
				int c2 = cell.getCellType();
				if(c2==1) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);}
					else if(c2==0) {
						double numericCellValue = cell.getNumericCellValue();
						long l= (long)numericCellValue;
						System.out.println(l);
					}
				}
				
			}
		}
	
	}


