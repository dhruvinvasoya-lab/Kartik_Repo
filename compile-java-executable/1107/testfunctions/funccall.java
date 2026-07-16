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

class funccall {

	public static void funccall() {
		tg.activateApp(var_urunapp);
				tg.wait(2);
		tg.deactivateApp(var_urunapp);
				tg.wait(2);
		tg.activateApp(var_nestapp);
				tg.wait(2);
		tg.deactivateApp(var_nestapp);
				tg.wait(2);
		tg.clearAppData(var_nestapp);
		tg.clearAppData(var_urunapp);
				tg.wait(2);
				tg_String var_localurunapp = "com.app.urunner";
		tg.activateApp(var_localurunapp);
				tg.wait(2);
		tg.deactivateApp(var_localurunapp);
				tg.wait(2);
		tg.clearAppData(var_localurunapp);
	}
}