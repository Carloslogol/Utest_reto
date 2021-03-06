package co.com.choucair.utest_reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/user_register.feature",
                    tags = "@UserRegistration",
                    glue = "co.com.choucair.utest_reto.stepdefinitions",
                    snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
