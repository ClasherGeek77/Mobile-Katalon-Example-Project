package register
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@When("I want to fill form")
	def I_fill_register() {
		Mobile.callTestCase(findTestCase('Test Cases/pages/register/register_valid/input_form'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@When("I click create account")
	def I_click_create() {
		Mobile.callTestCase(findTestCase('Test Cases/pages/register/register_valid/click_create_account'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@When("I click register")
	def I_click_register() {
		Mobile.callTestCase(findTestCase('Test Cases/pages/register/register_valid/click_register'), null, FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("I type valid email and pass")
	def I_type_valid_email_pass() {
		Mobile.callTestCase(findTestCase('Test Cases/pages/login/login_valid/set_text_valid_email_and_password'), null, FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("I see home header")
	def I_see_header() {
		Mobile.callTestCase(findTestCase('Test Cases/pages/login/login_valid/assert_succes_login'), null, FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I see success register notif")
	def I_see_success() {
		Mobile.callTestCase(findTestCase('Test Cases/pages/register/register_valid/assert_success_register'), null, FailureHandling.STOP_ON_FAILURE)
	}
}