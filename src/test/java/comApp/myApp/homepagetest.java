package comApp.myApp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class homepagetest {
	
	homepage abc;
	
	public homepagetest() {
		abc = new homepage();
	}
	
	@Test
	public void verifynewsletter() {
		Assert.assertTrue(abc.elementFound(abc.getnewsletter()));
	}
	@Test 
	public void verifyValueInNewsletter() {
	    abc.setnewsletter();
		abc.newsletterOk();
		Assert.assertTrue(abc.displayText().contains("Invalid email address"));
	}

}
