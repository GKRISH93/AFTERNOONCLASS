package org.steps;

import org.helper.helperclass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends helperclass {

	@Before(order=2)
	private void beforeMethod2() {
       System.out.println("beforeMethod=2");
    }
	@Before(order=1)
	private void beforeMethod1() {
		System.out.println("beforeMethod=1");		
	}
	@After(order=1)
	private void afterMethod1() {
		System.out.println("afterMethod=1");		
    }
	@After(order=2)
	public void	screenShoot(Scenario s) {
		
		if (s.isFailed()) {
			TakesScreenshot t = (TakesScreenshot)driver;
			byte[] src = t.getScreenshotAs(OutputType.BYTES);
			s.embed(src, "image/png");
		}
	}

		
		
	
	
	
	

}
