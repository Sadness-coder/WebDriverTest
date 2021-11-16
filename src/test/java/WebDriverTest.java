import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebDriverTest {
    @Test
    public void main() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        Dimension d = new Dimension(1296, 1010);
        driver.manage().window().setSize(d);
        driver.get("https://openfx.by/#01");
        System.out.print("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+driver.manage().window().getSize()+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        WebElement searchInput = driver.findElement(By.cssSelector("#fullpage > section.section.fp-section.active.fp-table.fp-completely > div > div > div > div.header-top > div > div.header-link > a.span.enter"));

        searchInput.click();
        Thread.sleep(1000);
        searchInput = driver.findElement(By.cssSelector("#login > form > div:nth-child(1) > div.col-12.input-group > input"));

        searchInput.sendKeys("333898719");
        Thread.sleep(1000);
        searchInput = driver.findElement(By.cssSelector("#login > form > div:nth-child(2) > div:nth-child(1) > div > input:nth-child(1)"));
        searchInput.sendKeys("Aezakmi123");
        searchInput = driver.findElement(By.cssSelector("#login > form > div:nth-child(3) > div.col-12.text-center > button"));
        searchInput.click();
        searchInput = driver.findElement(By.cssSelector("#sidebar > div > ul > li:nth-child(1) > div > div.d-flex.align-items-center.multiple-menu-item.py-2.px-3 > i.fa.fa-caret-down.fa-lg.mr-2.ml-auto"));

        searchInput.click();
        Thread.sleep(1000);
        searchInput = driver.findElement(By.cssSelector("#outer-element-0 > ul > li:nth-child(2) > a"));

        searchInput.click();
        Thread.sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(1000);
        searchInput = driver.findElement(By.cssSelector("div.row:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(8) > div:nth-child(1) > button:nth-child(1)"));
        searchInput.click();
        Thread.sleep(1000);
        searchInput = driver.findElement(By.cssSelector("#table-accounts > tbody > tr > td:nth-child(8) > div > div > a:nth-child(1)"));
        searchInput.click();
        Thread.sleep(1000);
        searchInput = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[2]/table[2]/tbody/tr[4]/td[3]/a"));
        searchInput.click();
        Thread.sleep(1000);
        searchInput = driver.findElement(By.cssSelector(".fixSyle2 > span:nth-child(4) > button:nth-child(1)"));
        searchInput.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
