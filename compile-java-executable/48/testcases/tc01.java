import java.util.Map;
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
public class tc01 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc01() {
		tg.openDevice();
				tg.wait(5);
				tg.click("ele_OKButton1783707870668", 1);
				tg.wait("ele_mainmenusearchcityTextView1783707181807", ComparisonType.IS_VISIBLE);
				tg.click("ele_mainmenusearchcityTextView1783707181807", 1);
				tg.wait("ele_LondonTextView1783707187483", ComparisonType.IS_VISIBLE);
				tg.click("ele_LondonTextView1783707187483", 1);
				tg.wait("ele_OpennavigationdrawerImageButton1783707195801", ComparisonType.IS_VISIBLE);
				tg.click("ele_OpennavigationdrawerImageButton1783707195801", 1);
				tg.wait(5);
		tg.deactivateApp("org.asdtm.goodweather");
				tg.wait(5);
		tg.activateApp("com.google.android.youtube");
		// [DISABLED] 		tg.wait("ele_SearchYouTubeViewGroup1783775496015", ComparisonType.IS_VISIBLE);
		// [DISABLED] 		tg.click("ele_SearchYouTubeViewGroup1783775496015", 1);
		// [DISABLED] 		tg.type("ele_SearchYouTubeEditText1783775539967", "music", false);
		// [DISABLED] 		tg.wait("ele_musicTextView1783775562237", ComparisonType.IS_VISIBLE);
		// [DISABLED] 		tg.click("ele_musicTextView1783775562237", 1);
				tg.click("ele_ImageView1783775913883", 1);
				tg.click("ele_ImageView1783953868068", 1);
				tg.wait(20);
		START_CUSTOM_SCRIPT;
		driver.executeScript("mobile: terminateApp", Map.of(
		    "appId", "com.google.android.youtube"
		));
		END_CUSTOM_SCRIPT;
		tg.activateApp("com.android.chrome");
				if(tg.performAssert("ele_NothanksButton1783775984745", ComparisonType.IS_VISIBLE)){
				tg.click("ele_NothanksButton1783775984745", 1);
				}
				tg.wait("ele_SearchortypeURLEditText1783776041754", ComparisonType.IS_VISIBLE);
				tg.click("ele_SearchortypeURLEditText1783776041754", 1);
				tg.type("ele_SearchortypeURLEditText1783776064072", "https://fast.com/", false);
				tg.wait("ele_httpsfastcomTextView1783781601292", ComparisonType.IS_VISIBLE);
				tg.click("ele_httpsfastcomTextView1783781601292", 1);
				tg.wait(7);
		// [DISABLED] 		tg.wait("ele_ContinueonthewebTextView1783776140359", ComparisonType.IS_VISIBLE);
		// [DISABLED] 		tg.click("ele_ContinueonthewebTextView1783776140359", 1);
		// [DISABLED] 		tg.wait("ele_WebViewFrameLayout1783776146470", ComparisonType.IS_VISIBLE);
		// [DISABLED] 		tg.click("ele_WebViewFrameLayout1783776146470", 1);
		// [DISABLED] 		if(tg.performAssert("ele_AllowwhilevisitingthesiteButton1783776176000", ComparisonType.IS_VISIBLE)){
		// [DISABLED] 		tg.click("ele_AllowwhilevisitingthesiteButton1783776176000", 1);
		// [DISABLED] 		}
				tg.wait(10);
		tg.deactivateApp("com.android.chrome");
		tg.close();
	}
}