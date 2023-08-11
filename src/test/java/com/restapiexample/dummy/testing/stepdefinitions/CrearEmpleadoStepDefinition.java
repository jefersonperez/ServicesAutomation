package com.restapiexample.dummy.testing.stepdefinitions;

import com.restapiexample.dummy.testing.models.Employeer;
import cucumber.api.java.es.*;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;

public class CrearEmpleadoStepDefinition {

    @Dado("^que quiero crear un empleado al servicio \"([^\"]*)\"$")
    public void queQuieroCrearUnEmpleadoAlServicio(String url, List<Employeer> employeerList) {

        String body = "{\n" +
                "   \"name\":\""+employeerList.get(0).getName()+"\",\n" +
                "   \"salary\":\""+employeerList.get(0).getSalary()+"\",\n" +
                "   \"age\":\""+employeerList.get(0).getAge()+"\"\n" +
                "}";

        SerenityRest.given().body(body).baseUri(url).header("Content-Type","application/json").post();
    }


    @Entonces("^valido el status code \"([^\"]*)\"$")
    public void validoElStatusCode(int status) {
    SerenityRest.lastResponse().then().statusCode(status);
    System.out.println( SerenityRest.lastResponse().prettyPrint());
    System.out.println("status code: "+ SerenityRest.lastResponse().getStatusCode());
    }


}
