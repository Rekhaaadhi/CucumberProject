package org.pojoclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class HomePagePojoClass extends BaseClass{
	
	public HomePagePojoClass() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[text()='Accept All Cookies']")
	private WebElement btnacceptCookie;
	@FindBy(xpath="(//a[@data-modal-id='loginModal'])[1]")
	private WebElement linkSiginRegister;
	@FindBy(xpath="//a[text()='CREATE AN ACCOUNT']")
	private WebElement linkCreateNewAcnt;
	@FindBy(xpath="//a[@data-content='NEW']")
	private WebElement linkNewBook;
	@FindBy(partialLinkText="Coming")
	private WebElement linkComingSn;
	public WebElement getBtnacceptCookie() {
		return btnacceptCookie;
	}
	public WebElement getLinkSiginRegister() {
		return linkSiginRegister;
	}
	public WebElement getLinkCreateNewAcnt() {
		return linkCreateNewAcnt;
	}
	public WebElement getLinkNewBook() {
		return linkNewBook;
	}
	public WebElement getLinkComingSn() {
		return linkComingSn;
	}
}
	
	