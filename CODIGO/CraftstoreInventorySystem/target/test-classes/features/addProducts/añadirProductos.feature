# author: David Pilaguano
# date: 18/08/2024
# language: es

Característica: Añadir Productos

  @ProductoAñadidoExitosamente
  Escenario: Añadir un producto nuevo exitosamente

    Dado que el usuario se encuentre en la pagina de añadir productos
    Cuando ingresa un producto valido
    Entonces deberá ingresar un producto nuevo

  @ProductoAñadidoIncorrectamenteNumeroDeId
  Escenario: Añadir un producto nuevo de manera incorrecta

    Dado que el usuario se encuentre en la pagina de añadir productos
    Cuando ingresa un producto invalido
    Entonces debera mostrar un mensaje de error

  @usoDelBotonParaRegresar
  Escenario: Desea regresar a una ventana anterior

    Dado que el usuario se encuentre en la pagina de añadir productos
    Cuando Presiona el boton de regreso
    Entonces debera regresar a una ventana anterior

