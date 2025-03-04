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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// **Mulai Aplikasi**
// **Tap Burger Menu**
Mobile.tap(findTestObject('OR-Category/android.widget.ImageBurger'), 10)

// **Tap Menu Category**
Mobile.tap(findTestObject('OR-Category/android.widget.MenuCategory'), 10)

// **Tap Edit Icon**
Mobile.tap(findTestObject('OR-Category/android.widget.IconEditCategory'), 10)

// **Tambahkan Delay (Jika Perlu)**
Mobile.delay(2)

// **Hapus Teks Lama**
Mobile.clearText(findTestObject('OR-Category/android.widget.FieldUpdateCategory'), 10)

// **Inputkan Teks Baru dengan setText()**
Mobile.setText(findTestObject('OR-Category/android.widget.FieldUpdateCategory'), 'Personal Edit', 10)

// **Tap Update Button**
Mobile.tap(findTestObject('OR-Category/android.widget.BtnUpdateCategory'), 10)

