package com.restapiexample.dummy.testing.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com.restapiexample.dummy.testing.features/actualizarEmpleado.feature",
        glue = "com.restapiexample.dummy.testing.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class ActualizarEmpleadoRunner {
}
