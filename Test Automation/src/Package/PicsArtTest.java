package Package;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class PicsArtTest {
	static String xpath_PicsArt = "//*[@id=\"header-desktop\"]/div/div[1]/a/img";
	static String xpath_Blog = "//*[@id=\"header-desktop\"]/div/div[2]/nav/div[7]/a";
	static String xpath_Design_school = "//*[@id=\"__next\"]/div/div[1]/div/header/div/nav/ul/li[1]/a";
	static String xpath_Trends = "//*[@id=\"__next\"]/div/div[1]/div/header/div/nav/ul/li[2]/a";
	static String xpath_Picsart_Pro = "//*[@id=\"__next\"]/div/div[1]/div/header/div/nav/ul/li[3]/a";
	static String xpath_News = "//*[@id=\"__next\"]/div/div[1]/div/header/div/nav/ul/li[4]/a";
	static String xpath_Search = "//*[@id=\"__next\"]/div/div[1]/div/header/div/div[2]/div/form/button/i";
	static String xpath_Search_input_field = "//*[@id=\"__next\"]/div/div[1]/div/header/div/div[2]/div/form/input";
	static String xpath_Searched_data_to_verify = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/div/h2";
	static String xpath_Picsart_Blog = "//*[@id=\"__next\"]/div/div[1]/div/header/div/div[1]/a[2]";
	static String xpath_left_arrow_button = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/div[1]/div/div[1]/div/button[1]/i";
	static String xpath_right_arrow_button = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/div[1]/div/div[1]/div/button[2]/i/";
	static String classname_Cover = "main-carousel-item-root-0-2-34";
	static String classname_Cover_centeredContent = "main-carousel-item-centeredContent-0-2-38";
	static String xpath_Cover_Image = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/div[1]/div/div[1]/div/div[1]/a/span/img";
	static String classname_postTitle = "post-single-postTitle-0-2-222";
	static String classname_image_under_cover = "main-carousel-suggestions-itemHolder-0-2-143";
	
	static String PicsArt_url_to_verify = "https://picsart.com/";
	static String PicsArt_base_url = "https://picsart.com";
	static String Blog_url_to_verify = PicsArt_base_url+"/blog";
	static String Design_school_url_to_verify = PicsArt_base_url+"/blog/category/design-school"; 
	static String Trends_url_to_verify = PicsArt_base_url+"/blog/category/trends";
	static String Picsart_Pro_url_to_verify = PicsArt_base_url+"/blog/category/picsart-pro";
	static String News_url_to_verify = PicsArt_base_url+"/blog/category/news";
	static String Search_url_to_verify = PicsArt_base_url+"/blog/search?s=";
	static String Post_url_to_verify = PicsArt_base_url+"/blog/post/";
	
	static Logger log = LogManager.getLogger(PicsArtTest.class);
	
    public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver 3");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();

		int Delay_time = 3000;

		int Retry_count = 3;
		for (int i = 1; i <= Retry_count; i++) {
			try {
				driver.get(PicsArt_base_url);
				log.info("browser opened on " + PicsArt_base_url);
				log.info("Test 1 - Verify Blog, Design School, Trends, Picsart Pro, News, Search buttons: try #" + i);
				WebElement PicsArt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_PicsArt)));
				PicsArt.click();
				Thread.sleep(Delay_time);
				String PicsArt_url = driver.getCurrentUrl();
				if(!PicsArt_url_to_verify.equals(PicsArt_url)) {
					log.error("PicsArt button navigated to url " + PicsArt_url + " instead of " + PicsArt_url_to_verify);
				}
				WebElement Blog = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_Blog)));
				Blog.click();
				Thread.sleep(Delay_time);
				String Blog_url = driver.getCurrentUrl();
				if(!Blog_url_to_verify.equals(Blog_url)) {
					log.error("Blog button navigated to url " + Blog_url + " instead of " + Blog_url_to_verify);
					continue;
				}
				WebElement Design_school = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_Design_school)));
				Design_school.click();
				Thread.sleep(Delay_time);
				String Design_school_url = driver.getCurrentUrl();
				if(!Design_school_url_to_verify.equals(Design_school_url)) {
					log.error("Design School button navigated to url " + Design_school_url + " instead of " + Design_school_url_to_verify);
					continue;
				}
				WebElement Trends = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_Trends)));
				Trends.click();
				Thread.sleep(Delay_time);
				String Trends_url = driver.getCurrentUrl();
				if(!Trends_url_to_verify.equals(Trends_url)) {
					log.error("Trends button navigated to url " + Trends_url + " instead of " + Trends_url_to_verify);
					continue;
				}

				WebElement Picsart_Pro = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_Picsart_Pro)));
				Picsart_Pro.click();
				Thread.sleep(Delay_time);
				String Picsart_Pro_url = driver.getCurrentUrl();
				if(!Picsart_Pro_url_to_verify.equals(Picsart_Pro_url)) {
					log.error("Picsart Pro button navigated to url " + Picsart_Pro_url + " instead of " + Picsart_Pro_url_to_verify);
					continue;
				}

				WebElement News = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_News)));
				News.click();
				Thread.sleep(Delay_time);
				String News_url = driver.getCurrentUrl();
				if(!News_url_to_verify.equals(News_url)) {
					log.error("News button navigated to url " + News_url + " instead of " + News_url_to_verify);
					continue;
				}

				WebElement Search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_Search)));
				actions.moveToElement(Search).perform();
				WebElement Search_input_field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_Search_input_field)));
				String search_data = "dog";
				Search_input_field.sendKeys(search_data);
				Search.click();
				Thread.sleep(Delay_time);
				String Search_url = driver.getCurrentUrl();
				if(!(Search_url_to_verify+search_data).equals(Search_url)) {
					log.error("Search button navigated to url " + Search_url + " instead of " + Search_url_to_verify);
					continue;
				}
				WebElement Searched_data_to_verify = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_Searched_data_to_verify)));
				if(!(Searched_data_to_verify.getText()).equals(search_data)) {
					log.error("Search functionality did not work correctly");
					continue;
				}
			}
			catch (Exception ex){
				log.error(ex.getMessage());
				continue;
			}
			log.info("Test 1 finished without errors at try #" + i);
			break;
		}
		
		Retry_count = 3;
		for (int i = 1; i <= Retry_count; i++) {
			try {
				driver.get(PicsArt_base_url);
				log.info("browser opened on " + PicsArt_base_url);
				log.info("Test 2 - Verify post images on PicsArt Blog: try #" + i);
				WebElement PicsArt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_PicsArt)));
				PicsArt.click();
				Thread.sleep(Delay_time);
				String PicsArt_url = driver.getCurrentUrl();
				if(!PicsArt_url_to_verify.equals(PicsArt_url)) {
					log.error("PicsArt button navigated to url " + PicsArt_url + " instead of " + PicsArt_url_to_verify);
				}
				WebElement Blog = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_Blog)));
				Blog.click();
				Thread.sleep(Delay_time);
				String Blog_url = driver.getCurrentUrl();
				if(!Blog_url_to_verify.equals(Blog_url)) {
					log.error("Blog button navigated to url " + Blog_url + " instead of " + Blog_url_to_verify);
					continue;
				}
				WebElement Cover = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(classname_Cover)));
				actions.moveToElement(Cover).perform();
				WebElement Left_Arrow = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_left_arrow_button)));
				Left_Arrow.click();
				Thread.sleep(Delay_time);
				WebElement Cover_centeredContent = wait.until(ExpectedConditions.elementToBeClickable(By.className(classname_Cover_centeredContent)));
				WebElement Cover_Image = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_Cover_Image)));
				Cover_centeredContent.click();
				String Post_Title_to_verify = Cover_Image.getAttribute("alt");				
				Thread.sleep(Delay_time);
				String Post_url = driver.getCurrentUrl();
				if(!(Post_url_to_verify + Post_Title_to_verify).equals(Post_url)) {
					log.error("Clicking on post navigated to url " + Post_url + " instead of " + Post_url_to_verify + Post_Title_to_verify);
					continue;
				}
				
				Blog = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_Picsart_Blog)));
				Blog.click();
				Thread.sleep(Delay_time);
				Blog_url = driver.getCurrentUrl();
				if(!Blog_url_to_verify.equals(Blog_url)) {
					log.error("Blog button navigated to url " + Blog_url + " instead of " + Blog_url_to_verify);
					continue;
				}
				WebElement Image_under_cover = wait.until(ExpectedConditions.elementToBeClickable(By.className(classname_image_under_cover)));
				Image_under_cover.click();
				log.info(Image_under_cover);
			}
			catch (Exception ex){
				log.error(ex.getMessage());
				continue;
			}
			log.info("Test 2 finished without errors at try #" + i);
			break;
		}

		driver.close();
	}
}

