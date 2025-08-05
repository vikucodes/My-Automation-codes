package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.BaseClass;

public class ExtentReportManager implements ITestListener {
    public ExtentSparkReporter sparkReporter; // UI of The Report
    public ExtentReports extent;  // Populate common info on the report
    public ExtentTest test;    // Create test case entry into the report and update status on the test report
    
    String repName;

    public void onStart(ITestContext testContext) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy.mm.dd.HH.mm.ss");
        Date dt = new Date();
        String currentdatetimestamp = df.format(dt);
        
        // Generate the timestamped file name for the report
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        repName = "Test-Report" + timeStamp + ".html"; // Initial name
        
        // Sanitize the file name by replacing invalid characters
        repName = repName.replaceAll("[<>:\"/\\|?*]", "_"); // Replace invalid characters with underscores

        // Initialize the ExtentSparkReporter with the sanitized file path
        sparkReporter = new ExtentSparkReporter(".\\reports\\" + repName); // Specific location of the report
        sparkReporter.config().setDocumentTitle("Opencart Automation Report"); // Title of the Report
        sparkReporter.config().setReportName("OpenCart Functional Testing");  // Name of the Report
        sparkReporter.config().setTheme(Theme.DARK);
        
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("Application", "opencart");
        extent.setSystemInfo("Module", "Admin");
        extent.setSystemInfo("sub Module", "customers");
        extent.setSystemInfo("user name", System.getProperty("user.name"));
        extent.setSystemInfo("Environment", "QA");
        
        String os = testContext.getCurrentXmlTest().getParameter("os");
        extent.setSystemInfo("operating", os);
        
        String browser = testContext.getCurrentXmlTest().getParameter("browser");
        extent.setSystemInfo("Browser", browser);
        
        List<String> includedGroups = testContext.getCurrentXmlTest().getIncludedGroups();
        if (!includedGroups.isEmpty()) {
            extent.setSystemInfo("Groups", includedGroups.toString());
        }
    }

    public void onTestSuccess(ITestResult result) {
        test = extent.createTest(result.getClass().getName());
        test.assignCategory(result.getMethod().getGroups()); // To display groups in report
        test.log(Status.PASS, result.getName() + " got successfully executed");
    }

    public void onTestFailure(ITestResult result) {
        test = extent.createTest(result.getClass().getName());
        test.assignCategory(result.getMethod().getGroups()); // To display groups in report
        test.log(Status.FAIL, result.getName() + " got failed ");
        test.log(Status.INFO, result.getThrowable().getMessage());
        
        try {
            String imgpath = new BaseClass().captureScreen(result.getName());
            test.addScreenCaptureFromPath(imgpath);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult result) {
        test = extent.createTest(result.getClass().getName());
        test.assignCategory(result.getMethod().getGroups()); // To display groups in report
        test.log(Status.SKIP, result.getName() + " got skipped ");
        test.log(Status.INFO, result.getThrowable().getMessage());
    }

    public void onFinish(ITestContext testContext) {
        extent.flush();
        
        // Ensure the path for the report file is correct
        String pathOfExtentReport = System.getProperty("user.dir") + "\\reports\\" + repName;
        File extentReport = new File(pathOfExtentReport);

        try {
            Desktop.getDesktop().browse(extentReport.toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
