import ec.edu.espe.CraftStoreInventorySystem.view.FrmUniversoDelFomix;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import ec.edu.espe.CraftStoreInventorySystem.view.FrmDeleteProduct;

public class eliminarProductosPasos {

    FrmDeleteProduct frmDeleteProduct;

    @Dado("que el usuario se encuentre en la pagina de elimnar productos")
    public void que_el_usuario_se_encuentre_en_la_pagina_de_elimnar_productos() {frmDeleteProduct.setVisible(true);}

    @Cuando("el usuario borre un producto")
    public void el_usuario_borre_un_producto() {

    }

    @Entonces("el producto se debera eliminar")
    public void el_producto_se_debera_eliminar() {
    }

    @Entonces("el producto no se eliminara")
    public void el_producto_no_se_eliminara() {
    }

}
