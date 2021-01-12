package org.adactin;

import java.io.IOException;

import org.base.BaseClass;
import org.locator.BookHotel;
import org.locator.BookingConfirmation;
import org.locator.Login;
import org.locator.SearchHotel;
import org.locator.SelectHotel;
import org.openqa.selenium.WebElement;

public class AdactinHotel extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {

		getDriver();
		loadUrl("https://adactinhotelapp.com/");

		Login login = new Login();

		WebElement txtUser = login.getTxtUser();
		sendKeys(txtUser,
				excelRead("C:\\Users\\Hannah\\eclipse-workspace\\AdactinHotel\\Excel\\Adactin.xlsx", "Sheet1", 1, 0));
		WebElement txtPass = login.getTxtPass();
		sendKeys(txtPass,
				excelRead("C:\\Users\\Hannah\\eclipse-workspace\\AdactinHotel\\Excel\\Adactin.xlsx", "Sheet1", 1, 1));
		WebElement btnLogin = login.getBtnLogin();
		click(btnLogin);

		SearchHotel search = new SearchHotel();

		WebElement sltLocation = search.getSltLocation();
		selectByVisibleText(sltLocation,
				excelRead("C:\\Users\\Hannah\\eclipse-workspace\\AdactinHotel\\Excel\\Adactin.xlsx", "Sheet1", 1, 2));
		WebElement sltNos = search.getSltNos();
		selectByVisibleText(sltNos,
				excelRead("C:\\Users\\Hannah\\eclipse-workspace\\AdactinHotel\\Excel\\Adactin.xlsx", "Sheet1", 1, 3));
		WebElement checkIn = search.getCheckIn();
		sendKeys(checkIn,
				excelRead("C:\\Users\\Hannah\\eclipse-workspace\\AdactinHotel\\Excel\\Adactin.xlsx", "Sheet1", 1, 4));
		WebElement checkOut = search.getCheckOut();
		sendKeys(checkOut,
				excelRead("C:\\Users\\Hannah\\eclipse-workspace\\AdactinHotel\\Excel\\Adactin.xlsx", "Sheet1", 1, 5));
		WebElement sltAdult = search.getSltAdult();
		selectByVisibleText(sltAdult,
				excelRead("C:\\Users\\Hannah\\eclipse-workspace\\AdactinHotel\\Excel\\Adactin.xlsx", "Sheet1", 1, 6));
		WebElement btnSearch = search.getBtnSearch();
		click(btnSearch);

		SelectHotel select = new SelectHotel();

		WebElement rdoButton = select.getRdoButton();
		click(rdoButton);
		WebElement btnContinue = select.getBtnContinue();
		click(btnContinue);

		BookHotel book = new BookHotel();

		WebElement txtFirstName = book.getTxtFirstName();
		sendKeys(txtFirstName,
				excelRead("C:\\Users\\Hannah\\eclipse-workspace\\AdactinHotel\\Excel\\Adactin.xlsx", "Sheet1", 1, 7));
		WebElement txtLastName = book.getTxtLastName();
		sendKeys(txtLastName,
				excelRead("C:\\Users\\Hannah\\eclipse-workspace\\AdactinHotel\\Excel\\Adactin.xlsx", "Sheet1", 1, 8));
		WebElement txtAdd = book.getTxtAdd();
		sendKeys(txtAdd,
				excelRead("C:\\Users\\Hannah\\eclipse-workspace\\AdactinHotel\\Excel\\Adactin.xlsx", "Sheet1", 1, 9));
		WebElement txtCcNo = book.getTxtCcNo();
		sendKeys(txtCcNo,
				excelRead("C:\\Users\\Hannah\\eclipse-workspace\\AdactinHotel\\Excel\\Adactin.xlsx", "Sheet1", 1, 10));
		WebElement sltCcType = book.getSltCcType();
		selectByValue(sltCcType,
				excelRead("C:\\Users\\Hannah\\eclipse-workspace\\AdactinHotel\\Excel\\Adactin.xlsx", "Sheet1", 1, 11));
		WebElement sltExpMonth = book.getSltExpMonth();
		selectByValue(sltExpMonth,
				excelRead("C:\\Users\\Hannah\\eclipse-workspace\\AdactinHotel\\Excel\\Adactin.xlsx", "Sheet1", 1, 12));
		WebElement sltExpYear = book.getSltExpYear();
		selectByValue(sltExpYear,
				excelRead("C:\\Users\\Hannah\\eclipse-workspace\\AdactinHotel\\Excel\\Adactin.xlsx", "Sheet1", 1, 13));
		WebElement txtCvv = book.getTxtCvv();
		sendKeys(txtCvv,
				excelRead("C:\\Users\\Hannah\\eclipse-workspace\\AdactinHotel\\Excel\\Adactin.xlsx", "Sheet1", 1, 14));
		WebElement btnBook = book.getBtnBook();
		click(btnBook);

		BookingConfirmation confirm = new BookingConfirmation();
		
		Thread.sleep(5000);
		WebElement orderNo = confirm.getOrderNo();
		String att = getAttribute(orderNo, "value");
		System.out.println(att);
		excelWrite("C:\\Users\\Hannah\\eclipse-workspace\\AdactinHotel\\Excel\\Adactin.xlsx", "Sheet1", 1, 15, att);

	}

}
