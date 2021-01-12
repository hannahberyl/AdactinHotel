package org.locator;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="radiobutton_4")
	private WebElement rdoButton;
	
	@FindBy(id="continue")
	private WebElement btnContinue;

	public WebElement getRdoButton() {
		return rdoButton;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
}
