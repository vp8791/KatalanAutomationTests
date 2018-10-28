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

WebUI.click(findTestObject('Object Repository/Decision Tables/Issueing membership and Discount/Rules/Rule1/Page_Home page/a_Decision Tree on AgeResidenc'))

WebUI.setText(findTestObject('Object Repository/Decision Tables/Issueing membership and Discount/Rules/Rule1/Page_Black Box Enter Residency Deta/input_Name_name'), 
    'Rule1')

WebUI.setText(findTestObject('Object Repository/Decision Tables/Issueing membership and Discount/Rules/Rule1/Page_Black Box Enter Residency Deta/input_Age_age'), 
    '75')

WebUI.click(findTestObject('Object Repository/Decision Tables/Issueing membership and Discount/Rules/Rule1/Page_Black Box Enter Residency Deta/input'))

WebUI.verifyElementPresent(findTestObject('Decision Tables/Issueing membership and Discount/Rules/Rule1/Page_Black Box Output/td_Issue MemberShip'), 
    0)

WebUI.verifyElementPresent(findTestObject('Decision Tables/Issueing membership and Discount/Rules/Rule1/Page_Black Box Output/td_Offer 10 Discount'), 
    0)

WebUI.verifyElementText(findTestObject('Decision Tables/Issueing membership and Discount/Rules/Rule1/Page_Black Box Output/td_false'), 
    'false')

WebUI.verifyElementText(findTestObject('Decision Tables/Issueing membership and Discount/Rules/Rule1/Page_Black Box Output/td_false_1'), 
    'false')

WebUI.closeBrowser()

