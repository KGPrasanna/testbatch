package comApp.myApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage extends basepage {
	
	public homepage(){
		  PageFactory.initElements(driver,this);
		}
		
	@FindBy(xpath =" //*[@id=\'newsletter-input\']")
	private WebElement newsletter;

	public WebElement getnewsletter(){
	return newsletter;
		}
	public void setnewsletter(){
		 setText(newsletter,"Gokul");
			}
	
    @FindBy(xpath="//*[@id=\'newsletter_block_left\']/div/form/div/button")
    private WebElement nextbutton;
    
    public void newsletterOk() {
    	 nextbutton.click();
    }
    
    @FindBy (xpath="//*[@id=\"columns\"]/p")
    private WebElement message;
    
    public String displayText() {
     return	message.getText();
    }
}