import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class WebDriverTest {
    @Test
    public void main() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        Dimension d = new Dimension(1296, 975);
        driver.manage().window().setSize(d);
        driver.get("https://openfx.by/#01");
        System.out.print("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+driver.manage().window().getSize()+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        WebElement searchInput = driver.findElement(By.cssSelector("#fullpage > section.section.fp-section.active.fp-table.fp-completely > div > div > div > div.header-top > div > div.header-link > a.span.enter"));
        Thread.sleep(4000);
        searchInput.click();
        searchInput = driver.findElement(By.cssSelector("#login > form > div:nth-child(1) > div.col-12.input-group > input"));
        Thread.sleep(4000);
        searchInput.sendKeys("333898719");
        searchInput = driver.findElement(By.cssSelector("#login > form > div:nth-child(2) > div:nth-child(1) > div > input:nth-child(1)"));
        searchInput.sendKeys("Aezakmi123");
        searchInput = driver.findElement(By.cssSelector("#login > form > div:nth-child(3) > div.col-12.text-center > button"));
        searchInput.click();
        searchInput = driver.findElement(By.cssSelector("#sidebar > div > ul > li:nth-child(1) > div > div.d-flex.align-items-center.multiple-menu-item.py-2.px-3 > i.fa.fa-caret-down.fa-lg.mr-2.ml-auto"));
        Thread.sleep(4000);
        searchInput.click();
        searchInput = driver.findElement(By.cssSelector("#outer-element-0 > ul > li:nth-child(2) > a"));
        Thread.sleep(4000);
        searchInput.click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,0)");
        searchInput = driver.findElement(By.cssSelector("#table-accounts > tbody > tr > td:nth-child(8) > div > button"));
        Thread.sleep(4000);
        searchInput.click();
        searchInput = driver.findElement(By.cssSelector("#table-accounts > tbody > tr > td:nth-child(8) > div > div > a:nth-child(1)"));
        Thread.sleep(4000);
        searchInput.click();
        searchInput = driver.findElement(By.cssSelector("#main-content > div > div.opasity-block > div.card-body > div.row.align-items-stretch.ml-2.mr-2 > div:nth-child(1) > div > div.col-md-8.p-3.align-content-stretch > table.table.borderless.d-sm-table.d-table > tbody > tr:nth-child(4) > td.d-none.d-sm-none.d-md-block.d-lg-block.d-xl-block.text-right > a"));
        Thread.sleep(4000);
        searchInput.click();
        searchInput = driver.findElement(By.cssSelector("table.table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(3) > a:nth-child(1)"));
        Thread.sleep(400000000);
        Thread.sleep(4000);
        searchInput.click();
        Thread.sleep(4000);

        driver.quit();
    }
}
