package com.dekosas.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
//traduce mi lenguaje natural a programación
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = "com/dekosas/StepDefinitions",
        snippets = SnippetType.CAMELCASE //para que me traduzca en forma de camelCase
)

public class LoginRunner {
}
