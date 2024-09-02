import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import ec.edu.espe.CraftStoreInventorySystem.view.FrmEditProduct;
import ec.edu.espe.CraftStoreInventory.model.Product;
import ec.edu.espe.CraftStoreInventorySystem.view.FrmUniversoDelFomix;

import java.nio.charset.StandardCharsets;


public class editarProductosPasos {
    FrmEditProduct frmEditProduct=new FrmEditProduct();
    Product product;
    FrmUniversoDelFomix frmUniversoDelFomix= new FrmUniversoDelFomix();

    @Dado("que el usuario se encuentre en la pagina de EditarProductos")
    public void que_el_usuario_se_encuentre_en_la_pagina_de_editar_productos() {
    frmEditProduct.setVisible(true);}

    @Cuando("presione el boton editar")
    public void presione_el_boton_editar() {
        frmEditProduct.saveProduct();
        System.out.println("Producto editado correctamente");

    }

    @Entonces("el producto se debera editar")
    public void el_producto_se_debera_editar() {
    }

    @Entonces("el producto no se editara")
    public void elProductoNoSeEditara() {

    }

    @Entonces("regresara a la pagina principal")
    public void regresaraALaPaginaPrincipal() {
        frmUniversoDelFomix.setVisible(true);
    }

    @Cuando("presione el boton de regresar")
    public void presioneElBotonDeRegresar() {
        System.out.println("boton ejecutado correctamente");
    }
}
