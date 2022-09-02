package base;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import portals.operations.Common.CommonOperations;
import portals.operations.Common.DashBoardPageOperations;
import portals.pages.Agent.A2ATransferPage;
import portals.pages.Agent.AgentOnboardingPage;
import portals.pages.Agent.AirtimeSalePage;
import portals.pages.Agent.CashInByAgentPage;
import portals.pages.Agent.CustomerOnboardingPage;
import portals.pages.Agent.ManageAgentPage;
import portals.pages.Agent.UpdateCustomerKYCPage;
import portals.pages.Common.AboutUsPage;
import portals.pages.Common.ChangeLanguagePage;
import portals.pages.Common.CommissionReportPage;
import portals.pages.Common.ContactUsPage;
import portals.pages.Common.DashboardPage;
import portals.pages.Common.FAQsPage;
import portals.pages.Common.ForgotMPinPage;
import portals.pages.Common.ForgotPasswordPage;
import portals.pages.Common.LoginPage;
import portals.pages.Common.MPINPolicyPage;
import portals.pages.Common.NavigationPage;
import portals.pages.Common.NewUserPage;
import portals.pages.Common.PrivacyPolicyPage;
import portals.pages.Common.TermsAndConditionsPage;
import portals.pages.Common.TransactionDetailPage;
import portals.pages.Common.TransactionSummaryPage;
import portals.pages.Customer.ArbelaStorePage;
import portals.pages.Customer.ChangeMpinPage;
import portals.pages.Customer.ChangeSecretWordPage;
import portals.pages.Customer.InviteFriendsPage;
import portals.pages.Customer.MobilePostpaidPage;
import portals.pages.Customer.MobileTopupPage;
import portals.pages.Customer.MyProfilePage;
import portals.pages.Customer.P2POffnetPage;
import portals.pages.Customer.P2PTransferPage;
import portals.pages.Customer.WithdrawCashPage;
import portals.pages.Customer.eVoucherPage;
import utils.elasticUtils.elasticwrite;

public class CreateObject extends SetupInit {
	public elasticwrite log;
	public Map<Object, Object> datamap = new LinkedHashMap<Object, Object>();
	public LoginPage loginPage;
	public NavigationPage navigationPage;
	public DashboardPage dashboardPage;
	public MyProfilePage customerProfilePage;
	//tangerine start //////
	public P2PTransferPage p2pTransferPage;
	public P2POffnetPage p2pOffnetPage;
	public ChangeMpinPage changeMpinPage;
	public ChangeSecretWordPage changesecretwordpage;
	public InviteFriendsPage inviteFriendsPage;
	public DashBoardPageOperations dashBoardPageOperations;
	//tangerine end //////
	public WithdrawCashPage withdrawCashPage;
	public MobileTopupPage mobileTopupPage;
	public MPINPolicyPage mpinPolicyPage;
	public ChangeLanguagePage changeLanguagePage;
	public PrivacyPolicyPage privacyPolicyPage;
	public ContactUsPage contactUsPage;
	public AboutUsPage aboutUsPage;
	public TermsAndConditionsPage termsAndConditionsPage;
	public CommonOperations common;
	public FAQsPage faqsPage;
	public MobilePostpaidPage mobilePostpaidPage;
	public TransactionDetailPage transactionDetailPage;
	public TransactionSummaryPage transactionSummaryPage;
	public CommissionReportPage commissionReportPage;
	public ForgotMPinPage forgotMPinPage;
	public A2ATransferPage a2aTransferPage;
	public CashInByAgentPage cashInByAgentPage;
	public portals.pages.Agent.WithdrawMoneyPage agentWithdrawMoneyPage;
	public UpdateCustomerKYCPage updateCustomerKYCPage;
	public CustomerOnboardingPage customerOnboardingPage;
	public ManageAgentPage manageAgentPage;
	public portals.pages.Agent.MyProfilePage agentProfilePage;
	public AgentOnboardingPage agentOnboardingPage;
	public ForgotPasswordPage forgotPasswordPage;
	public NewUserPage newUserPage;
	public eVoucherPage eVoucherPage;
	public ArbelaStorePage arbelaStorePage;
	public portals.pages.Agent.eVoucherPage eVoucherCustomerPage;
	public AirtimeSalePage airtimeSalePage;

	public CreateObject(WebDriver driver) {
		reloadCurrentPage(driver);
		log = new elasticwrite();
		navigationPage = new NavigationPage(driver, log);
		loginPage = new LoginPage(driver, log);
		if (!loginPage.isUserLoggedIn(3)) {
			String url = getportalURL(env, userType);
			driver.get(url);
			loginPage.login(userName, password, subUserType);
		}
		navigationPage.goToHome(5);
		dashboardPage = new DashboardPage(driver, log);
		customerProfilePage = new MyProfilePage(driver, log);
		// tangerine start ////////
		p2pTransferPage = new P2PTransferPage(driver, log);
		p2pOffnetPage = new P2POffnetPage(driver, log);
		changeMpinPage =  new ChangeMpinPage(driver, log);
		changesecretwordpage = new ChangeSecretWordPage(driver, log);
		inviteFriendsPage = new InviteFriendsPage(driver, log);
		withdrawCashPage = new WithdrawCashPage(driver, log);
		dashBoardPageOperations = new DashBoardPageOperations(driver, log);
		// tangerine end //////////
		
		common = new CommonOperations(driver, log);
		mobileTopupPage = new MobileTopupPage(driver, log);
		mobilePostpaidPage = new MobilePostpaidPage(driver, log);
		mpinPolicyPage = new MPINPolicyPage(driver, log);
		changeLanguagePage = new ChangeLanguagePage(driver, log);
		privacyPolicyPage = new PrivacyPolicyPage(driver, log);
		contactUsPage = new ContactUsPage(driver, log);
		aboutUsPage = new AboutUsPage(driver, log);
		termsAndConditionsPage = new TermsAndConditionsPage(driver, log);
		transactionDetailPage = new TransactionDetailPage(driver, log);
		transactionDetailPage = new TransactionDetailPage(driver, log);
		transactionSummaryPage = new TransactionSummaryPage(driver, log);
		commissionReportPage = new CommissionReportPage(driver, log);
		forgotMPinPage = new ForgotMPinPage(driver, log);
		a2aTransferPage = new A2ATransferPage(driver, log);
		cashInByAgentPage = new CashInByAgentPage(driver, log);
		agentWithdrawMoneyPage = new portals.pages.Agent.WithdrawMoneyPage(driver, log);
		updateCustomerKYCPage = new UpdateCustomerKYCPage(driver, log);
		customerOnboardingPage = new CustomerOnboardingPage(driver, log);
		manageAgentPage = new ManageAgentPage(driver, log);
		agentProfilePage = new portals.pages.Agent.MyProfilePage(driver, log);
		customerProfilePage = new  portals.pages.Customer.MyProfilePage(driver, log);
		agentOnboardingPage = new AgentOnboardingPage(driver, log);
		forgotPasswordPage = new ForgotPasswordPage(driver, log);
		newUserPage = new NewUserPage(driver, log);
		eVoucherPage = new eVoucherPage(driver, log);
		arbelaStorePage = new ArbelaStorePage(driver, log);
		eVoucherCustomerPage = new portals.pages.Agent.eVoucherPage(driver, log);
		airtimeSalePage = new AirtimeSalePage(driver, log);
		
	}
}
