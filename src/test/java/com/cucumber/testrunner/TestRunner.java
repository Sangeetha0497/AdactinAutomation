package com.cucumber.testrunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.feature.BaseClassAllMethods;
import com.cucumber.helper.ConfigReader;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//"json:\\src\\test\\resource\\com\\cucumber\\report\\report.json",
		//"junit:\\src\\test\\resource\\com\\cucumber\\report\\report.xml",
		//"html:\\src\\test\\resource\\com\\cucumber\\report\\"
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:\\src\\test\\resource\\com\\cucumber\\reports\\ExtentReport\\extent.html", 
		},
features = "C:\\Users\\kishore\\eclipse-workspace\\AdactIn1\\src\\test\\java\\com\\cucumber\\feature\\Adact.feature", 
glue = "com.cucumber.stepdefinition", dryRun = true, tags = "@TC_101")
public class TestRunner extends BaseClassAllMethods {
	@BeforeClass
	public static void browserLaunch() throws Throwable {
		ConfigReader cr = new ConfigReader();
		driver = getBrowser(cr.getBrowserName());
		
	}

	@AfterClass
	public static void driverQuit() {
		driver.quit();
		Reporter.loadXMLConfig(new File(
				System.getProperty("user.dir")+"\\src\\test\\resource\\com\\cucumber\\prop\\extent-config.xml"));
	}

}
