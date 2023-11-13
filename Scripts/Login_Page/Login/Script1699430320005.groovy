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
import com.kms.katalon.core.webui.common.WebUiCommonHelper

WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.maximizeWindow()

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Login_Page/textbox_Username'), GlobalVariable.User)

WebUI.verifyTextPresent(GlobalVariable.User, true)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Login_Page/textbox_Password'), GlobalVariable.Password)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Login_Page/button_Login'))

WebUI.verifyElementText(findTestObject('Login_Page/label_Products'), 'Products')

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('Detail_produk/select'), 'za', false)

WebElement element1 = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Detail_produk/button_Product', [('i') : i]))
WebElement element2 = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Detail_produk/button_Produk2', [('j') : j]))

CustomKeywords.'cusKey.KeywordFilter.verifyFilterDescending'(element1, element2)