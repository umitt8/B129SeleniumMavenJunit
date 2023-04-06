package day07_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class c03_beforeAfter {
    WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }

    @Test
    public void test01() {
        driver.get("https://www.yotube.com");
    }

    @Test
    public void test02() {
        driver.get("https://www.amazon.com");
    }
}
