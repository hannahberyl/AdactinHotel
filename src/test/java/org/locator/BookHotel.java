package org.locator;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass {
	
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtAdd;
	
	@FindBy(id="cc_num")
	private WebElement txtCcNo;
	
	@FindBy(id="cc_type")
	private WebElement sltCcType;
	
	@FindBy(id="cc_exp_month")
	private WebElement sltExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement sltExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCvv;
	
	@FindBy(id="book_now")
	private WebElement btnBook;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAdd() {
		return txtAdd;
	}

	public WebElement getTxtCcNo() {
		return txtCcNo;
	}

	public WebElement getSltCcType() {
		return sltCcType;
	}

	public WebElement getSltExpMonth() {
		return sltExpMonth;
	}

	public WebElement getSltExpYear() {
		return sltExpYear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}
}
