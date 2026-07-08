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
public class tc1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc1() {
		tg.openDevice();
		tg.swipe(Direction.DOWN);
		tg.wait("ele_mainmenurefreshTextView1783500689851", ComparisonType.IS_VISIBLE);
		tg.click("ele_mainmenurefreshTextView1783500689851", 1);
		tg.wait("ele_mainmenusearchcityTextView1783500732508", ComparisonType.IS_VISIBLE);
		tg.click("ele_mainmenusearchcityTextView1783500732508", 1);
		tg.wait("ele_NavigateupImageButton1783500751203", ComparisonType.IS_VISIBLE);
		tg.click("ele_NavigateupImageButton1783500751203", 1);
		tg.wait(2);
		tg.close();
	}
}