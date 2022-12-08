package generic_scripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericExcel2 {
	public static String getData(String Sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./poi/excel1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
	 Cell cel = book.getSheet(Sheet).getRow(row).getCell(cell);
	 String value = cel.getStringCellValue();
	 return value;
	}

}


