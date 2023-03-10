package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class payment extends basepage {
	public By first_name = By.xpath("//input[@id='billing_first_name']");
	public By last_name = By.xpath("//input[@id='billing_last_name']");
	public By address = By.xpath("//input[@id='billing_address_1']");
	public By postal_code = By.xpath("//input[@id='billing_postcode']");
	public By phone = By.xpath("//input[@id='billing_phone']");
	public By email = By.xpath("//input[@id='billing_email']");
	
	//public void  payinfo(String fname, String lname, String Thikana, String pcode, String mobile, String mail) {
	//	writeTextOnElement(first_name, fname);
	//	writeTextOnElement(last_name, lname);
	//	writeTextOnElement(address, Thikana);
	//	writeTextOnElement(postal_code, pcode);
	//	writeTextOnElement(phone, mobile);
	//	writeTextOnElement(email, mail);
	//input[@id='billing_first_name']
			
		}
		
	



