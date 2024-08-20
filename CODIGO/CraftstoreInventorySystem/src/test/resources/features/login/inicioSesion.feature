# author: Alfonso Arroyo
# date: 18/08/2024
# language: es

Característica: Inicio de sesión
  Se valida que el inicio de sesión funcione correctamente con diversas credenciales

  @InicioSesionExitoso
  Escenario: Iniciar sesión exitosamente
    Dado que el usuario se encuentre en la página de inicio de sesión
    Cuando ingresa las credenciales de acceso correctas
    Entonces debería ver la página principal

  @InicioSesionFallido
  Escenario: Intentar iniciar sesión con credenciales incorrectas
    Dado que el usuario se encuentre en la página de inicio de sesión
    Cuando ingresa las credenciales de acceso incorrectas
    Entonces debería ver un mensaje de error de inicio de sesión

  @InicioSesionFallido
  Escenario: Intentar iniciar sesión con un usuario correcto pero contraseña incorrecta
    Dado que el usuario se encuentre en la página de inicio de sesión
    Cuando ingresa un nombre de usuario correcto y una contraseña incorrecta
    Entonces debería ver un mensaje de error de inicio de sesión

  @InicioSesionFallido
  Escenario: Intentar iniciar sesión con una contraseña correcta pero un usuario incorrecto
    Dado que el usuario se encuentre en la página de inicio de sesión
    Cuando ingresa un nombre de usuario incorrecto y una contraseña correcta
    Entonces debería ver un mensaje de error de inicio de sesión

  @InicioSesionFallido
  Escenario: Intentar iniciar sesión dejando los campos en blanco
    Dado que el usuario se encuentre en la página de inicio de sesión
    Cuando no ingresa ningún dato en los campos de usuario y contraseña
    Entonces debería ver un mensaje de error de inicio de sesión
