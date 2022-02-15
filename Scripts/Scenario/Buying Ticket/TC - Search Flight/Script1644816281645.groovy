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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Object Repository/Page_Dashboard - PHPTRAVELS/a_flights'))

switch (Type) {
    case 'Round Trip':
        WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVELS/label_Round Trip'))

        break
    case 'One Way':
        WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVELS/label_One Way'))

        break
}

WebUI.setText(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVELS/input_Flying From_from'), From)

WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVELS/div_SUB Juanda'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVELS/input_To Destination_to'), To)

WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVELS/div_JOG Adi Sutjipto'))

WebUI.setText(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVELS/input_Departure Date_depart'), DateDepart)

if (WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Search Hotels - PHPTRAVELS/label_Return Date'), FailureHandling.OPTIONAL)) {
    WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVELS/input_Return Date_returning'), DateReturn)
}

WebUI.selectOptionByValue(findTestObject('Page_Search Hotels - PHPTRAVELS/select_Economy                Business                First'), 
    Classes, true)

WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVELS/a_1'))

WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVELS/input_Adults_adults'), Adults)

WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVELS/input_Childs_childs'), Childs)

WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVELS/input_Infants_childs'), Infants)

WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVELS/button_Search'))

