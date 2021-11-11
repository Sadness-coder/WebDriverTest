import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class WebDriverTest {
    @Test
    public void main() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://openfx.by/#01");
        System.out.print("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+driver.manage().window().getSize()+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        WebElement searchInput = driver.findElement(By.cssSelector("#fullpage > section.section.fp-section.active.fp-table.fp-completely > div > div > div > div.header-top > div > div.header-link > a.span.enter"));
        Thread.sleep(1000);
        searchInput.click();
        searchInput = driver.findElement(By.cssSelector("#login > form > div:nth-child(1) > div.col-12.input-group > input"));
        Thread.sleep(1000);
        searchInput.sendKeys("333898719");
        searchInput = driver.findElement(By.cssSelector("#login > form > div:nth-child(2) > div:nth-child(1) > div > input:nth-child(1)"));
        searchInput.sendKeys("Aezakmi123");
        searchInput = driver.findElement(By.cssSelector("#login > form > div:nth-child(3) > div.col-12.text-center > button"));
        Thread.sleep(1000);
        searchInput.click();
        searchInput = driver.findElement(By.cssSelector("#sidebar > div > ul > li:nth-child(1) > div > div.d-flex.align-items-center.multiple-menu-item.py-2.px-3 > i.fa.fa-caret-down.fa-lg.mr-2.ml-auto"));
        Thread.sleep(1000);
        searchInput.click();
        searchInput = driver.findElement(By.cssSelector("#outer-element-0 > ul > li:nth-child(2) > a"));
        Thread.sleep(1000);
        searchInput.click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,0)");
        searchInput = driver.findElement(By.cssSelector("#table-accounts > tbody > tr > td:nth-child(8) > div > button > span"));
        Thread.sleep(1000);
        searchInput.click();
        searchInput = driver.findElement(By.cssSelector("#table-accounts > tbody > tr > td:nth-child(8) > div > div > a:nth-child(1)"));
        Thread.sleep(1000);
        searchInput.click();
        searchInput = driver.findElement(By.cssSelector("#main-content > div > div.opasity-block > div.card-body > div.row.align-items-stretch.ml-2.mr-2 > div:nth-child(1) > div > div.col-md-8.p-3.align-content-stretch > table.table.borderless.d-sm-table.d-table > tbody > tr:nth-child(4) > td.d-none.d-sm-none.d-md-block.d-lg-block.d-xl-block.text-right > a"));
        Thread.sleep(1000);
        searchInput.click();
        searchInput = driver.findElement(By.cssSelector("#main-content > div > div.opasity-block > div.card-body > div.row.align-items-stretch.ml-2.mr-2 > div:nth-child(1) > div > div.col-md-8.p-3.align-content-stretch > table.table.borderless.d-sm-table.d-none > tbody > tr:nth-child(4) > td:nth-child(2) > div > span.input-group-append > button.btn.btn-success"));
        Thread.sleep(1000);
        searchInput.click();
        Thread.sleep(2000);
        driver.quit();
    }
}