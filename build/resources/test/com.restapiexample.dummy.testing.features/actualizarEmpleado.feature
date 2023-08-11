# language: es

Característica: Actualizar empleado

  Escenario: Actualizar empleado exitosamente

    Dado que quiero Actualizar un empleado al servicio "https://dummy.restapiexample.com/api/v1/update/"
      |id|name|salary|age|
      |24|Jeferson Perez|1000000|26|
    Entonces valido el status code "200"
