package genericUtility;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		//convert physical representation of excel sheet into java representation FileInputStream fis = new FileInputStream("./testData/excelData.xlsx"); //load the java representation of excel file

		Workbook workbook = WorkbookFactory.create(fis);

		//accessing the sheet

		Sheet sheet = workbook.getSheet("Sheet1");

		//accessing the row Row row sheet.getRow(1);

		//accessing the cell

		Cell cell = row.getCell(0);

		//converting cell type to string type String url cell.getStringCellValue();

		//printing the yalue in console

		System.out.println("The URL is: "+url); 
		String username= row.getCell(1).toString();

		System.out.println("The username is: "+username);

		String password= row.getCell(2).toString();
		System.out.println("The password is: "+password);

		double num= row.getCell(3).getNumericCellValue(); 
		boolean bool, row.getCell(4).getBooleanCellValue();

		System.out.println(num);
		System.out.println(bool);

}

	public String fetchDataFromExcelSheet(Sheet, 1, 0
			
			
			
			
			
			
			
			) {
		// TODO Auto-generated method stub
		return null;
	}
	https://github.com/MohdTaha4045/SeleniumProject.git
		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
