package client;

import adt.ArrayList;
import adt.ListInterface;
import entity.Runner;
import java.io.*;
import javax.swing.JOptionPane;

/**
 * Registration.java A client program that uses the List ADT to store the 
 *  list of registered runners for a marathon.
 * @author Kat Tan
 * @version 1.0
 */
public class Registration extends javax.swing.JFrame {

  private ListInterface<Runner> runnerList = new ArrayList<>();

  public Registration() {
    initComponents();
    jtfNumber.setText("" + Runner.getNextNumber());
    jtfName.grabFocus();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jlblTitle = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jbtClose = new javax.swing.JButton();
    jtfName = new javax.swing.JTextField();
    jtfNumber = new javax.swing.JTextField();
    jbtDisplay = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jlblTitle.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
    jlblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jlblTitle.setText("Marathon Registration");

    jLabel2.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
    jLabel2.setText("Name");

    jLabel3.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
    jLabel3.setText("Number");

    jbtClose.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
    jbtClose.setText("Close Registration");
    jbtClose.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jbtCloseActionPerformed(evt);
      }
    });

    jtfName.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
    jtfName.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jtfNameActionPerformed(evt);
      }
    });

    jtfNumber.setEditable(false);
    jtfNumber.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
    jtfNumber.setForeground(new java.awt.Color(0, 102, 255));

    jbtDisplay.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
    jbtDisplay.setText("Display Runners Info");
    jbtDisplay.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jbtDisplayActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jlblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jbtDisplay)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
            .addComponent(jbtClose)
            .addGap(35, 35, 35))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfNumber))
              .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jtfName)))
            .addGap(118, 118, 118))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jlblTitle)
        .addGap(44, 44, 44)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jtfNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(31, 31, 31)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jbtClose, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
          .addComponent(jbtDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(24, 24, 24))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jtfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNameActionPerformed
    String name = jtfName.getText();
    Runner runner = new Runner(name);
    runnerList.add(runner);
    jtfNumber.setText("" + Runner.getNextNumber());
    // jtaResult.setText("Runner List: \n" + formatList(runnerList));
    jtfName.setText("");
    jtfName.grabFocus();
  }//GEN-LAST:event_jtfNameActionPerformed

  private void jbtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDisplayActionPerformed
    JOptionPane.showMessageDialog(null, formatList());
  }//GEN-LAST:event_jbtDisplayActionPerformed

  private void jbtCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCloseActionPerformed
    try {
      File file = new File("runners.dat");
      // System.out.println("***TRACE: " + file.getAbsolutePath());
      ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream(file));
      ooStream.writeObject(runnerList);
      ooStream.close();
      this.dispose();
    } catch (FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_jbtCloseActionPerformed

  public String formatList() {
    String outputStr = "";
    for (int position = 1; position <= runnerList.getNumberOfEntries(); ++position) {
      outputStr += position + ".AL " + runnerList.getEntry(position);
    }
    return outputStr;
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
      java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Registration().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JButton jbtClose;
  private javax.swing.JButton jbtDisplay;
  private javax.swing.JLabel jlblTitle;
  private javax.swing.JTextField jtfName;
  private javax.swing.JTextField jtfNumber;
  // End of variables declaration//GEN-END:variables
}
