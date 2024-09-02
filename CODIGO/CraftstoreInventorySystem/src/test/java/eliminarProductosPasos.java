import ec.edu.espe.CraftStoreInventorySystem.view.FrmUniversoDelFomix;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import ec.edu.espe.CraftStoreInventorySystem.view.FrmDeleteProduct;

public class eliminarProductosPasos {
    FrmDeleteProduct frmDeleteProduct=new FrmDeleteProduct();
    FrmUniversoDelFomix frmUniversoDelFomix = new FrmUniversoDelFomix();

    @Dado("que el usuario se encuentre en la pagina de elimnar productos")
    public void que_el_usuario_se_encuentre_en_la_pagina_de_elimnar_productos() {frmDeleteProduct.setVisible(true);}

    @Cuando("el usuario borre un producto")
    public void el_usuario_borre_un_producto() {
        int selectedRow;
        frmDeleteProduct.selectedRow=1;
        selectedRow=frmDeleteProduct.selectedRow;
        if(selectedRow==-1)
        {
            System.out.println("Porfavor Seleccione un producto a eliminar");

        }else{
            System.out.println("Producto Eliminado Correctamente");
        }

    }

    @Entonces("el producto se debera eliminar")
    public void el_producto_se_debera_eliminar() {

    }

    @Entonces("el producto no se eliminara")
    public void el_producto_no_se_eliminara() {
    }

    @Cuando("el usuario presione el boton regresar")
    public void elUsuarioPresioneElBotonRegresar() {

    }

    @Entonces("la ventana aparecera")
    public void laVentanaAparecera() {
    frmUniversoDelFomix.setVisible(true);
    }
}
