/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.Registros;

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
    
    public View(java.awt.Frame parent, boolean modal) {
        super(parent,modal);
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
        VolverBttn = new javax.swing.JButton();
        GuardarBttn = new javax.swing.JButton();
        CargarBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        VolverBttn.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        VolverBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Go-back_36760.png"))); // NOI18N
        VolverBttn.setText("Volver");

        GuardarBttn.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        GuardarBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save_icon-icons.com_53618.png"))); // NOI18N
        GuardarBttn.setText("Guardar");
        GuardarBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarBttnMouseClicked(evt);
            }
        });

        CargarBttn.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        CargarBttn.setText("Cargar");
        CargarBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarBttnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CargarBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                        .addComponent(VolverBttn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(GuardarBttn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(GuardarBttn)
                .addGap(143, 143, 143)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VolverBttn)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(CargarBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarBttnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarBttnMouseClicked

    private void CargarBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarBttnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CargarBttnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CargarBttn;
    private javax.swing.JButton GuardarBttn;
    private javax.swing.JButton VolverBttn;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setControl(Controller control) {
        this.control = control;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
//        this.model = model;
//        model.addObserver(this);
    }
}

