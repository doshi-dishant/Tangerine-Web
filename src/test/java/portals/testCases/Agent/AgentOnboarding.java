package portals.testCases.Agent;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import utils.Utility;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.CreateObject;
import base.SetupInit;
import dataProvider.TestDataImport;

public class AgentOnboarding extends SetupInit {
	protected CreateObject co;
	Map<String, ArrayList<Map<Object, Object>>> verificationData = new LinkedHashMap<>();

	@BeforeMethod
	public void beforeMethod() {
		co = new CreateObject(getDriver());
	}

	@Test(dataProvider = "AgentOnboarding", dataProviderClass = TestDataImport.class)
	public void AgentOnboarding(Map<Object, Object> map) {
		try {
			if (co.navigationPage.isLogoutButtonDislay(3)) {
				pauseInSeconds(3);
				co.navigationPage.clickOnLogOut();
			}
			co.datamap.putAll(map);
			setTestParameters(co.datamap, "AgentOnboarding");
			map.put(MethodName, "AgentOnboarding");
			map = co.agentOnboardingPage.AgentOnboarding(map);
			setUseCaseVerificationData("AgentOnboarding", verificationData, map);
			setSuccessParameters(co.datamap);
			writeVerificationFile(Utility.getJsonStringFromMap(map));
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co)
;
		}
	}
	
	
	
	@Test(dataProvider = "AgentOnboarding", dataProviderClass = TestDataImport.class)
	public void agentOnboarding1(Map<Object, Object> map) {
		try {
			co.datamap.putAll(map);
			setTestParameters(co.datamap, "agentOnboarding");
			co.navigationPage.clickOnAgentOnboarding();
			co.agentOnboardingPage.AgentOnboarding(map);
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	
	@Test(dataProvider = "AgentOnboarding", dataProviderClass = TestDataImport.class)
	public void ChangeMpinfromSideMenu(Map<Object, Object> map) {
		try {
			co.datamap.putAll(map);
			setTestParameters(co.datamap, "AgentOnboardingchangeMpinSidemenu");
			co.navigationPage.clickOnChangeMpinfromSideMenuForWrongMPIN();
			co.superagentChangeMpinPage.SetNewMpin(map);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
		}
	}
	
	@Test(dataProvider = "AgentOnboarding", dataProviderClass = TestDataImport.class)
	public void ChangeMpinfromProfile(Map<Object, Object> map) {
		try {
			co.datamap.putAll(map);
			setTestParameters(co.datamap, "AgentOnboardingchangeMpinSidemenu");
			//co.navigationPage.clickOnChangeMpinfromSideMenuForWrongMPIN();
			co.navigationPage.clickOnSideMenu();
			co.navigationPage.clickOnSideMenuProfile();
			co.navigationPage.clickOnSideMenuProfileViewProfile();
			co.navigationPage.clickOnChangeMPinForEnterpriseFromProfile();
			co.superagentChangeMpinPage.setnewMpinFirstime(map);
			
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
		}
	}
	
	
	@Test(dataProvider = "AgentOnboarding", dataProviderClass = TestDataImport.class)
	public void ChangePasswordfromProfile(Map<Object, Object> map) {
		try {
			co.datamap.putAll(map);
			setTestParameters(co.datamap, "AgentOnboardingChangePasswordfromProfile");
			co.navigationPage.clickOnChangePasswordfromSideMenuForPassword();
			co.navigationPage.clickOnChangePassword();
			co.superagentChangeMpinPage.setnewPasswordFirstime(map);
			
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
		}
	}
	
	@Test(dataProvider = "AgentOnboarding", dataProviderClass = TestDataImport.class)
	public void ChangePasswordfromSetting(Map<Object, Object> map) {
		try {
			co.common.webPortalLoginAfterChangePassword(map, "From1", 0);
			co.datamap.putAll(map);
			setTestParameters(co.datamap, "AgentOnboardingChangePasswordfromSetting");
			co.navigationPage.clickOnSideMenu();
			co.navigationPage.clickOnSideMenuProfile();
			co.navigationPage.clickOnSideMenuProfileViewProfile();
			co.navigationPage.clickOnChangePassword();
			co.superagentChangeMpinPage.setnewPasswordSecondtime(map);
			
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
		}
	}
	
	
	

}
