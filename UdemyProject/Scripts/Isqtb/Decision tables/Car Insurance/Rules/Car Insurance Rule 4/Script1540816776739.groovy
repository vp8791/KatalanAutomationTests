import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.56.102:8080/spring-mvc-forms')

WebUI.click(findTestObject('Object Repository/Decision Tables/Car Insurance Repository/Rule 4/Page_Home page/a_Decision Tree on Insurances'))

WebUI.setText(findTestObject('Object Repository/Decision Tables/Car Insurance Repository/Rule 4/Page_Car Rentals/input_Name_name'), 
    'hgf')

WebUI.click(findTestObject('Object Repository/Decision Tables/Car Insurance Repository/Rule 4/Page_Car Rentals/input_Skieng_skiing'))

WebUI.click(findTestObject('Object Repository/Decision Tables/Car Insurance Repository/Rule 4/Page_Car Rentals/input'))

WebUI.click(findTestObject('Object Repository/Decision Tables/Car Insurance Repository/Rule 4/Page_Black Box Output/td_Insure Person'))

WebUI.click(findTestObject('Object Repository/Decision Tables/Car Insurance Repository/Rule 4/Page_Black Box Output/td_true'))

WebUI.click(findTestObject('Object Repository/Decision Tables/Car Insurance Repository/Rule 4/Page_Black Box Output/td_Offer Discount'))

WebUI.click(findTestObject('Object Repository/Decision Tables/Car Insurance Repository/Rule 4/Page_Black Box Output/td_10'))

WebUI.verifyElementText(findTestObject('Decision Tables/Car Insurance Repository/Rule 4/Page_Black Box Output/td_10'), '10%')

WebUI.verifyElementText(findTestObject('Decision Tables/Car Insurance Repository/Rule 4/Page_Black Box Output/td_true'), 
    'true')

WebUI.closeBrowser()

