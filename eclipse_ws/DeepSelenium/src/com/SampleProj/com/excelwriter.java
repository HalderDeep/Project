package com.SampleProj.com;


import java.io.File;
import java.io.FileOutputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelwriter {
	
	
	
	@SuppressWarnings("deprecation")
	public void excelwrite(String path) throws Exception{
	
	

	
	
	//define the file path where excel sheet will be generated
	String filepath= (path);
	File file= new File(filepath);
	FileOutputStream fos=new FileOutputStream(file);
        //create the blank workbook
	Workbook wb= new XSSFWorkbook();
        //create the blank excel sheet
	Sheet sh= wb.createSheet("TestSheet");
	//define the position in the excel sheet where write operation needs to perform
        Row rw= sh.createRow(5);
	Cell cl=rw.createCell(1);
        //define input type
	cl.setCellType(CellType.STRING);
        //define the data value
	cl.setCellValue("Test Data by Deep");
	System.out.println("test data entered");
        //write the workbook
	wb.write(fos);
	wb.close();
	}
	public static void main(String[] args) throws Exception {
		excelwriter ex= new excelwriter();
		ex.excelwrite(".\\excelsheet\\test.xlsx");
	
	}	
}

