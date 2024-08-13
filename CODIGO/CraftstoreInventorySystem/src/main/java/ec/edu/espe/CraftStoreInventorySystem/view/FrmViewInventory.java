
package ec.edu.espe.CraftStoreInventorySystem.view;

import ec.edu.espe.CraftStoreInventory.utils.CloudDB;
import java.awt.Color;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;


/**
 *
 * @author Mario Anrrango, A-Byte Wizards, DCCO - ESPE
 */
public class FrmViewInventory extends javax.swing.JFrame {

    private CloudDB cloudDB;
    private DefaultTableModel tableModel;
    int xMouse, yMouse;
    
    public FrmViewInventory() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/logo.png")).getImage());
        cloudDB = new CloudDB();
        tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0); // Limpiar la tabla al inicio
        loadProducts();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        returnBtn = new javax.swing.JPanel();
        returnBtnText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchFldText = new javax.swing.JTextField();
        searchBtn = new javax.swing.JPanel();
        searchBtnText = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        header1 = new javax.swing.JPanel();
        exitBtn1 = new javax.swing.JPanel();
        exitTxt1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        returnBtn.setBackground(new java.awt.Color(110, 37, 159));

        returnBtnText.setBackground(new java.awt.Color(110, 37, 159));
        returnBtnText.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        returnBtnText.setForeground(new java.awt.Color(255, 255, 255));
        returnBtnText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        returnBtnText.setText("REGRESAR");
        returnBtnText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnBtnText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnBtnTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                returnBtnTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                returnBtnTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout returnBtnLayout = new javax.swing.GroupLayout(returnBtn);
        returnBtn.setLayout(returnBtnLayout);
        returnBtnLayout.setHorizontalGroup(
            returnBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(returnBtnText, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        returnBtnLayout.setVerticalGroup(
            returnBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(returnBtnText, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(returnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 150, 40));

        jTable1.setBackground(new java.awt.Color(110, 80, 159));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "DESCRIPCIÓN", "CANTIDAD", "CATEGORÍA", "PRECIO", "TAMAÑO"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 650, 140));
        jPanel3.add(searchFldText, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 300, 30));

        searchBtn.setBackground(new java.awt.Color(110, 37, 159));

        searchBtnText.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        searchBtnText.setForeground(new java.awt.Color(255, 255, 255));
        searchBtnText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchBtnText.setText("Buscar");
        searchBtnText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchBtnText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchBtnTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchBtnTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout searchBtnLayout = new javax.swing.GroupLayout(searchBtn);
        searchBtn.setLayout(searchBtnLayout);
        searchBtnLayout.setHorizontalGroup(
            searchBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchBtnText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        searchBtnLayout.setVerticalGroup(
            searchBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchBtnLayout.createSequentialGroup()
                .addComponent(searchBtnText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 100, 30));

        jPanel2.setBackground(new java.awt.Color(110, 37, 159));

        header1.setBackground(new java.awt.Color(110, 37, 159));
        header1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                header1MouseDragged(evt);
            }
        });
        header1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                header1MousePressed(evt);
            }
        });

        exitBtn1.setBackground(new java.awt.Color(110, 37, 159));

        exitTxt1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt1.setForeground(new java.awt.Color(242, 242, 242));
        exitTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt1.setText("X");
        exitTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt1.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxt1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtn1Layout = new javax.swing.GroupLayout(exitBtn1);
        exitBtn1.setLayout(exitBtn1Layout);
        exitBtn1Layout.setHorizontalGroup(
            exitBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtn1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtn1Layout.setVerticalGroup(
            exitBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INVENTARIO");

        javax.swing.GroupLayout header1Layout = new javax.swing.GroupLayout(header1);
        header1.setLayout(header1Layout);
        header1Layout.setHorizontalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addContainerGap(237, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213)
                .addComponent(exitBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        header1Layout.setVerticalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(header1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnBtnTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnBtnTextMouseEntered
        returnBtn.setBackground(new Color(110,80,159));
    }//GEN-LAST:event_returnBtnTextMouseEntered

    private void returnBtnTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnBtnTextMouseExited
        returnBtn.setBackground(new Color(110,37,159));
    }//GEN-LAST:event_returnBtnTextMouseExited

    private void returnBtnTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnBtnTextMouseClicked
        FrmUniversoDelFomix frmUniversoDelFomix = new FrmUniversoDelFomix();
        this.setVisible(false);
        frmUniversoDelFomix.setVisible(true);
    }//GEN-LAST:event_returnBtnTextMouseClicked

    private void searchBtnTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnTextMouseEntered
        searchBtn.setBackground(new Color(110,80,159));
    }//GEN-LAST:event_searchBtnTextMouseEntered

    private void searchBtnTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnTextMouseExited
        searchBtn.setBackground(new Color(110,37,159));
    }//GEN-LAST:event_searchBtnTextMouseExited

    private void searchBtnTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnTextMouseClicked
        // Obtener el texto del campo de búsqueda
        String searchCriteria = searchFldText.getText().trim();

        // Llamar al método searchProduct con el criterio de búsqueda
        searchProduct(searchCriteria);
    }//GEN-LAST:event_searchBtnTextMouseClicked

    private void exitTxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxt1MouseClicked

    private void exitTxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt1MouseEntered
        exitBtn1.setBackground(Color.red);
        exitTxt1.setForeground(Color.white);
    }//GEN-LAST:event_exitTxt1MouseEntered

    private void exitTxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxt1MouseExited
        exitBtn1.setBackground(new Color(110,37,159));
        exitTxt1.setForeground(Color.white);
    }//GEN-LAST:event_exitTxt1MouseExited

    private void header1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_header1MouseDragged

    private void header1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_header1MousePressed

    private void searchProduct(String searchCriteria) {
        tableModel.setRowCount(0); // Limpiar tabla
        List<Document> products = cloudDB.getAllProducts();
        for (Document doc : products) {
            if (doc.getString("name").toLowerCase().contains(searchCriteria.toLowerCase()) || 
                doc.getString("id").toLowerCase().contains(searchCriteria.toLowerCase())) {
                Object[] rowData = {
                    doc.getString("id"),
                    doc.getString("name"),
                    doc.getString("description"),
                    doc.getInteger("quantity"),
                    doc.getString("size"),
                    doc.getDouble("price"),
                    doc.getString("category")
                };
                tableModel.addRow(rowData);
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmViewInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmViewInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmViewInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmViewInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmViewInventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel exitBtn;
    private javax.swing.JPanel exitBtn1;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel exitTxt1;
    private javax.swing.JPanel header;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel returnBtn;
    private javax.swing.JLabel returnBtnText;
    private javax.swing.JPanel searchBtn;
    private javax.swing.JLabel searchBtnText;
    private javax.swing.JTextField searchFldText;
    // End of variables declaration//GEN-END:variables

    private void loadProducts() {
        tableModel.setRowCount(0); 
        List<Document> products = cloudDB.getAllProducts();
        for (Document doc : products) {
            Object[] rowData = {
                doc.getString("id"),
                doc.getString("name"),
                doc.getString("description"),
                doc.getInteger("quantity"),
                doc.getString("size"),
                doc.getDouble("price"),
                doc.getString("category")
            };
            tableModel.addRow(rowData);
        }
    }
 }
