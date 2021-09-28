package com.mvnpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project_BaseClass {
	public static WebDriver driver; // null
	public static String value;

	public static WebDriver browserConfig(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\driver\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\driver.geckodriver.exe");

			driver = new FirefoxDriver();
		} else if (type.equalsIgnoreCase("interner explorer")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\driver.iedriverserver.exe");

			driver = new InternetExplorerDriver();

		} else if (type.equalsIgnoreCase("edge")) {
			System.setProperty(null, null);

			driver = new EdgeDriver();

		}
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		return driver;

	}

	// get
	public static void launchBrowser(String url) {

		driver.get(url);

	}

	// click
	public static void clickonElement(WebElement element) {
		element.click();

	}

	// sendkeys
	public static void inputValues(WebElement element, String value) {
		element.sendKeys(value);

	}

	// Actions
	public static void mousebasedActions(WebElement element) {

		Actions act = new Actions(driver);

		act.moveToElement(element).build().perform();

	}

	public static void frames(WebElement element) {
		driver.switchTo().frame(element);

	}

	// select
	public static void selectBy(WebElement element, String type, String text) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("value")) {

			s.selectByValue(text);

		} else if (type.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(text);
			s.selectByIndex(parseInt);

		} else if (type.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(text);

		} else {
			System.out.println("Invalid Type");

		}
	}

	public static void waitConcept(WebElement element, String type, int time) {

		if (type.equalsIgnoreCase("implicit")) {
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

		} else if (type.equalsIgnoreCase("explicit")) {
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
	}

	public static void sleep(int time) throws Throwable {
		Thread.sleep(time);

	}

	public static void javascript(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}

	public static void takescreenshot(String path) throws Throwable {

		TakesScreenshot shot = (TakesScreenshot) driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(src, dest);

	}

	public static void defaultcontent() {
		driver.switchTo().defaultContent();

	}

	public static String Read_TestData_from_Excel(String path, int row_index, int cell_index) throws Throwable {

		File f = new File(path);

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis); // Upcasting

		Sheet sheetAt = w.getSheetAt(0);

		Row row = sheetAt.getRow(row_index);

		Cell cell = row.getCell(cell_index);

		CellType cellType = cell.getCellType(); // CellType --> is a function //cellType --> ref name

		if (cellType.equals(CellType.STRING)) {

			value = cell.getStringCellValue();

			
		}

		else if (cellType.equals(CellType.NUMERIC)) {

			double numericValue = cell.getNumericCellValue();

			value = Double.toString(numericValue);

		
		}
		return value;

	}
	

}
