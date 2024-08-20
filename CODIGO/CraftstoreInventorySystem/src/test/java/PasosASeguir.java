import ec.edu.espe.CraftStoreInventorySystem.view.FrmLogin;
import ec.edu.espe.CraftStoreInventorySystem.view.FrmUniversoDelFomix;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class PasosASeguir {

    FrmLogin frmLogin = new FrmLogin();
    FrmUniversoDelFomix frmUniversoDelFomix = new FrmUniversoDelFomix();

    @Dado("que el usuario se encuentre en la página de inicio de sesión")
    public void que_el_usuario_se_encuentre_en_la_página_de_inicio_de_sesión() {
        frmLogin.setVisible(true);
    }

    @Cuando("ingresa las credenciales de acceso correctas")
    public void ingresa_las_credenciales_de_acceso_correctas() {
        frmLogin.userTxt.setText("admin");
        frmLogin.passTxt.setText("admin");
        frmLogin.loginBtnTxtMouseClicked(null);
    }

    @Entonces("debería ver la página principal")
    public void deberia_ver_la_pagina_principal() {
        if (!frmLogin.isVisible()) {
            System.out.println("La página principal está abierta.");
        } else {
            System.out.println("La página principal no se ha abierto.");
        }
    }

    @Cuando("ingresa las credenciales de acceso incorrectas")
    public void ingresa_las_credenciales_de_acceso_incorrectas() {
        frmLogin.userTxt.setText("usuario_incorrecto");
        frmLogin.passTxt.setText("contraseña_incorrecta");
        frmLogin.loginBtnTxtMouseClicked(null);
    }

    @Cuando("ingresa un nombre de usuario correcto y una contraseña incorrecta")
    public void ingresa_un_nombre_de_usuario_correcto_y_una_contraseña_incorrecta() {
        frmLogin.userTxt.setText("admin");
        frmLogin.passTxt.setText("contraseña_incorrecta");
        frmLogin.loginBtnTxtMouseClicked(null);
    }

    @Cuando("ingresa un nombre de usuario incorrecto y una contraseña correcta")
    public void ingresa_un_nombre_de_usuario_incorrecto_y_una_contraseña_correcta() {
        frmLogin.userTxt.setText("usuario_incorrecto");
        frmLogin.passTxt.setText("admin");
        frmLogin.loginBtnTxtMouseClicked(null);
    }

    @Cuando("no ingresa ningún dato en los campos de usuario y contraseña")
    public void no_ingresa_ningún_dato_en_los_campos_de_usuario_y_contraseña() {
        frmLogin.userTxt.setText("");
        frmLogin.passTxt.setText("");
        frmLogin.loginBtnTxtMouseClicked(null);
    }

    @Entonces("debería ver un mensaje de error de inicio de sesión")
    public void debería_ver_un_mensaje_de_error_de_inicio_de_sesión() {
        if (frmLogin.errorLabel.isVisible()) {
            System.out.println("El mensaje de error de inicio de sesión está visible.");
        } else {
            System.out.println("El mensaje de error de inicio de sesión no está visible.");
        }
    }
}
