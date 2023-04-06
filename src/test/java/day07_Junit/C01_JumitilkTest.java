package day07_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C01_JumitilkTest {

    @Test
    public void test01(){
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
       // WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
       // eger chrom kullaniliyorsa parantez icine eklentiyi yazmak gerekiyor
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://tecproeducation.com");
        driver.close();
    }

    @Test
    public void test02() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
        driver.close();

    }

}
