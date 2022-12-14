/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI_Info;

import Emp_Info.Employee;
import Emp_Info.EmployeeHistory;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Anirudh
 */
public class AddEmpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddEmpJPanel
     */
    
    EmployeeHistory employeeHistory;
    
    public AddEmpJPanel(EmployeeHistory employeeHistory) {
        initComponents();
        this.employeeHistory = employeeHistory;
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEmpId = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblStrtDate = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblTeamInfo = new javax.swing.JLabel();
        lblPosTitle = new javax.swing.JLabel();
        lblPhoneNo = new javax.swing.JLabel();
        lblEmailAdd = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmpId = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtPosTitle = new javax.swing.JTextField();
        txtPhoneNo = new javax.swing.JTextField();
        txtEmailAdd = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        btnAttachImg = new javax.swing.JButton();
        dtStrtDate = new com.toedter.calendar.JDateChooser();
        cbGender = new javax.swing.JComboBox<>();
        cbLevel = new javax.swing.JComboBox<>();
        lblEmailErr = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(700, 500));

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Add Details");
        lblTitle.setToolTipText("");

        lblName.setText("Name");

        lblEmpId.setText("Employee ID");

        lblAge.setText("Age");

        lblGender.setText("Gender");

        lblStrtDate.setText("Start Date");

        lblLevel.setText("Level");

        lblTeamInfo.setText("Team Info");

        lblPosTitle.setText("Position Title");

        lblPhoneNo.setText("Phone Number");

        lblEmailAdd.setText("Email Address");

        lblPhoto.setText("Picture");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpIdActionPerformed(evt);
            }
        });
        txtEmpId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmpIdKeyPressed(evt);
            }
        });

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeKeyPressed(evt);
            }
        });

        txtPhoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneNoKeyPressed(evt);
            }
        });

        txtEmailAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailAddKeyPressed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnAttachImg.setText("Attach Image");
        btnAttachImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachImgActionPerformed(evt);
            }
        });

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        cbGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGenderActionPerformed(evt);
            }
        });

        cbLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAge)
                            .addComponent(lblName)
                            .addComponent(lblEmpId)
                            .addComponent(lblGender)
                            .addComponent(lblLevel))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbGender, 0, 140, Short.MAX_VALUE)
                            .addComponent(txtEmpId)
                            .addComponent(txtAge)
                            .addComponent(txtName)
                            .addComponent(cbLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPhoneNo)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblTeamInfo)
                                                .addComponent(lblEmailAdd))
                                            .addGap(44, 44, 44))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblPhoto)
                                            .addGap(89, 89, 89)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPhoneNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnAttachImg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPosTitle)
                                    .addComponent(lblStrtDate))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dtStrtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                        .addComponent(txtPosTitle)))))))
                .addComponent(lblEmailErr, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitle)
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmpId))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLevel)
                            .addComponent(cbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStrtDate)
                            .addComponent(dtStrtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPosTitle)
                            .addComponent(txtPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTeamInfo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhoneNo)
                            .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmailAdd)
                            .addComponent(txtEmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmailErr, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhoto)
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnAttachImg)
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpIdActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:     

        boolean flag = true;
        StringBuilder errorString = new StringBuilder();
        
        //Validations
        if(txtName.getText().equals("")){
            errorString.append("Name field cannot be blank.\n");
            flag = false;
        }
        if(txtEmpId.getText().equals("")){
            errorString.append("Employee ID cannot be blank.\n");
            flag = false;
        }
        if(txtAge.getText().equals("")){
            errorString.append("Age cannot be blank.\n");
            flag = false;
        }
        if(txtTeamInfo.getText().equals("")){
            errorString.append("Team Information cannot be blank.\n");
            flag = false;
        }
        if(txtPosTitle.getText().equals("")){
            errorString.append("Position Title cannot be blank.\n");
            flag = false;
        }
        if(txtEmailAdd.getText().equals("")){
            errorString.append("Email cannot be blank.\n");
            flag = false;
        }
        if(txtPhoneNo.getText().equals("")){
            errorString.append("Phone number cannot be blank.\n");
            flag = false;
        }
        else if (txtPhoneNo.getText().length() < 10){
            errorString.append("Phone number has to be of 10 digits.\n");
            flag = false;            
        }
        if(!lblEmailErr.getText().equals((""))){
            errorString.append("Please Enter proper email address.\n");
            flag = false;            
        }
        
        if(!flag){
            JOptionPane.showMessageDialog(this,errorString); 
            return;
        }
        
        String name = txtName.getText();
        int empId = Integer.parseInt(txtEmpId.getText());
        int age = Integer.parseInt(txtAge.getText());
        int level = Integer.parseInt(cbLevel.getSelectedItem().toString());
        String teamInfo = txtTeamInfo.getText();
        String position = txtPosTitle.getText();
        String email = txtEmailAdd.getText();
        long phNmbr = Long.parseLong(txtPhoneNo.getText());
        ImageIcon img = (ImageIcon) lblImage.getIcon();
        Date strtDt = (Date) dtStrtDate.getDate();
        char sex = cbGender.getSelectedItem().toString().charAt(0);
        
        Employee emp = employeeHistory.AddNewEmployee();
        
        emp.setName(name);
        emp.setAge(age);
        emp.setEmpId(empId);
        emp.setSex(sex);
        emp.setStrtDate(strtDt);
        emp.setLevel(level);
        emp.setTeamInfo(teamInfo);
        emp.setPosition(position);
        emp.setEmail(email);
        emp.setPhNmbr(phNmbr);
        emp.setPhoto(img);
        
        JOptionPane.showMessageDialog(this,"Employee Data Saved Successfully"); 
        
        txtName.setText("");
        txtEmpId.setText("");
        txtAge.setText("");
        dtStrtDate.setDate(null);
        txtTeamInfo.setText("");
        txtPosTitle.setText("");
        txtEmailAdd.setText("");
        txtPhoneNo.setText("");
        lblImage.setIcon(new ImageIcon());
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAttachImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachImgActionPerformed
        // TODO add your handling code here:  
        
        JFileChooser image = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES","png","jpg","jpeg");
        image.addChoosableFileFilter(fnef);
        int openDialogue = image.showOpenDialog(null);
        
        if(openDialogue == JFileChooser.APPROVE_OPTION){
            File selectedImg = image.getSelectedFile();
            String selectedImgPath = selectedImg.getAbsolutePath(); 
            
            ImageIcon imgIcon = new ImageIcon(selectedImgPath);
            Image img = imgIcon.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);
            lblImage.setIcon(new ImageIcon(img)); 
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a file with extension of .jpg or .jpeg or .png");
        }
    }//GEN-LAST:event_btnAttachImgActionPerformed

    private void cbGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGenderActionPerformed

    private void txtPhoneNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNoKeyPressed
        // TODO add your handling code here:
        String phone = txtPhoneNo.getText();
        int len = phone.length();
        
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'){
            if(len < 10)
                txtPhoneNo.setEditable(true);
            else
                txtPhoneNo.setEditable(false);
        }
        else{
            if (evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()== KeyEvent.VK_DELETE){
                txtPhoneNo.setEditable(true);
            }else{
                txtPhoneNo.setEditable(false);   
            }
        }
    }//GEN-LAST:event_txtPhoneNoKeyPressed

    private void txtEmailAddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailAddKeyPressed
        // TODO add your handling code here:
        
        String regex = "^(.+)@(.+)$";
        Pattern pt = Pattern.compile(regex);
        Matcher match = pt.matcher(txtEmailAdd.getText());
        
        if(!match.matches())
            lblEmailErr.setText("Please enter proper email address.");
        else
            lblEmailErr.setText("");
    }//GEN-LAST:event_txtEmailAddKeyPressed

    private void txtEmpIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpIdKeyPressed
        // TODO add your handling code here:
        
        String empId = txtEmpId.getText();
        int len = empId.length();
        
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'){
            if(len < 9)
                txtEmpId.setEditable(true);
            else
                txtEmpId.setEditable(false);
        }
        else{
            if (evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()== KeyEvent.VK_DELETE){
                txtEmpId.setEditable(true);
            }else{
                txtEmpId.setEditable(false);   
            }
        }
    }//GEN-LAST:event_txtEmpIdKeyPressed

    private void txtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyPressed
        // TODO add your handling code here:
        
        String empId = txtAge.getText();
        int len = empId.length();
        
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'){
            if(len < 3)
                txtAge.setEditable(true);
            else
                txtAge.setEditable(false);
        }
        else{
            if (evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()== KeyEvent.VK_DELETE){
                txtAge.setEditable(true);
            }else{
                txtAge.setEditable(false);   
            }
        }
    }//GEN-LAST:event_txtAgeKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttachImg;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JComboBox<String> cbLevel;
    private com.toedter.calendar.JDateChooser dtStrtDate;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblEmailAdd;
    private javax.swing.JLabel lblEmailErr;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPosTitle;
    private javax.swing.JLabel lblStrtDate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmailAdd;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtPosTitle;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables
}
