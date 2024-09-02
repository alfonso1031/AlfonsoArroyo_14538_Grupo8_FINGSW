# author: David Pilaguano
# date: 18/08/2024
# language: es

Característica: Editar Productos

  @ProductoEditadoExito
  Escenario:Producto Editado de manera correcta
    Dado que el usuario se encuentre en la pagina de EditarProductos
    Cuando presione el boton editar
    Entonces el producto se debera editar


  @ProductoEditadoError
  Escenario:Fallo al Editar un producto
    Dado que el usuario se encuentre en la pagina de EditarProductos
    Cuando presione el boton editar
    Entonces el producto no se editara

  @ProductoEditadoError
  Escenario: Regresar
    Dado que el usuario se encuentre en la pagina de EditarProductos
    Cuando presione el boton de regresar
    Entonces regresara a la pagina principal