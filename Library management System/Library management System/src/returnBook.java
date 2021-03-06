
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class returnBook extends javax.swing.JFrame {
    public Connection cn;
    public Statement st;
    /**
     * Creates new form ReturnBook
     */
    public returnBook() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement?zeroDateTimeBehavior=convertToNull","root","");
            st = cn.createStatement();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        txtBookID = new javax.swing.JTextField();
        btnReturn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 850));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 48)); // NOI18N
        jLabel1.setText("Return Book");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(560, 150, 298, 65);

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(1160, 660, 120, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Student ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(430, 340, 210, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Book ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 430, 130, 29);

        txtStudentID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtStudentID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStudentIDKeyTyped(evt);
            }
        });
        getContentPane().add(txtStudentID);
        txtStudentID.setBounds(640, 340, 370, 35);

        txtBookID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtBookID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBookIDKeyTyped(evt);
            }
        });
        getContentPane().add(txtBookID);
        txtBookID.setBounds(640, 430, 370, 35);

        btnReturn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn);
        btnReturn.setBounds(640, 580, 130, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/istockphoto-1132077472-612x612 (2).jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1500, 850);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        setVisible(false);
        new home().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtStudentIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStudentIDKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtStudentIDKeyTyped

    private void txtBookIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBookIDKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtBookIDKeyTyped

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        String studID = txtStudentID.getText();
        String bookID = txtBookID.getText();
        Date date = new Date(); 
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");
        String search;
        ResultSet rs;
        int copy, newcopy;
        
        if (studID.equals("") || bookID.equals("")){
            JOptionPane.showMessageDialog(null, "Please fill the necessary details");
        }
        else if (studID.length()!=5 || bookID.length()!=5){
            JOptionPane.showMessageDialog(null, "Invalid ID Input");
        }
        else{
            try{
                search = "SELECT `STUDENT ID`,`BOOK ID`,`RETURN DATE` FROM `transaction` WHERE `STUDENT ID` = "+studID+" AND `BOOK ID`= "+bookID+";";
                rs = st.executeQuery(search);
                if(rs.next()==false){
                    JOptionPane.showMessageDialog(null, "Record not found.");
                    txtStudentID.setText("");
                    txtBookID.setText("");
                }
                else{
                    String bStatus = rs.getString("RETURN DATE");
                    if (bStatus!=null){
                        JOptionPane.showMessageDialog(null, "The Student already returned the book");
                    }
                    else{
                        search = "SELECT `COPIES` FROM `book` WHERE `BOOK ID` = "+bookID+";";
                        rs = st.executeQuery(search);
                        if(rs.next()==false){
                            JOptionPane.showMessageDialog(null, "No copy");
                        }
                        else{
                        copy = rs.getInt("COPIES");

                        String fdate = sdf.format(date);

                        newcopy = copy+1;

                        String updatec = "UPDATE `book` SET `COPIES`="+newcopy+" WHERE `BOOK ID`="+bookID+";";
                        st.executeUpdate(updatec);

                        String updateT = "UPDATE `transaction` SET `RETURN DATE`='"+fdate+"' WHERE `STUDENT ID` = "+studID+" AND `BOOK ID` = "+bookID+";";
                        st.executeUpdate(updateT);

                        JOptionPane.showMessageDialog(null, "Succesfully returned");
                        }
                    }
                }
            }
            catch (SQLException ex){
                Logger.getLogger(searchStudent.class.getName()).log(Level.SEVERE,null,ex);
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_btnReturnActionPerformed

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
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(returnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new returnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtBookID;
    private javax.swing.JTextField txtStudentID;
    // End of variables declaration//GEN-END:variables
}
