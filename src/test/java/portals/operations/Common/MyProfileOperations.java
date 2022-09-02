package portals.operations.Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.SetupInit;
import utils.elasticUtils.elasticwrite;

public class MyProfileOperations extends SetupInit {
	public String VerifyfullnameEnglish = "//*[text()='Full Name in English']//following-sibling::p[text()='%s']";
	public String VerifyGender = "//*[text()='Gender']//following-sibling::p[text()='%s']";
	public String VerifyPhone = "//*[text()='Phone']//following-sibling::p[text()='%s']";
	public String VerifyEmailID = "//*[text()='Email ID']//following-sibling::p[text()='%s']";
	public String VerifyOccupation = "//*[text()='Occupation']//following-sibling::p[text()='%s']";
	public String VerifyOwnershipStatus = "//*[text()='Ownership status']//following-sibling::p[text()='%s']";
	public String VerifyStreetAddress = "//*[text()='Street Address']//following-sibling::p[text()='%s']";
	public String VerifyAreaorVilllageOrDistict = "//*[text()='Area/Village/District']//following-sibling::p[text()='%s']";
	public String VerifyCity = "//*[text()='City']//following-sibling::p[text()='%s']";
	public String VerifyBranchDetail = "//*[text()='Branch details']//following-sibling::p[text()='%s']";
	public String VerifyBankAccountNumber = "//*[text()='Bank Account Number']//following-sibling::p[text()='%s']";
	public String VerifyBankAccountHolderName = "//*[text()='Bank Account holder Name']//following-sibling::p[text()='%s']";
	public String VerifySwiftCode = "//*[text()='Swift Code']//following-sibling::p[text()='%s']";
	public String VerifyEntityName = "//*[text()='Entity Name']//following-sibling::p[text()='%s']";
	public String VerifyNasswalletAccountOpenDate = "//*[text()='Date opened NassWallet account']//following-sibling::p[text()='%s']";
	public String VerifyNationality = "//*[text()='Nationality']//following-sibling::p[text()='%s']";
	public String VerifyProofOfIdentityIraqi = "//*[text()='Proof of Identity (Iraqi National)']//following::p[text()='%s']";
	public String VerifyNationalID = "//*[text()='National ID']//following::p[text()='%s']";
	public String VerifyCivilID = "//*[text()='Civil ID']//following::p[text()='%s']";
	public String VerifyProofOfAddressIraqi = "//*[text()='Proof of Address (Iraqi National)']//following::p[text()='%s']";
	public String VerifyInformationCard = "//*[text()='Information Card']//following::p[text()='%s']";
	public String VerifySupplyCard = "//*[text()='Supply Card']//following::p[text()='%s']";
	public String VerifyProofOfIdentityNonIraqi = "//*[text()='Proof of Identity (Non Iraqi)']//following::p[text()='%s']";
	public String VerifyPassport = "//*[text()='Passport']//following-sibling::p[text()='%s']";
	public String VerifyProofOfAddressNonIraqi = "//*[text()='Proof of Residency (Non Iraqi)']//following-sibling::p[text()='%s']";
	public String VerifyEntryStemp = "//*[text()='Entry Stamp']//following-sibling::p[text()='%s']";
	public String VerifyResidencyCard = "//*[text()='Residency Card']//following-sibling::p[text()='%s']";
	public String verifyHaveBankAccount = "//*[text()='Have Bank Account']//following-sibling::p[text()='%s']";
	public String verifyBusinessRegistationNumber = "//*[text()='Business Registration Number']//following-sibling::p[text()='%s']";
	public String verifyAgentTypeOfBusiness = "//*[text()='Agent Type of Business']//following-sibling::p[text()='%s']";
	public String VerifyEmailPersInfo = "//*[text()='Email ID']//following-sibling::p[text()='%s']";
	public String VerifyLandlineNoPersInfo = "//*[text()='Landline no']//following-sibling::p[text()='%s']";
	public String VerifyAlternateNoPersInfo = "//*[text()='Alternate mobile']//following-sibling::p[text()='%s']";
	public String VerifyCityPersInfo = "//*[text()='City']//following-sibling::p[text()='%s']";
	public String VerifyMobileNoPersInfo = "//*[text()='Mobile number']//following-sibling::p[text()='%s']";
	public String VerifyGivenNamePersInfo = "//*[text()='Given name']//following-sibling::p[text()='%s']";
	public String VerifyPhysicalAddressPersInfo = "//*[text()='Physical address']//following-sibling::p[text()='%s']";
	public String VerifySurnamePersInfo = "//*[text()='Surname']//following-sibling::p[text()='%s']";
	public String VerifyNationalIDPersInfo = "//*[text()='National Id']//following-sibling::p[text()='%s']";
	public String VerifyDocumentIDPersInfo = "//*[text()='Document ID']//following-sibling::p[text()='%s']";
	public String VerifyDOBPersInfo = "//*[text()='Date of birth']//following-sibling::p[text()='%s']";
	public String VerifyPostalAddressPersInfo = "//*[text()='Postal address']//following-sibling::p[text()='%s']";
	public String VerifyNinDocInfo = "//*[text()='Nin']//following-sibling::p[text()='%s']";
	public String VerifyProfileDocInfo = "//*[text()='Profile']//following-sibling::p[text()='%s']";
	By txtEmail = By.id("frm_text_EMAIL_IDid");
	By drpOccupation = By.id("frm_select_OCCUPATIONid");
	By txtStreetAddress = By.id("frm_text_STREET_ADDRESSid");
	By txtAreaOrVillageOrDistrict = By.id("frm_text_AREA/VILLAGE/DISTRICTid");
	By drpCity = By.id("frm_select_CITYid");
	public String drpRequestTypeValue = "//*[normalize-space(text())='%s']";
	By btnEdit = By.xpath("//*[text()='Edit']");
	public By btnNext = By.xpath("//*[text()='Next']");
	public By alert = By.id("alert-dialog-slide-description");
	By btnClose = By.xpath("//*[text()='Close']");
	By btnSubmit = By.name("submit");
	By verifyNaviMyProfile = By.xpath("//*[contains(text(),'My Profile')]");
	By verifyAccPersonalInfo = By.xpath("//*[contains(text(),'Ugandan prepaid account personal info')]");
	By verifyDocumentInfo = By.xpath("//*[contains(text(),'Document info ugandan users')]");
	By btnChangeMPINOption = By.xpath("//*[contains(text(),'Change MPIN')]");
	By viewBalance = By.xpath("//*[contains(text(),'Check') and contains(text(),'Balance')][last()]");
	By btnPersonalInf0 = By.xpath("//*[@class='MuiButtonBase-root MuiIconButton-root MuiExpansionPanelSummary-expandIcon MuiIconButton-edgeEnd'][1]");
	By btnDocumentInf0 = By.xpath("(//*[@class='MuiButtonBase-root MuiIconButton-root MuiExpansionPanelSummary-expandIcon MuiIconButton-edgeEnd'])[last()]");
	elasticwrite log;
	CommonOperations common;

	public MyProfileOperations(WebDriver driver, elasticwrite log) {
		this.log = log;
		this.driver = driver;
		common = new CommonOperations(driver, log);
	}

	public void clickOnPersonal(int... args) {
		try {
			clickOnElement(log, By.xpath("//*[contains(@class,'link') and text()='Personal']"), args);
		} catch (Exception e) {
			throw new RuntimeException(CLICK_ERROR_MESSAGE + "Personal");
		}
		setLogSteps(log, "Click On Personal");
	}

	public void clickOnAddress(int... args) {
		try {
			clickOnElement(log, By.xpath("//*[contains(@class,'link') and text()='Address']"), args);
		} catch (Exception e) {
			throw new RuntimeException(CLICK_ERROR_MESSAGE + "Address");
		}
		setLogSteps(log, "Click On Address");
	}

	public void clickOnBank(int... args) {
		try {
			clickOnElement(log, By.xpath("//*[contains(@class,'link') and text()='Bank']"), args);
		} catch (Exception e) {
			throw new RuntimeException(CLICK_ERROR_MESSAGE + "Bank");
		}
		setLogSteps(log, "Click On Bank");
	}

	public void clickOnGovernment(int... args) {
		try {
			clickOnElement(log, By.xpath("//*[contains(@class,'link') and text()='Government']"), args);
		} catch (Exception e) {
			throw new RuntimeException(CLICK_ERROR_MESSAGE + "Government");
		}
		setLogSteps(log, "Click On Government");
	}

	public void clickOnNationality(int... args) {
		try {
			clickOnElement(log, By.xpath("//*[contains(@class,'link') and text()='Nationality']"), args);
		} catch (Exception e) {
			throw new RuntimeException(CLICK_ERROR_MESSAGE + "Nationality");
		}
		setLogSteps(log, "Click On Nationality");
	}

	public void clickOnBusiness(int... args) {
		try {
			clickOnElement(log, By.xpath("//*[contains(@class,'link') and text()='Business']"), args);
		} catch (Exception e) {
			throw new RuntimeException(CLICK_ERROR_MESSAGE + "Business");
		}
		setLogSteps(log, "Click On Business");
	}

	public void enterEmailID(String emailID, int... args) {
		try {
			sendKeys(log, txtEmail, emailID, args);
		} catch (Exception e) {
			throw new RuntimeException(SEND_ERROR_MESSAGE + "EmailID");
		}
		setLogSteps(log, "Enter Email : " + emailID);
	}

	public void selectOccupation(String occupation, int... args) {
		try {
			selectFromDropDown(log, drpOccupation, By.xpath(String.format(drpRequestTypeValue, occupation)), args);
		} catch (Exception e) {
			throw new RuntimeException(SELECT_ERROR_MESSAGE + "Occupation");
		}
		setLogSteps(log, "Select Occupation :" + occupation);
	}

	public void enterStreetAddress(String address, int... args) {
		try {
			sendKeys(log, txtStreetAddress, address, args);
		} catch (Exception e) {
			throw new RuntimeException(SEND_ERROR_MESSAGE + "StreetAddress");
		}
		setLogSteps(log, "Enter Street Address : " + address);
	}

	public void enterAreaOrVillageOrDistrict(String avd, int... args) {
		try {
			sendKeys(log, txtAreaOrVillageOrDistrict, avd, args);
		} catch (Exception e) {
			throw new RuntimeException(SEND_ERROR_MESSAGE + "area/village/district");
		}
		setLogSteps(log, "Enter Area/Village/District : " + avd);
	}

	public void selectCity(String city, int... args) {
		try {
			selectFromDropDown(log, drpCity, By.xpath(String.format(drpRequestTypeValue, city)), args);
		} catch (Exception e) {
			throw new RuntimeException(SELECT_ERROR_MESSAGE + "City");
		}
		setLogSteps(log, "Select City :" + city);
	}

	public void selectHaveBankAccount(String account, int... args) {
		try {
			clickOnElement(log, By.xpath("//*[text()='" + account + "']"), args);
		} catch (Exception e) {
			throw new RuntimeException(CLICK_ERROR_MESSAGE + "Have Bank Account");
		}
		setLogSteps(log, "Click On Have Bank Account");
	}

	public void clickOnEditButton(int... args) {
		try {
			clickOnElement(btnEdit);
		} catch (Exception e) {
			throw new RuntimeException(CLICK_ERROR_MESSAGE + "Edit Button");
		}
		setLogSteps(log, "Click On Edit Button");
	}

	public void clickOnNextButton(int... args) {
		try {
			clickOnElement(btnNext, args);
		} catch (Exception e) {
			throw new RuntimeException(CLICK_ERROR_MESSAGE + "Next Button");
		}
		setLogSteps(log, "Click On Next button");
	}

	public void clickOnCloseButton(int... args) {
		try {
			clickOnElement(btnClose, args);
		} catch (Exception e) {
			throw new RuntimeException(CLICK_ERROR_MESSAGE + "Close Button");
		}
		setLogSteps(log, "Click On Close Button");
	}

	public void clickOnsubmitButton() {
		try {
			clickOnElement(this.log, btnSubmit, 0);
		} catch (Exception e) {
			throw new RuntimeException(CLICK_ERROR_MESSAGE + "Submit Button");
		}
		setLogSteps(log, "Click On Submit Button");
	}
	
	public void isNavigateToMyProfilePage(int... args) {
		verifyVisible(verifyNaviMyProfile, args);
		setLogSteps(log, "Naviagte To My Profile Page");
		verifyVisible(verifyAccPersonalInfo, args);
		setLogSteps(log, "VerifyContent >> Ugandan prepaid account personal info");
		verifyVisible(verifyDocumentInfo, args);
		setLogSteps(log, "VerifyContent >> Document info ugandan users");
		verifyVisible(btnChangeMPINOption, args);
		setLogSteps(log, "VerifyContent >> Change MPIN Option");
	}

	public void checkBalance(int... args) {
		try {
			clickOnElement(this.log, viewBalance, 0);
		} catch (Exception e) {
			throw new RuntimeException(CLICK_ERROR_MESSAGE + "Check Balance Button");
		}
		setLogSteps(log, "Click On Check Balance");
	}
	
	public void clickOnChangeMPIN(int... args) {
		try {
			clickOnElement(this.log, btnChangeMPINOption, 0);
		} catch (Exception e) {
			throw new RuntimeException(CLICK_ERROR_MESSAGE + "Change MPIN Button");
		}
		setLogSteps(log, "Click On Change MPIN Button");
	}
	
	public void clickOnPersonalInfo(int... args) {
		try {
			clickOnElement(this.log, btnPersonalInf0, 0);
		} catch (Exception e) {
			throw new RuntimeException(CLICK_ERROR_MESSAGE + "PersonalInfo Button");
		}
		setLogSteps(log, "Click On PersonalInfo Button");
	}
	
	public void clickOnDocumentInfo(int... args) {
		try {
			clickOnElement(this.log, btnDocumentInf0, 0);
		} catch (Exception e) {
			throw new RuntimeException(CLICK_ERROR_MESSAGE + "DocumentInfo Button");
		}
		setLogSteps(log, "Click On DocumentInfo Button");
	}
}
