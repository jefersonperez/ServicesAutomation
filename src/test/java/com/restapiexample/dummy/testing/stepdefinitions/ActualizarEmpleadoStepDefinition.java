package com.restapiexample.dummy.testing.stepdefinitions;

import com.restapiexample.dummy.testing.models.Employeer;
import cucumber.api.java.es.Dado;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;

public class ActualizarEmpleadoStepDefinition {
    @Dado("^que quiero Actualizar un empleado al servicio \"([^\"]*)\"$")
    public void queQuieroActualizarUnEmpleadoAlServicio(String url, List<Employeer> employeerList) {
        url = url+employeerList.get(0).getId();

        String body = "{\n" +
                "   \"name\":\""+employeerList.get(0).getName()+"\",\n" +
                "   \"salary\":\""+employeerList.get(0).getSalary()+"\",\n" +
                "   \"age\":\""+employeerList.get(0).getAge()+"\"\n" +
                "}";

        SerenityRest.given().body(body).baseUri(url).header("Content-Type","application/json").put();

    }
}
