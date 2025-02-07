
package Vista;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;


public class MenuPrincipal extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_menu;
    
    public MenuPrincipal() {
        initComponents();
        this.setSize(new Dimension(1200,700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Menu prontomueble");
        
       this.setLayout(null);
       jDesktopPane_menu= new JDesktopPane();
       
       int ancho=java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
       int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
       this.jDesktopPane_menu.setBounds(0, 0, ancho, (alto-110));
       this.add(jDesktopPane_menu);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        Menu_agrerarMueble = new javax.swing.JMenuItem();
        jMenu_verMueble = new javax.swing.JMenuItem();
        Menu_agregarstock = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setText("Mueble");
        menu.setPreferredSize(new java.awt.Dimension(100, 50));

        Menu_agrerarMueble.setText("Agregar mueble");
        Menu_agrerarMueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_agrerarMuebleActionPerformed(evt);
            }
        });
        menu.add(Menu_agrerarMueble);

        jMenu_verMueble.setText("Ver mueble");
        menu.add(jMenu_verMueble);

        Menu_agregarstock.setText("Agregar stock");
        Menu_agregarstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_agregarstockActionPerformed(evt);
            }
        });
        menu.add(Menu_agregarstock);

        jMenuBar1.add(menu);

        jMenu1.setText("Proveedor");
        jMenu1.setPreferredSize(new java.awt.Dimension(100, 50));
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_agrerarMuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_agrerarMuebleActionPerformed

    }//GEN-LAST:event_Menu_agrerarMuebleActionPerformed

    private void Menu_agregarstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_agregarstockActionPerformed
         AgregarStock ActualizarMueble= new AgregarStock();
        jDesktopPane_menu.add(ActualizarMueble);
         ActualizarMueble.setVisible(true); 
    }//GEN-LAST:event_Menu_agregarstockActionPerformed

    public JMenuItem getMenu_agrerarMueble() {
        return Menu_agrerarMueble;
    }

    
   
    public JMenuItem getMenu_agregarstock() {
        return Menu_agregarstock;
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Menu_agregarstock;
    private javax.swing.JMenuItem Menu_agrerarMueble;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenu_verMueble;
    private javax.swing.JMenu menu;
    // End of variables declaration//GEN-END:variables
}
