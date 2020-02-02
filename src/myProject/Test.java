package myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		//paleidziam narsykle
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Darius\\Desktop\\selenium install\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.autobilis.lt/paskola/");
		//maximize
		driver.manage().window().maximize();
		//laukiam popupso ir uzdarom
		
		WebDriverWait wait = new WebDriverWait(driver, 60);       
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\\\"pe_close_btn\\\"]")));
		driver.findElement(By.xpath("//*[@id=\"pe_close_btn\"]")).click();
		
		// surasom duomenys.
		//Paskolos suma
		driver.findElement(By.xpath("//*[@id=\"moki-banner-popup-paskola\"]/div[2]/div/div[2]/div[1]/div[1]/p/span/input")).sendKeys("11999");
		//vardas
		driver.findElement(By.xpath("//*[@id=\"moki-banner-popup-paskola\"]/div[2]/div/div[2]/div[2]/form/div[1]/input")).sendKeys("Test");
		//pavarde
		driver.findElement(By.xpath("//*[@id=\"moki-banner-popup-paskola\"]/div[2]/div/div[2]/div[2]/form/div[2]/input")).sendKeys("Testukas");
		//asmens kodas
		driver.findElement(By.xpath("//*[@id=\"moki-banner-popup-paskola\"]/div[2]/div/div[2]/div[2]/form/div[3]/input")).sendKeys("39405315522");
		//telefono nr.
		driver.findElement(By.xpath("//*[@id=\"moki-banner-popup-paskola\"]/div[2]/div/div[2]/div[2]/form/div[4]/input")).sendKeys("+37068811988");
		//El. pastas
		driver.findElement(By.xpath("//*[@id=\"moki-banner-popup-paskola\"]/div[2]/div/div[2]/div[2]/form/div[5]/input")).sendKeys("test@gmail.com");
		//patvirtinimas del taisykliu
		driver.findElement(By.xpath("//*[@id=\"duomenys\"]")).click();
		//Tęsti
		driver.findElement(By.xpath("//*[@id=\"moki-banner-popup-paskola\"]/div[2]/div/div[2]/div[2]/form/div[6]/a")).click();
		
		//uzdarom narsykle
		driver.close();
		System.out.println("Success");
		
	}

}
