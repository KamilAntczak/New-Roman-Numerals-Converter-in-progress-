/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic.window;

import exceptions.WrongNumberException;
import history.of.convertion.ArabicToRomanHistory;
import convert.numbers.ArabicNumberValidation;
import convert.numbers.ArabicToRomanConvertion;
import convert.numbers.RomanToArabicResultCounter;
import convert.numbers.RomanNumberValidator;
import convert.numbers.RomanToArabicAdder;
import convert.numbers.RomanToArabicConverter;
import history.of.convertion.RomanToArabicHistory;

/**
 *
 * @author Kamil
 */
public class GraphicInterface extends javax.swing.JFrame {
    
    ArabicToRomanHistory arabicToRomanHistory = new ArabicToRomanHistory();
    RomanToArabicHistory romanToArabicHistory = new RomanToArabicHistory();
    
    
    RomanToArabicAdder romanToArabicAdder = new RomanToArabicAdder();
    RomanToArabicConverter romanToArabicConverter = new RomanToArabicConverter();
    RomanNumberValidator romanNumberValidator = new RomanNumberValidator();
    RomanToArabicResultCounter romanResultCounter = new RomanToArabicResultCounter();
    /**
     * Creates new form GraphicInterface
     */
    public GraphicInterface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        putArabicNumbersField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        arabicToRomanSwapAreaHistory = new javax.swing.JTextArea();
        swapToRomanButton = new javax.swing.JButton();
        romanOneButton = new javax.swing.JButton();
        romanFiveButton = new javax.swing.JButton();
        romanTenButton = new javax.swing.JButton();
        romanThausandButton = new javax.swing.JButton();
        romanFiftyButton = new javax.swing.JButton();
        romanHundredButton = new javax.swing.JButton();
        romanFiveHunButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        PutArabicNumberLabel = new javax.swing.JLabel();
        userRomanNumberLabel = new javax.swing.JLabel();
        romanToArabicButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        romanToArabicSwapAreaHistory = new javax.swing.JTextArea();
        resetAllHistoryButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Roman Numerals Converter - Antczak Kamil");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setForeground(java.awt.Color.white);

        arabicToRomanSwapAreaHistory.setColumns(20);
        arabicToRomanSwapAreaHistory.setRows(5);
        jScrollPane1.setViewportView(arabicToRomanSwapAreaHistory);

        swapToRomanButton.setBackground(new java.awt.Color(174, 255, 195));
        swapToRomanButton.setText("Swap To Roman");
        swapToRomanButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        swapToRomanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swapToRomanButtonActionPerformed(evt);
            }
        });

        romanOneButton.setText("I");
        romanOneButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        romanOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romanOneButtonActionPerformed(evt);
            }
        });

        romanFiveButton.setText("V");
        romanFiveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        romanFiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romanFiveButtonActionPerformed(evt);
            }
        });

        romanTenButton.setText("X");
        romanTenButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        romanTenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romanTenButtonActionPerformed(evt);
            }
        });

        romanThausandButton.setText("M");
        romanThausandButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        romanThausandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romanThausandButtonActionPerformed(evt);
            }
        });

        romanFiftyButton.setText("L");
        romanFiftyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        romanFiftyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romanFiftyButtonActionPerformed(evt);
            }
        });

        romanHundredButton.setText("C");
        romanHundredButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        romanHundredButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romanHundredButtonActionPerformed(evt);
            }
        });

        romanFiveHunButton.setText("D");
        romanFiveHunButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        romanFiveHunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romanFiveHunButtonActionPerformed(evt);
            }
        });

        PutArabicNumberLabel.setText("Put Arabic Number Here :");

        userRomanNumberLabel.setText("Your Roman Number :");

        romanToArabicButton.setBackground(new java.awt.Color(174, 255, 195));
        romanToArabicButton.setText("Convert");
        romanToArabicButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        romanToArabicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romanToArabicButtonActionPerformed(evt);
            }
        });

        romanToArabicSwapAreaHistory.setColumns(20);
        romanToArabicSwapAreaHistory.setRows(5);
        jScrollPane2.setViewportView(romanToArabicSwapAreaHistory);

        resetAllHistoryButton.setBackground(new java.awt.Color(255, 160, 160));
        resetAllHistoryButton.setText("RESET HISTORY");
        resetAllHistoryButton.setToolTipText("");
        resetAllHistoryButton.setActionCommand(" RESET HISTORY");
        resetAllHistoryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetAllHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetAllHistoryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(putArabicNumbersField)
                            .addComponent(swapToRomanButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PutArabicNumberLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(romanOneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(romanFiftyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(romanThausandButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(romanFiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(romanTenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(romanToArabicButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(romanHundredButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(romanFiveHunButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userRomanNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetAllHistoryButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(PutArabicNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(putArabicNumbersField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(swapToRomanButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(romanOneButton)
                            .addComponent(romanTenButton)
                            .addComponent(romanFiveButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(romanFiveHunButton)
                            .addComponent(romanHundredButton)
                            .addComponent(romanFiftyButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(romanThausandButton)
                            .addComponent(romanToArabicButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userRomanNumberLabel)
                    .addComponent(resetAllHistoryButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void swapToRomanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swapToRomanButtonActionPerformed
               
        try{
            String userArabicNumber = this.putArabicNumbersField.getText();
            ArabicNumberValidation arabicValidation = new ArabicNumberValidation();
            arabicValidation.validateNumber(userArabicNumber);
            try{
                ArabicToRomanConvertion swapAlgorithm = new ArabicToRomanConvertion();
                String romanResult = swapAlgorithm.swapToRoman(userArabicNumber);
                arabicToRomanHistory.addAtrConvertionToHistory(userArabicNumber, romanResult);
                this.arabicToRomanSwapAreaHistory.setText(arabicToRomanHistory.printListArabicToRoman());
            }
            catch(WrongNumberException e){
                e.outOfRange();
                this.putArabicNumbersField.setText("");
            }
        }    
        catch(WrongNumberException e){
            e.returnError();
            this.putArabicNumbersField.setText("");
        }
        
    }//GEN-LAST:event_swapToRomanButtonActionPerformed

    private void romanFiftyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romanFiftyButtonActionPerformed
        romanToArabicAdder.addNumeberToList("L");
        this.userRomanNumberLabel.setText(romanToArabicAdder.printRomanNumber());
    }//GEN-LAST:event_romanFiftyButtonActionPerformed

    private void romanFiveHunButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romanFiveHunButtonActionPerformed
        romanToArabicAdder.addNumeberToList("D");
        this.userRomanNumberLabel.setText(romanToArabicAdder.printRomanNumber());
    }//GEN-LAST:event_romanFiveHunButtonActionPerformed

    private void romanOneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romanOneButtonActionPerformed
        romanToArabicAdder.addNumeberToList("I");
        this.userRomanNumberLabel.setText(romanToArabicAdder.printRomanNumber());
    }//GEN-LAST:event_romanOneButtonActionPerformed

    private void romanFiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romanFiveButtonActionPerformed
        romanToArabicAdder.addNumeberToList("V");
        this.userRomanNumberLabel.setText(romanToArabicAdder.printRomanNumber());
    }//GEN-LAST:event_romanFiveButtonActionPerformed

    private void romanTenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romanTenButtonActionPerformed
        romanToArabicAdder.addNumeberToList("X");
        this.userRomanNumberLabel.setText(romanToArabicAdder.printRomanNumber());
    }//GEN-LAST:event_romanTenButtonActionPerformed

    private void romanHundredButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romanHundredButtonActionPerformed
        romanToArabicAdder.addNumeberToList("C");
        this.userRomanNumberLabel.setText(romanToArabicAdder.printRomanNumber());
    }//GEN-LAST:event_romanHundredButtonActionPerformed

    private void romanThausandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romanThausandButtonActionPerformed
        romanToArabicAdder.addNumeberToList("M");
        this.userRomanNumberLabel.setText(romanToArabicAdder.printRomanNumber());
    }//GEN-LAST:event_romanThausandButtonActionPerformed

    private void romanToArabicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romanToArabicButtonActionPerformed
        // TODO add your handling code here:
        
        try{
            
            romanNumberValidator.isRomanValid(romanToArabicAdder.getList());
            
                try{
                    
                    romanToArabicConverter.sendListToSwap(romanToArabicAdder.getList());
                    int result = romanResultCounter.resultCounter(romanToArabicConverter.getListOfSwappedValues());
                    romanToArabicHistory.addRomanToArabicHistoryConvertion(romanToArabicAdder.getList().toString(), result);
                    this.romanToArabicSwapAreaHistory.setText(romanToArabicHistory.printListRomanToArabic());
                    romanToArabicAdder.resetAll();
                    this.userRomanNumberLabel.setText("Your Roman Number : ");
                    
                }
                catch(WrongNumberException e){               
                e.returnError();
               }
        }
        catch(WrongNumberException e){
            
             romanToArabicAdder.resetAll();
              this.userRomanNumberLabel.setText("Your Roman Number : ");
            e.returnError();
        }
        
    }//GEN-LAST:event_romanToArabicButtonActionPerformed

    private void resetAllHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetAllHistoryButtonActionPerformed
        // TODO add your handling code here:
        arabicToRomanHistory.resetAll();
        romanToArabicHistory.resetAll();
        
        this.arabicToRomanSwapAreaHistory.setText("");
        this.romanToArabicSwapAreaHistory.setText("");
    }//GEN-LAST:event_resetAllHistoryButtonActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PutArabicNumberLabel;
    private javax.swing.JTextArea arabicToRomanSwapAreaHistory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField putArabicNumbersField;
    private javax.swing.JButton resetAllHistoryButton;
    private javax.swing.JButton romanFiftyButton;
    private javax.swing.JButton romanFiveButton;
    private javax.swing.JButton romanFiveHunButton;
    private javax.swing.JButton romanHundredButton;
    private javax.swing.JButton romanOneButton;
    private javax.swing.JButton romanTenButton;
    private javax.swing.JButton romanThausandButton;
    private javax.swing.JButton romanToArabicButton;
    private javax.swing.JTextArea romanToArabicSwapAreaHistory;
    private javax.swing.JButton swapToRomanButton;
    private javax.swing.JLabel userRomanNumberLabel;
    // End of variables declaration//GEN-END:variables
}
