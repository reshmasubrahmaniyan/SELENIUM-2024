package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

@FindBy(linkText="Log out")
private WebElement logoutLink;

@FindBy(partialLinkText  ="BOOKS")
private WebElement booksLink;

@FindBy(partialLinkText ="COMPUTERS")
private WebElement computerLink;

@FindBy(partialLinkText ="ELECTRONICS")
private WebElement electronicsLink;


public HomePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getLogoutlink() {
		return logoutLink;
	
}
public WebElement getLogoutLink() {
	return logoutLink;
}
public WebElement getBooksLink() {
	return booksLink;
}
public WebElement getComputerLink() {
	return computerLink;
}
public WebElement getElectronicsLink() {
	return electronicsLink;
}

}
