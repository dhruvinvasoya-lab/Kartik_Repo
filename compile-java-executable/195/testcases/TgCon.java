import abc;
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
public class tgcon {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tgcon() {
		tg.openDevice();
				tg.wait(2);
		START_CUSTOM_SCRIPT;
		driver.get("http://192.168.88.154:8000/Demo");
		END_CUSTOM_SCRIPT;
				tg.wait(20);
		tg.close();
	}
}