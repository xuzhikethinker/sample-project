/*
 * EdgePropertyDialog.java
 *
 * Created on March 22, 2007, 2:23 PM
 * Copyright 2007 Grotto Networking
 */
package mousemenu;

/**
 * Created with IntelliJ IDEA.
 * User: ipaezana
 * Date: 6/14/12
 * Time: 12:54 PM
 * To change this template use File | Settings | File Templates.
 */

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author  Greg
 */
public class VertexPropertyDialog extends javax.swing.JDialog {
    GraphElements.MyVertex vertex;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField powerFormattedTextField;
    private javax.swing.JFormattedTextField freqFormattedTextField;
    private javax.swing.JCheckBox isDataCollectorCheckBox;

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // private javax.swing.JFormattedTextField wtFormattedTextField;
    // End of variables declaration//GEN-END:variables

    /** Creates new form VertexPropertyDialog */
    public VertexPropertyDialog(java.awt.Frame parent, GraphElements.MyVertex vertex) {
        super(parent, true);
        initComponents();
        this.vertex = vertex;
        setTitle("Vertex: " + vertex.toString());
        this.freqFormattedTextField.setValue(vertex.getFrequency());
        this.isDataCollectorCheckBox.setSelected(vertex.isDataCollector());
        this.powerFormattedTextField.setValue(vertex.getPower());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        freqFormattedTextField = new javax.swing.JFormattedTextField();
        powerFormattedTextField = new javax.swing.JFormattedTextField();
        isDataCollectorCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vertex Properties");
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonHandler(evt);
            }
        });

        jLabel1.setText("Sampling Frequency:");
        jLabel2.setText("Node Power:");
        jLabel3.setText("Is Data Collector:");


        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                                .addContainerGap()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                        .add(jButton1)
                                        .add(layout.createSequentialGroup()
                                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                        .add(jLabel1)
                                                        .add(jLabel2)
                                                        .add(jLabel3))
                                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                        .add(layout.createSequentialGroup()
                                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                                .add(freqFormattedTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                               .add(layout.createSequentialGroup()
                                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                                .add(powerFormattedTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                                .add(isDataCollectorCheckBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                        .add(jLabel1)
                                        .add(freqFormattedTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                                 .add(jLabel2)
                                                .add(powerFormattedTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                        .add(jLabel3)
                                        .add(isDataCollectorCheckBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton1))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonHandler
        vertex.setFrequency((Integer) this.freqFormattedTextField.getValue());
        vertex.setIsDataCollector((Boolean) this.isDataCollectorCheckBox.isSelected());
        vertex.setPower((Integer) this.powerFormattedTextField.getValue());
//        if(this.isDataCollectorCheckBox.isSelected()){
//         // vertex.serColor = Color.GREEN;
//
//           // System.out.println("Deberia cambiar color a verde!!!");
//        }
        // edge.setWeight((Double)this.wtFormattedTextField.getValue());
        dispose();
    }//GEN-LAST:event_okButtonHandler




}

