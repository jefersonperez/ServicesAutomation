# language: es

  Característica: Crear empleado

    Escenario: Crear empleado exitosamente

      Dado que quiero crear un empleado al servicio "https://dummy.restapiexample.com/api/v1/create"
      |name|salary|age|
      |Jeferson|100000|25|
      Entonces valido el status code "200"
