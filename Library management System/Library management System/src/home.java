
import javax.swing.JFrame;

public class home extends javax.swing.JFrame {

    public home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnsearchStudent = new javax.swing.JButton();
        btnaddStudent = new javax.swing.JButton();
        btnsearchBook = new javax.swing.JButton();
        btnaddBook = new javax.swing.JButton();
        btnborrowBook = new javax.swing.JButton();
        btnreturnBook = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        btnviewRecords = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 850));
        getContentPane().setLayout(null);

        btnsearchStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsearchStudent.setText("Search Student");
        btnsearchStudent.setPreferredSize(new java.awt.Dimension(140, 30));
        btnsearchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchStudentActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearchStudent);
        btnsearchStudent.setBounds(260, 330, 210, 80);

        btnaddStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnaddStudent.setText("Add Student");
        btnaddStudent.setPreferredSize(new java.awt.Dimension(140, 30));
        btnaddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddStudentActionPerformed(evt);
            }
        });
        getContentPane().add(btnaddStudent);
        btnaddStudent.setBounds(260, 470, 210, 80);

        btnsearchBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsearchBook.setText("Search Book");
        btnsearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchBookActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearchBook);
        btnsearchBook.setBounds(550, 330, 210, 80);

        btnaddBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnaddBook.setText("Add Book");
        btnaddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddBookActionPerformed(evt);
            }
        });
        getContentPane().add(btnaddBook);
        btnaddBook.setBounds(550, 470, 210, 80);

        btnborrowBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnborrowBook.setText("Borrow Book");
        btnborrowBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrowBookActionPerformed(evt);
            }
        });
        getContentPane().add(btnborrowBook);
        btnborrowBook.setBounds(830, 330, 210, 80);

        btnreturnBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnreturnBook.setText("Return Book");
        btnreturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnBookActionPerformed(evt);
            }
        });
        getContentPane().add(btnreturnBook);
        btnreturnBook.setBounds(830, 470, 210, 80);

        btnlogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogout);
        btnlogout.setBounds(620, 650, 210, 70);

        btnviewRecords.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnviewRecords.setText("View Book Records");
        btnviewRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewRecordsActionPerformed(evt);
            }
        });
        getContentPane().add(btnviewRecords);
        btnviewRecords.setBounds(1120, 400, 210, 80);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 3, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LIBRARY MANAGEMENT SYSTEM");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 150, 874, 93);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/istockphoto-1132077472-612x612 (2).jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1520, 850);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsearchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchStudentActionPerformed
        setVisible(false);
        new searchStudent().setVisible(true);
    }//GEN-LAST:event_btnsearchStudentActionPerformed

    private void btnaddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddStudentActionPerformed
        setVisible(false);
        new addStudent().setVisible(true);
    }//GEN-LAST:event_btnaddStudentActionPerformed

    private void btnsearchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchBookActionPerformed
        setVisible(false);
        new searchBook().setVisible(true);
    }//GEN-LAST:event_btnsearchBookActionPerformed

    private void btnaddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddBookActionPerformed
        setVisible(false);
        new addBook().setVisible(true);
    }//GEN-LAST:event_btnaddBookActionPerformed

    private void btnborrowBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrowBookActionPerformed
        setVisible(false);
        new borrowBook().setVisible(true);
    }//GEN-LAST:event_btnborrowBookActionPerformed

    private void btnreturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnBookActionPerformed
        setVisible(false);
        new returnBook().setVisible(true);
    }//GEN-LAST:event_btnreturnBookActionPerformed

    private void btnviewRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewRecordsActionPerformed
        setVisible(false);
        new viewRecords().setVisible(true);
    }//GEN-LAST:event_btnviewRecordsActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_btnlogoutActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddBook;
    private javax.swing.JButton btnaddStudent;
    private javax.swing.JButton btnborrowBook;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnreturnBook;
    private javax.swing.JButton btnsearchBook;
    private javax.swing.JButton btnsearchStudent;
    private javax.swing.JButton btnviewRecords;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
