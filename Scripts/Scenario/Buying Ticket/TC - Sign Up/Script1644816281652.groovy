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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.phptravels.net/')

WebUI.click(findTestObject('Page_PHPTRAVELS - PHPTRAVELS/button_Got It'))

WebUI.click(findTestObject('Object Repository/Page_PHPTRAVELS - PHPTRAVELS/a_Signup'))

WebUI.setText(findTestObject('Object Repository/Page_Signup - PHPTRAVELS/input_First Name_first_name'), FirstName)

WebUI.setText(findTestObject('Object Repository/Page_Signup - PHPTRAVELS/input_Last Name_last_name'), LastName)

WebUI.setText(findTestObject('Object Repository/Page_Signup - PHPTRAVELS/input_Phone_phone'), Contact)

WebUI.setText(findTestObject('Page_Signup - PHPTRAVELS/input_Email_email'), Email)

WebUI.setText(findTestObject('Page_Signup - PHPTRAVELS/input_Password_password'), Password)

WebUI.scrollToElement(findTestObject('Page_Signup - PHPTRAVELS/button_Signup'), 0)

WebUI.click(findTestObject('Page_Signup - PHPTRAVELS/button_Signup'))

if (WebUI.verifyElementVisible(findTestObject('Page_Signup - PHPTRAVELS/label_Phone'), FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_Login - PHPTRAVELS/button_Login'))

    WebUI.callTestCase(findTestCase('Scenario/Buying Ticket/TC - Login'), [('Email') : Email, ('Password') : Password, ('Type') : Type
            , ('From') : From, ('To') : To, ('DateDepart') : DateDepart, ('DateReturn') : DateReturn, ('Classes') : Classes
            , ('Adults') : Adults, ('Childs') : Chillds, ('Infants') : Infants], FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.callTestCase(findTestCase('Scenario/Buying Ticket/TC - Login'), [('Email') : Email, ('Password') : Password, ('Type') : Type
            , ('From') : From, ('To') : To, ('DateDepart') : DateDepart, ('DateReturn') : DateReturn, ('Classes') : Classes
            , ('Adults') : Adults, ('Childs') : Chillds, ('Infants') : Infants], FailureHandling.STOP_ON_FAILURE)
}

