package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		File file = new File("Desktop//datadriven.xls");
		FileInputStream input = new FileInputStream(file);
		Workbook workbook = new HSSFWorkbook(input);
		Sheet sheetAt = workbook.getSheet("Sheet1");
		int lastRowNum = sheetAt.getLastRowNum();
		short lastCellNum = sheetAt.getRow(1).getLastCellNum();

		for (int r = 0; r < lastRowNum; r++) {
			HSSFRow row = (HSSFRow) sheetAt.getRow(r);
			for (int c = 0; c < lastCellNum; c++) {
				HSSFCell cell = row.getCell(c);
				CellType cellType = cell.getCellType();
				switch (cellType) {
				case STRING:
					String stringCellValue = cell.getStringCellValue();
					WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
					email.sendKeys(stringCellValue);
					break;

				case NUMERIC:
					double numericCellValue = cell.getNumericCellValue();
					WebElement email1 = driver.findElement(By.xpath("//input[@id='email']"));

					break;
				default:
					break;
				}

			}

		}

		Thread.sleep(3000);
		driver.close();
	}

}
