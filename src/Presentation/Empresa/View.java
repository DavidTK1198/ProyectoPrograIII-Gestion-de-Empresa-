/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.Empresa;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

/**
 *
 * @author boyro
 */
public class View extends javax.swing.JDialog implements Observer {

    /**
     * Creates new form View
     */
    private Controller control;
    private Model model;

    public View(java.awt.Frame Parent, boolean modal) {
        super(Parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        NombreLbl = new javax.swing.JLabel();
        NombreTxtFld = new javax.swing.JTextField();
        ActicidaLbl = new javax.swing.JLabel();
        ActividadTxtFld = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CedJuridicaiTxtFld = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CorreoTxtFld = new javax.swing.JTextField();
        telefonoLbl = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        direccion = new javax.swing.JTextArea();
        Direccion = new javax.swing.JLabel();
        AgregarBoton = new javax.swing.JButton();
        TelefonoTxtField = new javax.swing.JTextField();
        NuevoBotton = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaTelefonos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 153));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 204, 0));

        NombreLbl.setBackground(new java.awt.Color(204, 204, 255));
        NombreLbl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NombreLbl.setText("Nombre");

        NombreTxtFld.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        ActicidaLbl.setBackground(new java.awt.Color(204, 204, 255));
        ActicidaLbl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ActicidaLbl.setText("Actividad");

        ActividadTxtFld.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Ced Jurídica");

        CedJuridicaiTxtFld.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Correo electronico");

        CorreoTxtFld.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        telefonoLbl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        telefonoLbl.setText("Telefono");

        direccion.setColumns(20);
        direccion.setRows(5);
        jScrollPane3.setViewportView(direccion);

        Direccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Direccion.setText("Direccion");

        AgregarBoton.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        AgregarBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save_icon-icons.com_53618.png"))); // NOI18N
        AgregarBoton.setText("Agregar");
        AgregarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarBotonMouseClicked(evt);
            }
        });

        TelefonoTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoTxtFieldActionPerformed(evt);
            }
        });

        NuevoBotton.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        NuevoBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new_25355.png"))); // NOI18N
        NuevoBotton.setText("Nuevo");

        BotonCancelar.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        BotonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel_89309.png"))); // NOI18N
        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(AgregarBoton)
                        .addGap(38, 38, 38)
                        .addComponent(NuevoBotton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(BotonCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(CedJuridicaiTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(CorreoTxtFld))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(NombreLbl)
                                    .addGap(18, 18, 18)
                                    .addComponent(NombreTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ActicidaLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ActividadTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Direccion)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(telefonoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TelefonoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreLbl)
                    .addComponent(NombreTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ActicidaLbl)
                    .addComponent(ActividadTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CedJuridicaiTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CorreoTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Direccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelefonoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarBoton)
                    .addComponent(NuevoBotton)
                    .addComponent(BotonCancelar))
                .addContainerGap())
        );

        ActicidaLbl.getAccessibleContext().setAccessibleName("ActividadLbl");
        jLabel4.getAccessibleContext().setAccessibleName("Ced_JurídicaLbl");
        telefonoLbl.getAccessibleContext().setAccessibleName("telefonoLbl");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        ListaTelefonos.setBackground(new java.awt.Color(255, 153, 153));
        ListaTelefonos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ListaTelefonos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente#", "Cedula", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(ListaTelefonos);

        jLabel3.setBackground(new java.awt.Color(255, 153, 153));
        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Informacion de la empresa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel1.setText("Datos de la Empresa");

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-arrow-25.png"))); // NOI18N
        Volver.setText("Volver");
        Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Volver)
                .addGap(468, 468, 468))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Volver))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Empresa");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseClicked
        // TODO add your handling code here:
        control.hide();
    }//GEN-LAST:event_VolverMouseClicked

    private void TelefonoTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoTxtFieldActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void AgregarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarBotonMouseClicked
        String nombre = this.NombreTxtFld.getText();
        String actividad = this.ActividadTxtFld.getText();
        String correo = this.CorreoTxtFld.getText();
        String cedJud = this.CedJuridicaiTxtFld.getText();
        String telefono = this.TelefonoTxtField.getText();
        String direccionn = this.direccion.getText();
        if (validacionTexto(nombre,cedJud,direccionn,actividad,telefono,correo)) {
            this.control.editEmpresa(model.isEditable(), nombre, cedJud,direccionn, actividad,telefono,correo);
        }
        
    }//GEN-LAST:event_AgregarBotonMouseClicked

  
    @Override
    public void update(Observable o, Object arg) {
        this.ListaTelefonos.setModel(model.getTable());
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
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ActicidaLbl;
    private javax.swing.JTextField ActividadTxtFld;
    private javax.swing.JButton AgregarBoton;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JTextField CedJuridicaiTxtFld;
    private javax.swing.JTextField CorreoTxtFld;
    private javax.swing.JLabel Direccion;
    private javax.swing.JTable ListaTelefonos;
    private javax.swing.JLabel NombreLbl;
    private javax.swing.JTextField NombreTxtFld;
    private javax.swing.JButton NuevoBotton;
    private javax.swing.JTextField TelefonoTxtField;
    private javax.swing.JButton Volver;
    private javax.swing.JTextArea direccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel telefonoLbl;
    // End of variables declaration//GEN-END:variables

    private boolean validacionTexto(String nom,String cedJur,String direc,String activ, String tel,String correoE) {
        if(nom.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingresar nombre de la empresa");
            return false;
        }
        if(cedJur.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingresar cedula juridica");
            return false;
        }
         if(direc.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingresar direccion de la empresa");
            return false;
        }
        if(activ.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingresar actividad de la empresa");
            return false;
        }
        if(tel.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingresar telefono");
            return false;
        }
         if(correoE.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingresar correo electronico");
            return false;
        }
        return true;
    }
}
