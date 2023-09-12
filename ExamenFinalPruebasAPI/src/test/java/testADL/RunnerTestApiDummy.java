package testADL;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        snippets = CAMELCASE,
        features = "classpath:features",
        tags = "@EscenarioDelete"
)
public class RunnerTestApiDummy {
}
