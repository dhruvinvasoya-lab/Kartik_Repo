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
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

class function {

	public static void function() {
				tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
				tg.wait(5);
				tg.wait("ele_firstname196", ComparisonType.IS_VISIBLE);
				tg.click("ele_firstname196", 1);
				tg.wait("ele_firstname196", ComparisonType.IS_VISIBLE);
				tg.type("ele_firstname196", "#TGITVAR.userId");
				tg.wait("ele_lastname374", ComparisonType.IS_VISIBLE);
				tg.click("ele_lastname374", 1);
				tg.wait("ele_lastname374", ComparisonType.IS_VISIBLE);
				tg.type("ele_lastname374", "#TGITVAR.title");
				tg.wait(5);
				tg.wait("ele_radioradio171", ComparisonType.IS_VISIBLE);
				tg.click("ele_radioradio171", 1);
	}
}