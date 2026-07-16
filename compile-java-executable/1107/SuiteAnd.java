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

@Listeners(TestListener.class)
public class SuiteAnd {

    public static int var_GBInt = 100;

    public static String var_GBStr = "GlobalString";

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void utitilitystringcopy() {
        tg.openDevice();
        String var_dt = "Null";
        String var_strone = "Kartik";
        String var_strtwo = "M-a-k,w,ana";
        String var_strthree = "Null";
        int var_one = 10;
        int var_two = 10;
        int var_three = 10;
        // [DISABLED] var_dt = tg.dateUtilities("{DATE[ADDDAYS][25.05.2026,14][dd-MM-yyyy]}");
        // [DISABLED] tg.printLogs(var_dt);
        // [DISABLED] var_strthree = tg.stringUtilities("{STRING[TOUPPER]["+var_strone+"]["+var_strtwo+"]}");
        // [DISABLED] tg.printLogs(var_strthree);
        // [DISABLED] var_strthree = tg.stringUtilities("{STRING[TOLOWER]["+var_strone+"]["+var_strtwo+"]}");
        // [DISABLED] tg.printLogs(var_strthree);
        // [DISABLED] var_strthree = tg.stringUtilities("{STRING[TRIM]["+var_strone+"][]}");
        // [DISABLED] tg.printLogs(var_strthree);
        // [DISABLED] var_strthree = tg.stringUtilities("{STRING[LENGTH]["+var_strone+"][]}");
        // [DISABLED] tg.printLogs(var_strthree);
        // [DISABLED] var_strthree = tg.stringUtilities("{STRING[CHARAT]["+var_strone+"][2]}");
        // [DISABLED] tg.printLogs(var_strthree);
        // [DISABLED] var_strthree = tg.stringUtilities("{STRING[SUBSTRING]["+var_strone+"][2,3]}");
        // [DISABLED] tg.printLogs(var_strthree);
        // [DISABLED] var_strthree = tg.stringUtilities("{STRING[INDEXOF]["+var_strone+"][tik]}");
        // [DISABLED] tg.printLogs(var_strthree);
        // [DISABLED] var_strthree = tg.stringUtilities("{STRING[STARTSWITH]["+var_strone+"][K]}");
        // [DISABLED] tg.printLogs(var_strthree);
        // [DISABLED] var_strthree = tg.stringUtilities("{STRING[ENDSWITH]["+var_strone+"][k]}");
        // [DISABLED] tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[REPLACE][" + var_strone + "][Kartik,Hiii]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[SPLIT][" + var_strtwo + "][-]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[CONCAT][" + var_strtwo + "]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[COMPARE][" + var_strone + ",Kartik][]}");
        tg.printLogs(var_strthree);
        var_strthree = tg.stringUtilities("{STRING[COMPAREIGNORECASE][" + var_strone + "][kartik]}");
        tg.printLogs(var_strthree);
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

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void utilitykeywords() {
        tg.openDevice();
        String var_dt = "Null";
        String var_ans1 = "Null";
        String var_ans2 = "demotext";
        int var_one = 10;
        int var_two = 10;
        int var_three = 10;
        var_dt = tg.dateUtilities("{DATE[ADDDAYS][25.05.2026,14][dd-MM-yyyy]}");
        tg.printLogs(var_dt);
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " + " + var_two + " * 4]}").toString();
        var_ans1 = tg.performCalculations("{MATH[(" + var_one + " + " + var_two + ") * 2]}").toString();
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " / " + var_two + "]}").toString();
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " % " + var_two + "]}").toString();
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " > " + var_two + "]}").toString();
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " == " + var_two + "]}").toString();
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " != " + var_two + "]}").toString();
        var_ans1 = tg.performCalculations("{MATH[1 && 0]}").toString();
        var_ans1 = tg.performCalculations("{MATH[1 || 0]}").toString();
        var_ans1 = tg.performCalculations("{MATH[!" + var_one + "]}").toString();
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " > " + var_two + " && " + var_two + " > " + var_two + "]}").toString();
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " & " + var_two + "]}").toString();
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " | " + var_two + "]}").toString();
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " ^ " + var_two + "]}").toString();
        var_ans1 = tg.performCalculations("{MATH[~" + var_one + "]}").toString();
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " << " + var_two + "]}").toString();
        var_ans1 = tg.performCalculations("{MATH[" + var_one + " >> " + var_two + "]}").toString();
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void utilitystring() {
        tg.openDevice();
        String var_dt = "Null";
        String var_strone = " Kartik ";
        String var_strtwo = "M-a-k,w,ana";
        int var_one = 10;
        int var_two = 10;
        int var_three = 10;
        var_dt = tg.dateUtilities("{DATE[ADDDAYS][25.05.2026,14][dd-MM-yyyy]}");
        tg.printLogs(var_dt);
        var_strone = tg.stringUtilities("{STRING[TOUPPER][" + var_strone + "][" + var_strtwo + "]}");
        tg.printLogs(var_strone);
        var_strone = tg.stringUtilities("{STRING[TOLOWER][" + var_strone + "][" + var_strtwo + "]}");
        tg.printLogs(var_strone);
        var_strone = tg.stringUtilities("{STRING[TRIM][" + var_strone + "][]}");
        tg.printLogs(var_strone);
        var_strone = tg.stringUtilities("{STRING[LENGTH][" + var_strone + "][]}");
        tg.printLogs(var_strone);
        var_strone = tg.stringUtilities("{STRING[CHARAT][" + var_strone + "][2]}");
        tg.printLogs(var_strone);
        // [DISABLED] 		var_strone = tg.stringUtilities("{STRING[SUBSTRING]["+var_strone+"][0,2]}");
        // [DISABLED] 		tg.printLogs(var_strone);
        // [DISABLED] 		var_strone = tg.stringUtilities("{STRING[INDEXOF]["+var_strone+"][tik]}");
        // [DISABLED] 		tg.printLogs(var_strone);
        // [DISABLED] 		var_strone = tg.stringUtilities("{STRING[STARTSWITH]["+var_strone+"][f]}");
        // [DISABLED] 		tg.printLogs(var_strone);
        // [DISABLED] 		var_strone = tg.stringUtilities("{STRING[ENDSWITH]["+var_strone+"][k]}");
        // [DISABLED] 		tg.printLogs(var_strone);
        // [DISABLED] 		var_strone = tg.stringUtilities("{STRING[REPLACE]["+var_strone+"][Hiii]}");
        // [DISABLED] 		tg.printLogs(var_strone);
        // [DISABLED] 		var_strone = tg.stringUtilities("{STRING[SPLIT]["+var_strtwo+"][-]}");
        // [DISABLED] 		tg.printLogs(var_strone);
        // [DISABLED] 		var_strone = tg.stringUtilities("{STRING[CONCAT]["+var_strtwo+"]}");
        // [DISABLED] 		tg.printLogs(var_strone);
        // [DISABLED] 		var_strone = tg.stringUtilities("{STRING[COMPARE]["+var_strone+",Kartik][]}");
        // [DISABLED] 		tg.printLogs(var_strone);
        // [DISABLED] 		var_strone = tg.stringUtilities("{STRING[COMPAREIGNORECASE]["+var_strone+"][kartik]}");
        // [DISABLED] 		tg.printLogs(var_strone);
        tg.close();
    }
}
