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

WebUI.callTestCase(findTestCase('Scenario/Buying Ticket/TC - Sign Up'), [('FirstName') : FirstName, ('LastName') : LastName
        , ('Contact') : Contact, ('Email') : Email, ('Password') : Password, ('Type') : Type, ('From') : From, ('To') : To
        , ('DateDepart') : DateDepart, ('DateReturn') : DateReturn, ('Classes') : Classes, ('Adults') : Adults, ('Chillds') : Childs
        , ('Infants') : Infants], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Flights - PHPTRAVELS/strong_USD 294.8'))

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_SelectAfghanistanAland IslandsAlbani_5b78e7'), 
    Nationality, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_MR                        MISS                        MRS'), 
    Title, true)

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVELS/input_First Name_firstname_1'), FirstName1)

WebUI.setText(findTestObject('Object Repository/Page_Flight Booking - PHPTRAVELS/input_Last Name_lastname_1'), LastName1)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_SelectAfghanistanAland IslandsAlbani_5b78e7_1'), 
    Nationality, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Month                        01 Janu_dabf24'), 
    MonthOfBirth, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_1                                   _9e319c'), 
    DayOfBirth, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_2022                                _b6d849'), 
    YearOfBirth, true)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVELS/input_Passport or ID number_passport_1'), Passport)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Month                        01 Janu_dabf24_1'), 
    MonthOfIssuance, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_1                                   _0d20ab'), 
    DayOfIssuance, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_2022                                _b6d849_1'), 
    YearOfIssuance, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_Month                        01 Janu_dabf24_1_2'), 
    MonthOfExpired, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_1                                   _0d20ab_1'), 
    DayOfExpired, true)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVELS/select_2042                                _156e7b'), 
    YearOfExpired, true)

WebUI.delay(3)

WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVELS/input_paypal_payment_gateway'))



WebUI.check(findTestObject('Page_Flight Booking - PHPTRAVELS/label_By continuing, you agree to the   Terms and Conditions'))

WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVELS/button_Confirm Booking'))

