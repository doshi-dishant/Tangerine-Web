package portals.testCases.Agent;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.CreateObject;
import base.SetupInit;
import dataProvider.TestDataImport;
import utils.Utility;

public class A2ATransfer extends SetupInit {
	protected CreateObject co;
	Map<String, ArrayList<Map<Object, Object>>> verificationData = new LinkedHashMap<>();

	@BeforeMethod
	public void beforeMethod() {
		co = new CreateObject(getDriver());
	}

	@Test(dataProvider = "A2ATransfer", dataProviderClass = TestDataImport.class)
	public void a2aTranfer(Map<Object, Object> map) {
		try {
			co.datamap.putAll(map);
			setTestParameters(co.datamap, "a2aTranfer");
			map.put(MethodName, "a2aTransfer");
			co.navigationPage.clickOnA2ATransfer();
			map = co.a2aTransferPage.a2aTransfer(map);
			setUseCaseVerificationData("a2aTranfer", verificationData, map);
			setSuccessParameters(co.datamap);
			writeVerificationFile(Utility.getJsonStringFromMap(map));
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test
	public void verifyPerformedA2ATranferFromFromUserPassbook() {
		if (verifyMethodIsAvail(verificationData, "a2aTranfer")) {
			for (Map<Object, Object> map : verificationData.get("a2aTranfer")) {
				try {
					co.datamap.putAll(map);
					setTestParameters(co.datamap, "verifyPerformedA2ATranferFromFromUserPassbook");
					co.common.verifyTransactionInWebPortalForFromUser(map, co.dashboardPage);
					setSuccessParameters(co.datamap);
				} catch (Exception e) {
					setExceptionData(co, e);
				} finally {
					setExcecutionData(co);
					if (co.navigationPage.isLogoutButtonDislay(3))
						co.navigationPage.clickOnLogOut();
				}
			}
		} else {
			throw new RuntimeException("verification failed, due to operation failed");
		}
	}

	@Test
	public void verifyPerformedA2ATransferFromToUserPassbook() {
		if (verifyMethodIsAvail(verificationData, "a2aTranfer")) {
			if (co.navigationPage.isLogoutButtonDislay(3)) {
				co.navigationPage.clickOnLogOut();
			}
			for (Map<Object, Object> map : verificationData.get("a2aTranfer")) {
				co.loginPage.login(map.get(ToUserName).toString(), map.get(ToPassword).toString(), "sub agent");
				try {
					co.datamap.putAll(map);
					setTestParameters(co.datamap, "verifyPerformedA2ATranferFromToUserPassbook");
					co.common.verifyTransactionInWebPortalForToUser(map, co.dashboardPage);
					setSuccessParameters(co.datamap);
				} catch (Exception e) {
					setExceptionData(co, e);
				} finally {
					setExcecutionData(co);
					if (co.navigationPage.isLogoutButtonDislay(3))
						co.navigationPage.clickOnLogOut();
				}
			}
			
		} else {
			throw new RuntimeException("verification failed, due to operation failed");
		}
	}


	@Test(dataProvider = "A2ATransfer", dataProviderClass = TestDataImport.class)
	public void a2aTransferFromSideMenu(Map<Object, Object> map) {
		try {
			co.datamap.putAll(map);
			setTestParameters(co.datamap, "a2aTransferFromSideMenu");
			map.put(MethodName, "a2aTransfer");
			co.navigationPage.clickOnSideMenuA2ATransfer();
			map = co.a2aTransferPage.a2aTransfer(map);
			setUseCaseVerificationData("a2aTransferFromSideMenu", verificationData, map);
			setSuccessParameters(co.datamap);
			writeVerificationFile(Utility.getJsonStringFromMap(map));
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test
	public void verifyPerformedA2ATransferFromSideMenuFromUserPassbook() {
		if (verifyMethodIsAvail(verificationData, "a2aTransferFromSideMenu")) {
			for (Map<Object, Object> map : verificationData.get("a2aTransferFromSideMenu")) {
				try {
					co.datamap.putAll(map);
					setTestParameters(co.datamap, "verifyPerformedA2ATransferFromSideMenuFromUserPassbook");
					co.common.verifyTransactionInWebPortalForFromUser(map, co.dashboardPage);
					setSuccessParameters(co.datamap);
				} catch (Exception e) {
					setExceptionData(co, e);
				} finally {
					setExcecutionData(co);
				}
			}
		} else {
			throw new RuntimeException("verification failed, due to operation failed");
		}
	}

	@Test
	public void verifyPerformedA2ATransferFromSideMenuFromToUserPassbook() {
		if (verifyMethodIsAvail(verificationData, "a2aTransferFromSideMenu")) {
			if (co.navigationPage.isLogoutButtonDislay(3)) {
				co.navigationPage.clickOnLogOut();
			}
			for (Map<Object, Object> map : verificationData.get("a2aTransferFromSideMenu")) {
				co.loginPage.login(map.get(ToUserName).toString(), map.get(ToPassword).toString(), "sub agent");
				try {
					co.datamap.putAll(map);
					setTestParameters(co.datamap, "verifyPerformedA2ATransferFromSideMenuFromToUserPassbook");
					co.common.verifyTransactionInWebPortalForToUser(map, co.dashboardPage);
					setSuccessParameters(co.datamap);
				} catch (Exception e) {
					setExceptionData(co, e);
				} finally {
					setExcecutionData(co);
					if (co.navigationPage.isLogoutButtonDislay(3))
						co.navigationPage.clickOnLogOut();
				}
			}
		} else {
			throw new RuntimeException("verification failed, due to operation failed");
		}
	}
}
