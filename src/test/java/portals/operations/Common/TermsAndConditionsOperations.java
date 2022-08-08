package portals.operations.Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.SetupInit;
import utils.elasticUtils.elasticwrite;

public class TermsAndConditionsOperations extends SetupInit {
	By verifyNaviTermsConditions = By.xpath("//*[contains(@class,'graph_area')]//*[text()='Terms & Conditions']");
	elasticwrite log;

	public TermsAndConditionsOperations(WebDriver driver, elasticwrite log) {
		this.log = log;
		this.driver = driver;
	}

	public void isNavigateToTermsConditionPage(int... args) {
		verifyVisible(verifyNaviTermsConditions, args);
		setLogSteps(log, "Naviagte To Terms & Conditions Page");
	}
}
