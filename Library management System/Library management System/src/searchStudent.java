
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class searchStudent extends javax.swing.JFrame {
    public Connection cn;
    public Statement st;
    /**
     * Creates new form searchStudent
     */
    public searchStudent() {
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

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblStudentID = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblBirthday = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblYrc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 850));
        getContentPane().setLayout(null);

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(1129, 741, 120, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 48)); // NOI18N
        jLabel1.setText("Search Student");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(560, 30, 400, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Student ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(520, 130, 90, 22);

        txtStudentID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtStudentID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStudentIDKeyTyped(evt);
            }
        });
        getContentPane().add(txtStudentID);
        txtStudentID.setBounds(630, 130, 230, 28);

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(880, 130, 120, 31);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Student ID: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 290, 150, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Name: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 340, 110, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Gender: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(280, 390, 110, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Birthday: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 440, 120, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Address:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(270, 490, 120, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Year Level / Course: ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(180, 540, 210, 30);

        lblStudentID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(lblStudentID);
        lblStudentID.setBounds(400, 290, 450, 30);

        lblName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(lblName);
        lblName.setBounds(400, 340, 450, 30);

        lblGender.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(lblGender);
        lblGender.setBounds(400, 390, 450, 30);

        lblBirthday.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(lblBirthday);
        lblBirthday.setBounds(400, 440, 450, 30);

        lblAddress.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(lblAddress);
        lblAddress.setBounds(400, 490, 450, 30);

        lblYrc.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(lblYrc);
        lblYrc.setBounds(400, 540, 450, 30);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Date Borrowed"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(940, 290, 400, 290);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Library Records");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1060, 230, 160, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Student's Information");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(300, 230, 180, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/istockphoto-1132077472-612x612 (2).jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 1500, 850);

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

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String studID = txtStudentID.getText();
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        tblModel.setRowCount(0);
        
        if(studID.equals("")){
            JOptionPane.showMessageDialog(null, "Fill the necessary details");
        }
        else if(studID.length()!=5){
            JOptionPane.showMessageDialog(null, "Invalid Student Number");
            txtStudentID.setText("");
            lblStudentID.setText("");
            lblName.setText("");
            lblGender.setText("");
            lblBirthday.setText("");
            lblAddress.setText("");
            lblYrc.setText("");
        }
        else{
            try{
                
                String search = "SELECT `STUDENT ID`,`LAST NAME`,`FIRST NAME`,`MIDDLE NAME`,`GENDER`,`BIRTHDAY`,`ADDRESS`,`YEAR LEVEL`,`COURSE` FROM `student` WHERE `STUDENT ID` = "+studID+";";
                ResultSet rs = st.executeQuery(search);
                
                if (rs.next()==false){
                    JOptionPane.showMessageDialog(null, "This student is not registered.");
                    txtStudentID.setText("");
                    lblStudentID.setText("");
                    lblName.setText("");
                    lblGender.setText("");
                    lblBirthday.setText("");
                    lblAddress.setText("");
                    lblYrc.setText("");
                }
                else{
                    lblStudentID.setText(rs.getString("STUDENT ID"));
                    lblName.setText(rs.getString("LAST NAME") + ", " + rs.getString("FIRST NAME") + " " + rs.getString("MIDDLE NAME"));
                    lblGender.setText(rs.getString("GENDER"));
                    lblBirthday.setText(rs.getString("BIRTHDAY"));
                    lblAddress.setText(rs.getString("ADDRESS"));
                    lblYrc.setText(rs.getString("YEAR LEVEL") + " - " + rs.getString("COURSE"));
                    
                   
                    
                    String ssql = "SELECT `BOOK ID`,`BORROW DATE` FROM `transaction` WHERE `STUDENT ID` ="+studID+" AND `RETURN DATE` IS NULL;";
                    
        
                    rs = st.executeQuery(ssql);

                    if(rs.next()==false){
                        
                    }
                    else{
                        String book = rs.getString("BOOK ID");
                        String bdate = rs.getString("BORROW DATE");

                        Object tbData[] = {book, bdate};
                        tblModel.addRow(tbData);

                        while(rs.next()){
                            book = rs.getString("BOOK ID");
                            bdate = rs.getString("BORROW DATE");

                            Object tbData2[] = {book, bdate};
                            tblModel.addRow(tbData2);
                        }

                    }
                }

            }
            catch (SQLException ex){
                Logger.getLogger(searchStudent.class.getName()).log(Level.SEVERE,null,ex);
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(searchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JLabel lblYrc;
    private javax.swing.JTextField txtStudentID;
    // End of variables declaration//GEN-END:variables
}
