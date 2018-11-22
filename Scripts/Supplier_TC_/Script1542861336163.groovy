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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.phptravels.net/admin')

WebUI.setText(findTestObject('SupplierCreation/input_email'), 'admin@phptravels.com')

WebUI.setText(findTestObject('SupplierCreation/input_password'), 'demoadmin')

WebUI.click(findTestObject('SupplierCreation/button_Login'))

WebUI.click(findTestObject('SupplierCreation/a_Accounts'))

WebUI.click(findTestObject('SupplierCreation/a_Suppliers'))

WebUI.click(findTestObject('SupplierCreation/button_Add'))

def ExcelData = findTestData('Datefile_supplier_excelData/AddSupplierInfo')

int i = 1

WebUI.setText(findTestObject('Common/fielddatas', [('dynamicvariable') : 'fname']), ExcelData.getValue(i++, 1))

WebUI.setText(findTestObject('Common/fielddatas', [('dynamicvariable') : 'lname']), ExcelData.getValue(i++, 1))

WebUI.setText(findTestObject('Common/fielddatas', [('dynamicvariable') : 'email']), ExcelData.getValue(i++, 1))

WebUI.setText(findTestObject('Common/fielddatas', [('dynamicvariable') : 'password']), ExcelData.getValue(i++, 1))

WebUI.setText(findTestObject('Common/fielddatas', [('dynamicvariable') : 'mobile']), ExcelData.getValue(i++, 1))

WebUI.click(findTestObject('AdminCreation/ClickCountryDropDown'))

WebUI.delay(1)

WebUI.click(findTestObject('AdminCreation/select_india', [('Country') : ExcelData.getValue(i++, 1)]))

WebUI.delay(5)

WebUI.setText(findTestObject('Common/fielddatas', [('dynamicvariable') : 'address1']), ExcelData.getValue(i++, 1))

WebUI.setText(findTestObject('Common/fielddatas', [('dynamicvariable') : 'address2']), ExcelData.getValue(i++, 1))

WebUI.click(findTestObject('SupplierCreation/ClickSupplier'))

WebUI.click(findTestObject('SupplierCreation/Selectsupplier', [('supplier') : ExcelData.getValue(i++, 1)]))

WebUI.setText(findTestObject('Common/fielddatas', [('dynamicvariable') : 'itemname']), ExcelData.getValue(i++, 1))

WebUI.click(findTestObject('SupplierCreation/ClickAssignHotel'))

WebUI.click(findTestObject('SupplierCreation/SelectAssignHotel', [('assignhotel') : ExcelData.getValue(i++, 1)]))

WebUI.click(findTestObject('SupplierCreation/ClickAssignTours'))

WebUI.click(findTestObject('SupplierCreation/SelectAssignTours', [('assigntours') : ExcelData.getValue(i++, 1)]))

WebUI.click(findTestObject('SupplierCreation/ClickSelectCars'))

WebUI.click(findTestObject('SupplierCreation/SelectSelectCars', [('assigncars') : ExcelData.getValue(i++, 1)]))

def dbdataForPermission = findTestData('Datafile for CreateAdmin/add_edit_remove')

for (def index : (1..dbdataForPermission.getRowNumbers())) {
    for (def indexc : (1..dbdataForPermission.getColumnNumbers())) {
        WebUI.scrollToElement(findTestObject('AdminCreation/add_edit_remove_checkbox', [('value') : dbdataForPermission.getValue(indexc, index)]), 
            10)

        WebUI.click(findTestObject('AdminCreation/add_edit_remove_checkbox', [('value') : dbdataForPermission.getValue(indexc, index)]))
    }
}

WebUI.click(findTestObject('SupplierCreation/SupplierSubmit'))

//WebUI.verifyElementPresent(findTestObject('SupplierCreation/VerifySupplierPresent'), 5)

//WebUI.closeBrowser()

