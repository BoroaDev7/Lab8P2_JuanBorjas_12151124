
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author famil
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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
        botonComenzar = new javax.swing.JButton();
        botonPausar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelNombrePista = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelLargoPista = new javax.swing.JLabel();
        barraCorredores = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCorredores = new javax.swing.JTable();
        cajaCorredores = new javax.swing.JComboBox<>();
        botonAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nombrePista = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        numeroIdentificador = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nombreCorredor = new javax.swing.JTextField();
        tiposAutos = new javax.swing.JComboBox<>();
        botonColor = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        largoPista = new javax.swing.JTextField();
        botonUsarPista = new javax.swing.JButton();
        botonReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        botonComenzar.setText("Comenzar");
        botonComenzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonComenzarMouseClicked(evt);
            }
        });

        botonPausar.setText("Pausar");
        botonPausar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonPausarMouseClicked(evt);
            }
        });

        jLabel1.setText("Pista:");

        labelNombrePista.setText("_____");

        jLabel3.setText("Largo:");

        labelLargoPista.setText("_____");

        tablaCorredores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Corredor", "Distancia"
            }
        ));
        jScrollPane1.setViewportView(tablaCorredores);

        botonAgregar.setText("Agregar");
        botonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarMouseClicked(evt);
            }
        });

        jLabel5.setText("Nombre Pista");

        jLabel6.setText("Numero Identificador");

        jLabel7.setText("Nombre Corredor");

        tiposAutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mcqueen", "Nascar", "Convertible" }));

        botonColor.setText("Color");
        botonColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonColorMouseClicked(evt);
            }
        });

        botonGuardar.setText("Guardar");
        botonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGuardarMouseClicked(evt);
            }
        });

        jLabel8.setText("Largo");

        botonUsarPista.setText("Usar Pista");
        botonUsarPista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonUsarPistaMouseClicked(evt);
            }
        });

        botonReiniciar.setText("Reiniciar");
        botonReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonReiniciarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombreCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cajaCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botonAgregar))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(numeroIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(largoPista)
                            .addComponent(nombrePista))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(botonComenzar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botonPausar)
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelNombrePista)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelLargoPista))
                                    .addComponent(jScrollPane1)
                                    .addComponent(barraCorredores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tiposAutos, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(botonColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(botonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))))
                                .addGap(133, 133, 133)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botonUsarPista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 23, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonComenzar)
                    .addComponent(botonPausar)
                    .addComponent(jLabel1)
                    .addComponent(labelNombrePista)
                    .addComponent(jLabel3)
                    .addComponent(labelLargoPista))
                .addGap(18, 18, 18)
                .addComponent(barraCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregar)
                    .addComponent(jLabel5)
                    .addComponent(nombrePista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(numeroIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(largoPista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nombreCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonUsarPista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tiposAutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonColor)
                    .addComponent(botonReiniciar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonGuardar)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarMouseClicked
        // TODO add your handling code here:
      
       
         TiposdeAutos car= new TiposdeAutos(tiposAutos.getSelectedItem().toString(),Integer.parseInt(numeroIdentificador.getText()),distancia,nombreCorredor.getText(),color);   
         tipos.add(car);
        DefaultComboBoxModel autitos=(DefaultComboBoxModel)cajaCorredores.getModel();
        autitos.addElement(car.getNumeroIdentificador()); 
        cajaCorredores.setModel(autitos);
       
        try {
        admin= new AdminBinarios("./Corredores.cbm");
        admin.cargarArchivo();
        admin.setListaCorredores(tipos);
        admin.escribirArchivo();
            JOptionPane.showMessageDialog(this, "Equipo agregado Exitosamente");
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(this, "Nose puede agregar el Equipo");
        }
        numeroIdentificador.setText("");
        nombreCorredor.setText("");
        color=null;
        
        
        
    }//GEN-LAST:event_botonGuardarMouseClicked

    private void botonColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonColorMouseClicked
        // TODO add your handling code here:
        color=JColorChooser.showDialog(this,"Seleccione un Color", color);
        botonColor.setBackground(color);
        
    }//GEN-LAST:event_botonColorMouseClicked

    private void botonComenzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonComenzarMouseClicked
        // TODO add your handling code here:
        if(tiposAutos.getSelectedItem().equals("Mcqueen")){
             distancia=autos.DistanciaRecorrida1(); }
         else if(tiposAutos.getSelectedItem().equals("Nascar")){
             distancia=autos.DistanciaRecorrida2(); }
         else if(tiposAutos.getSelectedItem().equals("Convertible")){
             distancia=autos.DistanciaRecorrida3(); }
       
        
    }//GEN-LAST:event_botonComenzarMouseClicked

    private void botonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseClicked
        // TODO add your handling code here: 
        DefaultComboBoxModel autitos=(DefaultComboBoxModel)cajaCorredores.getModel();
        DefaultTableModel comb= (DefaultTableModel)tablaCorredores.getModel();
        String []arr= new String[3];
        int pos=cajaCorredores.getSelectedIndex();
        arr[0]=String.valueOf(tipos.get(pos).getNumeroIdentificador());
        arr[1]=tipos.get(pos).getNombre();
        arr[2]=String.valueOf(tipos.get(pos).getDistanciaRecorrida()+tipos.get(pos).getDistanciaRecorrida());       
        comb.addRow(arr);
    }//GEN-LAST:event_botonAgregarMouseClicked

    private void botonUsarPistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonUsarPistaMouseClicked
        // TODO add your handling code here:
        if(nombrePista.getText().isBlank() && largoPista.getText().isBlank() ){
          labelNombrePista.setText("_____") ;
          labelLargoPista.setText("_____");
          JOptionPane.showMessageDialog(null, "Nose puede agregar ya que esta vacia");
        }
        else{
        labelNombrePista.setText(nombrePista.getText());
        labelLargoPista.setText(String.valueOf(largoPista.getText()));
         JOptionPane.showMessageDialog(null, "Pista Agregada!");
         nombrePista.setText("");
         largoPista.setText("");
        }
    }//GEN-LAST:event_botonUsarPistaMouseClicked

    private void botonReiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonReiniciarMouseClicked
        // TODO add your handling code here:
        labelNombrePista.setText("_____") ;
          labelLargoPista.setText("_____");
         nombrePista.setText("");
         largoPista.setText("");
         DefaultTableModel comb= (DefaultTableModel)tablaCorredores.getModel();
        String []arr= new String[3];
        arr[0]=" ";
        arr[1]=" ";
        arr[2]=" ";       
        comb.addRow(arr);
    }//GEN-LAST:event_botonReiniciarMouseClicked

    private void botonPausarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPausarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPausarMouseClicked

 

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraCorredores;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonColor;
    private javax.swing.JButton botonComenzar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonPausar;
    private javax.swing.JButton botonReiniciar;
    private javax.swing.JButton botonUsarPista;
    private javax.swing.JComboBox<String> cajaCorredores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelLargoPista;
    private javax.swing.JLabel labelNombrePista;
    private javax.swing.JTextField largoPista;
    private javax.swing.JTextField nombreCorredor;
    private javax.swing.JTextField nombrePista;
    private javax.swing.JTextField numeroIdentificador;
    private javax.swing.JTable tablaCorredores;
    private javax.swing.JComboBox<String> tiposAutos;
    // End of variables declaration//GEN-END:variables
 Color color=null;
 AdminAutos autos;
 ArrayList<TiposdeAutos> tipos=new ArrayList();
 int distancia;
 AdminBinarios admin;
}
