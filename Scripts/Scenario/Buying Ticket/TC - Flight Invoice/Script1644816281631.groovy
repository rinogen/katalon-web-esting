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
import org.openqa.selenium.Point as Point

WebUI.callTestCase(findTestCase('Scenario/Buying Ticket/TC - Flight Booking'), [('Nationality') : Nationality, ('Title') : Title
        , ('FirstName1') : FirstName1, ('LastName1') : LastName1, ('MonthOfBirth') : MonthOfBirth, ('DayOfBirth') : DayOfBirth
        , ('YearOfBirth') : YearOfBirth, ('Passport') : Passport, ('MonthOfIssuance') : MonthOfIssuance, ('DayOfIssuance') : DayOfIssuance
        , ('YearOfIssuance') : YearOfIssuance, ('MonthOfExpired') : MonthOfExpired, ('DayOfExpired') : DayOfExpired, ('YearOfExpired') : YearOfExpired
        , ('Payment') : Payment, ('FirstName') : FirstName, ('LastName') : LastName, ('Contact') : Contact, ('Email') : Email
        , ('Password') : Password, ('Type') : Type, ('From') : From, ('To') : To, ('DateDepart') : DateDepart, ('DateReturn') : DateReturn
        , ('Classes') : Classes, ('Adults') : Adults, ('Childs') : Childs, ('Infants') : Infants], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_Flight Invoice - PHPTRAVELS/button_Download Invoice'), 0)

WebUI.click(findTestObject('Page_Flight Invoice - PHPTRAVELS/button_Download Invoice'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_Flight Invoice - PHPTRAVELS/button_Account'))

WebUI.click(findTestObject('Page_Flight Invoice - PHPTRAVELS/a_Logout'))

