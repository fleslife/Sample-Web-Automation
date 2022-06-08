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

import org.openqa.selenium.Keys as Keys

class StepDefinition {

	String textInput
	String textValue

	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 @Given("I want to write a step with (.*)")
	 def I_want_to_write_a_step_with_name(String name) {
	 println name
	 }
	 @When("I check for the (\\d+) in step")
	 def I_check_for_the_value_in_step(int value) {
	 println value
	 }
	 @Then("I verify the (.*) in step")
	 def I_verify_the_status_in_step(String status) {
	 println status
	 }
	 */

	@Given("I open default page")
	def I_open_default_page() {
		WebUI.openBrowser(GlobalVariable.url)
		WebUI.navigateToUrl(GlobalVariable.url)
		WebUI.maximizeWindow()
		sleep(4)
	}

	@When("I click '(.*)'")
	def I_click(String elme) {
		//WebUI.delay(3)
		//WebUI.waitForElementClickable(findTestObject('Object Repository/'+elme), GlobalVariable.delay_timeout)
		WebUI.click(findTestObject('Object Repository/'+elme))
	}
	
	@When("I submit '(.*)'")
	def I_submit(String elme) {
	WebUI.submit(findTestObject('Object Repository/'+elme))
	}

	@When("I type '(.*)' on '(.*)'")
	def I_type_on(String txt, String elme) {
		if (txt.indexOf("{randomValue}")>=0){
			txt = txt.replace("{randomValue}", this.textInput)
		}

		if (txt.indexOf("{textValue}")>=0){
			txt = txt.replace("{textValue}", this.textValue)
		}
		//WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/'+elme), 10)
		WebUI.setText(findTestObject('Object Repository/'+elme), txt)
	}

	@When("I select option value '(.*)' on '(.*)'")
	def I_select_on(String value, String elme) {
		//WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/'+elme), 10)
		WebUI.selectOptionByValue(findTestObject(elme), value, false)
	}

	@When("I send keys TAB on '(.*)'")
	def I_send_keys_TAB_on(String elme) {
		WebUI.waitForElementVisible(findTestObject('Object Repository/'+elme), 10)
		WebUI.sendKeys(findTestObject('Object Repository/'+elme), Keys.chord(Keys.TAB))
	}

	@When("I send keys ENTER on '(.*)'")
	def I_send_keys_ENTER_on(String elme) {
		WebUI.waitForElementVisible(findTestObject('Object Repository/'+elme), 10)
		WebUI.sendKeys(findTestObject('Object Repository/'+elme), Keys.chord(Keys.ENTER))
	}

	@When("I scroll to element '(.*)'")
	def I_scroll_to_element(String elme){
		WebUI.scrollToElement(findTestObject(elme),10)
	}

	@When("I check '(.*)'")
	def I_check(String elme) {
		//WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/'+elme), 10)
		WebUI.check(findTestObject(elme))
	}

	@When("I upload file '(.*)' on '(.*)'")
	def I_upload_file_on(String file, String elme) {
		//WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/'+elme), 10)
		WebUI.uploadFile(findTestObject('Object Repository/'+elme), file)
	}

	@When("I wait for (.*) seconds")
	def I_wait_for(String secondsStr) {
		int seconds = secondsStr.toInteger()
		WebUI.delay(seconds)
	}

	@Then("I take screenshot")
	def I_take_the_screenshot(){
		WebUI.takeScreenshot()
	}
	
	@When("I should see text '(.*)'")
	def I_should_see_text(String txt) {
		if (txt.indexOf('{randomValue}') > 1){
			txt = txt.replace('{randomValue}', this.textInput)
			WebUI.verifyTextPresent(txt, false)
		}else{
			WebUI.verifyTextPresent(txt, false)
		}
	}

	@Then("I close browser")
	def I_close_browser(){
		WebUI.closeBrowser()
	}
}