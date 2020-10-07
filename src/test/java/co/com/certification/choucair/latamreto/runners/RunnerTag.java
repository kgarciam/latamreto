package co.com.certification.choucair.latamreto.runners;



import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/latam.feature",
        tags = "@lenghtcode",
        glue = {"co.com.certification.choucair.latamreto.stepdefinitions","co.com.certification.choucair.latamreto.util"},
        snippets = SnippetType.CAMELCASE )




public class RunnerTag {
}
