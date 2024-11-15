package books;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.ExcelUtility;
import genericutility.FileUtility;
import objectrepository.HomePage;
@Listeners(ListenersUtility.class)
public class TC_DWS_005_Test extends BaseClass{
	@Test
	public void ClickOnBooks() throws EncryptedDocumentException, IOException{
	hp=new HomePage(driver);
	hp.getBooksLink().click();
	Assert.assertEquals(driver.getTitle(), .getStringDataFromExcel("Books",1,0),"Books page is not displayed";
	Test.log(Status.PASS,"Books page is displayed");
}
