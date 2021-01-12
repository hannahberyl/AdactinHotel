package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public static void loadUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void sendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static WebElement byId(String data) {
		WebElement findElement = driver.findElement(By.id(data));
		return findElement;
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void selectByValue(WebElement element, String data) {
		new Select(element).selectByValue(data);
	}

	public static void selectByIndex(WebElement element, int index) {
		new Select(element).selectByIndex(index);
	}

	public static void selectByVisibleText(WebElement element, String data) {
		new Select(element).selectByVisibleText(data);
	}

	public static String getText(WebElement element) {
		return element.getText();

	}

	public static String getAttribute(WebElement element, String data) {
		String str = element.getAttribute(data);
		return str;
	}

	public static String excelRead(String path, String SheetName, int rowNo, int cellNo) throws IOException {
		File file = new File(path);
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String value = "";
		int cellType = cell.getCellType();
		if (cellType == 1) {
			value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
			value = format.format(dateCellValue);
		} else {
			double d = cell.getNumericCellValue();
			long l = (long) d;
			value = String.valueOf(l);
		}
		return value;
	}

	public static void excelWrite(String path, String SheetName, int rowNo, int cellNo, String text)
			throws IOException {
		File file = new File(path);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(rowNo);
		Cell createCell = row.createCell(cellNo);
		createCell.setCellValue(text);
		FileOutputStream stream = new FileOutputStream(file);
		workbook.write(stream);

	}

}
