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

class utilityfunc {

	public static void utilityfunc() {
				tg_String var_dt = "Null";
				tg_String var_strone = "Kartik";
				tg_String var_strtwo = "M-a-k,w,ana";
				tg_String var_strthree = "Null";
				tg_int var_one = 10;
				tg_int var_two = 10;
				tg_int var_three = 10;
				var_dt = tg.dateUtilities("{DATE[ADDDAYS][25.05.2026,14][dd-MM-yyyy]}");
				tg.printLogs(var_dt);
				var_strthree = tg.stringUtilities("{STRING[TOUPPER]["+var_strone+"]["+var_strtwo+"]}");
				tg.printLogs(var_strthree);
				var_strthree = tg.stringUtilities("{STRING[TOLOWER]["+var_strone+"]["+var_strtwo+"]}");
				tg.printLogs(var_strthree);
				var_strthree = tg.stringUtilities("{STRING[TRIM]["+var_strone+"][]}");
				tg.printLogs(var_strthree);
				var_strthree = tg.stringUtilities("{STRING[LENGTH]["+var_strone+"][]}");
				tg.printLogs(var_strthree);
				var_strthree = tg.stringUtilities("{STRING[CHARAT]["+var_strone+"][2]}");
				tg.printLogs(var_strthree);
				var_strthree = tg.stringUtilities("{STRING[SUBSTRING]["+var_strone+"][2,3]}");
				tg.printLogs(var_strthree);
				var_strthree = tg.stringUtilities("{STRING[INDEXOF]["+var_strone+"][tik]}");
				tg.printLogs(var_strthree);
				var_strthree = tg.stringUtilities("{STRING[STARTSWITH]["+var_strone+"][K]}");
				tg.printLogs(var_strthree);
				var_strthree = tg.stringUtilities("{STRING[ENDSWITH]["+var_strone+"][k]}");
				tg.printLogs(var_strthree);
				var_strthree = tg.stringUtilities("{STRING[REPLACE]["+var_strone+"][Kartik,Hiii]}");
				tg.printLogs(var_strthree);
				var_strthree = tg.stringUtilities("{STRING[SPLIT]["+var_strtwo+"][-]}");
				tg.printLogs(var_strthree);
				var_strthree = tg.stringUtilities("{STRING[CONCAT]["+var_strtwo+"]}");
				tg.printLogs(var_strthree);
				var_strthree = tg.stringUtilities("{STRING[COMPARE]["+var_strone+",Kartik][]}");
				tg.printLogs(var_strthree);
				var_strthree = tg.stringUtilities("{STRING[COMPAREIGNORECASE]["+var_strone+"][kartik]}");
				tg.printLogs(var_strthree);
	}
}