package org.pojo;

import org.helper.helperclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Loginpojo extends helperclass{

	public Loginpojo() {
		
		PageFactory.initElements(driver, this);
	}	
	@FindBy(id="email")
	private WebElement txtuser;
	
	public WebElement getTxtuser() {
		return txtuser;
	}
	@CacheLookup
	@FindBys({@FindBy(id="pass")})	
	public WebElement getTxtpass;

	public WebElement getTxtpass() {
		return getTxtpass;
	}	
	@CacheLookup
	@FindBys({@FindBy(name="login")})	
	public WebElement loginbtn;
	
	public WebElement loginbtn() {
		return loginbtn;
		
	}
	
}
