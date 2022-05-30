/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vpaysystem;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author SWHB
 */
public class Settings extends javax.swing.JPanel {

    /**
     * Creates new form Settings
     */
    String IP;
    boolean isUpdate=false;
    String myID;
    public Settings(String myID, String IP) {
        initComponents();
        cmsSeparator.setVisible(false);
        nameSeparator.setVisible(false);
        passSeparator.setVisible(false);
        deptSeparator.setVisible(false);
        this.IP=IP;
        this.myID=myID;
        
          Connection con;
        Statement st;
        ResultSet rs;
        System.out.println("Check Out");
            try
            {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@"+IP+":1521:xe","system","bukhari");
              st=con.createStatement();
              
              
   
             
            String sq2="Select * from Customer where CMS_ID='"+myID+"'";
            rs=st.executeQuery(sq2);
            rs.next();
            txtCMS.setText(rs.getString("CMS_ID"));
            txtPassword.setText(rs.getString("Password"));
            txtName.setText(rs.getString("Customer_Name"));
            txtDept.setText(rs.getString("Department"));
            con.close();
            }
            catch (Exception e)
            {
                
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
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel2 = new javax.swing.JLabel();
        txtCMS = new javax.swing.JTextField();
        lblCMS = new javax.swing.JLabel();
        cmsSeparator = new javax.swing.JSeparator();
        lblPassword = new javax.swing.JLabel();
        txtDept = new javax.swing.JTextField();
        passSeparator = new javax.swing.JSeparator();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        nameSeparator = new javax.swing.JSeparator();
        lblDept = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        deptSeparator = new javax.swing.JSeparator();
        btnSave = new javax.swing.JButton();
        nameEdit = new javax.swing.JLabel();
        passEdit1 = new javax.swing.JLabel();
        passEdit2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(52, 52, 60));
        setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Setting");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 10, 0, 0);
        add(jLabel2, gridBagConstraints);

        txtCMS.setEditable(false);
        txtCMS.setBackground(new java.awt.Color(52, 52, 60));
        txtCMS.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtCMS.setForeground(new java.awt.Color(255, 255, 255));
        txtCMS.setBorder(null);
        txtCMS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCMSFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCMSFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 279;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 74, 0, 0);
        add(txtCMS, gridBagConstraints);

        lblCMS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCMS.setForeground(new java.awt.Color(153, 153, 153));
        lblCMS.setText("CMS ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 74, 0, 0);
        add(lblCMS, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 278;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 74, 0, 0);
        add(cmsSeparator, gridBagConstraints);

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(153, 153, 153));
        lblPassword.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 74, 0, 0);
        add(lblPassword, gridBagConstraints);

        txtDept.setEditable(false);
        txtDept.setBackground(new java.awt.Color(52, 52, 60));
        txtDept.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtDept.setForeground(new java.awt.Color(255, 255, 255));
        txtDept.setBorder(null);
        txtDept.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDeptFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDeptFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 279;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 74, 0, 0);
        add(txtDept, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 278;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 74, 0, 0);
        add(passSeparator, gridBagConstraints);

        lblName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(153, 153, 153));
        lblName.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 74, 0, 0);
        add(lblName, gridBagConstraints);

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(52, 52, 60));
        txtName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(null);
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 279;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 74, 0, 0);
        add(txtName, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 278;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 74, 0, 0);
        add(nameSeparator, gridBagConstraints);

        lblDept.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDept.setForeground(new java.awt.Color(153, 153, 153));
        lblDept.setText("Department");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 74, 0, 0);
        add(lblDept, gridBagConstraints);

        txtPassword.setEditable(false);
        txtPassword.setBackground(new java.awt.Color(52, 52, 60));
        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 279;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 74, 0, 0);
        add(txtPassword, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 278;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 74, 0, 0);
        add(deptSeparator, gridBagConstraints);

        btnSave.setBackground(new java.awt.Color(70, 80, 95));
        btnSave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnSaveFocusGained(evt);
            }
        });
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 41;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 60, 53, 0);
        add(btnSave, gridBagConstraints);

        nameEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-24.png"))); // NOI18N
        nameEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nameEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameEditMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 97, 0, 37);
        add(nameEdit, gridBagConstraints);

        passEdit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-24.png"))); // NOI18N
        passEdit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passEdit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passEdit1MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 92, 0, 0);
        add(passEdit1, gridBagConstraints);

        passEdit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-24.png"))); // NOI18N
        passEdit2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passEdit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passEdit2MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 92, 0, 0);
        add(passEdit2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCMSFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCMSFocusGained
        lblCMS.setForeground(Color.white);
    }//GEN-LAST:event_txtCMSFocusGained

    private void txtCMSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCMSFocusLost
        lblCMS.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_txtCMSFocusLost

    private void txtDeptFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDeptFocusGained
        lblDept.setForeground(Color.white);
    }//GEN-LAST:event_txtDeptFocusGained

    private void txtDeptFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDeptFocusLost
        lblDept.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_txtDeptFocusLost

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        lblName.setForeground(Color.white);
    }//GEN-LAST:event_txtNameFocusGained

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        lblName.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_txtNameFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        lblPassword.setForeground(Color.white);
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        lblPassword.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_txtPasswordFocusLost

    private void btnSaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSaveFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveFocusGained

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        btnSave.setBackground(new Color(225,150,100));
        btnSave.setForeground(Color.black);
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        btnSave.setBackground(new Color(70,80,95));
        btnSave.setForeground(Color.white);
    }//GEN-LAST:event_btnSaveMouseExited

    private void nameEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameEditMouseClicked
      isUpdate=true;
     
        nameSeparator.setVisible(true);
       txtName.setEditable(true);
       
    }//GEN-LAST:event_nameEditMouseClicked

    private void passEdit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passEdit1MouseClicked
       isUpdate=true;
       
        passSeparator.setVisible(true);
       txtPassword.setEditable(true);
         
          
        
    }//GEN-LAST:event_passEdit1MouseClicked

    private void passEdit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passEdit2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_passEdit2MouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        nameSeparator.setVisible(false);
        txtName.setEditable(false);
           deptSeparator.setVisible(false);
        txtDept.setEditable(false);
        
           passSeparator.setVisible(false);
        txtPassword.setEditable(false);
        
           cmsSeparator.setVisible(false);
        txtCMS.setEditable(false);
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
      if(isUpdate)
       {
        Connection con;
        Statement st;
        ResultSet rs;
        System.out.println("Check Out");
            try
            {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@"+IP+":1521:xe","system","bukhari");
            st=con.createStatement();
            
   
             
            String sq2="Update Customer set Password='"+txtPassword.getText()+"', Customer_Name='"+txtName.getText()+"' where CMS_ID='"+myID+"'";
            rs=st.executeQuery(sq2);
            
            }
            catch (Exception e)
            {
                
            }
        }
      isUpdate=false;
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JSeparator cmsSeparator;
    private javax.swing.JSeparator deptSeparator;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCMS;
    private javax.swing.JLabel lblDept;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel nameEdit;
    private javax.swing.JSeparator nameSeparator;
    private javax.swing.JLabel passEdit1;
    private javax.swing.JLabel passEdit2;
    private javax.swing.JSeparator passSeparator;
    private javax.swing.JTextField txtCMS;
    private javax.swing.JTextField txtDept;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
