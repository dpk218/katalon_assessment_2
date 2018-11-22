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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('CreateAdmin_TC_DB'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.phptravels.net/admin')

WebUI.setText(findTestObject('AddTour/input_email'), 'deepak.s@inapp.com')

WebUI.setText(findTestObject('AddTour/input_password'), 'Deepak')

WebUI.click(findTestObject('AddTour/span_Login'))

WebUI.click(findTestObject('AddTour/a_Tours'))

WebUI.click(findTestObject('AddTour/a_Tours_1'))

WebUI.click(findTestObject('AddTour/button_Add'))

def internalData = findTestData('Datafile_CreateTour/Test_Data_tour')

int i = 1

WebUI.setText(findTestObject('Common/fielddatas', [('dynamicvariable') : 'tourname']), internalData.getValue(i++, 1))

WebUI.setText(findTestObject('Common/fielddatas', [('dynamicvariable') : 'maxadult']), internalData.getValue(i++, 1))

WebUI.setText(findTestObject('Common/fielddatas', [('dynamicvariable') : 'adultprice']), internalData.getValue(i++, 1))

WebUI.click(findTestObject('AddTour/ChildButton'))

WebUI.setText(findTestObject('Common/fielddatas', [('dynamicvariable') : 'maxchild']), internalData.getValue(i++, 1))

WebUI.setText(findTestObject('Common/fielddatas', [('dynamicvariable') : 'childprice']), internalData.getValue(i++, 1))

WebUI.click(findTestObject('AddTour/InfantButton'))

WebUI.setText(findTestObject('Common/fielddatas', [('dynamicvariable') : 'maxinfant']), internalData.getValue(i++, 1))

WebUI.setText(findTestObject('Common/fielddatas', [('dynamicvariable') : 'infantprice']), internalData.getValue(i++, 1))

WebUI.click(findTestObject('AddTour/StarDropdown'))

WebUI.click(findTestObject('AddTour/StarSelection', [('value') : internalData.getValue(i++, 1)]))

WebUI.setText(findTestObject('Common/fielddatas', [('dynamicvariable') : 'tourdays']), internalData.getValue(i++, 1))

WebUI.setText(findTestObject('Common/fielddatas', [('dynamicvariable') : 'tournights']), internalData.getValue(i++, 1))

WebUI.click(findTestObject('AddTour/TourTypeDrop'))

WebUI.click(findTestObject('AddTour/TypeSelection', [('type') : internalData.getValue(i++, 1)]))

WebUI.click(findTestObject('AddTour/select location'))

WebUI.setText(findTestObject('AddTour/SearchLocation'), 'Paris')

WebUI.click(findTestObject('AddTour/LocationSelection'))

WebUI.click(findTestObject('AddTour/Inclusion'))

WebUI.click(findTestObject('AddTour/Select All'))

WebUI.delay(5)

WebUI.click(findTestObject('AddTour/Select All'))

def tourfacilitiesinclude = findTestData('Datafile_CreateTour/Inclusions')

for (def index : (1..tourfacilitiesinclude.getRowNumbers())) {
    WebUI.click(findTestObject('AddTour/Include_facilities', [('includefacilities') : tourfacilitiesinclude.getValue(1, 
                    index)]))
}

WebUI.click(findTestObject('AddTour/ClickExclusions'))

def tourfacilitiesexclude = findTestData('Datafile_CreateTour/Exclusions')

for (def indexe : (1..tourfacilitiesexclude.getRowNumbers())) {
    WebUI.click(findTestObject('AddTour/Exclusion_facilities', [('excludefacilities') : tourfacilitiesexclude.getValue(1, 
                    indexe)]))
}

WebUI.click(findTestObject('AddTour/SubmitTour'))

WebUI.verifyElementPresent(findTestObject('AddTour/VerifyTourPresent'), 10)

WebUI.openBrowser('')

