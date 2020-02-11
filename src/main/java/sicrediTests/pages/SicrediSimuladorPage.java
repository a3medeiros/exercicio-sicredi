package sicrediTests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import sicrediTests.support.Waiters;

public class SicrediSimuladorPage  extends BasePage {
    public SicrediSimuladorPage(WebDriver driver) {
        super(driver);
    }


    public boolean formularioExiste() {

        return driver.findElement(By.cssSelector(".blocoSimular")).isDisplayed();
    }

    public SicrediSimuladorPage escreveValorDeAplicacao(String valor) {
        WebElement campoAplicacao = driver.findElement(By.id("valorAplicar"));
        campoAplicacao.sendKeys(valor);
        return this;
    }

    public SicrediSimuladorPage escreveValorDePoupança(String valor) {
        WebElement campoAplicacao = driver.findElement(By.id("valorInvestir"));
        campoAplicacao.sendKeys(valor);
        return this;
    }

    public SicrediSimuladorPage escreverQuantidadeTempo(String qtdTempo) {
        WebElement campoTempo = driver.findElement(By.id("tempo"));
        campoTempo.sendKeys(qtdTempo);
        return this;
    }

  /*  public SicrediSimuladorPage selecionaTipoTempo(String tipoTempo) {
        Select departureSelect = new Select(driver.findElement(By.cssSelector(".btSelect")));
        departureSelect.selectByVisibleText(tipoTempo);
        return this;}*/



    public ResultadoSimuladorSicredi clicaSimular() {
        driver.findElement(By.cssSelector(".btnSimular")).click();

        return new ResultadoSimuladorSicredi(driver);
    }

    public SicrediSimuladorPage preencheValores(String valor) {
        escreveValorDeAplicacao(valor);
        escreveValorDePoupança(valor);
        return this;
    }

    public String mensagemErroAplicacao() {
       // Waiters.waitUntilElementIsPresent("valorAplicar-error",10);
        return driver.findElement(By.id("valorAplicar-error")).getText();
    }

    public String mensagemErroPoupado() {
       // Waiters.waitUntilElementIsPresent("valorInvestir-error",10);
        return driver.findElement(By.id("valorInvestir-error")).getText();
    }

    public SicrediSimuladorPage clickTempo() {
        driver.findElement(By.id("tempo")).click();
        return this;
    }

    public SicrediSimuladorPage clicaLimparFormulario() {
        driver.findElement(By.cssSelector(".btnLimpar")).click();
        return this;
    }

    public String textoCampoAplicacao() {
        return driver.findElement(By.id("valorAplicar")).getText();
    }

    public String textoCampoPoupanca() {
        return driver.findElement(By.id("valorInvestir")).getText();
    }

    public String textoCampoQtdTempo() {
        return driver.findElement(By.id("tempo")).getText();

    }
}
