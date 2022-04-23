package login_page;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginClass {
	WebDriver driver;
	public LoginClass(WebDriver driver) {
	this.driver = driver;
	}
	// Using FindBy for locating elements
	@FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement Signin ;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement emailTextBox;
	@FindBy(how = How.XPATH, using ="//*[@id=\"passwd\"]")
	WebElement passwordTextBox;
	@FindBy(how = How.XPATH, using ="//*[@id=\"SubmitLogin\"]/span")
	WebElement loginButton;
	@FindBy(how = How.XPATH, using = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	WebElement dress;
	@FindBy(how = How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	WebElement checkout1;
	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
	WebElement checkout2;
	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/form/p/button")
	WebElement checkout3;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cgv\"]")
	WebElement checkbox;
	@FindBy(how = How.XPATH, using = "//*[@id=\"form\"]/p/button")
	WebElement checkout4;
	@FindBy(how = How.XPATH, using = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	WebElement wire;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cart_navigation\"]/button/span")
	WebElement order;
	
	//
	public void clickSignin() {
		Signin.click();
	}
	public void setEmail(String strEmail) {
		emailTextBox.sendKeys(strEmail);
		}
		public void setPassword(String strPassword) {
		passwordTextBox.sendKeys(strPassword);
		}
		public void clickLoginButton() {
		loginButton.click();
		}
		
		public void setDress() throws InterruptedException {
			dress.click();	
			//driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebElement Dress = driver.findElement(By.linkText("Printed Dress"));
			Actions a= new Actions(driver);
			a.moveToElement(Dress).perform();
			Dress.click();
			driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
			}		

		public void setcheckout1() {
			checkout1.click();
		}
		public void setcheckout2() {
			checkout2.click();
		}
		public void setcheckout3() {
			checkout3.click();
		}
		public void setcheckbox() {
			checkbox.click();
		}
		public void setcheckout4() {
			checkout4.click();
		}
		public void setwire() {
			wire.click();
		}
		public void setorder() {
			order.click();
		}
		}
		
