package cusKey

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.WebElement

import internal.GlobalVariable

public class KeywordFilter {

	@Keyword
	def verifyFilterDescending(WebElement namaProduk1, WebElement namaProduk2) {
		for(int i = 1; i<=6;i++) {
			for (int j = 2; j<=6; j++) {
				def namaProdukPertama = WebUI.getText(findTestObject('Object Repository/Detail_produk/button_Product', [('i') : i]))
				def namaProdukKedua = WebUI.getText(findTestObject('Object Repository/Detail_produk/button_Produk2', [('j') : j]))
				println("Nama Produk Pertama: " + namaProdukPertama)
				println("Nama Produk Kedua: " + namaProdukKedua)
			}
		}
	}
}