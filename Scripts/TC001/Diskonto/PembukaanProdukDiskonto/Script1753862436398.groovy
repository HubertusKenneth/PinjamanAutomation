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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.Keys


WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.1.239:8080/CoreMain/spa/coreplus.html?key=jq981528')

WebUI.setText(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/span_Favorites'))

WebUI.rightClick(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa'))

WebUI.click(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/span_Create New Favorite'))

WebUI.setText(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd'), 
    'LNPM0001')

WebUI.click(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/span_Run'))

WebUI.click(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/label_test_xui.UI.Labelw'))

WebUI.setText(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/input_Kode Produk_xui.UI.Input-INPUTl'), 
    'AE')

WebUI.setText(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/input_Nama Produk_xui.UI.Input-INPUTm'), 
    'KEN TEST')

WebUI.click(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/input_Kelompok Angsuran_xui.UI.ComboInput-INPUTo'))

WebUI.click(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/span_D - DISKONTO'))

WebUI.setText(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/input_Frekuensi Pokok_xui.UI.ComboInput-INPUTq'), 
    '1')

WebUI.setText(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/input_Dapat Diubah_xui.UI.ComboInput-INPUTr'), 
    '1')

WebUI.setText(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/input_Denda Pokok_xui.UI.ComboInput-INPUTu'), 
    '10')

WebUI.setText(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/input_Denda Bunga_xui.UI.ComboInput-INPUTv'), 
    '5')

WebUI.setText(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/input_Minimal Plafond_xui.UI.ComboInput-INPUTy'), 
    '200000')

WebUI.sendKeys(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/input_Minimal Plafond_xui.UI.ComboInput-INPUTy'), 
    Keys.chord(Keys.ENTER))

TestObject SukuBunga = new TestObject("SukuBunga")
SukuBunga.addProperty("xpath", ConditionType.EQUALS, "//span[@id='xui.UI.TreeGrid-CELLA:e:-c_c']")
WebUI.click(SukuBunga)

WebUI.delay(1)

def driver = DriverFactory.getWebDriver()
def activeInput = driver.switchTo().activeElement()

activeInput.clear()
activeInput.sendKeys("10")
activeInput.sendKeys(Keys.TAB)

WebUI.click(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/span_PARAMETER ANGSURAN_xui.UI.TreeGrid-HCELLAa'))

WebUI.click(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/span_Simpan'))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:ab:']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:aj:']"))

WebUI.click(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/img_START_xui.UI.Imagec'))

WebUI.click(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/span_Sign Out'))

WebUI.click(findTestObject('Object Repository/PembukaanProdukPinjaman/Page_ARB Banking System/span_Yes'))

WebUI.closeBrowser()

