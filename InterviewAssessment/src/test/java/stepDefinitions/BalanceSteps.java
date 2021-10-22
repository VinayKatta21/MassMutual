package stepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.mm.pages.BalancePage;
import com.mm.utils.Utils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BalanceSteps extends hooks {
	
	BalancePage balancePage = new BalancePage(hooks.driver);
	
	@Given("^Navigate to the exercise site$")
	public void navigate_to_the_exercise_site() throws Throwable {
		driver.get(cfgRdr.getURL());
	}

	@Then("^Verify the values on screen are greater than zero$")
	public void verify_the_values_on_screen_are_greater_than_zero(){
		assertTrue(balancePage.getValuesGreaterThan0(balancePage.txtFld_val_1));
		assertTrue(balancePage.getValuesGreaterThan0(balancePage.txtFld_val_2));
		assertTrue(balancePage.getValuesGreaterThan0(balancePage.txtFld_val_3));
		assertTrue(balancePage.getValuesGreaterThan0(balancePage.txtFld_val_4));
		assertTrue(balancePage.getValuesGreaterThan0(balancePage.txtFld_val_5));
	}
	
	@Then("^Verify the values on screen are formatted as currency$")
	public void verify_the_values_on_are_formatted_as_currency(){
		assertTrue(Utils.findCurrencySymbol(balancePage.getText(balancePage.txtFld_val_1)));
		assertTrue(Utils.findCurrencySymbol(balancePage.getText(balancePage.txtFld_val_2)));
		assertTrue(Utils.findCurrencySymbol(balancePage.getText(balancePage.txtFld_val_3)));
		assertTrue(Utils.findCurrencySymbol(balancePage.getText(balancePage.txtFld_val_4)));
		assertTrue(Utils.findCurrencySymbol(balancePage.getText(balancePage.txtFld_val_5)));
	}
	
	@Then("^Verify the total Balance value on screen match the sum of the values$")
	public void verify_the_total_Balance_value_on_match_sum_of_values(){
		double val1 = balancePage.getCurrencyValue(balancePage.txtFld_val_1);
		double val2 = balancePage.getCurrencyValue(balancePage.txtFld_val_2);
		double val3 = balancePage.getCurrencyValue(balancePage.txtFld_val_3);
		double val4 = balancePage.getCurrencyValue(balancePage.txtFld_val_4);
		double val5 = balancePage.getCurrencyValue(balancePage.txtFld_val_5);
		double totalBalance = balancePage.getCurrencyValue(balancePage.txtFld_tot_balance);
		assertEquals(totalBalance, val1+val2+val3+val4+val5);
	}

}
