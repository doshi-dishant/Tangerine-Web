package portals.testCases.Common;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.CreateObject;
import base.SetupInit;
import dataProvider.TestDataImport;

public class CommonTestcasesSubAgent extends SetupInit {
	protected CreateObject co;
	Map<String, ArrayList<Map<Object, Object>>> verificationData = new LinkedHashMap<>();

	@BeforeMethod
	public void beforeMethod() {
		co = new CreateObject(getDriver());
	}

	@Test
	public void checkBalanceFromDashboardViewBalance() {
		try {
			setTestParameters(co.datamap,
					"checkBalanceFromDashboardViewBalance");
			co.dashBoardPageOperations.clickOnCheckBalance();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test(dataProvider = "QRCode", dataProviderClass = TestDataImport.class)
	public void qrCodeFromDashboard(Map<Object, Object> map) {
		try {
			co.datamap.putAll(map);
			setTestParameters(co.datamap, "qrCodeFromDashboard");
			co.navigationPage.clickOnNavBarQRCode();
			co.dashboardPage.verifyQRcodeData(map);
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test(dataProvider = "Passbook_Filter", dataProviderClass = TestDataImport.class)
	public void passBookFromDashboard(Map<Object, Object> map) {
		try {
			co.datamap.putAll(map);
			setTestParameters(co.datamap, "passBookFromDashboard");
			co.navigationPage.clickOnNavBarPassbook();
			co.dashboardPage.selectPassbookFilter(map);
			co.dashboardPage.verifyPassbook(map);
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test
	public void verifyDownloadPassbook() {
		try {
			setTestParameters(co.datamap, "verifyDownloadPassbook");
			co.common.clearDownloadsDirectory();
			co.dashboardPage.verifyDownloadPassbook();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test
	public void recentTransactionFromDashboard() {
		try {
			setTestParameters(co.datamap, "recentTransactionFromDashboard");
			co.dashboardPage.verifyRecentTransactions();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}
	
	/*
	 * @Test
	 * public void verifyContactUsFromDashboard() { try {
	 * setTestParameters(co.datamap, "verifyContactUsFromDashboard");
	 * co.navigationPage.clickOnContactUs(); co.contactUsPage.verifyContactUs();
	 * setSuccessParameters(co.datamap); } catch (Exception e) {
	 * setExceptionData(co, e); } finally { setExcecutionData(co); } }
	 * 
	 * @Test public void verifyContactUsFromSideMenuProfile() { try {
	 * setTestParameters(co.datamap, "verifyContactUsFromSideMenuProfile");
	 * co.navigationPage.clickOnSideMenuProfile();
	 * co.navigationPage.clickOnSideMenuContactUsFromProfile();
	 * co.contactUsPage.verifyContactUs(); setSuccessParameters(co.datamap); } catch
	 * (Exception e) { setExceptionData(co, e); } finally { setExcecutionData(co); }
	 * }
	 * 
	 * @Test public void verifyAboutUsFromDashboard() { try {
	 * setTestParameters(co.datamap, "verifyAboutUsFromDashboard");
	 * co.navigationPage.clickOnAboutUs(); co.aboutUsPage.verifyAboutUs();
	 * setSuccessParameters(co.datamap); } catch (Exception e) {
	 * setExceptionData(co, e); } finally { setExcecutionData(co); } }
	 * 
	 * @Test public void verifyAboutUsFromSideMenuProfile() { try {
	 * setTestParameters(co.datamap, "verifyAboutUsFromSideMenuProfile");
	 * co.navigationPage.clickOnSideMenuProfile();
	 * co.navigationPage.clickOnSideMenuAboutUsFromProfile();
	 * co.aboutUsPage.verifyAboutUs(); setSuccessParameters(co.datamap); } catch
	 * (Exception e) { setExceptionData(co, e); } finally { setExcecutionData(co); }
	 * }
	 */

	@Test
	public void mpinPolicyFromDashboardFooter() {
		try {
			setTestParameters(co.datamap, "mpinPolicyFromDashboardFooter");
			co.navigationPage.clickOnDashboardeMPINPolicy();
			co.mpinPolicyPage.verifyMpinPolicy();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test
	public void mpinPolicyFromSideMenuSettings() {
		try {
			setTestParameters(co.datamap, "mpinPolicyFromSideMenuSettings");
			co.navigationPage.clickOnSideMenuSettings();
			co.navigationPage.clickOnSideMenueMPINPolicyFromSetings();
			co.mpinPolicyPage.verifyMpinPolicy();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test
	public void privacyPolicyFromDashboardFooter() {
		try {
			setTestParameters(co.datamap, "privacyPolicyFromDashboardFooter");
			co.navigationPage.clickOnDashboardePrivacyPolicy();
			co.privacyPolicyPage.verifyPrivacyPolicy();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test
	public void privacyPolicyFromSideMenuSettings() {
		try {
			setTestParameters(co.datamap, "privacyPolicyFromSideMenuSettings");
			co.navigationPage.clickOnSideMenuSettings();
			co.navigationPage.clickOnSideMenuePrivacyPolicyFromSettings();
			co.privacyPolicyPage.verifyPrivacyPolicy();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test
	public void termsAndConditionsFromSideMenuSettings() {
		try {
			setTestParameters(co.datamap, "termsAndConditionsFromSideMenuSettings");
			co.navigationPage.clickOnSideMenuSettings();
			co.navigationPage.clickOnSideMenueTermsAndConditionsFromSettings();
			co.termsAndConditionsPage.verifyTermsAndConditions();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test
	public void termsAndConditionsFromDashboardFooter() {
		
		try {
			setTestParameters(co.datamap, "termsAndConditionsFromDashboardFooter");
			co.navigationPage.clickOnDashboardeTermsAndConditions();
			co.termsAndConditionsPage.verifyTermsAndConditions();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}
	
	@Test
	public void verifyChatOption() {
		try {
			setTestParameters(co.datamap, "verifyChatOption");
			co.navigationPage.clickOnChatOption();
			co.dashboardPage.verifyChatOption();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test(dataProvider = "ChangeLanguage", dataProviderClass = TestDataImport.class)
	public void changeLanguageFromDashboardFooter(Map<Object, Object> map) {
		try {
			co.datamap.putAll(map);
			setTestParameters(co.datamap, "changeLanguageFromDashboardFooter");
			co.navigationPage.clickOnDashboardChangeLanguage();
			co.changeLanguagePage.changeLanguage(map);
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test(dataProvider = "ChangeLanguage", dataProviderClass = TestDataImport.class)
	public void changeLanguageFromSideMenuProfile(Map<Object, Object> map) {
		try {
			co.datamap.putAll(map);
			setTestParameters(co.datamap, "changeLanguageFromSideMenuProfile");
			co.navigationPage.clickOnSideMenuProfile();
			co.navigationPage.clickOnSideMenuChangeLanguageFromProfile();
			co.changeLanguagePage.changeLanguage(map);
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test
	public void logout() {
		try {
			setTestParameters(co.datamap, "logout");
			if (co.navigationPage.isLogoutButtonDislay(5))
				co.navigationPage.clickOnLogOut();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test
	public void transactionDeatilReportFromDashboard() {
		try {
			setTestParameters(co.datamap,
					"transactionDeatilReportFromDashboard");
			co.navigationPage.clickOnTransactionDetail();
			co.transactionDetailPage.verifyTransactionDetailReport();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test
	public void transactionDeatilReportFromDashboardFooter() {
		try {
			setTestParameters(co.datamap,
					"transactionDeatilReportFromDashboardFooter");
			co.navigationPage.clickOnDashboardTransactionDetail();
			co.transactionDetailPage.verifyTransactionDetailReport();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test
	public void transactionDeatilReportFromSideMenuServices() {
		try {
			setTestParameters(co.datamap,
					"transactionDeatilReportFromSideMenuServices");
			co.navigationPage.clickOnSideMenuServicesTransactionDetail();
			co.transactionDetailPage.verifyTransactionDetailReport();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test
	public void transactionSummaryReportFromDashboard() {
		try {
			setTestParameters(co.datamap,
					"transactionSummaryReportFromDashboard");
			co.navigationPage.clickOnTransactionSummary();
			co.transactionSummaryPage.verifyTransactionSummaryReport();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test
	public void transactionSummaryReportFromDashboardFooter() {
		try {
			setTestParameters(co.datamap,
					"transactionSummaryReportFromDashboardFooter");
			co.navigationPage.clickOnDashboardTransactionSummary();
			co.transactionSummaryPage.verifyTransactionSummaryReport();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test
	public void transactionSummaryReportFromSideMenuServices() {
		try {
			setTestParameters(co.datamap,
					"transactionSummaryReportFromSideMenuServices");
			co.navigationPage.clickOnSideMenuTransactionSummary();
			co.transactionSummaryPage.verifyTransactionSummaryReport();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test
	public void commissionReportFromDashboard() {
		try {
			setTestParameters(co.datamap, "commissionReportFromDashboard");
			co.navigationPage.clickOnCommissionReport();
			co.commissionReportPage.verifyCommissionReport();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test
	public void commissionReportFromDashboardFooter() {
		try {
			setTestParameters(co.datamap, "commissionReportFromDashboardFooter");
			co.navigationPage.clickOnCommissionReportFooter();
			co.commissionReportPage.verifyCommissionReport();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test
	public void commissionReportFromSideMenuServices() {
		try {
			setTestParameters(co.datamap,
					"commissionReportFromSideMenuServices");
			co.navigationPage.clickOnSideMenuServicesCommissionReport();
			co.commissionReportPage.verifyCommissionReport();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test
	public void changeMPinFromDashboardFooter() {
		try {
			setTestParameters(co.datamap, "changeMPinFromDashboardFooter");
			co.navigationPage.clickOnChangeMPin();
			co.commissionReportPage.verifyCommissionReport();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test
	public void changeMPinFromSideMenu() {
		try {
			setTestParameters(co.datamap, "changeMPinFromSideMenu");
			co.navigationPage.clickOnSideMenuSettingsChangeMPIN();
			co.commissionReportPage.verifyCommissionReport();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}

	@Test
	public void forgotMPin() {
		try {
			setTestParameters(co.datamap, "forgotMPin");
			co.navigationPage.clickOnLogOut();
			co.navigationPage.clickOnForgottenMPIN();
			co.forgotMPinPage.forgotMpin();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			co.loginPage.login(userName, password, subUserType);
			setExcecutionData(co);
		}
	}

	@Test
	public void forgotPassword() {
		try {
			setTestParameters(co.datamap, "forgotPassword");
			co.navigationPage.clickOnLogOut();
			co.navigationPage.clickOnForgottenPassword();
			co.forgotPasswordPage.forgotPassword();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			co.loginPage.login(userName, password, subUserType);
			setExcecutionData(co);
		}
	}
	
	@Test
	public void newUser() {
		try {
			setTestParameters(co.datamap, "newUser");
			co.navigationPage.clickOnLogOut();
			co.navigationPage.clickOnNewUser();
			co.newUserPage.newUser();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			co.loginPage.login(userName, password, subUserType);
			setExcecutionData(co);
		}
	}
	@Test
	public void verifyTransactionsInAdmin() {
		try {
			setTestParameters(co.datamap, "verifyTransactionsInAdmin");
			co.common.verifyTransactionInAdmin();
			setSuccessParameters(co.datamap);
		} catch (Exception e) {
			setExceptionData(co, e);
		} finally {
			setExcecutionData(co);
		}
	}
}
