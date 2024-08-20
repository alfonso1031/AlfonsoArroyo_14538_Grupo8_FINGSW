# author: Alfonso Arroyo
# date: 19/08/2024
# language: es

  Característica: Inicio de sesion
    Se inicia sesion con las credenciales de acceso correctas

  @InicioSesionExitoso
  Escenario: Iniciar sesion exitosamente
    Dado que el usuario se encuentre en la pagina de inicio de sesion
    Cuando ingresa las credenciales de acceso correctas
    Entonces deberia ver la pagina principal

