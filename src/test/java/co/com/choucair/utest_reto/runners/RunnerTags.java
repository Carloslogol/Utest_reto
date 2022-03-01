package co.com.choucair.utest_reto.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/user_register.feature",
                    tags = "@Stories",
                    glue = "co.com.choucair.utest_reto.stepdefinitions",
                    snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RunnerTags {
}
