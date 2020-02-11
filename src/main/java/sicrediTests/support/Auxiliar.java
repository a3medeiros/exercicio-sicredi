package sicrediTests.support;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Auxiliar {
    public static void jsClick(WebElement element) {
        ((JavascriptExecutor) Web.driver).executeScript("arguments[0].click();", element);
    }
}
