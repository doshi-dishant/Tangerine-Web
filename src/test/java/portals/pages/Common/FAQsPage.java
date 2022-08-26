package portals.pages.Common;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import base.CreateObject;
import base.SetupInit;
import portals.operations.Common.PrivacyPolicyOperations;
import utils.elasticUtils.elasticwrite;

public class FAQsPage extends SetupInit {
	PrivacyPolicyOperations privacyPolicyOperations;
	elasticwrite log;

	

	public void FAQsPage() {
		privacyPolicyOperations.isNavigateToPrivacyPolicyPage(0);
	}
}
