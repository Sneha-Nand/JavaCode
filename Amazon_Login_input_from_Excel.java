package basicPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Login_input_from_Excel{

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fsign%2Fs%3Fk%3Dsign%2Bin%26ref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\SNEHA\\Java\\JavaOne\\DDTesting\\sneha.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		
		String username = w1.getSheet("logindetails").getRow(1).getCell(0).getStringCellValue();
		System.out.println(username);
		
		String password = w1.getSheet("logindetails").getRow(0).getCell(1).getStringCellValue();
		System.out.println(password);
		
		WebElement uname = driver.findElement(By.id("ap_email"));
		uname.sendKeys(username);
		
		WebElement continuebtn = driver.findElement(By.id("continue"));
		continuebtn.click();
		
		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys(password);
		
		WebElement signbtn = driver.findElement(By.id("signInSubmit"));
		signbtn.click();
	}

}
