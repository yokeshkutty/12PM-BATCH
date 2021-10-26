package org.maven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\monis\\Desktop\\JOHN.xlsx");
		f.createNewFile();
		FileOutputStream fi=new FileOutputStream(f);
		XSSFWorkbook w=new XSSFWorkbook();
		XSSFSheet createSheet = w.createSheet("super");
		XSSFRow createRow = createSheet.createRow(1);
		XSSFCell createCell = createRow.createCell(0);
		createCell.setCellValue("supermachi");
		w.write(fi);
		if(createCell.equals(supermachi)
		
		
	}

}
