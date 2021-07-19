package sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String url=driver.getTitle();
		System.out.println("The title of the url is: "+url);
		String url1=driver.getCurrentUrl();
		System.out.println("The current url is: "+url1);
		driver.quit();
		// TODO Auto-generated method stub

	}

}
