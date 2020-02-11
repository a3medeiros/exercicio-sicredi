package sicrediTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sicrediTests.support.Auxiliar;
import sicrediTests.support.Waiters;

public class ResultadoSimuladorSicredi extends BasePage{
    public ResultadoSimuladorSicredi(WebDriver driver) {
        super(driver);
    }

    public boolean valorEhExibido() {
        Waiters.waitUntilElementIsPresent(".blocoResultadoSimulacao",10);
        return driver.findElement(By.cssSelector(".valor")).isDisplayed();
    }

    public boolean tabelaDeValoresExiste() {
        return driver.findElement(By.cssSelector(".maisOpcoes")).isDisplayed();
    }

    public SicrediSimuladorPage clicaNovaSimulacao() {
        WebElement botaoRefazer = driver.findElement(By.cssSelector(".btnRefazer"));
        Auxiliar.jsClick(botaoRefazer);
        return new SicrediSimuladorPage(driver);
    }
}
