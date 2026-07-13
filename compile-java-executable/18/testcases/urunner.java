import java.util.Map;;
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
public class urunner {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void urunner() {
		tg.openDevice();
		tg.swipe(Direction.UP);
		tg.wait("ele_ImageView1783070965732", ComparisonType.IS_VISIBLE);
		tg.click("ele_ImageView1783070965732", 1);
		tg.wait("ele_EnteremailaddressEditText1783070973225", ComparisonType.IS_VISIBLE);
		tg.click("ele_EnteremailaddressEditText1783070973225", 1);
		// [DISABLED] tg.startSecureBlock();
		tg.wait("ele_EnteremailaddressEditText1783070973225", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnteremailaddressEditText1783070973225", "admin@gmail.com", true);
		// [DISABLED] tg.endSecureBlock();
		tg.wait("ele_EnterpasswordEditText1783070986637", ComparisonType.IS_VISIBLE);
		tg.click("ele_EnterpasswordEditText1783070986637", 1);
		// [DISABLED] tg.startSecureBlock();
		tg.wait("ele_EnterpasswordEditText1783070986637", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnterpasswordEditText1783070986637", "admin", true);
		// [DISABLED] tg.endSecureBlock();
		tg.wait("ele_SignInButton1783070999937", ComparisonType.IS_VISIBLE);
		tg.click("ele_SignInButton1783070999937", 1);
		tg.close();
	}
}