package com.example.selenium_lab.finki;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.support.ui.Select;

public class Script {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/");
        
        WebElement signInButton = driver.findElement(By.id("signin_button"));
        signInButton.click();
        
        WebElement userNameInput = driver.findElement(By.name("user_login"));
        WebElement passwordInput = driver.findElement(By.name("user_password"));
        WebElement btnLogIn = driver.findElement(By.className("btn-primary"));

        userNameInput.sendKeys("username");
        passwordInput.sendKeys("password");

        btnLogIn.click();
        
     

        WebElement payBillsLink = driver.findElement(By.linkText("Pay Bills"));
        payBillsLink.click();
        
        WebElement paySaved = driver.findElement(By.linkText("Pay Saved Payee"));
        paySaved.click();
        
        Select selec = new Select(driver.findElement(By.id("sp_payee")));
        selec.selectByVisibleText("Apple");
        
        Select select = new Select(driver.findElement(By.id("sp_account")));
        select.selectByVisibleText("Checking");
        
        
        WebElement inputAmount = driver.findElement(By.id("sp_amount"));
        inputAmount.sendKeys("100");
       
        WebElement dateWidget = driver.findElement(By.id("sp_date"));
	    dateWidget.clear();
	    dateWidget.sendKeys("2019-04-25");
	   
	    
	    WebElement descField = driver.findElement(By.id("sp_description"));
        descField.sendKeys("I am writing a description...");
        
        
        driver.findElement(By.id("pay_saved_payees")).click();
        
	    
	}
}
	   

