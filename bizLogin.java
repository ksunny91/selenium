package biz.login;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bizLogin {
	
	@Test
	public void captureScreenshot() throws Exception
	{
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://biz.wemakeprice.com");
		
		WebElement login_uid = driver.findElement(By.id("login_uid"));
		login_uid.sendKeys("msjo499");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//ID 입력		
		
		WebElement login_upw_biz = driver.findElement(By.id("login_upw_biz"));
		login_upw_biz.sendKeys("anstjd123!");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//PW 입력							
		
		WebElement loginConfirmBtn_biz = driver.findElement(By.id("loginConfirmBtn_biz"));
		loginConfirmBtn_biz.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//로그인 버튼 클릭
		
		if (driver.getPageSource().contains("다시 확인해 주세요"))
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);		
			FileUtils.copyFile(source, new File("./Screenshots/login_screenshot.png"));		
			System.out.println("Screenshot taken");
		}
				
			
		driver.quit();		
	}

}
