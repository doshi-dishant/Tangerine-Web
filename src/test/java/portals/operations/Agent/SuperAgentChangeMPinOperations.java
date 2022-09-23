package portals.operations.Agent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.SetupInit;
import portals.operations.Common.CommonOperations;
import utils.elasticUtils.elasticwrite;

public class SuperAgentChangeMPinOperations extends SetupInit {
	
	CommonOperations common;
	elasticwrite log; 
	////input[@id='frm_text_oldPasswordid'] |  //input[@id='frm_text_passwordid'] |  //input[@id='frm_text_confirmPasswordid']
	By OldPassword = By.xpath("//input[@id='frm_text_oldPasswordid']");
	By NewPassword = By.xpath("//input[@id='frm_text_passwordid']");
	By ConfrmNewPassword = By.xpath("//input[@id='frm_text_confirmPasswordid']");
	
	By currentMpin = By.id("frm_text_oldtransactionPinid");
	By newMpin = By.id("frm_text_transactionPinid");
	By confirmMpin = By.id("frm_text_confirmTransactionPinid");
	By btnSubmit = By.name("submit");
	public By MPINchanged  = By.xpath("//p[contains(text(),'MPIN has been changed successfully')]");
	public By Passwordchanged  = By.xpath("//p[contains(text(),'Password has been changed successfully')]");
	 

	
	
	public SuperAgentChangeMPinOperations(WebDriver driver, elasticwrite log) {
		this.log = log;
		this.driver = driver;
		//changeMpinPage = new ChangeMpinPageOperations(this.driver, log);
		common = new CommonOperations(this.driver, log);
	}
	
	public void entercurrentMpin(String currentmpin, int... args) {
		sendKeys(currentMpin, currentmpin, 0);
		setLogSteps(log, "Enter Current MPIN : " + currentmpin);
	}
	
	
	public void enternewMpin(String currentmpin, int... args) {
		sendKeys(newMpin, currentmpin, 0);
		setLogSteps(log, "Enter New MPIN : " + newMpin);
	}
	
	public void enterconfirmMpin(String currentmpin, int... args) {
		sendKeys(confirmMpin, currentmpin, 0);
		setLogSteps(log, "Enter Confirm MPIN : " + confirmMpin);
	}

	public void verifyMPINchanged(int args) {
		try {
			verifyVisible(MPINchanged, args);
		} catch (Exception e) {
			throw new RuntimeException(GET_TEXT_ERROR_MESSAGE + "MPIN changed Message Not Found");
		}
		setLogSteps(log, "MPIN changed Message Found");
	}
	
	public void verifyPasswordchanged(int args) {
		try {
			verifyVisible(Passwordchanged, args);
		} catch (Exception e) {
			throw new RuntimeException(GET_TEXT_ERROR_MESSAGE + "Password changed Message Not Found");
		}
		setLogSteps(log, "Password changed Message Found");
	}

	public void clickOnsubmitButton() {
		try {
			clickOnElement(this.log, btnSubmit, 0);
		} catch (Exception e) {
			throw new RuntimeException(CLICK_ERROR_MESSAGE + "Submit Button");
		}
		setLogSteps(log, "Click On Submit Button");
	}

	public void enteroldpassword(String currentmpin, int i) {
		sendKeys(OldPassword, currentmpin, 0);
		setLogSteps(log, "Enter Current MPIN : " + currentmpin);
	}
	
	public void enterConfirmNewpassword(String currentmpin, int i) {
		sendKeys(NewPassword, currentmpin, 0);
		setLogSteps(log, "Enter Current MPIN : " + currentmpin);
	}

	public void enterNewpassword(String currentmpin, int i) {
		sendKeys(ConfrmNewPassword, currentmpin, 0);
		setLogSteps(log, "Enter Current MPIN : " + currentmpin);
		
	}
	
	
}
