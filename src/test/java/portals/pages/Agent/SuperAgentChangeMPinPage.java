package portals.pages.Agent;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import base.SetupInit;
import portals.operations.Agent.SuperAgentChangeMPinOperations;
import portals.operations.Common.CommonOperations;
import portals.operations.Common.DashBoardPageOperations;
import utils.elasticUtils.elasticwrite;

public class SuperAgentChangeMPinPage extends SetupInit {
	SuperAgentChangeMPinOperations superagentchangeMpinPage;
	DashBoardPageOperations dashboardPageCommon;
	CommonOperations common;
	elasticwrite log;

	public SuperAgentChangeMPinPage(WebDriver driver, elasticwrite log) {
		this.log = log;
		this.driver = driver;
		superagentchangeMpinPage = new SuperAgentChangeMPinOperations(this.driver, log);
		dashboardPageCommon = new DashBoardPageOperations(driver, log);
		common = new CommonOperations(this.driver, log);
	}

	public void setnewMpin(Map<Object, Object> map) {
		superagentchangeMpinPage.entercurrentMpin(map.get(FromMpin).toString(), 0);
		superagentchangeMpinPage.enternewMpin(map.get(NewMpin).toString(), 0);
		superagentchangeMpinPage.enterconfirmMpin(map.get(NewMpin).toString(), 0);
		superagentchangeMpinPage.clickOnsubmitButton();	
	}
	
	public void SetNewMpin(Map<Object, Object> map) {
		superagentchangeMpinPage.entercurrentMpin(map.get(FromMpin).toString(), 0);
		superagentchangeMpinPage.enternewMpin(map.get(NewMpin).toString(), 0);
		superagentchangeMpinPage.enterconfirmMpin(map.get(NewMpin).toString(), 0);
		superagentchangeMpinPage.clickOnsubmitButton();
		superagentchangeMpinPage.verifyMPINchanged(0);
	}
	
	
	public void setnewMpinFirstime(Map<Object, Object> map) {
		superagentchangeMpinPage.entercurrentMpin(map.get(NewMpin).toString(), 0);
		superagentchangeMpinPage.enternewMpin(map.get(NewMpin1).toString(), 0);
		superagentchangeMpinPage.enterconfirmMpin(map.get(NewMpin1).toString(), 0);
		superagentchangeMpinPage.clickOnsubmitButton();	
		superagentchangeMpinPage.verifyMPINchanged(0);
	}
	
	public void setnewMpinSecondtime(Map<Object, Object> map) {
		superagentchangeMpinPage.entercurrentMpin(map.get(NewMpin1).toString(), 0);
		superagentchangeMpinPage.enternewMpin(map.get(NewMpin2).toString(), 0);
		superagentchangeMpinPage.enterconfirmMpin(map.get(NewMpin2).toString(), 0);
		superagentchangeMpinPage.clickOnsubmitButton();	
		superagentchangeMpinPage.verifyPasswordchanged(0);
	}
	
	public void setnewPasswordFirstime(Map<Object, Object> map) {
		superagentchangeMpinPage.enteroldpassword(map.get(FromPassword).toString(), 0);
		superagentchangeMpinPage.enterNewpassword(map.get(NewPassword).toString(), 0);
		superagentchangeMpinPage.enterConfirmNewpassword(map.get(NewPassword).toString(), 0);
		superagentchangeMpinPage.clickOnsubmitButton();	
		superagentchangeMpinPage.verifyPasswordchanged(0);
	}
	
	public void setnewPasswordSecondtime(Map<Object, Object> map) {
		superagentchangeMpinPage.enteroldpassword(map.get(NewPassword).toString(), 0);
		superagentchangeMpinPage.enterNewpassword(map.get(NewPassword1).toString(), 0);
		superagentchangeMpinPage.enterConfirmNewpassword(map.get(NewPassword1).toString(), 0);
		superagentchangeMpinPage.clickOnsubmitButton();	
		superagentchangeMpinPage.verifyPasswordchanged(0);
	}
	
}
