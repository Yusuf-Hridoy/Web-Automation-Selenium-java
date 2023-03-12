package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;import org.openqa.selenium.support.FindBy.FindByBuilder;
import org.testng.annotations.Test;

import pages.Printworkbd_homepage;
import pages.payment;
import pages.view_book;
//port pages.story_books;
import profit.settings;


public class Home_page_test extends settings  {
	Printworkbd_homepage printworkbd_homepage = new Printworkbd_homepage();
	view_book book_view = new view_book();
	payment pay = new payment();
	
	
	
	
	
	
	@Test
	public void hoverr() throws InterruptedException {
		getDriver().get("https://www.printworksbd.com/");
		//getDriver().get(printworkbd_homepage.Story_books);
		Printworkbd_homepage Story_books = new Printworkbd_homepage();
		Actions actions = new Actions(getDriver());
		WebElement story_book = getDriver().findElement(printworkbd_homepage.Story_books);
		actions.clickAndHold(story_book).build().perform();
		
		// hovering the inside section
		Printworkbd_homepage Story_books_fiction = new Printworkbd_homepage();
		WebElement story_books_fiction = getDriver().findElement(printworkbd_homepage.Story_books_fiction);
		actions.clickAndHold(story_books_fiction).build().perform();
		
		//click after hover
		getDriver().findElement(printworkbd_homepage.Story_books_fiction).click();
		
		//Scrolldown
		Printworkbd_homepage Next_page = new Printworkbd_homepage();
		WebElement nextpage = getDriver().findElement(printworkbd_homepage.Next_page);
		actions.scrollToElement(nextpage).build().perform();
		
		//click next page
		getDriver().findElement(printworkbd_homepage.Next_page).click();
		Thread.sleep(3000);
		
		//view book
		view_book view_the_book = new view_book();
		getDriver().findElement(book_view.view_the_book).click();
		Thread.sleep(3000);
		
		//add to cart
		 view_book cart_menu  = new view_book();
		  getDriver().findElement(book_view.cart_menu).click();
		  
		  // hover cart icon
		  view_book hover_checkout_menu = new view_book();
		  WebElement hover = getDriver().findElement(book_view.hover_checkout_menu);
		  actions.clickAndHold(hover).build().perform();
		  
		  //click checkout
		  view_book click_checkout = new view_book();
		  getDriver().findElement(book_view.click_checkout).click();
		  
		  // provide info first name
		 payment paying = new payment();
		// getDriver().findElements(pay.payinfo("yusuf", "ahmed", "savar", "1347", "01793527440", "abc@gmail.com"));
		// pay.payinfo("yusuf", "ahmed", "savar", "1347", "01793527440", "abc@gmail.com");
		 WebElement fn = getDriver().findElement(pay.first_name);
		 WebElement ln = getDriver().findElement(pay.last_name);
		 WebElement ad = getDriver().findElement(pay.address);
		 WebElement pc = getDriver().findElement(pay.postal_code);
		 WebElement ph = getDriver().findElement(pay.phone);
		 WebElement mail = getDriver().findElement(pay.email);
		 fn.sendKeys("yusuf");
		 ln.sendKeys("ahmed");
		 ad.sendKeys("savar");
		 pc.sendKeys("1347");
		 ph.sendKeys("01793527440");
		 mail.sendKeys("123@gmail.com");
		
		 
		  
		
		 
		
		
	
		
		
		
	}

}
