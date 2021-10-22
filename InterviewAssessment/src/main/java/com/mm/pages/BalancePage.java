package com.mm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.mm.utils.Utils;

public class BalancePage extends BasePage {
	
	public BalancePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//label[text()='Value 1']")
	public WebElement lbl_val_1;
		
	@FindBy(xpath="//label[text()='Value 2']")
	public WebElement lbl_val_2;
	
	@FindBy(xpath="//label[text()='Value 3']")
	public WebElement lbl_val_3;
	
	@FindBy(xpath="//label[text()='Value 4']")
	public WebElement lbl_val_4;
	
	@FindBy(xpath="//label[text()='Value 5']")
	public WebElement lbl_val_5;
	
	@FindBy(xpath="//label[text()='Total Balance']")
	public WebElement lbl_tot_balance;
	
	// assuming txtFld value is in the input tag under following sibling div
	@FindBy(xpath="//label[text()='Value 1']/following-sibling::div/input")
	public WebElement txtFld_val_1;
	
	@FindBy(xpath="//label[text()='Value 2']/following-sibling::div/input")
	public WebElement txtFld_val_2;
	
	@FindBy(xpath="//label[text()='Value 3']/following-sibling::div/input")
	public WebElement txtFld_val_3;
	
	@FindBy(xpath="//label[text()='Value 4']/following-sibling::div/input")
	public WebElement txtFld_val_4;
	
	@FindBy(xpath="//label[text()='Value 5']/following-sibling::div/input")
	public WebElement txtFld_val_5;
	
	@FindBy(xpath="//label[text()='Total Balance']/following-sibling::div/input")
	public WebElement txtFld_tot_balance;
	
	public boolean getValuesGreaterThan0(WebElement ele) {
		boolean greaterFlag=false;
		String strCurrValue = Utils.removeFirstChar(getText(ele));
		int currValue= Integer.parseInt(strCurrValue);
		if(currValue>0)
			greaterFlag=true;
		return greaterFlag;
	}
	
	public double getCurrencyValue(WebElement ele) {
		return Double.parseDouble(ele.getText());
	}

}
