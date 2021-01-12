package org.locator;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass{
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement sltLocation;
	
	@FindBy(id="hotels")
	private WebElement sltHotel;
	
	@FindBy(id="room_type")
	private WebElement sltRoom;
	
	@FindBy(id="room_nos")
	private WebElement sltNos;
	
	@FindBy(id="datepick_in")
	private WebElement checkIn;
	
	@FindBy(id="datepick_out")
	private WebElement checkOut;
	
	@FindBy(id="adult_room")
	private WebElement sltAdult;
	
	@FindBy(id="child_room")
	private WebElement sltChild;
	
	@FindBy(id="Submit")
	private WebElement btnSearch;
	

	public WebElement getSltLocation() {
		return sltLocation;
	}
	public WebElement getSltHotel() {
		return sltHotel;
	}
	public WebElement getSltRoom() {
		return sltRoom;
	}
	public WebElement getSltNos() {
		return sltNos;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getSltAdult() {
		return sltAdult;
	}
	public WebElement getSltChild() {
		return sltChild;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
}
