package portals.pages.Agent;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import base.SetupInit;
import portals.operations.Agent.CustomerOnboardingPageOperations;
import portals.operations.Common.CommonOperations;
import portals.operations.Common.DashBoardPageOperations;
import utils.Utility;
import utils.elasticUtils.elasticwrite;

public class CustomerOnboardingPage extends SetupInit {
	CustomerOnboardingPageOperations customerOnboardingPageOperations;
	DashBoardPageOperations dashboardPageCommon;
	CommonOperations common;
	elasticwrite log;

	public CustomerOnboardingPage(WebDriver driver, elasticwrite log) {
		this.log = log;
		this.driver = driver;
		customerOnboardingPageOperations = new CustomerOnboardingPageOperations(this.driver, log);
		dashboardPageCommon = new DashBoardPageOperations(driver, log);
		common = new CommonOperations(this.driver, log);
	}

	public boolean customerOnboarding(Map<Object, Object> map) {
		dashboardPageCommon.selectOnboardUserType(map.get(OnboardUserType).toString(), 0);
		customerOnboardingPageOperations.clickOnsubmitButton();
		String phone = "75" + String.valueOf(Utility.getRandomInt(1111, 9999))
				+ String.valueOf(Utility.getRandomInt(1111, 9999));
		customerOnboardingPageOperations.enterMobileNumber(phone, 0);
		if (!map.get(FullNameInEnglish).toString().isEmpty()) {
			customerOnboardingPageOperations.enterFullNameInEnglish(map.get(FullNameInEnglish).toString(), 0);
		}
		if (!map.get(FullNameInArabic).toString().isEmpty()) {
			customerOnboardingPageOperations.enterFullNameInArabic(map.get(FullNameInArabic).toString(), 0);
		}
		customerOnboardingPageOperations.SelectGender(map.get(Gender).toString(), 0);
		customerOnboardingPageOperations.selectDate(map.get(DateOfBirth).toString(), 0);
		if (!map.get(EmailID).toString().isEmpty()) {
			customerOnboardingPageOperations.enterEmailID(map.get(EmailID).toString(), 0);
		}
		if (!map.get(Occupation).toString().isEmpty()) {
			customerOnboardingPageOperations.selectOccupation(map.get(Occupation).toString(), 0);
		}
		if (!map.get(ProfilePicture).toString().isEmpty()) {
			customerOnboardingPageOperations.enterFileUploadData(map.get(ProfilePicture).toString(), 0);
		}
		customerOnboardingPageOperations.clickOnNextButton(0);
		if (!map.get(StreetAddress).toString().isEmpty()) {
			customerOnboardingPageOperations.enterStreetAddress(map.get(StreetAddress).toString(), 0);
		}
		if (!map.get(City).toString().isEmpty()) {
			customerOnboardingPageOperations.selectCity(map.get(City).toString(), 0);
		}
		customerOnboardingPageOperations.clickOnNextButton(0);
		customerOnboardingPageOperations.uploadPersonalPhotoGraph(map.get(PersonalPhoto).toString(), 0);
		customerOnboardingPageOperations.uploadIdentityProofFromFront(map.get(IdentityProofFromFront).toString(), 0);
		customerOnboardingPageOperations.uploadIdentityProofFromBack(map.get(IdentityProofFromBack).toString(), 0);
		customerOnboardingPageOperations.uploadProofOfAddress(map.get(ProofOfAddress).toString(), 0);
		customerOnboardingPageOperations.clickOnNextButton(0);
		if (!map.get(HaveBankAccount).toString().isEmpty()) {
			customerOnboardingPageOperations.selectHaveBankAccount(map.get(HaveBankAccount).toString(), 0);
		}
		if (!map.get(HaveBankAccount).toString().equalsIgnoreCase("no")) {
			customerOnboardingPageOperations.SelectBusinessAccountName(map.get(SelectBankAccountName).toString(), 0);
			customerOnboardingPageOperations.enterBankAccountNumber(map.get(BankAccountNumber).toString(), 0);
		}
		customerOnboardingPageOperations.clickOnNextButton(0);
		if (!map.get(ProofOfIdentityIraqi).toString().isEmpty()) {
			customerOnboardingPageOperations.selectNationality(map.get(Nationality).toString(), 0);
			if (map.get(Nationality).toString().equalsIgnoreCase(Iraqi)) {
				customerOnboardingPageOperations.SelectProofOfIdentity(map.get(ProofOfIdentityIraqi).toString(), 0);
				customerOnboardingPageOperations.enterNationalID(map.get(IdOfIdentity).toString(), 0);
				customerOnboardingPageOperations.SelectProofOfAddress(map.get(ProofOfAddressIraqi).toString(), 0);
				customerOnboardingPageOperations.enterInformationCard(map.get(AddressCard).toString(), 0);
			}
		}
		customerOnboardingPageOperations.clickOnsubmitButton(0);
		dashboardPageCommon.clickOnConfirmBtn(0);
		if (verifyVisible(dashboardPageCommon.alert, 5)) {
			String message = getElementText(this.log, dashboardPageCommon.alert, 5);
			setLogSteps(this.log, message);
			dashboardPageCommon.clickOnCloseButton(0);
			if (message.contains("Account Identifier already exist")) {
				setLogSteps(this.log, "Account Identifier already exist");
				return true;
			} else {
				return false;
			}
		} else {
			dashboardPageCommon.verifyOnboardSuccessText(0);
			setLogSteps(log, "Verify Onboarded Successfully");
			return true;
		}
	}
}
