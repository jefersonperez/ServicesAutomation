# language: es

Característica: Listar empleados

  Escenario: Listar empleado exitosamente

    Dado que quiero listar un empleado al servicio "https://dummy.restapiexample.com/api/v1/employees"
    Entonces valido el status code "200"
