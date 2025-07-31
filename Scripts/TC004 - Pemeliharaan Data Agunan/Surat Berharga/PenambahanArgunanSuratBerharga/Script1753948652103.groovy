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

WebUI.setText(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc (2)'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (2)'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj (2)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/span_Favorites (2)'))

WebUI.rightClick(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa (2)'))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/span_Create New Favorite (2)'))

WebUI.setText(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd (2)'), 
    'LNMA0034')

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/span_Run (2)'))

WebUI.setText(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/input_Nama Nasabah  No Identitas_xui.UI.Inp_1fc092 (2)'), 
    'HUBERTUS')

WebUI.sendKeys(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/input_Nama Nasabah  No Identitas_xui.UI.Inp_1fc092 (2)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/span_HUBERTUS KENNETH (2)'))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/label_A_xui.UI.Labelae (1)'))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/input_Jenis Agunan_xui.UI.ComboInput-INPUTm (2)'))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/span_SRT - SURAT BERHARGA'))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/div_Detail Agunan (2)'))

WebUI.setText(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/input_Bukti Kepemilikan_xui.UI.Input-INPUTan'), 
    'KEN')

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/input_Bukti Kepemilikan_xui.UI.Input-INPUTan'))

WebUI.setText(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/input_Jenis Surat Berharga_xui.UI.Input-INPUTao'), 
    'test')

WebUI.setText(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/input_Lembaga Pemeringkat_xui.UI.Input-INPUTaq'), 
    'test')

WebUI.setText(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/input_Lembaga Penerbit Surat Berharga_xui.U_fb86fb'), 
    'test')

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/input_Tanggal Terbit_xui.UI.ComboInput-INPUTu'))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.DatePicker-PRE2:d:']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.DatePicker-SET:d:']"))
 
WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/span_Simpan (2)'))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:ab:']"))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Button-CAPTION:ah:']"))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/img_START_xui.UI.Imagec (2)'))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/span_Sign Out (2)'))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/span_Yes (2)'))

WebUI.closeBrowser()

