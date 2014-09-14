package pl.busca.github;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;


@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
//@Cucumber.Options(format = { "pretty", "html:target/cucumber-html-report", "json:target/cucumber.json" },
// 				  features = "classpath:se/thinkcode/itake/oi_mundo.feature")

@Cucumber.Options(format = { "pretty", "html:target/cucumber-html-report", "json:target/cucumber-html-report.json" },
				  features={"classpath:pl/busca/github/github.feature"})


//@Cucumber.Options(
//	    //this code will only look into "features/" folder for features
//	    features={"classpath:features/"},
//	    glue = { "com.mycompany.cucumber.stepdefinitions", "com.mycompany.cucumber.hooks" },
//	    format = { "com.mycompany.cucumber.formatter.RuntimeInfoCatcher", "json:target/cucumber.json" },
//	    tags = { "@working" }
//	    )
public class RunCukesTest {
}