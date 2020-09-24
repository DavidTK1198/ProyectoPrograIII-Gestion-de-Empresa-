/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.MainWindow;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

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
        this.setResizable(false);
        Date date = new Date();
        String fech = new SimpleDateFormat("dd/MM/yyyy").format(date);
        this.fecha.setText(fech);
        String p = "Facturas.xml";
        Logic.Service.getInstance().load(p);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Principal = new javax.swing.JPanel();
        clientes = new javax.swing.JButton();
        productos = new javax.swing.JButton();
        empresa = new javax.swing.JButton();
        Facturar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Salirlabel = new javax.swing.JLabel();
        ajustes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Registros = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Principal.setBackground(new java.awt.Color(0, 204, 255));

        clientes.setBackground(new java.awt.Color(255, 255, 255));
        clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-administrator-male-55.png"))); // NOI18N
        clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesMouseClicked(evt);
            }
        });
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });

        productos.setBackground(new java.awt.Color(255, 255, 255));
        productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-service-60.png"))); // NOI18N
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

        empresa.setBackground(new java.awt.Color(255, 255, 255));
        empresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-job-48.png"))); // NOI18N
        empresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empresaMouseClicked(evt);
            }
        });

        Facturar.setBackground(new java.awt.Color(255, 255, 255));
        Facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-folder-bills-60(1).png"))); // NOI18N
        Facturar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FacturarMouseClicked(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(255, 255, 255));
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-exit-50.png"))); // NOI18N
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Salirlabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Salirlabel.setForeground(new java.awt.Color(255, 255, 255));
        Salirlabel.setText("Salir");

        ajustes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ajustes.setForeground(new java.awt.Color(255, 255, 255));
        ajustes.setText("Configurar Empresa");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Facturacion");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestionar Clientes");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gestionar Productos");

        Registros.setForeground(new java.awt.Color(255, 255, 255));
        Registros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/image(1).png"))); // NOI18N
        Registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrosMouseClicked(evt);
            }
        });
        Registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrosActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Registros");

        fecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("jLabel5");

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Facturar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(51, 51, 51)))
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                        .addComponent(ajustes)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                        .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(productos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Registros, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(120, 120, 120)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Salirlabel))
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(fecha)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Facturar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ajustes)
                            .addComponent(jLabel1))
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(productos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, Short.MAX_VALUE))))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(fecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Registros)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Salirlabel)
                        .addComponent(jLabel3))
                    .addComponent(jLabel4))
                .addGap(12, 12, 12))
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

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       
        try {
            
            if(!Logic.Service.getInstance().my_Empresa() .validateData())
              throw new Exception("Datos de la empresa Incompletos");
            else{
           this.dispose();
           String p = "Facturas.xml";/// a ver que ponemos aquí
           Logic.Service.getInstance().Save(p);
            }
            
 
        }catch(Exception e){
            
         JOptionPane.showMessageDialog(null, e.getMessage());
       
        }
  

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

    private void empresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empresaMouseClicked

        this.control.empresaShow();
    }//GEN-LAST:event_empresaMouseClicked

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientesActionPerformed

    private void RegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrosActionPerformed

    private void FacturarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacturarMouseClicked
        this.control.facturacion_Show();
    }//GEN-LAST:event_FacturarMouseClicked

    private void RegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrosMouseClicked
        this.control.registros_Show();
    }//GEN-LAST:event_RegistrosMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
          try {
            
            if(!Logic.Service.getInstance().my_Empresa() .validateData())
              throw new Exception("Datos de la empresa Incompletos");
            else{
           this.dispose();
           String p = "Facturas.xml";/// a ver que ponemos aquí
           Logic.Service.getInstance().Save(p);
            }
            
 
        }catch(Exception e){
            
         JOptionPane.showMessageDialog(null, e.getMessage());
          return;
        }
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Facturar;
    private javax.swing.JPanel Principal;
    private javax.swing.JButton Registros;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel Salirlabel;
    private javax.swing.JLabel ajustes;
    private javax.swing.JButton clientes;
    private javax.swing.JButton empresa;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPopupMenu jPopupMenu1;
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
        this.model.addObserver(this);
    }

}
