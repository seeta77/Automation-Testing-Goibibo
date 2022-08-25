import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class goibibo1 {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\KOMAL\\\\Desktop\\\\selenium jar\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver w= new ChromeDriver();
		w.get("https://www.goibibo.com/");
		
		
		w.findElement(By.id("roundTrip")).click();//select the round trip option
		
		WebElement ele= w.findElement(By.cssSelector("input[id='gosuggest_inputSrc']"));//source
		ele.sendKeys("Pune");
		Thread.sleep(2000);
		ele.sendKeys(Keys.ARROW_DOWN);
		ele.sendKeys(Keys.ENTER);
		
		WebElement ele2=w.findElement(By.cssSelector("input[id='gosuggest_inputDest']"));//destination
		ele2.sendKeys("Mumbai");
		Thread.sleep(2000);
		ele2.sendKeys(Keys.ARROW_DOWN);
		ele2.sendKeys(Keys.ENTER);
		
		//Departure		
		w.findElement(By.id("departureCalendar")).click();
		Thread.sleep(2000);
		
	while(!w.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]/div[1]/div[1]/div[1]/div/div[6]/div/div/div/div[2]/div/div[1]")).getText().contains("June"))

		{
		
		w.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]/div[1]/div[1]/div[1]/div/div[6]/div/div/div/div[1]/span[2]")).click();
		  }
		
		
	List<WebElement> datelist=w.findElements(By.className("calDate"));
	int count=datelist.size();

        for(int i=0;i<count;i++) 
          {

                  String text=w.findElements(By.className("calDate")).get(i).getText();

                  System.out.println("text is"+text);  
 
                    if(text.equalsIgnoreCase("24"))
	
                     {
                      	w.findElements(By.className("calDate")).get(i).click();
                        break;
                     }
 
	      }
//Return
        
        w.findElement(By.id("returnCalendar")).click();
		Thread.sleep(2000);
		
	while(!w.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]/div[1]/div[1]/div[1]/div/div[8]/div/div/div/div[2]/div/div[1]")).getText().contains("July"))

		{
		
		w.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]/div[1]/div[1]/div[1]/div/div[8]/div/div/div/div[1]/span[2]")).click();
		  }
		
		
	List<WebElement> datelist1=w.findElements(By.className("calDate"));
	int count1=datelist1.size();

        for(int i=0;i<count1;i++) 
          {

                  String text1=w.findElements(By.className("calDate")).get(i).getText();

                  System.out.println("text is"+text1);  
 
                    if(text1.equalsIgnoreCase("24"))
	
                     {
                      	w.findElements(By.className("calDate")).get(i).click();
                        break;
                     }
 
	      }
        
        
        //Search
        
        w.findElement(By.id("gi_search_btn")).click();
        
        //departure time
        
       // w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[3]/div[2]/div[1]/div[1]")).click();
        Thread.sleep(2000);
        w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[4]/div[1]/div[1]/div/div/div/div/div/div[2]/div[1]/div[2]/a/span")).click();//flight details
        Thread.sleep(2000);
        w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[4]/div[1]/div[1]/div/div/div/div/div/div[1]/div[2]/div/div")).click();
	//     w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[1]/div/div[2]/span[2]/input")).click();    To book the ticket
	
     //Started Automating Hotels module
        		
        	
        		Thread.sleep(2000);
        		
        		w.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/ul/li[2]/a")).click();//hotel tab
        		w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div/div[1]/div[1]/input")).click();
        		w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div/div[2]/div")).click();
        		WebElement ele21= w.findElement(By.cssSelector("input[id='downshift-1-input']"));//source
        		ele21.sendKeys("Mumbai");
        		Thread.sleep(2000);
        		ele21.sendKeys(Keys.ARROW_DOWN);
        		ele21.sendKeys(Keys.ENTER);
        		
        		//date
        		
        		
        		 w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div/div[3]/div/div[1]/div/h4")).click();
        			Thread.sleep(2000);
        			
        		while(!w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div/div[1]/div")).getText().contains("July"))

        			{
        			System.out.println("in while");
        			w.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div")).click();
        			System.out.println("out while"); 
        			}
        			
        			
        		List<WebElement> datelist11=w.findElements(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div/div[2]/div/div/ul[2]"));
        		int count11=datelist11.size();

        	        for(int i=0;i<count11;i++) 
        	          {

        	                  String text1=w.findElements(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div/div[2]/div/div/ul[2]")).get(i).getText();

        	                  System.out.println("text is"+text1);  
        	 
        	                    if(text1.equalsIgnoreCase("10"))
        		
        	                     {
        	                      	w.findElements(By.xpath("//*[@id=\"root\"]/div[2]/div/section[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div/div[2]/div/div/ul[2]")).get(i).click();
        	                        break;
        	                     }
        	 
        		      }
        			
        	        
        	        		//Automating Train module	
        	        			//From
        	        			w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/section[1]/section[1]/section[1]/aside[1]/label[1]/div[1]/div[1]/input[1]")).sendKeys("MSB, Chennai Beach Railway Station", Keys.ENTER);
        	        			 Thread.sleep(2000);
        	        			 w.findElement(By.xpath("/html/body/div[2]/div[1]/div/section/section[1]/section[1]/aside[1]/label[1]/div/div/div/ul/li")).click();
        	        			 
        	        			 //To
        	        			 w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/section[1]/section[1]/section[1]/aside[1]/label[2]/div[1]/div[1]/input[1]")).sendKeys("NZM, Hazrat Nizamuddin Railway Station", Keys.ENTER);
        	        			 Thread.sleep(2000);
        	        			 w.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/section[1]/section[1]/section[1]/aside[1]/label[2]/div[1]/div[1]/div[1]/ul[1]/li[1]")).click();
        	        			 
        	        			//radio
        	        			w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/section[1]/section[1]/section[1]/aside[3]/div[2]/div[1]/label[2]/span[1]/input[1]")).click();
        	        			 
        	        			//search train
        	        			w.findElement(By.xpath("//button[contains(text(),'Search Trains')]")).click();
        	        			 
        	        			//AVL-40
        	        			w.findElement(By.xpath("//li[contains(text(),'AC Only')]")).click();
        	        			w.findElement(By.xpath("//li[contains(text(),'Late Depart (After 6 pm)')]")).click();	 
        	        			w.findElement(By.xpath("//body/div[@id='app']/div[@id='srpPageWrap']/section[2]/section[2]/section[1]/aside[1]/div[2]/label[1]/span[1]")).click();
        	        			Thread.sleep(2000);
        	        			w.findElement(By.xpath("//p[contains(text(),'AVL-40')]")).click();
        	        			Thread.sleep(2000);
        	        			 
        	        			 //proceed
        	        			w.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click(); 
        	        			Thread.sleep(2000);
        	        			
        	        			//pay
        	        			w.manage().window().maximize();
        	        			JavascriptExecutor js = (JavascriptExecutor)w;
        	        			js.executeScript("window.scrollTo(0,500)");
        	        			 
        	        			Thread.sleep(2000);
        	        			w.findElement(By.xpath("//div[contains(text(),'Female')]")).click();
        	        			w.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[2]/div[3]/div[1]/div[2]/div[2]/input")).sendKeys("Priya");
        	        			w.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[2]/div[3]/div[1]/div[3]/div[2]/div/input")).sendKeys("25");
        	        			w.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[2]/div[3]/div[2]/div/div")).click();
        	        			w.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[2]/div[3]/div[2]/div/div[2]/div/ul/li[4]")).click();
        	        			w.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[2]/div[4]/div/button")).click();
        	        			Thread.sleep(2000);
        	        			 
        	        			w.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[3]/div[2]/div/div/div/div/input")).sendKeys("No.1, New Street");
        	        			w.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[3]/div[3]/div/div/div/div/input")).sendKeys("600008");
        	        			w.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[4]/div[2]/div[1]/div[1]/div/input")).sendKeys("9999999999");
        	        			w.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[4]/div[2]/div[2]/div/div/input")).sendKeys("priya@gmail.com");
        	        			Thread.sleep(2000);
        	        			 
        	        			js.executeScript("window.scrollTo(0,1349)");
        	        			Thread.sleep(2000);
        	        			w.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[5]/div[2]/div[1]/div[2]/div[1]/input")).sendKeys("Priya123");
        	        			Thread.sleep(2000);
        	        			 
        	        			w.findElement(By.xpath("/html/body/div[2]/div/section/section[2]/section[2]/section[1]/div[8]/button")).click();
        	        			Thread.sleep(2000);
        	        			
        	        			//error
        	        			w.findElement(By.xpath("/html/body/div[2]/div/section/div[2]/div/div/span")).click();
        	        			
        	        			//train module button
        	        			js.executeScript("window.scrollTo(0,-1349)");
        	        			w.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/ul/li[3]/a")).click(); 
        	        			Thread.sleep(2000);
        	        			System.out.println("search train module over");
        	        			
        	        			//PNR status button
        	        			w.findElement(By.xpath("//span[contains(text(),'PNR Status')]")).click();
        	        				
        	        		    Set <String> window = w.getWindowHandles();
        	        			Iterator <String> it = window.iterator(); 
        	        			String parentWindow = it.next();
        	        			String childWindow1 = it.next(); 
        	        			
        	        				
        	        			//PNR Page
        	        			w.switchTo().window(childWindow1);
        	        			Thread.sleep(1000);
        	        				
        	        			w.findElement(By.name("pnr_code")).sendKeys("1123456778");
        	        			w.findElement(By.xpath("//h2[contains(text(),'Check PNR Status')]")).click();
        	        			w.navigate().back();
        	        			w.close();
        	        			
        	        			w.switchTo().window(parentWindow);	
        	        			w.findElement(By.xpath("/html/body/div[1]/div[1]/div/header/ul/li[3]/a")).click();
        	        			System.out.println("PNR status module over");
        	        			
        	        			//Live Status button
        	        			w.findElement(By.xpath("//span[contains(text(),'Live train status')]")).click();
        	        			Thread.sleep(2000);
        	        				
        	        			Set <String> window1 = w.getWindowHandles();
        	        			Iterator <String> it1 = window1.iterator(); 
        	        			String parentWindow1 = it1.next();
        	        			String childWindow11 = it1.next(); 
        	        			
        	        			//LIVE STATUS Page
        	        			w.switchTo().window(childWindow11);
        	        				
        	        			//check train status
        	        			w.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/section/div[1]/div/input")).sendKeys("16127");
        	        			Thread.sleep(1000);
        	        			w.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/section/div[1]/div/div/div/ul/li/div/div/div/span")).click();
        	        			w.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/section/div[3]/div/div/div/div[1]/button[2]")).click();
        	        			w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).click();
        	        			w.close();
        	        			
        	        			w.switchTo().window(parentWindow1);
        	        			w.findElement(By.xpath("/html/body/div[1]/div/div/header/ul/li[3]/a")).click();
        	        			System.out.println("live status module over");
        	        			Thread.sleep(1000);
        	        				 
        	        			//View Train Coach position
        	        			w.findElement(By.xpath("//span[contains(text(),'View train coach position')]")).click();
        	        					

        	        			Set <String> window4 = w.getWindowHandles();
        	        			Iterator <String> it4 = window4.iterator(); 
        	        			String parentWindow4 = it4.next();
        	        			String childWindow4 = it4.next(); 
        	        					
        	        			w.switchTo().window(childWindow4);
        	        			Thread.sleep(1000);
        	        					
        	        			w.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/div/div[1]/div/input")).sendKeys("23226");
        	        			Thread.sleep(2000);
        	        			w.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/div/div[1]/div/div/div/ul/li/div/div/div/span")).click();
        	        			Thread.sleep(2000);
        	        			w.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[3]/div/button")).click();
        	        			w.findElement(By.xpath("/html/body/div[2]/div/div[2]/section[1]/div/div/a/button")).click();
        	        			w.close();
        	        					
        	        			w.switchTo().window(parentWindow4);
        	        			w.findElement(By.xpath("/html/body/div[1]/div/div/header/ul/li[3]/a")).click();
        	        			Thread.sleep(2000); 
        	        			
        	        			//PLATFORM LOCATOR
        	        			w.findElement(By.xpath("//span[contains(text(),'Platform Locator')]")).click();
        	        			Thread.sleep(2000);
        	        		
        	        	    	Set <String> window5 = w.getWindowHandles();
        	        			Iterator <String> it5 = window5.iterator(); 
        	        			String parentWindow5 = it5.next();
        	        			String childWindow15 = it5.next(); 
        	        			
        	        			w.switchTo().window(childWindow15);
        	        			Thread.sleep(1000);
        	        			
        	        			w.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/section/div[1]/div/input")).sendKeys("23226");
        	        			Thread.sleep(2000);
        	        			w.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/section/div[1]/div/div/div/ul/li/div/div/div/span")).click();
        	        			Thread.sleep(2000);
        	        			
        	        			w.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/section/div[2]/div/label/div/input")).click();
        	        		    w.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/section/div[2]/div/label/div/div/div/ul/li[1]/span/span")).click();
        	        			Thread.sleep(2000);
        	        		    w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")).click();
        	        		    w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/section[2]/ul[1]/li[1]/a[2]/button[1]")).click();
        	        		    w.close();
        	        		    
        	        		    w.switchTo().window(parentWindow5);
        	        		    w.findElement(By.xpath("/html/body/div[1]/div/div/header/ul/li[3]/a")).click();
        	        		    Thread.sleep(2000);
        	        			
        	        			//Forgot IRCTC password
        	        			js.executeScript("window.scrollTo(0,500)");
        	        			Thread.sleep(1000);
        	        				
        	        			w.findElement(By.xpath("/html/body/div[2]/div[1]/div/section/section[4]/div/aside[1]/div/a/span")).click();
        	        				
        	        			Set <String> window2 = w.getWindowHandles();
        	        			Iterator <String> it2 = window2.iterator(); 
        	        			String parentWindow2 = it2.next();
        	        			String childWindow2 = it2.next();
        	        				
        	        			//Forgot password page
        	        			w.switchTo().window(childWindow2);
        	        					
        	        			js.executeScript("window.scrollTo(0,200)");
        	        			Thread.sleep(1000);
        	        			w.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("priya123");
        	        			w.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("9999999999");
        	        			w.findElement(By.xpath("/html/body/div[2]/div[1]/section/div/div[4]/div[1]/button")).click();
        	        			Thread.sleep(2000);
        	        			w.close();
        	        			
        	        			w.switchTo().window(parentWindow2);
        	        			w.findElement(By.xpath("/html/body/div[1]/div/div/header/ul/li[3]/a")).click(); 
        	        			
        	        			
        	        			//Forgot IRCTC user
        	        			js.executeScript("window.scrollTo(0,500)");
        	        			
        	        			Thread.sleep(1000);
        	        			w.findElement(By.xpath("/html/body/div[2]/div[1]/div/section/section[4]/div/aside[2]/div/a/span")).click();
        	        			 

        	        			Set <String> window3 = w.getWindowHandles();
        	        			Iterator <String> it3 = window3.iterator(); 
        	        			String parentWindow3 = it3.next();
        	        			String childWindow3 = it3.next();
        	        			
        	        			w.switchTo().window(childWindow3);
        	        				
        	        			w.findElement(By.xpath("//*[@id=\"registered_id\"]")).sendKeys("abc@gmail.com");
        	        			w.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("01/01/1996");
        	        			Thread.sleep(2000);
        	        			w.findElement(By.xpath("/html/body/div[2]/div[1]/section/section/div/div[3]/div[1]/button")).click();
        	        			w.close();
        	        			
        	        			w.switchTo().window(parentWindow3); 
        	        			w.close();
        	        					
        	        	}

        	        


	}


