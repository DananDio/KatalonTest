import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://staging.gramedia.com/')

WebUI.waitForElementClickable(findTestObject('Landing Page/Button_BagIcon'), 4)

WebUiBuiltInKeywords.click(findTestObject('Landing Page/Button_BagIcon'))

WebUI.waitForElementClickable(findTestObject('gramedia.LoginPage/input_emailLoginPage'), 2)

WebUI.click(findTestObject('gramedia.LoginPage/input_emailLoginPage'))

WebUI.setText(findTestObject('gramedia.LoginPage/input_emailLoginPage'), 'budibudi@gmail.com')

WebUI.click(findTestObject('gramedia.LoginPage/input_PasswordLoginPage'))

WebUiBuiltInKeywords.setText(findTestObject('gramedia.LoginPage/input_PasswordLoginPage'), 'budibudi')

WebUiBuiltInKeywords.click(findTestObject('gramedia.LoginPage/button_submitLoginPage'))

WebUI.waitForPageLoad(10)

WebUiBuiltInKeywords.click(findTestObject('Page_Toko Buku Online Terbesar  Gra/Landing Page/Button_BagIcon'))

