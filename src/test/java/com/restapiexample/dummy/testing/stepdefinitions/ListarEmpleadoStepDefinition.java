package com.restapiexample.dummy.testing.stepdefinitions;

import cucumber.api.java.es.Dado;
import net.serenitybdd.rest.SerenityRest;

public class ListarEmpleadoStepDefinition {

    @Dado("^que quiero listar un empleado al servicio \"([^\"]*)\"$")
    public void queQuieroListarUnEmpleadoAlServicio(String url) {
        SerenityRest.given().baseUri(url).header("Content-Type","application/json").get();
    }
}
