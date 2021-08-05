import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

'Open browser and navigate to the specified url'
WebUI.openBrowser('https://demoqa.com/automation-practice-form')

'Resize current window to take up the entire screen\r\n'
WebUI.maximizeWindow()

'Set the value of an input field "First Name"'
WebUI.setText(findTestObject('Practice Form/TextBox_FirstName'), 'Fajar')

'Set the value of an input field "Last Name"'
WebUI.setText(findTestObject('Practice Form/TextBox_LastName'), 'LESmana')

'Set the value of an input field "User eMail"'
WebUI.setText(findTestObject('Practice Form/TextBox_UserEmail'), 'automation.test@mail.com')

'Click on element "Male"'
WebUI.click(findTestObject('Practice Form/RadioButton_Male'))

'Set the value of an input field "Mobile Number"'
WebUI.setText(findTestObject('Practice Form/TextBox_MobileNumber'), '087822997784')

'Click on element "Date of Birth"'
WebUI.click(findTestObject('Practice Form/TextBox_DateOfBirth'))

'Select options that have a value "July"'
WebUI.selectOptionByValue(findTestObject('Practice Form/DatePicker_Month'), '6', false)

'Select options that have a value "1984"'
WebUI.selectOptionByValue(findTestObject('Practice Form/DatePicker_Year'), '1990', false)

'Click on element "28"'
WebUI.click(findTestObject('Practice Form/DatePicker_Day'))

'Set the value of an input field "Subjects"'
WebUI.setText(findTestObject('Practice Form/TextBox_Subjects'), 'Computer')

'Simulate keystroke "Tab"'
WebUI.sendKeys(findTestObject('Practice Form/TextBox_Subjects'), Keys.chord(Keys.TAB))

'Set the value of an input field "Subjects"'
WebUI.setText(findTestObject('Practice Form/TextBox_Subjects'), 'Economics')

'Simulate keystroke "Enter"'
WebUI.sendKeys(findTestObject('Practice Form/TextBox_Subjects'), Keys.chord(Keys.ENTER))

'Scroll into element "CheckBox Music"'
WebUI.scrollToElement(findTestObject('Practice Form/TextBox_MobileNumber'), 30)

'Check a checkBox "Sports"'
WebUI.check(findTestObject('Practice Form/CheckBox_Sports'))

'Check a checkBox "Music"'
WebUI.check(findTestObject('Practice Form/CheckBox_Music'))

'Upload file image'
WebUI.uploadFile(findTestObject('Practice Form/Button_Upload'), 'C:\\Windows\\Web\\Screen\\img100.jpg')

'Set the value of an input field "Current Address"'
WebUI.setText(findTestObject('Practice Form/TextArea_CurrentAddress'), 'Jl. Tidak Rata No.84 Bandung')

'Click on element "DropdownList-State"'
WebUI.click(findTestObject('Practice Form/DropDownList_State'))

'Click on element "State-Option2"'
WebUI.click(findTestObject('Practice Form/DropDownList_State-Option2'), FailureHandling.STOP_ON_FAILURE)

'Click on element "DropdownList-City"'
WebUI.click(findTestObject('Practice Form/DropDownList_City'))

'Click on element "City-Option1"'
WebUI.click(findTestObject('Practice Form/DropDownList_City-Option1'))

'Delay execution for 5 seconds'
WebUI.delay(5)

'Take screenshot of the browser'
WebUI.takeScreenshot()

'Click on element "Button-Submit"'
WebUI.click(findTestObject('Practice Form/Button_Submit'))

'Delay execution for 5 seconds'
WebUI.delay(5)

'Take screenshot of the browser'
WebUI.takeScreenshot()

'Close the browser'
WebUI.closeBrowser()

