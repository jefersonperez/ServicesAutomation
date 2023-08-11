package com.restapiexample.dummy.testing.stepdefinitions;

import com.restapiexample.dummy.testing.models.Employeer;
import cucumber.api.java.es.Dado;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;

public class EliminarEmpleadoStepDefinition {

    @Dado("^que quiero Eliminar un empleado por id al servicio \"([^\"]*)\"$")
    public void queQuieroEliminarUnEmpleadoPorIdAlServicio(String url, List<Employeer> employeerList) {
        url = url+employeerList.get(0).getId();
        System.out.println(url);

        SerenityRest.given().baseUri(url).header("Content-Type","application/json").delete();
    }
}
