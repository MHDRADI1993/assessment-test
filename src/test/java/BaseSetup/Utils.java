package BaseSetup;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Utils extends Setup {
	public Utils() throws IOException {
		super();
	}

	public static void takeSnapshot(String name) {

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File(prop.getProperty("SnapchatAndVideosPath") + name + ".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

    /*public static String[][] getExcelData(String sheetName) throws IOException ,FileNotFoundException {

    	File excelFile = new File(prop.getProperty("ExcelPath"));
		FileInputStream excle = new FileInputStream(excelFile);
		excelWorkbook = new XSSFWorkbook(excle);
		sheet = excelWorkbook.getSheet(sheetName);
		rows = sheet.getPhysicalNumberOfRows();
		columns = sheet.getRow(0).getLastCellNum();
		System.out.println("rows number is : " + rows);
		System.out.println("columns number is : " + columns);
		String data[][] = new String[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if( sheet.getRow(i).getCell(j).toString()!= null) {
				data[i][j] = sheet.getRow(i).getCell(j).toString();
				}
			}
		}
		for (int i = 0; i < columns; i++) {
			if(sheet.getRow(0).getCell(i).toString()!=null) {
				excelColumnMap.put(sheet.getRow(0).getCell(i).toString(), i);
			}
		}
		return data;
    }

	public static ArrayList<String> getTestCaseRowData(String tc_name) {
	   ArrayList<String> tc_rowdata = new ArrayList<String>();
	   for (int row = 0; row < excelData.length; row++)
		{
			 if(tc_name.equals(excelData[row][0].trim())) {
				  for (int col = 0; col < columns; col++){
					  tc_rowdata.add(excelData[row][col]);
				  }
				  break;
			 }
		}
	   return tc_rowdata;
   	}*/

