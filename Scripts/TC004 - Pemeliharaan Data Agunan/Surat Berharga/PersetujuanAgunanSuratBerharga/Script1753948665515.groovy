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
import com.kms.katalon.core.testobject.ConditionType

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=jq981528')

WebUI.setText(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc'), 
    'HUBERTUS2')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    'W0cBnat/VTb4vE62HGItvw==')

WebUI.sendKeys(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/span_Favorites'))

WebUI.rightClick(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa'))

WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/span_Create New Favorite'))

WebUI.setText(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd'), 
    'LNMA0035')

WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/span_Run'))

WebUI.setText(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/input_Pencarian_xui.UI.Input-INPUTh'), 
    'HUBERTUS')

WebUI.sendKeys(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/input_Pencarian_xui.UI.Input-INPUTh'), 
    Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/button_Loading'))

WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/span_1'))


//WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/span_DATA DETAIL'))

//DATA DETAIL
WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Panel-TOGGLE:e:']"))
 
WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/span_Setuju'))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:ab:']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:ak:']"))

WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/img_START_xui.UI.Imagec'))

WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/span_Sign Out'))

WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/span_Yes'))

WebUI.closeBrowser()

