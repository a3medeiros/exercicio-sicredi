package sicrediTests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/sicrediTests"},
        plugin = {"pretty"}, tags = "@exercicio-nao-obrigatorio")

public class sicrediCucumberRunner {
}
