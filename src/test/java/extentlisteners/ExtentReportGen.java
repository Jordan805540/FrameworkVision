package extentlisteners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen {
	
	static ExtentReports extent;
	public static ExtentReports extentReportGenerator()
	{
		
		String path = System.getProperty("user.dir")+"//reports//zerodhareport.html";
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		
		reporter.config().setReportName("ZerodhaTestReport");
		
		reporter.config().setTheme(Theme.DARK);
		
		 extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Browser name", "Chrome");
		
		extent.setSystemInfo("Executed by", "Sept Batch");
		
		extent.setSystemInfo("OS", "Windows 10 pro");
		
		return extent;
		
		
		
	}

}
