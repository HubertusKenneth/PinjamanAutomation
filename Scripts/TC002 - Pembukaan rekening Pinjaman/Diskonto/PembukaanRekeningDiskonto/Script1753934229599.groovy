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

WebUI.setText(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (1)'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (1)'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/span_Favorites (1)'))

WebUI.rightClick(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/span_Create New Favorite (1)'))

WebUI.setText(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd (1)'), 
    'LNMA0001')

WebUI.click(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/span_Run (1)'))

WebUI.setText(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/input_Nama Nasabah_xui.UI.Input-INPUTi (1)'), 
    'HUBERTUS')

WebUI.sendKeys(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/input_Nama Nasabah_xui.UI.Input-INPUTi (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/span_HUBERTUS KENNETH (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/div_Data Rekening (1)'))

WebUI.setText(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/input_Produk_xui.UI.Input-INPUTs (1)'), 
    'DSK')

WebUI.sendKeys(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/input_Produk_xui.UI.Input-INPUTs (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/span_1 (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/input_Metode Bayar Angsuran_xui.UI.ComboInp_a58b10'))

//Petugas Marketing
TestObject MetodeBayarAngsuran = new TestObject("MetodeBayarAngsuran")
MetodeBayarAngsuran.addProperty("id", ConditionType.EQUALS, "xui.UI.ComboInput-INPUT:r:")

WebUI.waitForElementClickable(MetodeBayarAngsuran, 10)
WebUI.click(MetodeBayarAngsuran)
WebUI.delay(1)

TestObject optionDiskonto1 = new TestObject("optionDiskonto1")
optionDiskonto1.addProperty("xpath", ConditionType.EQUALS, "//div[contains(@class,'xui-list-item')]//span[normalize-space(text())='DISKONTO1']")

WebUI.waitForElementClickable(optionDiskonto1, 10)
WebUI.click(optionDiskonto1)
WebUI.delay(1)

//WebUI.setText(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/input_Plafond_xui.UI.ComboInput-INPUTaf (1)'), 
//    '200000')

TestObject inputPlafond = new TestObject('numericInput')
inputPlafond.addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.ComboInput-INPUT:af:']")

WebUI.waitForElementVisible(inputPlafond, 10)
WebUI.waitForElementClickable(inputPlafond, 10)

WebUI.setText(inputPlafond, "200000")
WebUI.sendKeys(inputPlafond, Keys.chord(Keys.ENTER))

WebUI.delay(10)

//WebUI.sendKeys(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/input_Plafond_xui.UI.ComboInput-INPUTaf (1)'), 
//    Keys.chord(Keys.ENTER))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.ButtonViews-ICON:b:c']"))
 
WebUI.click(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/span_O K (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/div_Data Jadwal Angsuran (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/div_Data Biaya (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/div_Data Amortisasi EIR (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/div_Data Lapbul Apolo (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/div_Data SLIK (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/div_Data Non Finansial (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/span_Simpan (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/span_Ya (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/span_O K_1 (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/img_START_xui.UI.Imagec (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/span_Sign Out (1)'))

WebUI.click(findTestObject('Object Repository/PembukaanRekeningPinjaman/Page_ARB Banking System/span_Yes (1)'))

WebUI.closeBrowser()

