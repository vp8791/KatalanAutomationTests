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

WebUI.click(findTestObject('Object Repository/Decision Tables/Car Rental Repository/Rule 1/Page_Home page/a_Decision Tree on Car Rentals'))

WebUI.setText(findTestObject('Object Repository/Decision Tables/Car Rental Repository/Rule 1/Page_Car Rentals/input_Name_name'), 
    'ttt')

WebUI.setText(findTestObject('Object Repository/Decision Tables/Car Rental Repository/Rule 1/Page_Car Rentals/input_Age_age'), 
    '15')

WebUI.click(findTestObject('Object Repository/Decision Tables/Car Rental Repository/Rule 1/Page_Car Rentals/input_Clean Driving Record_cle'))

WebUI.click(findTestObject('Object Repository/Decision Tables/Car Rental Repository/Rule 1/Page_Car Rentals/input_On Businesss_onbusiness'))

WebUI.click(findTestObject('Object Repository/Decision Tables/Car Rental Repository/Rule 1/Page_Car Rentals/input'))

WebUI.click(findTestObject('Object Repository/Decision Tables/Car Rental Repository/Rule 1/Page_Black Box Output/td_ttt'))

WebUI.click(findTestObject('Object Repository/Decision Tables/Car Rental Repository/Rule 1/Page_Black Box Output/td_15'))

WebUI.click(findTestObject('Object Repository/Decision Tables/Car Rental Repository/Rule 1/Page_Black Box Output/td_true'))

WebUI.click(findTestObject('Object Repository/Decision Tables/Car Rental Repository/Rule 1/Page_Black Box Output/td_true'))

WebUI.click(findTestObject('Object Repository/Decision Tables/Car Rental Repository/Rule 1/Page_Black Box Output/table_Name tttAge 15Clean Driv'))

WebUI.click(findTestObject('Object Repository/Decision Tables/Car Rental Repository/Rule 1/Page_Black Box Output/td_false'))

WebUI.click(findTestObject('Object Repository/Decision Tables/Car Rental Repository/Rule 1/Page_Black Box Output/td_false_1'))

WebUI.verifyElementText(findTestObject('Decision Tables/Car Rental Repository/Rule 1/Page_Black Box Output/td_false'), 'false')

WebUI.verifyElementText(findTestObject('Decision Tables/Car Rental Repository/Rule 1/Page_Black Box Output/td_false_1'), 
    'false')

WebUI.closeBrowser()

