package portals.testCases.Common;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.CreateObject;
import base.SetupInit;

public class CommonTestCasesCustomer extends SetupInit {
	protected CreateObject co;
	Map<String, ArrayList<Map<Object, Object>>> verificationData = new LinkedHashMap<>();

	@BeforeMethod
	public void beforeMethod() {
		co = new CreateObject(getDriver());
	}
	
	@Test
	public void MyProfileFromSideMenu() {
		try {
			setTestParameters(co.datamap, "MyProfileFromSideMenu");
			co.navigationPage.clickOnSideMenuProfileMyProfile();
			co.customerProfilePage.verifyMyProfile();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}
	
	@Test
	public void MyProfile() {
		try {
			setTestParameters(co.datamap, "MyProfile");
			co.navigationPage.clickOnMyProfile();
			co.customerProfilePage.verifyMyProfile();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}
	
	@Test
	public void CheckBalanceFromMyProfile() {
		try {
			setTestParameters(co.datamap, "Check Balance from My Profile");
			co.navigationPage.clickOnMyProfile();
			co.customerProfilePage.checkBalancefromMyProfile();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}
}
