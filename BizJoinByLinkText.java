package biz.join;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;

public class BizJoinByLinkText {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://biz.wemakeprice.com");
		WebElement aboutLink = driver.findElement(By.linkText("ȸ������"));
		aboutLink.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//ȸ������ ��ư Ŭ��

		WebElement join_id = driver.findElement(By.id("join_id"));
		join_id.sendKeys("kschoi91");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//ID �Է�
		
		WebElement join_pw = driver.findElement(By.id("join_pw"));
		join_pw.sendKeys("glasofk55!");
		WebElement join_pw_ck = driver.findElement(By.id("join_pw_ck"));
		join_pw_ck.sendKeys("glasofk55!");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//PW �Է�
		
		WebElement join_submit = driver.findElement(By.id("join_submit_step1"));
		join_submit.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//step2�� ����
		
		WebElement aboutLink5 = driver.findElement(By.id("deal_group_type_400000000"));
		aboutLink5.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//��ǰ�� ���� - ����/����/ü��
		
			
		WebElement join_company = driver.findElement(By.id("join_company"));
		join_company.sendKeys("��ȣ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//��ȣ �Է�
		
		WebElement join_representative = driver.findElement(By.id("join_representative"));
		join_representative.sendKeys("��ǥ�ڸ�");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//��ǥ�ڸ� �Է�		
		
		WebElement number_info1 = driver.findElement(By.name("number_info[company_no][no1]"));
		number_info1.sendKeys("123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//����ڵ�Ϲ�ȣ ù��° 3�ڸ� �Է�
		
		WebElement number_info2 = driver.findElement(By.name("number_info[company_no][no2]"));
		number_info2.sendKeys("12");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//����ڵ�Ϲ�ȣ �ι�° 2�ڸ� �Է�
		
		WebElement number_info3 = driver.findElement(By.name("number_info[company_no][no3]"));
		number_info3.sendKeys("12345");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//����ڵ�Ϲ�ȣ ����° 5�ڸ� �Է�

		WebElement company_info1 = driver.findElement(By.xpath(".//*[@id='container']/div/div/div/form/div/div[2]/table/tbody/tr[4]/td/p/input[2]"));
		company_info1.sendKeys("���ּ�");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//���ּ� �Է�

		WebElement aboutLink2 = driver.findElement(By.xpath(".//*[@id='container']/div/div/div/form/div/div[2]/table/tbody/tr[4]/td/button"));
		aboutLink2.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//����� �����ȣ ��ư Ŭ��
		
		WebElement zip_search2 = driver.findElement(By.name("zip_search2"));
		zip_search2.sendKeys("�������502");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//���θ� �Է�
						
		WebElement aboutLink3 = driver.findElement(By.xpath(".//*[@id='tab_content01']/div[1]/div/div[1]/fieldset/button"));
		aboutLink3.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//���θ� �˻���ư Ŭ��
		
		WebElement aboutLink4 = driver.findElement(By.xpath(".//*[@id='searchAddr2']/dl/dd[1]/span[2]"));
		aboutLink4.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//���θ� �ּ� Ŭ��
		
		WebElement company_status = driver.findElement(By.name("company_info[company_status]"));
		company_status.sendKeys("����");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//���� �Է�
		
		WebElement join_event = driver.findElement(By.id("join_event"));
		join_event.sendKeys("������ ������");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//���� �Է�
		
		WebElement aboutLink9 = driver.findElement(By.xpath(".//*[@id='container']/div/div/div/form/div/div[2]/table/tbody/tr[3]/td[2]/button"));
		aboutLink9.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//���� �߰� ��ư Ŭ��
		
		WebElement same = driver.findElement(By.id("same"));
		same.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//����� ����� ������ ���� üũ�ڽ� Ŭ��		
	
		
		WebElement company_phone1 = driver.findElement(By.name("number_info[company_phone][no1]"));
		company_phone1.sendKeys("010");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//��ǥ��ȣ1 1��° �Է�
		
		WebElement company_phone2 = driver.findElement(By.name("number_info[company_phone][no2]"));
		company_phone2.sendKeys("2345");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//��ǥ��ȣ1 2��° �Է�
		
		WebElement company_phone3 = driver.findElement(By.name("number_info[company_phone][no3]"));
		company_phone3.sendKeys("2345");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//��ǥ��ȣ1 3��° �Է�
		
		WebElement company_cs_phone1 = driver.findElement(By.name("number_info[company_cs_phone][no1]"));
		company_cs_phone1.sendKeys("010");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//�����͹�ȣ 1��° �Է�
		
		WebElement company_cs_phone2 = driver.findElement(By.name("number_info[company_cs_phone][no2]"));
		company_cs_phone2.sendKeys("1234");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//�����͹�ȣ 2��° �Է�
		
		WebElement company_cs_phone3 = driver.findElement(By.name("number_info[company_cs_phone][no3]"));
		company_cs_phone3.sendKeys("1234");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//�����͹�ȣ 3��° �Է�
		
		WebElement company_addr2 = driver.findElement(By.name("company_info[company_addr2]"));
		company_addr2.sendKeys("��ü �ּ�");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//��ü �ּ� �Է�
		
		WebElement tax_company_addr2 = driver.findElement(By.name("company_info[tax_company_addr2]"));
		tax_company_addr2.sendKeys("��ü �ּ�");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//��ü �ּ� �Է�		
		
		WebElement join_pname = driver.findElement(By.id("join_pname"));
		join_pname.sendKeys("���޴���ڸ�");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//���޴���ڸ� �Է�		
		
		WebElement aff_phone1 = driver.findElement(By.name("number_info[aff_phone][no1]"));
		aff_phone1.sendKeys("010");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//��ü ������ȣ �Է�1		
		
		WebElement aff_phone2 = driver.findElement(By.name("number_info[aff_phone][no2]"));
		aff_phone2.sendKeys("1234");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//��ü ������ȣ �Է�2		
		
		WebElement aff_phone3 = driver.findElement(By.name("number_info[aff_phone][no3]"));
		aff_phone3.sendKeys("1234");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//��ü ������ȣ �Է�3
		
		WebElement aff_mobile1 = driver.findElement(By.name("number_info[aff_mobile][no1]"));
		aff_mobile1.sendKeys("010");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//��ü �޴�����ȣ �Է�1
		
		WebElement aff_mobile2 = driver.findElement(By.name("number_info[aff_mobile][no2]"));
		aff_mobile2.sendKeys("1234");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//��ü �޴�����ȣ �Է�2
		
		WebElement aff_mobile3 = driver.findElement(By.name("number_info[aff_mobile][no3]"));
		aff_mobile3.sendKeys("1234");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//��ü �޴�����ȣ �Է�3
		
		WebElement join_pmail = driver.findElement(By.id("join_pmail"));
		join_pmail.sendKeys("callme_cks@yopmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//���޴���� �̸��� �Է�		
		
		WebElement aboutLink6 = driver.findElement(By.id("join_person"));
		aboutLink6.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//���� - ���޴���� ���� ��ư Ŭ��
			
		WebElement aboutLink7 = driver.findElement(By.id("join_person2"));
		aboutLink7.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//CS - ���޴���� ���� ��ư Ŭ��
		
		WebElement aboutLink8 = driver.findElement(By.id("join_person3"));
		aboutLink8.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//����� - ���޴���� ���� ��ư Ŭ��
		
		WebElement aboutLink10 = driver.findElement(By.id("join_person4"));
		aboutLink10.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//��� - ���޴���� ���� ��ư Ŭ��
				
		WebElement tech_email = driver.findElement(By.name("company_info[tech_email]"));
		tech_email.sendKeys("callme_cks@yopmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//�������� �̸��� �Է�		
		
		WebElement aboutLink11 = driver.findElement(By.name("company_info[bank_name]"));
		aboutLink11.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement aboutLink12 = driver.findElement(By.xpath(".//*[@id='container']/div/div/div/form/div/div[6]/table/tbody/tr/td[1]/p[1]/select/option[24]"));
		aboutLink12.click();
		//�Աݰ��� ���� ����
		
		WebElement join_account = driver.findElement(By.id("join_account"));
		join_account.sendKeys("47391029362507");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//���¹�ȣ �Է�		
		
		WebElement join_accountholder = driver.findElement(By.id("join_accountholder"));
		join_accountholder.sendKeys("�ְ漱");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//������ �Է�		
		
		
		WebElement aboutLink14 = driver.findElement(By.id("sellNo"));
		aboutLink14.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//�ΰ����� - �Ǹž��� Ŭ��
		
		
		WebElement aboutLink13 = driver.findElement(By.xpath(".//*[@id='container']/div/div/div/form/div/div[6]/table/tbody/tr/td[2]/button"));
		aboutLink13.click();
		//�Ǹ����� ��ư Ŭ��
		Thread.sleep(2000);	//wait for 2sec
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();		//������ ����ġ alertâ Ȯ�ι�ư Ŭ��
		System.out.println(alertText);
		Thread.sleep(2000);	
				
		WebElement aboutLink15 = driver.findElement(By.xpath(".//*[@id='container']/div/div/div/form/div/div[7]/table/tbody/tr[1]/td/button"));
		aboutLink15.click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//����÷�� ã�ƺ��� ��ư Ŭ�� - ����ڵ���� �纻
		
		StringSelection ss1 = new StringSelection("C:\\B.JPG");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
	    	    
	    //imitate mouse events like ENTER, CTRL+C, CTRL+V
	    Robot robot1 = new Robot();
	    robot1.keyPress(KeyEvent.VK_ENTER);
	    robot1.keyRelease(KeyEvent.VK_ENTER);
	    robot1.keyPress(KeyEvent.VK_CONTROL);
	    robot1.keyPress(KeyEvent.VK_V);
	    robot1.keyRelease(KeyEvent.VK_V);
	    robot1.keyRelease(KeyEvent.VK_CONTROL);
	    Thread.sleep(500);
	    robot1.keyPress(KeyEvent.VK_ENTER);
	    robot1.keyRelease(KeyEvent.VK_ENTER);
	    	   	
	    
	    
	   
	    WebElement aboutLink16 = driver.findElement(By.id("order_submit"));
		aboutLink16.click();	//��Ʈ��ȸ�� ���� ��û Ŭ��
		Thread.sleep(2000);		//wait for 2sec
		
	
		Alert alert1 = driver.switchTo().alert();
		String alertText1 = alert.getText();
		alert1.accept();		//alertâ Ȯ�ι�ư Ŭ��
		System.out.println(alertText1);
		Thread.sleep(500);	
		
		
		
		WebElement aboutLink17 = driver.findElement(By.xpath(".//*[@id='container']/div/div/div/form/div/div[7]/table/tbody/tr[2]/td/button"));
		aboutLink17.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//����÷�� ã�ƺ��� ��ư Ŭ�� - ���� �纻
		
		StringSelection ss2 = new StringSelection("C:\\B.JPG");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);

	    //imitate mouse events like ENTER, CTRL+C, CTRL+V
	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    Thread.sleep(500);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER); 		
	    
	    
	    
		WebElement aboutLink20 = driver.findElement(By.id("auth_send_btn"));
		aboutLink20.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//����� �޴��� �����ϱ� Ŭ��
		
		
		Alert alert3 = driver.switchTo().alert();
		String alertText2 = alert.getText();
		alert3.accept();		//alertâ Ȯ�ι�ư Ŭ��
		System.out.println(alertText2);
		Thread.sleep(500);	
		
		
	    
		WebElement auth_cert_input = driver.findElement(By.id("auth_cert_input"));
		auth_cert_input.sendKeys("778410");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//�޴��� ������ȣ �Է�	
		
		
		WebElement aboutLink21 = driver.findElement(By.id("auth_check_btn"));
		aboutLink21.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//����� �޴��� �����ϱ� Ŭ��
		
	    
	    /*WebElement aboutLink18 = driver.findElement(By.id("order_submit"));
		aboutLink18.click();	//��Ʈ��ȸ�� ���� ��û Ŭ��
	    
	    */
	    
		
	}
}