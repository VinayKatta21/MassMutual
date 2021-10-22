@smoke_pack
Feature: Balance

	Scenario: Verify the values greater than 0
		Given Navigate to the exercise site
		Then Verify the values on screen are greater than zero
	
	Scenario: Verify the values are formatted as currency
		Given Navigate to the exercise site
		Then Verify the values on screen are formatted as currency

	Scenario: Verify the total values are formatted as currency
		Given Navigate to the exercise site
		Then Verify the total Balance value on screen match the sum of the values
	
	