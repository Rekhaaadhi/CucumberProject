package org.pojoclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class RegisterPagePojo extends BaseClass{
	public RegisterPagePojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Register']")
	private WebElement btnRegister;
		
	@FindBy(xpath="//select[@name='user[title]']")
	private WebElement drpdwnTitle;
	
	@FindBy(name="user[firstname]")
	private WebElement fName;
	
	@FindBy(name="user[lastname]")
	private WebElement lName;
	
	@FindBy(name="user[email]")
	private WebElement email;
	
	@FindBy(name="user[confirmEmail]")
	private WebElement confmEmail;
	
	@FindBy(name="user[password]")
	private WebElement pswd;
	
	@FindBy(name="user[password_confirm]")
	private WebElement ConfmPswd;
	
	@FindBy(id="user[lastname]-error")
	private WebElement errlname;
	
	@FindBy(id="registerEmail-error")
	private WebElement errEmail;
	
	public WebElement geterrEmail() {
		return errEmail;
	}

	public WebElement getBtnRegister() {
		return btnRegister;
	}

	public WebElement getDrpdwnTitle() {
		return drpdwnTitle;
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getConfmEmail() {
		return confmEmail;
	}

	public WebElement getPswd() {
		return pswd;
	}

	public WebElement getConfmPswd() {
		return ConfmPswd;
	}
	
	public WebElement geterrlname() {
		return errlname;
	}


}
