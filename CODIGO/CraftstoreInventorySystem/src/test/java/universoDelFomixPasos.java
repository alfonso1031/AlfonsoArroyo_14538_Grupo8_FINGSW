import ec.edu.espe.CraftStoreInventorySystem.view.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class universoDelFomixPasos {
    FrmUniversoDelFomix frmUniversoDelFomix=new FrmUniversoDelFomix();
    FrmEditProduct frmEditProduct =new FrmEditProduct();
    FrmAddProduct frmAddProduct = new FrmAddProduct();
    FrmViewInventory frmViewInventory=new FrmViewInventory();
    FrmDeleteProduct frmDeleteProduct=new FrmDeleteProduct();

    @Dado("que se encuentre en la ventana principal")
    public void que_se_encuentre_en_la_ventana_principal() {
        frmUniversoDelFomix.setVisible(true);
    }

    @Cuando("presione el boton Ver Inventario")
    public void presione_el_boton_ver_inventario() {

    }

    @Entonces("se diriga a esa ventan")
    public void se_diriga_a_esa_ventan() {
        frmViewInventory.setVisible(true);
    }

    @Cuando("presione el boton aadirProducto")
    public void presioneElBotonAadirProducto() {
    }

    @Entonces("se dirige a la venta aadirProductos")
    public void seDirigeALaVentaAadirProductos() {
        frmAddProduct.setVisible(true);
    }

    @Cuando("presione el boton eliminarProducto")
    public void presioneElBotonEliminarProducto() {
        frmDeleteProduct.setVisible(true);

    }

    @Entonces("se diriga a esa ventana eliminarProducto")
    public void seDirigaAEsaVentanaEliminarProducto() {

    }

    @Cuando("presione el boton editarProducto")
    public void presioneElBotonEditarProducto() {

    }

    @Entonces("se diriga a esa ventana editarProducto")
    public void seDirigaAEsaVentanaEditarProducto() {
        frmEditProduct.setVisible(true);
    }
}
