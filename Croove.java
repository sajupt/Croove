package Croove;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Croove {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Start a new instance of Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Go to the url
		driver.get("http://hiring-qa.croove.net/");

		
		
		// Display the text on the home screen.
		System.out.println("The Homepage");
		//System.out.println("");
		WebElement Txt = driver.findElement(By.xpath("html/body/div[1]/div"));
		System.out.println("" + Txt.getText());
		System.out.println("");
	//	Thread.sleep(3000);
		
		//Click on the Info Button.
		System.out.println("Info");
		driver.findElement(By.xpath("//html/body/div[1]/div[2]/a[1]")).click();
		Thread.sleep(1000);
		WebElement Txt1 = driver.findElement(By.xpath("//div[@class='info']"));
		System.out.println("" + Txt1.getText());
		System.out.println("");
		Thread.sleep(3000);
		
		
		
		//Click on the Back to Main Button
	driver.findElement(By.linkText("Back to Main")).click();
	Thread.sleep(1000);
			
		// Click on the See a number button
		System.out.println("Generating a Random Number");
		driver.findElement(By.xpath("//html/body/div[1]/div[2]/a[2]")).click();
		Thread.sleep(1000);
		String str[] = driver.findElement(By.xpath("//p[@class='result']")).getText().split(" ");
		System.out.println(str[str.length - 1]);
		String str1 = (str[str.length - 1]);
		Integer i = Integer.valueOf(str1);
		System.out.println("");

		// To check if the random number generated is between 0 and 99
		if (i >= 0 && i <= 99) {
			System.out.println("The number " + i + " is between 0 and 99");
			System.out.println("");
		} else {
			System.out.println("The number " + i + " is not between 0 and 99");
		}
		// Get the input from user whether to generate another number or go back
		// to main page.
		Scanner scan1 = new Scanner(System.in);
		System.out.println("To generate another number enter 1, press any other number to go back to the Main menu");
		int choice1 = 0;
do {
			
			driver.findElement(By.xpath("html/body/div[1]/div[2]/a[2]")).click();
			Thread.sleep(2000);
			String str11[] = driver.findElement(By.xpath("//p[@class='result']")).getText().split(" ");
			System.out.println(str11[str11.length - 1]);
			String str2 = (str11[str11.length - 1]);
			Integer i1 = Integer.valueOf(str2);
			choice1 = scan1.nextInt();
			if (i1 >= 0 && i1 <= 99) {
				System.out.println("The number " + i1 + " is between 0 and 99");
				System.out.println("");
			} else {
				System.out.println("The number " + i1 + " is not between 0 and 99");
			}
			
			
			}while(choice1 == 1);
			driver.findElement(By.xpath("//div[2]/a[1]")).click();
			Thread.sleep(3000);
			System.out.println("Returning to the main menu");

	
	}
}

