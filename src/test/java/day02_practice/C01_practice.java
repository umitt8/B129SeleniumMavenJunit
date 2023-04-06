package day02_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C01_practice {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        // arama kutusunun, tagName'inin 'input' oldugunu test ediniz
        WebElement aramaKutusu =driver.findElement(By.xpath(("//input[@id='twotabsearchtextbox']")));

        String actuelTagname = aramaKutusu.getTagName();

        String expectedTagname =" input";

        if(expectedTagname.equals(actuelTagname)){
            System.out.println("TAGNAME INPUT");
        }else
            System.out.println("TAGNAME INPUT DEGIL");

        // arama kutusunun, name attribute'nun degerinin 'field-keywords' oldugunu test edin
        String actuelNameDegeri =aramaKutusu.getAttribute("name");

        String expectedNameDegeri = "field-keywords";

        if (expectedNameDegeri.equals(actuelNameDegeri)){

            System.out.println("Name Attributenin Degeri field-keywords");
        }else {
            System.out.println("Name Attributenin Degeri field-keywords DEGIL ");
        }

        // sayfayi kapatiniz
        driver.close();
    }




}
