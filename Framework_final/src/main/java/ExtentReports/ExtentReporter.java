package ExtentReports;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {
	
	public static ExtentReports generateExtentReport() {
		ExtentReports extentreport=new ExtentReports();
		File extentReportFile=new File(System.getProperty("user.dir")+"\\test\\output\\ExtentsReports\\extentreport.html");
		ExtentSparkReporter sparkreport=new ExtentSparkReporter(extentReportFile);
		sparkreport.config().setTheme(Theme.DARK);
		sparkreport.config().setReportName("Tutorial ninja results Report");
		sparkreport.config().setDocumentTitle("TN Automation Report");
		sparkreport.config().setTimeStampFormat("dd/mm/yyyy hh:mm:ss");
		
		extentreport.attachReporter(sparkreport);
		Properties configprop=new Properties();
		File configpropfile=new File (System.getProperty("user.dir")+"\\src\\main\\java\\tutorial\\ninja\\qa\\config\\Config.properties");
		
		try {
		FileInputStream fisconfigprop=new FileInputStream(configpropfile);
		configprop.load(fisconfigprop);
		}catch (Exception e) {
			e.printStackTrace();
		}
		extentreport.setSystemInfo("Application URL", configprop.getProperty("url"));
		extentreport.setSystemInfo("Browser Name", configprop.getProperty("browser"));
		extentreport.setSystemInfo("Email Name", configprop.getProperty("validEmail"));
		extentreport.setSystemInfo("Email Pass", configprop.getProperty("validPassword"));
		extentreport.setSystemInfo("username", configprop.getProperty("user.name"));
		extentreport.setSystemInfo("java version", configprop.getProperty("java.version"));
		
		return extentreport;
		
	}

}
