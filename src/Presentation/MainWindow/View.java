/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.MainWindow;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author DavidTK1198
 */
public class View extends javax.swing.JFrame implements Observer {

    /**
     * Creates new form View
     */
    private Controller control;
    private Model model;

  
    
    public View() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        empresa = new javax.swing.JButton();
        Facturar = new javax.swing.JButton();
        clientes = new javax.swing.JButton();
        productos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-exit-50.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        empresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-job-48.png"))); // NOI18N
        empresa.setText("Configurar Empresa");

        Facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-folder-bills-60(1).png"))); // NOI18N
        Facturar.setText("Facturación");
        Facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturarActionPerformed(evt);
            }
        });

        clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-administrator-male-55.png"))); // NOI18N
        clientes.setText("Administrar Clientes");
        clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesMouseClicked(evt);
            }
        });

        productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-service-60.png"))); // NOI18N
        productos.setText("Administrar Productos/Servicios");
        productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productosMouseClicked(evt);
            }
        });
        productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(empresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                        .addComponent(Facturar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                        .addComponent(productos)
                        .addGap(42, 42, 42))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(empresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Facturar, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productos, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FacturarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesMouseClicked
        // TODO add your handling code here:
        this.control.clienteShow();
    }//GEN-LAST:event_clientesMouseClicked

    private void productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosMouseClicked
        // TODO add your handling code here:
        this.control.productoShow();
    }//GEN-LAST:event_productosMouseClicked

    private void productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productosActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Facturar;
    private javax.swing.JPanel Principal;
    private javax.swing.JButton Salir;
    private javax.swing.JButton clientes;
    private javax.swing.JButton empresa;
    private javax.swing.JButton productos;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        
    }
    
      public Controller getControl() {
        return control;
    }

    public void setControl(Controller control) {
        this.control = control;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
        model.addObserver(this);
    }
    
    
}

