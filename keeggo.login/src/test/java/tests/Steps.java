package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	WebDriver driver;
	
	
	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String string) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://advantageonlineshopping.com/#/");
	    driver.manage().window().maximize();
	    System.out.println("Iniciando teste");
	    Thread.sleep(4000);
	  
	   
	   
	}

	@When("vou no icone de login e comeco a preencher as lacunas")
	public void vou_no_icone_de_login_e_comeco_a_preencher_as_lacunas() throws InterruptedException {
		driver.findElement(By.id("menuUser")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input")).sendKeys("LuizaHosanna");
		driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input")).sendKeys("Lu6341");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"sign_in_btnundefined\"]")).click();
	   
	   
	}

	@Then("fa?o meu login")
	public void fa_o_meu_login() {
		
		System.out.println("Login realizado com sucesso");
	    
	}



}
