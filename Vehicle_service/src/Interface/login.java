/*
/*
      **********Author***********
*************Ruwan Kumara**************

*/
 
package Interface;
import java.lang.*;
//import static inter.Home.getDate;
//import static inter.Home.getTime;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
//import org.exolab.castor.types.Date;

/**
 *
 * @author Ruwan
 */
public class login extends javax.swing.JFrame {


    
    
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
     txtusername.setFocusable(true); 
   //  backup();
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtusername = new javax.swing.JTextField();
        txtpsw = new javax.swing.JPasswordField();
        chkboxspwd = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtusername.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        txtusername.setName(""); // NOI18N
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 25, 180, -1));
        txtusername.getAccessibleContext().setAccessibleName("");
        txtusername.getAccessibleContext().setAccessibleDescription("");

        txtpsw.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtpsw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpswActionPerformed(evt);
            }
        });
        jPanel1.add(txtpsw, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 55, 180, -1));

        chkboxspwd.setBackground(new java.awt.Color(204, 204, 255));
        chkboxspwd.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        chkboxspwd.setText("Show password");
        chkboxspwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkboxspwdActionPerformed(evt);
            }
        });
        jPanel1.add(chkboxspwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 140, 20));

        jButton1.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/login.png"))); // NOI18N
        jButton1.setText("Login");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 80, -1));

        jButton2.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cancel.png"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 80, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/admin.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 120));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 329, 160));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 370, 280));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 170));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //       this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

//    private void backup()
//    {
//        
//        String date=new SimpleDateFormat("yyy-MM-dd").format(new Date());
//        path="G:\\";
//         path = path + "_" + date + ".sql";
//        try {
//            Runtime run= Runtime.getRuntime();
//            pr=run.exec("C://wamp64//bin//mysql//mysql5.7.21//bin//mysqldump.exe -uroot  --add-drop-database -B computer_shop -r"+ path);
//            
//            int processComplete= pr.waitFor();
//            if(processComplete==0)
//            {
//           // JOptionPane.showMessageDialog(rootPane, "Backup Success");
//            }
//            else
//            {
//            JOptionPane.showMessageDialog(rootPane, "Fail");
//            }
//            
//            
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(rootPane, e);
//        }
//    
//    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //           Calendar expireDate = Calendar.getInstance();
        //
        //                   // January is 0 (y, m, d)
        //                   expireDate.set(2020, 7, 19);
        //                   // Get current date and compare
        //                   if (Calendar.getInstance().after(expireDate)) {
            //                     // Die
            //                     JOptionPane.showMessageDialog(rootPane, "Sorry Your Froduct Is Expired");
            //                     System.exit(0);
            //
            //                   }
        //                   else
        //                   {

            String uname=txtusername.getText();
            String pword=txtpsw.getText();
            if(uname.equals("admin") && pword.equals("123"))
            {
                Home ho=new Home();
                ho.setVisible(true);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Username or Password Incorrect");
                txtusername.setText("");
                txtpsw.setText("");
            }

            //     }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chkboxspwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkboxspwdActionPerformed
        if(chkboxspwd.isSelected())
        {
            txtpsw.setEchoChar((char)0);
        }
        else
        {
            txtpsw.setEchoChar('*');
        }
    }//GEN-LAST:event_chkboxspwdActionPerformed

    private void txtpswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpswActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpswActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed
  Process pr=null;
  String path=null;
  
  
  
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkboxspwd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtpsw;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

   

    
}
