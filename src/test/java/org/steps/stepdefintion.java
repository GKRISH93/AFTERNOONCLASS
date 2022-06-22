package org.steps;

import java.util.List;
import java.util.Map;

import org.helper.helperclass;
import org.pojo.Loginpojo;
import org.pojo.NewAccountPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefintion extends helperclass {

	@Given("To open chromeDriver")
	public void toOpenChromeDriver() {
	   lauchChromeBrowser();
	   maxi();
	   implict(10);	   
	}
	@When("To pass valid username and password")
	public void toPassValidUsernameAndPassword(io.cucumber.datatable.DataTable d) {
	   Map<String,String> alldata = d.asMap(String.class, String.class);
	   String user = alldata.get("username");
	   String pass = alldata.get("password");
	   
		url("https://www.facebook.com/");
		
		Loginpojo l = new Loginpojo();
		fillTheTextBox(l.getTxtuser(), user);
		fillTheTextBox(l.getTxtpass(), pass);
	}	
	@When("To pass invalid username and valid password")
	public void toPassInvalidUsernameAndValidPassword(io.cucumber.datatable.DataTable d) {
	   List<Map<String, String>> alldatas = d.asMaps(String.class, String.class);
	   String user = alldatas.get(1).get("numbers");
	   String pass = alldatas.get(0).get("pass");
	   
	   url("https://www.facebook.com/");
		
		Loginpojo l = new Loginpojo();
		fillTheTextBox(l.getTxtuser(), user);
		fillTheTextBox(l.getTxtpass(), pass);
	}
	@Then("To click LoginButton")
	public void toClickLoginButton() {
		Loginpojo l = new Loginpojo();
        btnClick(l.loginbtn()); 
	}
	@When("To click Createnew btn")
	public void toClickCreatenewBtn() {
		url("https://www.facebook.com/");
		NewAccountPojo n = new NewAccountPojo();
		btnClick(n.getNewAccountBtn());
	}

	@Then("To click sign in Button")
	public void toClickSignInButton() {
		NewAccountPojo n = new NewAccountPojo();
        btnClick(n.getSignupbtn());
	   	}
	
	}



