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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=jq981528')

WebUI.setText(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (2)'), 
    'HUBERTUS')

WebUI.setEncryptedText(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (2)'), 
    'J7R4ejOak4Y=')

WebUI.sendKeys(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (2)'), 
    Keys.chord(Keys.ENTER))

WebUI.newTab('')

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=jq981528')

WebUI.newTab('')

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=jq981528')

WebUI.newTab('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=jq981528')

WebUI.newTab('')

WebUI.switchToWindowTitle('')

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=jq981528')

WebUI.switchToWindowTitle('ARB+ Banking System')

WebUI.setText(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (2)'), 
    'HUBERTUS2')

WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (2)'))

WebUI.setEncryptedText(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (2)'), 
    'W0cBnat/VTbmTte9JDIifQ==')

WebUI.sendKeys(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (2)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/span_O K (2)'))

WebUI.setEncryptedText(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (2)'), 
    'W0cBnat/VTb4vE62HGItvw==')

WebUI.sendKeys(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (2)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/span_Favorites (2)'))

WebUI.rightClick(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa (2)'))

WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/span_Create New Favorite (2)'))

WebUI.setText(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd (2)'), 
    'LNMA0035')

WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/span_Run (2)'))

WebUI.setText(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/input_Pencarian_xui.UI.Input-INPUTh (2)'), 
    'HUBERTUS')

WebUI.sendKeys(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/input_Pencarian_xui.UI.Input-INPUTh (2)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/button_Loading (2)'))

WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/span_1 (2)'))

WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/span_1_1 (1)'))

WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/span_Tolak (1)'))

WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/span_Ya (1)'))

WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/span_O K_1'))

WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/img_START_xui.UI.Imagec (2)'))

WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/span_Sign Out (2)'))

WebUI.click(findTestObject('Object Repository/PersetujuanPembukaanAgunan/Page_ARB Banking System/span_Yes (2)'))

WebUI.closeBrowser()

