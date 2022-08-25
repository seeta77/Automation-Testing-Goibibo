import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class goibibo11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 
	        		 System.setProperty("webdriver.gecko.driver","D:\\selenium jar\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	        			WebDriver wd = new FirefoxDriver();
	        			wd.get("https://www.goibibo.com/trains/");
	        			
	    //Automating Train module in goibibo site    			
	        			//From
	        			wd.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/section[1]/section[1]/section[1]/aside[1]/label[1]/div[1]/div[1]/input[1]")).sendKeys("MSB, Chennai Beach Railway Station", Keys.ENTER);
	        			 Thread.sleep(2000);
	        			 wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/section/section[1]/section[1]/aside[1]/label[1]/div/div/div/ul/li")).click();
	        			 
	        			 //To
	        			 wd.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/section[1]/section[1]/section[1]/aside[1]/label[2]/div[1]/div[1]/input[1]")).sendKeys("NZM, Hazrat Nizamuddin Railway Station", Keys.ENTER);
	        			 Thread.sleep(2000);
	        			 wd.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/section[1]/section[1]/section[1]/aside[1]/label[2]/div[1]/div[1]/div[1]/ul[1]/li[1]")).click();
	        			 
	        			//radio
	        			wd.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/section[1]/section[1]/section[1]/aside[3]/div[2]/div[1]/label[2]/span[1]/input[1]")).click();
	        			 
	        			//search train
	        			wd.findElement(By.xpath("//button[contains(text(),'Search Trains')]")).click();
	        			 
	        			//AVL-40
	        			wd.findElement(By.xpath("//li[contains(text(),'AC Only')]")).click();
	        			wd.findElement(By.xpath("//li[contains(text(),'Late Depart (After 6 pm)')]")).click();	 
	        			wd.findElement(By.xpath("//body/div[@id='app']/div[@id='srpPageWrap']/section[2]/section[2]/section[1]/aside[1]/div[2]/label[1]/span[1]")).click();
	        			Thread.sleep(2000);
	        			wd.findElement(By.xpath("//p[contains(text(),'AVL-40')]")).click();
	        			Thread.sleep(2000);
	        			 
	        			 //proceed
	        			wd.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click(); 
	        			Thread.sleep(2000);
	        			
	        			//pay
	        			wd.manage().window().maximize();
	        			JavascriptExecutor js = (JavascriptExecutor)wd;
	        			js.executeScript("window.scrollTo(0,500)");
	        			 
	        			Thread.sleep(2000);
	        			wd.findElement(By.xpath("//div[contains(text(),'Female')]")).click();
	        			wd.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[2]/div[3]/div[1]/div[2]/div[2]/input")).sendKeys("Priya");
	        			wd.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[2]/div[3]/div[1]/div[3]/div[2]/div/input")).sendKeys("25");
	        			wd.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[2]/div[3]/div[2]/div/div")).click();
	        			wd.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[2]/div[3]/div[2]/div/div[2]/div/ul/li[4]")).click();
	        			wd.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[2]/div[4]/div/button")).click();
	        			Thread.sleep(2000);
	        			 
	        			wd.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[3]/div[2]/div/div/div/div/input")).sendKeys("No.1, New Street");
	        			wd.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[3]/div[3]/div/div/div/div/input")).sendKeys("600008");
	        			wd.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[4]/div[2]/div[1]/div[1]/div/input")).sendKeys("9999999999");
	        			wd.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[4]/div[2]/div[2]/div/div/input")).sendKeys("priya@gmail.com");
	        			Thread.sleep(2000);
	        			 
	        			js.executeScript("window.scrollTo(0,1349)");
	        			Thread.sleep(2000);
	        			wd.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[5]/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("Priya123");
	        			Thread.sleep(2000);
	        			 
	        			wd.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[8]/button")).click();
	        			Thread.sleep(2000);
	        			
	        			//error
	        			wd.findElement(By.xpath("/html/body/div[2]/div/section/div[2]/div/div/span")).click();
	        			
	        			//train module button
	        			js.executeScript("window.scrollTo(0,-1349)");
	        			wd.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/ul/li[3]/a")).click(); 
	        			Thread.sleep(2000);
	        			System.out.println("search train module over");
	        			
	        			//PNR status button
	        			wd.findElement(By.xpath("//span[contains(text(),'PNR Status')]")).click();
	        				
	        		    Set <String> window = wd.getWindowHandles();
	        			Iterator <String> it = window.iterator(); 
	        			String parentWindow = it.next();
	        			String childWindow1 = it.next(); 
	        			
	        				
	        			//PNR Page
	        			wd.switchTo().window(childWindow1);
	        			Thread.sleep(1000);
	        				
	        			wd.findElement(By.name("pnr_code")).sendKeys("1123456778");
	        			wd.findElement(By.xpath("//h2[contains(text(),'Check PNR Status')]")).click();
	        			wd.navigate().back();
	        			wd.close();
	        			
	        			wd.switchTo().window(parentWindow);	
	        			wd.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/ul/li[3]/a")).click();
	        			System.out.println("PNR status module over");
	        			
	        			//Live Status button
	        			wd.findElement(By.xpath("//span[contains(text(),'Live train status')]")).click();
	        			Thread.sleep(2000);
	        				
	        			Set <String> window1 = wd.getWindowHandles();
	        			Iterator <String> it1 = window1.iterator(); 
	        			String parentWindow1 = it1.next();
	        			String childWindow11 = it1.next(); 
	        			
	        			//LIVE STATUS Page
	        			wd.switchTo().window(childWindow11);
	        				
	        			//check train status
	        			wd.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/section/div[1]/div/input")).sendKeys("16127");
	        			Thread.sleep(1000);
	        			wd.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/section/div[1]/div/div/div/ul/li/div/div/div/span")).click();
	        			wd.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/section/div[3]/div/div/div/div[1]/button[2]")).click();
	        			wd.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).click();
	        			wd.close();
	        			
	        			wd.switchTo().window(parentWindow1);
	        			wd.findElement(By.xpath("/html/body/div[1]/div/div/header/ul/li[3]/a")).click();
	        			System.out.println("live status module over");
	        			Thread.sleep(1000);
	        				 
	        			//View Train Coach position
	        			wd.findElement(By.xpath("//span[contains(text(),'View train coach position')]")).click();
	        					

	        			Set <String> window4 = wd.getWindowHandles();
	        			Iterator <String> it4 = window4.iterator(); 
	        			String parentWindow4 = it4.next();
	        			String childWindow4 = it4.next(); 
	        					
	        			wd.switchTo().window(childWindow4);
	        			Thread.sleep(1000);
	        					
	        			wd.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/div/div[1]/div/input")).sendKeys("23226");
	        			Thread.sleep(2000);
	        			wd.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/div/div[1]/div/div/div/ul/li/div/div/div/span")).click();
	        			Thread.sleep(2000);
	        			wd.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[3]/div/button")).click();
	        			wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/section[1]/div/div/a/button")).click();
	        			wd.close();
	        					
	        			wd.switchTo().window(parentWindow4);
	        			wd.findElement(By.xpath("/html/body/div[1]/div/div/header/ul/li[3]/a")).click();
	        			Thread.sleep(2000); 
	        			
	        			//PLATFORM LOCATOR
	        			wd.findElement(By.xpath("//span[contains(text(),'Platform Locator')]")).click();
	        			Thread.sleep(2000);
	        		
	        	    	Set <String> window5 = wd.getWindowHandles();
	        			Iterator <String> it5 = window5.iterator(); 
	        			String parentWindow5 = it5.next();
	        			String childWindow15 = it5.next(); 
	        			
	        			wd.switchTo().window(childWindow15);
	        			Thread.sleep(1000);
	        			
	        			wd.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/section/div[1]/div/input")).sendKeys("23226");
	        			Thread.sleep(2000);
	        			wd.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/section/div[1]/div/div/div/ul/li/div/div/div/span")).click();
	        			Thread.sleep(2000);
	        			
	        			wd.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/section/div[2]/div/label/div/input")).click();
	        		    wd.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/section/div[2]/div/label/div/div/div/ul/li[1]/span/span")).click();
	        			Thread.sleep(2000);
	        		    wd.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).click();
	        		    wd.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/section[2]/ul[1]/li[1]/a[2]/button[1]")).click();
	        		    wd.close();
	        		    
	        		    wd.switchTo().window(parentWindow5);
	        		    wd.findElement(By.xpath("/html/body/div[1]/div/div/header/ul/li[3]/a")).click();
	        		    Thread.sleep(2000);
	        			
	        			//Forgot IRCTC password
	        			js.executeScript("window.scrollTo(0,500)");
	        			Thread.sleep(1000);
	        				
	        			wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/section/section[4]/div/aside[1]/div/a/span")).click();
	        				
	        			Set <String> window2 = wd.getWindowHandles();
	        			Iterator <String> it2 = window2.iterator(); 
	        			String parentWindow2 = it2.next();
	        			String childWindow2 = it2.next();
	        				
	        			//Forgot password page
	        			wd.switchTo().window(childWindow2);
	        					
	        			js.executeScript("window.scrollTo(0,200)");
	        			Thread.sleep(1000);
	        			wd.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("priya123");
	        			wd.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("9999999999");
	        			wd.findElement(By.xpath("/html/body/div[2]/div[1]/section/div/div[4]/div[1]/button")).click();
	        			Thread.sleep(2000);
	        			wd.close();
	        			
	        			wd.switchTo().window(parentWindow2);
	        			wd.findElement(By.xpath("/html/body/div[1]/div/div/header/ul/li[3]/a")).click(); 
	        			
	        			
	        			//Forgot IRCTC user
	        			js.executeScript("window.scrollTo(0,500)");
	        			
	        			Thread.sleep(1000);
	        			wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/section/section[4]/div/aside[2]/div/a/span")).click();
	        			 

	        			Set <String> window3 = wd.getWindowHandles();
	        			Iterator <String> it3 = window3.iterator(); 
	        			String parentWindow3 = it3.next();
	        			String childWindow3 = it3.next();
	        			
	        			wd.switchTo().window(childWindow3);
	        				
	        			wd.findElement(By.xpath("//*[@id=\"registered_id\"]")).sendKeys("abc@gmail.com");
	        			wd.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("01/01/1996");
	        			Thread.sleep(2000);
	        			wd.findElement(By.xpath("/html/body/div[2]/div[1]/section/section/div/div[3]/div[1]/button")).click();
	        			wd.close();
	        			
	        			wd.switchTo().window(parentWindow3); 
	        			
	        			
	        				    
	        				    //Automating cab module
	        				    

	        				    //Driver clicks on the cab option to get access on it
	        				    wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/ul[1]/li[4]/a[1]")).click();
	        				    System.out.println("cab module was Automated");
	        				    Thread.sleep(2000);

	        				    //To Automate the Third radio button
	        				    wd.findElement(By.xpath("//body/div[@id='root']/section[1]/section[1]/section[1]/section[1]/div[1]/label[3]/div[1]/span[1]")).click();
	        				    System.out.println("Third radio button is Automated");
	        				    
	        				    //From
	        				    wd.findElement(By.id("downshift-1-input")).sendKeys("Chennai, Tamil Nadu, India", Keys.ENTER);
	        				    Thread.sleep(2000);
	        				    wd.findElement(By.xpath("//body/div[@id='root']/section[1]/section[1]/section[1]/section[1]/div[2]/section[1]/div[1]/div[1]/li[1]/div[1]")).click();
	        				    
	        				    //To
	        				    wd.findElement(By.id("downshift-2-input")).sendKeys("Bangalore, Karnataka, India", Keys.ENTER);
	        				    Thread.sleep(2000);
	        				    wd.findElement(By.xpath("//body/div[@id='root']/section[1]/section[1]/section[1]/section[1]/div[3]/section[1]/div[1]/div[1]/li[1]")).click();
	        				
	        				    //Pickup date
	        				    wd.findElement(By.xpath("//span[contains(text(),\"07 Jun' 21\")]")).click();
	        				    Thread.sleep(2000);
	        				    wd.findElement(By.xpath("//span[contains(text(),'23')]")).click();
	        				    Thread.sleep(2000);
	        				    
	        				    //search cab
	        				    wd.findElement(By.xpath("//button[contains(text(),'SEARCH CABS')]")).click();
	        				    System.out.println("Search button is clicked");
	        				    
	        				    wd.manage().window().maximize();
	        					JavascriptExecutor js1 = (JavascriptExecutor)wd;
	        					js1.executeScript("window.scrollTo(0,500)");
	        				    Thread.sleep(2000);
	        				    
	        					//select
	        					wd.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div[2]/div[2]/div/span/button")).click();
	        					Thread.sleep(2000);
	        					System.out.println("select button is clicked");
	        					wd.manage().window().maximize();
	        					js1.executeScript("window.scrollTo(0,1000)");
	        					Thread.sleep(2000);
	        					  
	        					
	        					//Gender
	        					Select s = new Select(wd.findElement(By.id("gender")));
	        					s.selectByVisibleText("Miss");
	        					Thread.sleep(2000);
	        					
	        					//Name
	        					wd.findElement(By.xpath("//body/div[@id='root']/div[2]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Lakshmi");
	        					
	        					//phone number
	        					wd.findElement(By.xpath("//body/div[@id='root']/div[2]/div[3]/div[1]/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys("9876543210");
	        					
	        					//Email
	        					wd.findElement(By.xpath("//body/div[@id='root']/div[2]/div[3]/div[1]/div[4]/div[2]/div[3]/div[1]/input[1]")).sendKeys("lakshmi@gmail.com");
	        					Thread.sleep(2000);
	        					
	        					//pay button
	        					wd.findElement(By.id("paymentButton")).click();
	        					System.out.println("pay button clicked");
	        					
	        					js1.executeScript("window.scrollTo(0,-1000)");
	        					Thread.sleep(2000);
	        					wd.findElement(By.linkText("Cabs")).click();
	        					Thread.sleep(2000);
	        					
	        					//latest update
	        					wd.findElement(By.xpath("//body/div[@id='root']/section[1]/section[1]/section[1]/div[1]/div[2]/ul[1]/li[1]/img[1]")).click();
	        					
	        					Set <String> window11 = wd.getWindowHandles();
	        					Iterator <String> it11 = window11.iterator(); 
	        					String parentWindow11 = it11.next();
	        					String childWindow111 = it11.next(); 
	        										
	        					//Travel soon
	        					wd.switchTo().window(childWindow111);
	        					Thread.sleep(1000);
	        					js1.executeScript("window.scrollTo(0,500)");
	        					Thread.sleep(2000);
	        					System.out.println("Travel soon page");
	        					
	        					//karnataka
	        					wd.findElement(By.xpath("//span[contains(text(),'Karnataka')]")).click();
	        					Thread.sleep(2000);
	        					
	        					//maharashtra
	        					wd.findElement(By.xpath("//span[contains(text(),'Maharashtra')]")).click();
	        					Thread.sleep(2000);
	        					
	        					//Gujarath
	        					wd.findElement(By.xpath("//span[contains(text(),'Gujarat')]")).click();
	        					Thread.sleep(2000);
	        					
	        					//madhya pradesh
	        					wd.findElement(By.xpath("//span[contains(text(),'Madhya Pradesh')]")).click();
	        					
	        					wd.close();
	        					wd.switchTo().window(parentWindow11);
	        					Thread.sleep(2000);
	        					
	        					//gosafe-cabs
	        					wd.findElement(By.xpath("//body/div[@id='root']/section[1]/section[1]/section[1]/div[1]/div[2]/ul[1]/li[2]/img[1]")).click();
	        					Thread.sleep(2000);
	        					
	        					Set <String> window111 = wd.getWindowHandles();
	        					Iterator <String> it111 = window111.iterator(); 
	        					String parentWindow111 = it111.next();
	        					String childWindow1111 = it111.next(); 
	        										
	        					//Check the Latest State-wise Travel Guidelines page
	        					wd.switchTo().window(childWindow1111);
	        					System.out.println("Check the Latest State-wise Travel Guidelines page");
	        					Thread.sleep(1000);
	        					js1.executeScript("window.scrollTo(0,2000)");
	        					Thread.sleep(1000);
	        					js1.executeScript("window.scrollTo(0,-2000)");
	        					
	        					wd.close();
	        					wd.switchTo().window(parentWindow111);
	        					Thread.sleep(2000);
	        					
	        					//explore
	        					wd.findElement(By.xpath("//h4[contains(text(),'Explore More')]")).click();
	        					Thread.sleep(2000);
	        					System.out.println("Explore button is clicked");
	        					
	        					js1.executeScript("window.scrollTo(0,1500)");
	        					Thread.sleep(2000);
	        					
	        					//Delhi To Jaipur Cab
	        					wd.findElement(By.linkText("Delhi To Jaipur Cab")).click();
	        					System.out.println("Delhi To Jaipur Cab");
	        					Thread.sleep(2000);
	        					wd.navigate().back();
	        					Thread.sleep(2000);
	        					
	        					//Delhi To Dehradun Cab
	        					wd.findElement(By.linkText("Delhi To Dehradun Cab")).click();
	        					System.out.println("Delhi To Dehradun Cab");
	        					Thread.sleep(2000);
	        					wd.navigate().back();
	        					Thread.sleep(2000);
	        					
	        					//Cab From Delhi
	        					wd.findElement(By.linkText("Cab From Delhi")).click();
	        					System.out.println("Cab From Delhi");
	        					Thread.sleep(2000);
	        					wd.navigate().back();
	        					Thread.sleep(2000);
	        					
	        					//Cab To Bangalore
	        					wd.findElement(By.linkText("Cab To Bangalore")).click();
	        					System.out.println("Cab To Bangalore");
	        					Thread.sleep(2000);
	        					wd.navigate().back();
	        					Thread.sleep(2000);
	        					
	        					//Cab To Patna
	        					wd.findElement(By.linkText("Cab To Patna")).click();
	        					System.out.println("Cab To Patna");
	        					Thread.sleep(2000);
	        					wd.navigate().back();
	        					Thread.sleep(2000);

	        					
	        					
	        					
	        				}

	        			

	        						}


