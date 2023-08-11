# language: es

Característica: Eliminar empleados

  Escenario: Eliminar empleado exitosamente

    Dado que quiero Eliminar un empleado por id al servicio "https://dummy.restapiexample.com/api/v1/delete/"
      |id|
      | 24 |
    Entonces valido el status code "200"
