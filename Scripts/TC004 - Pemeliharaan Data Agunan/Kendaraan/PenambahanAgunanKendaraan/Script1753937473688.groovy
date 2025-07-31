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

WebUI.setText(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/input_Username_xui.UI.Input-INPUTc'), 
    'HUBERTUS')

WebUI.click(findTestObject('Object Repository/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'))

WebUI.setEncryptedText(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    'ZnRK2WismzjXFIOC0MnUBQ==')

WebUI.sendKeys(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/input_Password_xui.UI.ComboInput-INPUTj'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/span_Favorites'))

WebUI.rightClick(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/div_TEST EOD GL_xui.UI.TreeView-BOXa'))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/span_Create New Favorite'))

WebUI.setText(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/textarea_Add_xui.UI.Input-INPUTd'), 
    'LNMA0034')

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/span_Run'))

WebUI.setText(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/input_Nama Nasabah  No Identitas_xui.UI.Inp_1fc092'), 
    'HUBERTUS')

WebUI.sendKeys(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/input_Nama Nasabah  No Identitas_xui.UI.Inp_1fc092'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/span_HUBERTUS KENNETH'))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/label_Data tidak ditemukan_xui.UI.Labelae'))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/input_Jenis Agunan_xui.UI.ComboInput-INPUTm'))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/span_KND - KENDARAAN'))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/div_Detail Agunan'))


//Bukti Kepemilikan
TestObject inputBuktiKepemilikan = new TestObject('InputKepemilikan')
inputBuktiKepemilikan.addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-INPUT:ap:']")

WebUI.waitForElementVisible(inputBuktiKepemilikan, 10)
WebUI.waitForElementClickable(inputBuktiKepemilikan, 10)

WebUI.setText(inputBuktiKepemilikan, "HUBERTUS")
WebUI.sendKeys(inputBuktiKepemilikan, Keys.chord(Keys.ENTER))


//BPKB
TestObject inputBPKB = new TestObject('numericInput')
inputBPKB.addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-INPUT:ar:']")

WebUI.waitForElementVisible(inputBPKB, 10)
WebUI.waitForElementClickable(inputBPKB, 10)

WebUI.setText(inputBPKB, "9999")
WebUI.sendKeys(inputBPKB, Keys.chord(Keys.ENTER))


//STNK
TestObject inputSTNK= new TestObject('numericInput')
inputSTNK.addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-INPUT:as:']")

WebUI.waitForElementVisible(inputSTNK, 10)
WebUI.waitForElementClickable(inputSTNK, 10)

WebUI.setText(inputSTNK, "9999")
WebUI.sendKeys(inputSTNK, Keys.chord(Keys.ENTER))



//Nomor Rangka
TestObject inputNomorRangka= new TestObject('numericInput')
inputNomorRangka.addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-INPUT:aw:']")

WebUI.waitForElementVisible(inputNomorRangka, 10)
WebUI.waitForElementClickable(inputNomorRangka, 10)

WebUI.setText(inputNomorRangka, "9999")
WebUI.sendKeys(inputNomorRangka, Keys.chord(Keys.ENTER))


//Input nomor mesin
TestObject inputNomorMesin= new TestObject('numericInput')
inputNomorMesin.addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-INPUT:ax:']")

WebUI.waitForElementVisible(inputNomorMesin, 10)
WebUI.waitForElementClickable(inputNomorMesin, 10)

WebUI.setText(inputNomorMesin, "9999")
WebUI.sendKeys(inputNomorMesin, Keys.chord(Keys.ENTER))

//
//WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/input_Jenis Kendaraan_xui.UI.ComboInput-INPUTw'))
//
//WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/span_BMW - ACH1M21B04 AT'))
//
//WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/input_Merk_xui.UI.ComboInput-INPUTx'))
//
//WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/span_BMW - BMW'))

//input Jenis Kendaraan
TestObject JenisKendaraan = new TestObject("JenisKendaraan")
JenisKendaraan.addProperty("id", ConditionType.EQUALS, "xui.UI.ComboInput-INPUT:u:")

WebUI.waitForElementClickable(JenisKendaraan, 10)
WebUI.click(JenisKendaraan)
WebUI.delay(1)

//Input Pilihan Jenis Kendaraan
TestObject optionKendaraan = new TestObject("optionKendaraan")
optionKendaraan.addProperty("xpath", ConditionType.EQUALS, "//div[contains(@class,'xui-list-item')]//span[normalize-space(text())='BMW - ACH1M21B04 AT']")

WebUI.waitForElementClickable(optionKendaraan, 10)
WebUI.click(optionKendaraan)
WebUI.delay(1)

//input Merk Kendaraan
TestObject MerkKendaraan = new TestObject("MerkKendaraan")
MerkKendaraan.addProperty("id", ConditionType.EQUALS, "xui.UI.ComboInput-INPUT:v:")

WebUI.waitForElementClickable(MerkKendaraan, 10)
WebUI.click(MerkKendaraan)
WebUI.delay(1)

//Input Merk
TestObject optionMerk = new TestObject("optionMerk")
optionMerk.addProperty("xpath", ConditionType.EQUALS, "//div[contains(@class,'xui-list-item')]//span[normalize-space(text())='BMW - BMW']")

WebUI.waitForElementClickable(optionMerk, 10)
WebUI.click(optionMerk)
WebUI.delay(1)


//model
TestObject inputModel= new TestObject('numericInput')
inputModel.addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-INPUT:ca:']")

WebUI.waitForElementVisible(inputModel, 10)
WebUI.waitForElementClickable(inputModel, 10)

WebUI.setText(inputModel, "9999")
WebUI.sendKeys(inputModel, Keys.chord(Keys.ENTER))


//Tahun
TestObject inputTahun= new TestObject('numericInput')
inputTahun.addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-INPUT:az:']")

WebUI.waitForElementVisible(inputTahun, 10)
WebUI.waitForElementClickable(inputTahun, 10)

WebUI.setText(inputTahun, "2025")
WebUI.sendKeys(inputTahun, Keys.chord(Keys.ENTER))



//Warna
TestObject inputWarna= new TestObject('inputWarna')
inputWarna.addProperty('xpath', ConditionType.EQUALS, "//*[@id='xui.UI.Input-INPUT:cb:']")

WebUI.waitForElementVisible(inputWarna, 10)
WebUI.waitForElementClickable(inputWarna, 10)

WebUI.setText(inputWarna, "hitam")
WebUI.sendKeys(inputWarna, Keys.chord(Keys.ENTER))

//WebUI.sendKeys(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/input_Warna_xui.UI.Input-INPUTcl'), 
//    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/span_Simpan'))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/span_Ya'))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/span_O K_1'))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/img_START_xui.UI.Imagec'))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/span_Sign Out'))

WebUI.click(findTestObject('Object Repository/PenambahanJenisAgunan/Page_ARB Banking System/span_Yes'))

WebUI.closeBrowser()

