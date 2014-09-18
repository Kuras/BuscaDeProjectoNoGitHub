package pl.busca.github;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Pending;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class GitHubStepdefs {

	private WebDriver driver;
	
	@Given("^Eu estou no site \"(.*?)\"$")
	public void eu_estou_no_site(String site) throws Throwable {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(site);

	}

	@When("^Eu procuro por \"(.*?)\"$")
	public void eu_procuro_por(String searchText) throws Throwable {
	    
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys(searchText + "\n");
		
	}

	@When("^Eu clico no link com descricao \"(.*?)\"$")
	public void eu_clico_no_link_com_descricao(String expectedLinkText) throws Throwable {
	    
		WebElement elementLinkText = driver.findElement(By.linkText(expectedLinkText));
		System.out.println(elementLinkText);
		elementLinkText.click();
		
	}

	@Then("^Eu deveria encontrar um link com descricao \"(.*?)\"$")
	public void eu_deveria_encontrar_um_link_com_descricao(String expectedLinkText) throws Throwable {
		
		WebElement elementLinkText = driver.findElement(By.linkText(expectedLinkText));
		assertNotNull(elementLinkText);
		
		driver.quit();

	}
}
