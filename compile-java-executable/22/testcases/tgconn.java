import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.*;
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class tgconn {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tgconn() {
		tg.openDevice();
		tg.wait("ele_TabBarItemTitleTextField1786366523410", ComparisonType.IS_VISIBLE);
		tg.click("ele_TabBarItemTitleTextField1786366523410", 1);
		tg.wait("ele_URLTextField1786367204172", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_URLTextField1786367204172", 1);
		tg.type("ele_URLTextField1786367204172", "192.168.88.154:8000/Demo", false);
		tg.wait("ele_GoButton1786367265898", ComparisonType.IS_VISIBLE);
		tg.click("ele_GoButton1786367265898", 1);
		tg.wait(20);
		tg.close();
	}
}