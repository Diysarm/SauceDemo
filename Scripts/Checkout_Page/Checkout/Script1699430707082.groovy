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

WebUI.verifyElementVisible(findTestObject('Check Out/button_ShoppingCart'))

WebUI.click(findTestObject('Check Out/button_ShoppingCart'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Check Out/button_CheckOut'))

WebUI.click(findTestObject('Check Out/button_CheckOut'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Check Out/textbox_FirstName'))

WebUI.setText(findTestObject('Check Out/textbox_FirstName'), 'Edy')

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Check Out/textbox_LastName'))

WebUI.setText(findTestObject('Check Out/textbox_LastName'), 'Nur')

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Check Out/textbox_Zip'))

WebUI.setText(findTestObject('Check Out/textbox_Zip'), '12345')

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Check Out/button_Continue'))

WebUI.click(findTestObject('Check Out/button_Continue'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Check Out/button_Finish'))

WebUI.click(findTestObject('Check Out/button_Finish'))

WebUI.takeScreenshot()

