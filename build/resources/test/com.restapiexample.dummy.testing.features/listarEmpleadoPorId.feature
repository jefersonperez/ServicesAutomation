# language: es

Característica: Listar empleados

  Escenario: Listar empleado exitosamente

    Dado que quiero listar un empleado por id al servicio "https://dummy.restapiexample.com/api/v1/employee/"
    |id|
    | 24 |
    Entonces valido el status code "200"
