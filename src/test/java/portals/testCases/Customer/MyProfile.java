package portals.testCases.Customer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.CreateObject;
import base.SetupInit;
import dataProvider.TestDataImport;

public class MyProfile extends SetupInit {
	protected CreateObject co;
	Map<String, ArrayList<Map<Object, Object>>> verificationData = new LinkedHashMap<>();

	@BeforeMethod
	public void beforeMethod() {
		co = new CreateObject(getDriver());
	}

	@Test(dataProvider = "verifyProfileDetails", dataProviderClass = TestDataImport.class)
	public void verifyProfileDetailsFromDashboard(Map<Object, Object> map) {
		try {
			co.datamap.putAll(map);
			setTestParameters(co.datamap, "verifyProfileDetailsFromDashboard");
			co.navigationPage.clickOnChangeMpinfromSideMenu();
			co.customerProfilePage.verifyProfileDetails(map);
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test(dataProvider = "verifyProfileDetails", dataProviderClass = TestDataImport.class)
	public void verifyProfileDetailsFromSideMenuProfileViewProfile(Map<Object, Object> map) {
		try {
			co.datamap.putAll(map);
			setTestParameters(co.datamap, "verifyProfileDetailsFromSideMenuProfileViewProfile");
			co.navigationPage.clickOnSideMenuProfileViewProfile();
			co.customerProfilePage.verifyProfileDetails(map);
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test(dataProvider = "Profile_Edit", dataProviderClass = TestDataImport.class)
	public void profileEditFromDashboard(Map<Object, Object> map) {
		try {
			co.datamap.putAll(map);
			setTestParameters(co.datamap, "profileEditFromDashboard");
			co.navigationPage.clickOnEditProfile();
			if (!co.customerProfilePage.editProfile(map)) {
				throw new RuntimeException("Profile Edit Failed");
			}
			// co.dashboardPage.verifyProfileDetails(map);
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test(dataProvider = "Profile_Edit", dataProviderClass = TestDataImport.class)
	public void profileEditFromSideMenuProfileViewProfile(Map<Object, Object> map) {
		try {
			co.datamap.putAll(map);
			setTestParameters(co.datamap, "profileEditFromSideMenuProfileViewProfile");
			co.navigationPage.clickOnSideMenuProfileViewProfile();
			if (!co.customerProfilePage.editProfile(map)) {
				throw new RuntimeException("Profile Edit Failed");
			}
			// co.dashboardPage.verifyProfileDetails(map);
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

}
