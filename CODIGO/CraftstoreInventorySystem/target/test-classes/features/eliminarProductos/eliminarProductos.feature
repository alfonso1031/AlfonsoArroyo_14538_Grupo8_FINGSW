# author: David Pilaguano
# date: 18/08/2024
# language: es

Característica: Eliminar Productos

  @ProductoEliminadoExito
  Escenario: Producto Eliminado de manera correcta
    Dado que el usuario se encuentre en la pagina de elimnar productos
    Cuando el usuario borre un producto
    Entonces el producto se debera eliminar

  @ProductoEliminadoFail
  Escenario: Producto Eliminado de manera incorrecta
    Dado que el usuario se encuentre en la pagina de elimnar productos
    Cuando el usuario borre un producto
    Entonces el producto no se eliminara
