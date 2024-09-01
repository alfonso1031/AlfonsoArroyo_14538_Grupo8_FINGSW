import ec.edu.espe.CraftStoreInventorySystem.view.FrmUniversoDelFomix;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import ec.edu.espe.CraftStoreInventorySystem.view.FrmDeleteCustomer;
import ec.edu.espe.CraftStoreInventorySystem.view.FrmUniversoDelFomix;


public class eliminarClientePasos {

    FrmDeleteCustomer frmDeleteCustomer=new FrmDeleteCustomer();
    FrmUniversoDelFomix frmUniversoDelFomix = new FrmUniversoDelFomix();



    @Dado("que el usuario se encuentre en la pagina de elimnar clientes")
    public void que_el_usuario_se_encuentre_en_la_pagina_de_elimnar_clientes() {frmDeleteCustomer.setVisible(true);}

    @Cuando("seleciona el boton borrar")
    public void seleciona_el_boton_borrar() {
        frmDeleteCustomer.confirmation=0;
        int decision=frmDeleteCustomer.confirmation;

        if ( decision == 0) {
            System.out.println("Success");
            } else {
            System.out.println("Error deleting customer. Please try again.");
        }
    }

    @Entonces("debera eliminar el cliente")
    public void debera_eliminar_el_cliente() {}


    @Entonces("debera saltar el msg de error")
    public void deberaSaltarElMsgDeError() {
        System.out.println("Error deleting customer. Please try again.");
    }

    @Cuando("seleciona el boton regresar")
    public void selecionaElBotonRegresar() {
    frmDeleteCustomer.setVisible(false);
    }

    @Entonces("debera regresar a la ventana anterior")
    public void deberaRegresarALaVentanaAnterior() {
    frmUniversoDelFomix.setVisible(true);
    }
}

