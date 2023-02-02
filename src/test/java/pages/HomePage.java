package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import suport.Utils;

public class HomePage extends Utils {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void acessarAplicacao(String site){
        driver.get(site);
    }

    public void preencherEmail(String email ){
        esperarPorElementoEstarPresente(By.id("email"),10);
        driver.findElement(By.id("email")).sendKeys(email);
    }

    public void clicarBotaoGanharCupom(){
        driver.findElement(By.className("email-content")).click();
        driver.findElement(By.id("button")).click();
    }

    public void validarCupomDesconto(String cupom){
        Assert.assertEquals(cupom,driver.findElement(By.cssSelector("#cupom > h2 > span")).getText());
    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0,10000)");
        Thread.sleep(2000);

    }
}
