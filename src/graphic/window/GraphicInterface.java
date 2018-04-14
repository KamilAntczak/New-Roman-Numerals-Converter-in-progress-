/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic.window;

import exceptions.WrongNumberException;
import swap.numbers.ArabicNumberValidation;
import swap.numbers.SwapAlgorithm;

/**
 *
 * @author Kamil
 */
public class GraphicInterface extends javax.swing.JFrame {

    /**
     * Creates new form GraphicInterface
     */
    public GraphicInterface() {
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

        putArabicNumbersField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyOfSwapArea = new javax.swing.JTextArea();
        swapToRomanButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        historyOfSwapArea.setColumns(20);
        historyOfSwapArea.setRows(5);
        jScrollPane1.setViewportView(historyOfSwapArea);

        swapToRomanButton.setText("Swap To Roman");
        swapToRomanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swapToRomanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(putArabicNumbersField)
                    .addComponent(swapToRomanButton, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(putArabicNumbersField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(swapToRomanButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void swapToRomanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swapToRomanButtonActionPerformed
               
        try{
            String userArabicNumber = this.putArabicNumbersField.getText();
            ArabicNumberValidation arabicValidation = new ArabicNumberValidation();
            arabicValidation.validateNumber(userArabicNumber);
            
            SwapAlgorithm swapAlgorithm = new SwapAlgorithm();
            swapAlgorithm.swapToRoman(userArabicNumber);
        }
               
        catch(WrongNumberException e){
            e.returnError();
            this.putArabicNumbersField.setText("");
        }
        
    }//GEN-LAST:event_swapToRomanButtonActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea historyOfSwapArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField putArabicNumbersField;
    private javax.swing.JButton swapToRomanButton;
    // End of variables declaration//GEN-END:variables
}