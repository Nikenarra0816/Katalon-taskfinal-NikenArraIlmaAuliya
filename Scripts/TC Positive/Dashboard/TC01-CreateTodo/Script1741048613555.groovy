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

// Mulai Aplikasi
// Tap tombol tambah task
Mobile.waitForElementPresent(findTestObject('OR-Dashboard/android.widget.ImageButton'), 2)

Mobile.tap(findTestObject('OR-Dashboard/android.widget.ImageButton'), 2)

// Input Title Task
Mobile.setText(findTestObject('OR-Task/android.widget.FieldTaskTitle'), tasktitle, 2)

// Input deskripsi tugas
Mobile.setText(findTestObject('OR-Task/android.widget.FieldWhatDone'), description, 2)

// Pilih tanggal
Mobile.tap(findTestObject('OR-Task/android.widget.FillDate'), 2)

Mobile.tap(findTestObject('OR-Task/android.view.tgl5'), 2)

Mobile.tap(findTestObject('OR-Task/android.widget.BtnOke'), 2)

// Pilih waktu
Mobile.tap(findTestObject('OR-Task/android.widget.FieldTime'), 2)

Mobile.tap(findTestObject('OR-Task/android.widget.Jam10'), 2)

Mobile.tap(findTestObject('OR-Task/android.widget.BtnTimeOK'), 2)

// **Pilih kategori dengan SWITCH-CASE**
String kategori = 'Business' // Ubah kategori sesuai kebutuhan

Mobile.tap(findTestObject('OR-Task/android.widget.ChoiceCategory'), 2)

switch (kategori) {
    case 'Business':
        Mobile.tap(findTestObject('OR-Task/android.widget.Business'), 2)

        break
    case 'Bangking':
        Mobile.tap(findTestObject('OR-Task/android.widget.Bangking'), 2)

        break
    case 'Insurance':
        Mobile.tap(findTestObject('OR-Task/android.widget.Insurance'), 2)

        break
    default:
        println('Kategori tidak valid, memilih default: Business')

        Mobile.tap(findTestObject('OR-Task/android.widget.Business'), 2)}

// Simpan tugas
Mobile.tap(findTestObject('OR-Task/android.widget.Save'), 2)

// **IF-ELSE: Verifikasi tugas berhasil disimpan**
if (Mobile.waitForElementPresent(findTestObject('OR-Dashboard/android.widget.ViewTitle'), 2, FailureHandling.OPTIONAL)) {
    println('Task berhasil disimpan!')
} else {
    println('Task gagal disimpan!')
}

