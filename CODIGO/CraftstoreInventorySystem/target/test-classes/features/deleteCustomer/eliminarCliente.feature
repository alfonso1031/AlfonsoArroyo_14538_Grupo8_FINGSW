# author: David Pilaguano
# date: 18/08/2024
# language: es

Característica: Eliminar Cliente

  @ClienteEliminadoExitosamente
  Escenario: Eliminar un cliente exitosamente

    Dado que el usuario se encuentre en la pagina de elimnar clientes
    Cuando seleciona el boton borrar
    Entonces debera eliminar el cliente


  @ErrorAlEliminarCliente
  Escenario: Elimianr cliente fallido
    Dado que el usuario se encuentre en la pagina de elimnar clientes
    Cuando seleciona el boton borrar
    Entonces debera saltar el msg de error

  @Regresar
  Escenario: Regresar
    Dado que el usuario se encuentre en la pagina de elimnar clientes
    Cuando seleciona el boton regresar
    Entonces debera regresar a la ventana anterior