package org.pojo;

import org.helper.helperclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPojo extends helperclass {

	public NewAccountPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({
		@FindBy(xpath="(//a[@role='button'])[2]")
	})public WebElement newAccountBtn;
	@FindAll({
		@FindBy(xpath="(//button[text()='Sign Up'])[1]")
	})public WebElement signupbtn;
	public WebElement getNewAccountBtn() {
		return newAccountBtn;
	}
	public void setNewAccountBtn(WebElement newAccountBtn) {
		this.newAccountBtn = newAccountBtn;
	}
	public WebElement getSignupbtn() {
		return signupbtn;
	}
	public void setSignupbtn(WebElement signupbtn) {
		this.signupbtn = signupbtn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
