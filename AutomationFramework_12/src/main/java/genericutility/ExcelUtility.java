package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Reshma
 */


public class ExcelUtility {
	/**
	 * This meathod is used to read String data from excel
	 * User must pass sheetname,row/index,column index
	 * @param sheetName
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentExcel
	 */
	public String getStringDataFromExcel(String sheetName, int rowIntex, int colIntex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptrData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIntex).getCell(colIntex).getStringCellValue();

	}

	/**
	 * This method is used to read boolean data from excel
	 * 
	 * @param sheetName
	 * @param rowIntex
	 * @param colIntex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public boolean getBooleanDataFromExcel(String sheetName, int rowIntex, int colIntex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptrData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIntex).getCell(colIntex).getBooleanCellValue();

	}

	public double getNumericDataFromExcel(String sheetName, int rowIntex, int colIntex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptrData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIntex).getCell(colIntex).getNumericCellValue();
	}

	public LocalDateTime getDataFromExcel(String sheetName, int rowIntex, int colIntex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptrData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIntex).getCell(colIntex).getLocalDateTimeCellValue();
	}
}
