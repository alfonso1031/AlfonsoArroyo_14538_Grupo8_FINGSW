import ec.edu.espe.CraftStoreInventorySystem.view.FrmAddProduct;
import ec.edu.espe.CraftStoreInventory.model.Product;
import ec.edu.espe.CraftStoreInventory.utils.CloudDB;
import java.lang.Float;
import java.lang.Integer;
import ec.edu.espe.CraftStoreInventorySystem.view.FrmUniversoDelFomix;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;


public class añadirProductosPasos {
    CloudDB cloudDB = new CloudDB();
    FrmAddProduct frmAddProduct = new FrmAddProduct();
    FrmUniversoDelFomix frmUniversoDelFomix = new FrmUniversoDelFomix();
    Product product;


    @Dado("que el usuario se encuentre en la pagina de añadir productos")
    public void que_el_usuario_se_encuentre_en_la_pagina_de_añadir_productos() {frmAddProduct.setVisible(true);}

    @Cuando("ingresa un producto valido")
    public void ingresa_un_producto_valido() {
        frmAddProduct.idFldText.setText("0548");
        frmAddProduct.nameFldText.setText("Mongo 2H");
        frmAddProduct.descriptionFldText.setText("lapiz punta fina");
        frmAddProduct.quantityFldText.setText("500");
        frmAddProduct.categoryFldText.setText("lapices");
        frmAddProduct.priceFldText.setText("50");
        frmAddProduct.sizeFldText.setText("mediano");
        frmAddProduct.addBtnTextMouseClicked(null);

    }
    @Entonces("deberá ingresar un producto nuevo")
    public void deberá_ingresar_un_producto_nuevo() {
        try {
            if (cloudDB.productExists(product.getId())) {
                cloudDB.updateProduct(product);
                System.out.println("El producto se ha registrado correctamente");
            } else {
                cloudDB.uploadProductData(product);
                System.out.println("El producto no se ha registrado correctamente");
            }
        } catch (Exception e) {
            System.out.println("El producto se ha registrado correctamente ");
        }
    }

    @Cuando("ingresa un producto invalido")
    public void ingresa_un_producto_invalido() {
        frmAddProduct.idFldText.setText("aaa");
        frmAddProduct.nameFldText.setText("Mongo 2H");
        frmAddProduct.descriptionFldText.setText("lapiz punta fina");
        frmAddProduct.quantityFldText.setText("500");
        frmAddProduct.categoryFldText.setText("lapices");
        frmAddProduct.priceFldText.setText("50");
        frmAddProduct.sizeFldText.setText("mediano");
        product = new Product(
                frmAddProduct.idFldText.getText(),
                frmAddProduct.nameFldText.getText(),
                frmAddProduct.descriptionFldText.getText(),
                Integer.parseInt(frmAddProduct.quantityFldText.getText()),
                frmAddProduct.categoryFldText.getText(),
                Float.parseFloat(frmAddProduct.priceFldText.getText()),
                frmAddProduct.sizeFldText.getText()
        );

        // Validar el ID del producto
        if (!product.getId().matches("\\d+")) {
            System.out.println("Ingresa un producto inválido");
        }
        frmAddProduct.addBtnTextMouseClicked(null);
    }
    @Entonces("debera mostrar un mensaje de error")
    public void debera_mostrar_un_mensaje_de_error() {

        try {
            if (cloudDB.productExists(product.getId())) {
                cloudDB.updateProduct(product);
                System.out.println("El producto se ha registrado correctamente");
            } else {
                cloudDB.uploadProductData(product);
                System.out.println("El producto no se ha registrado correctamente");
            }
        } catch (Exception e) {
            System.out.println("Error al registrar el producto ");
        }
    }
    @Cuando("Presiona el boton de regreso")
    public void presiona_el_boton_de_regreso() {
        frmAddProduct.returnBtnTextMouseClicked(null);
    }
    @Entonces("debera regresar a una ventana anterior")
    public void debera_regresar_a_una_ventana_anterior() {
        if(frmUniversoDelFomix.isVisible()){
            System.out.println("regreso a la ventana anterior");
        }
        System.out.println("no regreso a la ventana anterior");

    }
}