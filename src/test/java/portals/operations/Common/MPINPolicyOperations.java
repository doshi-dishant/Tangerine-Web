package portals.operations.Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.SetupInit;
import utils.elasticUtils.elasticwrite;

public class MPINPolicyOperations extends SetupInit {
	By verifyNaviMPINPolicy = By.xpath("//*[contains(@class,'graph_area')]//*[text()='MPIN Policy']");
	elasticwrite log;

	public MPINPolicyOperations(WebDriver driver, elasticwrite log) {
		this.log = log;
		this.driver = driver;
	}

	public void isNavigateToMpinPolicyPage(int... args) {
		verifyVisible(verifyNaviMPINPolicy, args);
		setLogSteps(log, "Naviagte To MPIN Policy Page");
	}
}
