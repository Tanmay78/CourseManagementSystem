/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_management;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author USER
 */
public class Course extends javax.swing.JFrame {
     Connection myconn=null;
     Statement  myStat=null;
     ResultSet myRs=null;
     String sid;
     String cid;
     JFileChooser chooser;
    /**
     * Creates new form Course
     */
    public Course(String sid, String cid) {
        this.sid=sid;
        this.cid=cid;
       
        initComponents();
        fillfields();
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
        clabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cname = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cattend = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mlabel = new javax.swing.JLabel();
        uploadbutton = new javax.swing.JButton();
        UPLOADLABEL = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pathlabel = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clabel.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        clabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(clabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, 875, 81));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel1.setText("Course Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 208, 139, 45));

        cname.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jPanel1.add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 361, 37));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel2.setText("My attendance");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 279, 139, 42));

        cattend.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jPanel1.add(cattend, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 143, 42));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel3.setText("Total Marks");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 351, 131, 43));

        mlabel.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jPanel1.add(mlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 351, 130, 40));

        uploadbutton.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        uploadbutton.setText("Upload Assignment");
        uploadbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(uploadbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 445, -1, 42));
        jPanel1.add(UPLOADLABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 445, 165, 42));

        jButton1.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jButton1.setText("Open Assignment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 445, 186, 42));
        jPanel1.add(pathlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 445, 238, 52));

        jButton4.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 14, 113, 43));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\gurmeet\\Desktop\\dbms5.jpg")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uploadbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadbuttonActionPerformed
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        chooser.setFileFilter(new FileNameExtensionFilter("PDF files","pdf"));
        int result = chooser.showSaveDialog(this);
       if (result == JFileChooser.APPROVE_OPTION) {
           //JOptionPane.showMessageDialog(this, chooser.getSelectedFile());
           UPLOADLABEL.setText("Assignment Uploaded!");
           File filename = chooser.getSelectedFile();
  
           String filepath= filename.getAbsolutePath();
           conn c=new conn();
        //conn c=new conn();
       int rows;
          String q="Update Student_work set Assignment_solution = '"+filepath+"' where id='"+sid+"' and Course_Code='"+cid+"' ";
          try{
              rows=c.s.executeUpdate(q);
          }
          catch(SQLException ex){
                   Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                   }
       }
       else{
           JOptionPane.showMessageDialog(this, "No file Selected");
       }
    }//GEN-LAST:event_uploadbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         PreparedStatement ps;
        conn c1=new conn();
        conn c=new conn();
        ResultSet rs;
        String q="Select * from Instructor where Course_Code='"+cid+"' ";
        try{
            rs=c.s.executeQuery(q);
            if(rs.next()){
                if(rs.getString("Assignment")!=null){
                    pathlabel.setText(rs.getString("Assignment"));
                }
                else
                   pathlabel.setText("No Assignment uploaded!"); 
            }
        }
        catch(SQLException ex){
                   Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                   }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dispose();
        Student s=new Student(sid);
        s.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed
    public void fillfields(){
        PreparedStatement ps;
        conn c1=new conn();
        conn c=new conn();
        ResultSet rs;
        String q= "select * from Course where Course_Code= '"+cid+"' " ;
        ResultSet rs1;
        String q1="select * from Student_work where id='"+sid+"' and Course_Code='"+cid+"' ";
        try{
            rs=c.s.executeQuery(q);
            rs1=c1.s.executeQuery(q1);
        if(rs.next()&& rs1.next()){
            cname.setText(rs.getString("Course_Name"));
            cattend.setText(rs1.getString("Att_percent")+"%");
            mlabel.setText(rs1.getString("marks"));
        }
        }
        catch(SQLException ex){
                   Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                   }
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
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new Course().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UPLOADLABEL;
    private javax.swing.JLabel cattend;
    public javax.swing.JLabel clabel;
    private javax.swing.JLabel cname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mlabel;
    private javax.swing.JLabel pathlabel;
    private javax.swing.JButton uploadbutton;
    // End of variables declaration//GEN-END:variables
}
