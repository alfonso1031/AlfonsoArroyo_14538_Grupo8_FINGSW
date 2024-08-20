import ec.edu.espe.CraftStoreInventorySystem.view.FrmLogin;
import ec.edu.espe.CraftStoreInventorySystem.view.FrmUniversoDelFomix;
import ec.edu.espe.CraftStoreInventory.utils.CloudDB;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;


public class PasosASeguir {

    FrmLogin frmLogin = new FrmLogin();
    FrmUniversoDelFomix frmUniversoDelFomix = new FrmUniversoDelFomix();
    CloudDB cloudDB = new CloudDB();

    @Dado("que el usuario se encuentre en la pagina de inicio de sesion")
    public void que_el_usuario_se_encuentre_en_la_pagina_de_inicio_de_sesion() {
        frmLogin.setVisible(true);
    }

    @Cuando("ingresa las credenciales de acceso correctas")
    public void ingresa_las_credenciales_de_acceso_correctas() {
        frmLogin.userTxt.setText("admin");
        frmLogin.passTxt.setText("admi");
        frmLogin.loginBtnTxtMouseClicked(null);
    }

    @Entonces("deberia ver la pagina principal")
    public void deberia_ver_la_pagina_principal() {
        if (frmUniversoDelFomix.isVisible()) {
            System.out.println("La página principal está abierta.");
        } else {
            System.out.println("La página principal no se ha abierto.");
        }
    }
}
