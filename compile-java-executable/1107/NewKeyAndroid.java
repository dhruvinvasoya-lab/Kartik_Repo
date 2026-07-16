import io.testgrid.listeners.TestListener;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

@Listeners(TestListener.class)
public class NewKeyAndroid {

    @Test
public void newkey01() {
    tg.openDevice();
    tg.wait(2);
    tg.printPageSource();
    tg.pageLoadStart("LoginPg");
    tg.wait("ele_UsernameorEmailEditText", ComparisonType.IS_VISIBLE);
    tg.click("ele_UsernameorEmailEditText", 1);
    tg.type("ele_UsernameorEmailEditText", "username", true);
    tg.wait("ele_PasswordEditText", ComparisonType.IS_VISIBLE);
    tg.click("ele_PasswordEditText", 1);
    tg.type("ele_PasswordEditText", "••••s", true);
    tg.pageLoadEnd("LoginPg");
    tg.pageLoadStart("GuestPg");
    tg.wait("ele_EnterasGuestButton", ComparisonType.IS_VISIBLE);
    tg.click("ele_EnterasGuestButton", 1);
    tg.wait(3);
    tg.swipe(Direction.UP);
    tg.swipe(Direction.DOWN);
    tg.pageLoadEnd("GuestPg");
    tg.pageLoadStart("Rotation");
    tg.wait(2);
    tg.setOrientation("LANDSCAPE");
    tg.wait(2);
    tg.setOrientation("PORTRAIT");
    tg.wait(2);
    tg.pageLoadEnd("Rotation");
    tg.deactivateApp("com.nestdesign.nestforms");
    tg.wait(2);
    tg.activateApp("com.app.urunner");
    tg.wait(2);
    tg.clearAppData("com.nestdesign.nestforms");
    tg.wait(2);
    tg.activateApp("com.nestdesign.nestforms");
    tg.wait(5);
    tg.close();
}

    @Test
public void newkey02() {
    tg.openDevice();
    tg.wait(2);
    String var_v1 = "";
    var_v1 = tg.saveToVariable(var_v1, "capability", "platformName");
    String var_v2 = "";
    var_v2 = tg.saveToVariable(var_v2, "capability", "newCommandTimeout");
    String var_v3 = "";
    var_v3 = tg.saveToVariable(var_v3, "capability", "udid");
    String var_v4 = "";
    var_v4 = tg.saveToVariable(var_v4, "capability", "platformVersion");
    String var_v5 = "";
    var_v5 = tg.saveToVariable(var_v5, "capability", "automationName");
    String var_v6 = "";
    var_v6 = tg.saveToVariable(var_v6, "deviceinfo", "model");
    String var_v7 = "";
    var_v7 = tg.saveToVariable(var_v7, "deviceinfo", "manufacturer");
    String var_v8 = "";
    var_v8 = tg.saveToVariable(var_v8, "deviceinfo", "android version");
    String var_v9 = "";
    var_v9 = tg.saveToVariable(var_v9, "deviceinfo", "udid");
    String var_v10 = "";
    var_v10 = tg.saveToVariable(var_v10, "deviceinfo", "devicetime");
    String var_v11 = "";
    var_v11 = tg.saveToVariable(var_v11, "regex", "[A-Za-z]{5,10}");
    tg.wait(2);
    tg.customScriptStart();
    System.out.println("platForm : " + var_v1);
    System.out.println("newCommandTimeout : " + var_v2);
    System.out.println("uDID : " + var_v3);
    System.out.println("platFormVersion : " + var_v4);
    System.out.println("automationName : " + var_v5);
    System.out.println("Model : " + var_v6);
    System.out.println("Manufacture : " + var_v7);
    System.out.println("AndroidVersion : " + var_v8);
    System.out.println("uDID : " + var_v9);
    System.out.println("DeviceTime : " + var_v10);
    System.out.println("Regex : " + var_v11);
    tg.customScriptEnd();
    tg.close();
}
}
