import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.maximizeWindow()

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Login_Page/textbox_Password'), GlobalVariable.Password)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Login_Page/button_Login'))

WebUI.verifyElementText(findTestObject('Login_Page/label_UsernameError'), 'Epic sadface: Username is required')

WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Login_Page/textbox_Password'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Login_Page/textbox_Username'), GlobalVariable.User)

WebUI.takeScreenshot()

WebUI.verifyTextPresent(GlobalVariable.User, false)

WebUI.verifyElementPresent(findTestObject('Login_Page/icon_Error'), 0)

WebUI.click(findTestObject('Login_Page/button_Login'))

WebUI.verifyElementText(findTestObject('Login_Page/label_PasswordError'), 'Epic sadface: Password is required')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Login_Page/textbox_Password'), 'sssd')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Login_Page/button_Login'))

WebUI.verifyElementText(findTestObject('Login_Page/label_UserAndPassNotMatch'), 'Epic sadface: Username and password do not match any user in this service')

WebUI.takeScreenshot()

