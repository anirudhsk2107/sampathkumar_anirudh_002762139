/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI_Info;

import Emp_Info.Employee;
import Emp_Info.EmployeeHistory;
import java.awt.Image;
import java.io.File;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Anirudh
 */
public class ViewEmpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewEmpJPanel
     */
    
    EmployeeHistory employeeHistory;
    
    public ViewEmpJPanel(EmployeeHistory employeeHistory) {
        initComponents();
        this.employeeHistory = employeeHistory;
        getTableData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStrtDate = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        lblTeamInfo = new javax.swing.JLabel();
        txtTeamInfo = new javax.swing.JTextField();
        lblPosTitle = new javax.swing.JLabel();
        txtPosTitle = new javax.swing.JTextField();
        lblPhoneNo = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        lblEmailAdd = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtEmailAdd = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblEmpId = new javax.swing.JLabel();
        txtEmpId = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewEmpData = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnUpdateImg = new javax.swing.JButton();
        dtStartDate = new com.toedter.calendar.JDateChooser();
        txtSearchFilter = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(1200, 500));

        lblStrtDate.setText("Start Date");

        lblLevel.setText("Level");

        lblTeamInfo.setText("Team Info");

        lblPosTitle.setText("Position Title");

        txtPosTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosTitleActionPerformed(evt);
            }
        });

        lblPhoneNo.setText("Phone Number");

        lblEmailAdd.setText("Email Address");

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTitle.setText("View Details");
        lblTitle.setToolTipText("");

        lblPhoto.setText("Picture");

        lblName.setText("Name");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblEmpId.setText("Employee ID");

        txtEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpIdActionPerformed(evt);
            }
        });

        lblAge.setText("Age");

        lblGender.setText("Gender");

        tblViewEmpData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Employee ID", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Phone No", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewEmpData);
        if (tblViewEmpData.getColumnModel().getColumnCount() > 0) {
            tblViewEmpData.getColumnModel().getColumn(1).setResizable(false);
            tblViewEmpData.getColumnModel().getColumn(1).setPreferredWidth(35);
            tblViewEmpData.getColumnModel().getColumn(2).setResizable(false);
            tblViewEmpData.getColumnModel().getColumn(2).setPreferredWidth(25);
            tblViewEmpData.getColumnModel().getColumn(3).setResizable(false);
            tblViewEmpData.getColumnModel().getColumn(3).setPreferredWidth(20);
            tblViewEmpData.getColumnModel().getColumn(4).setResizable(false);
            tblViewEmpData.getColumnModel().getColumn(4).setPreferredWidth(30);
            tblViewEmpData.getColumnModel().getColumn(8).setPreferredWidth(60);
        }

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnUpdateImg.setText("Update Image");
        btnUpdateImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateImgActionPerformed(evt);
            }
        });

        txtSearchFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchFilterActionPerformed(evt);
            }
        });
        txtSearchFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchFilterKeyReleased(evt);
            }
        });

        lblSearch.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSearch.setText("Search");

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAge)
                            .addComponent(lblName)
                            .addComponent(lblTeamInfo)
                            .addComponent(lblPhoto)
                            .addComponent(lblStrtDate))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdateImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTeamInfo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(dtStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAge))
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPosTitle)
                                .addGap(76, 76, 76)
                                .addComponent(txtPosTitle))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblEmailAdd)
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmailAdd)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmpId)
                                .addGap(76, 76, 76)
                                .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPhoneNo)
                                .addGap(64, 64, 64)
                                .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLevel)
                                    .addComponent(lblGender))
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLevel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(cbGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(846, 846, 846))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnView)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEdit)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDelete)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(txtSearchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpId)
                    .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGender)
                    .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblStrtDate)
                        .addComponent(lblLevel)
                        .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTeamInfo)
                    .addComponent(lblPhoneNo)
                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPosTitle))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmailAdd)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPhoto)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateImg)
                    .addComponent(btnUpdate))
                .addGap(55, 55, 55))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpIdActionPerformed

    private void txtPosTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPosTitleActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblViewEmpData.getSelectedRow();
        
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this,"Please Select a row to view!");
            return;
        }
        
         
        btnUpdate.setVisible(false);
        btnUpdateImg.setVisible(false);
        
        DefaultTableModel model  = (DefaultTableModel) tblViewEmpData.getModel();
        Employee employee = (Employee) model.getValueAt(selectedRow, 0);

        txtName.setEnabled(false);
        txtEmpId.setEnabled(false);
        txtAge.setEnabled(false);
        cbGender.setEnabled(false);
        dtStartDate.setEnabled(false);
        txtLevel.setEnabled(false);
        txtTeamInfo.setEnabled(false);
        txtPosTitle.setEnabled(false);
        txtPhoneNo.setEnabled(false);
        txtEmailAdd.setEnabled(false);
        
        txtName.setText(employee.getName());
        txtEmpId.setText(String.valueOf(employee.getEmpId()));
        txtAge.setText(String.valueOf(employee.getAge()));
        cbGender.setSelectedItem(String.valueOf(employee.getSex()));
        dtStartDate.setDate(employee.getStrtDate());
        txtLevel.setText(employee.getLevel());
        txtTeamInfo.setText(employee.getTeamInfo());
        txtPosTitle.setText(employee.getPosition());
        txtPhoneNo.setText(String.valueOf(employee.getPhNmbr()));
        txtEmailAdd.setText(employee.getEmail());
        lblImage.setIcon(employee.getPhoto());
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblViewEmpData.getSelectedRow();
        
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this,"Please Select a row to delete!");
            return;
        }
        
        DefaultTableModel model  = (DefaultTableModel) tblViewEmpData.getModel();
        Employee employee = (Employee) model.getValueAt(selectedRow, 0);
        
        employeeHistory.DeleteEmployee(employee);
        JOptionPane.showMessageDialog(this,"Employee record deleted.");
        
        txtName.setText("");
        txtEmpId.setText("");
        txtAge.setText("");
        //txtGender.setText("");
//        txtStrtDate.setText("");
        dtStartDate.setDate(null);
        txtLevel.setText("");
        txtTeamInfo.setText("");
        txtPosTitle.setText("");
        txtEmailAdd.setText("");
        txtPhoneNo.setText("");
        lblImage.setIcon(new ImageIcon());
        
        getTableData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblViewEmpData.getSelectedRow();
        
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this,"Please Select a row to update!");
            return;
        }
        
        btnUpdate.setVisible(true);
        btnUpdateImg.setVisible(true);
        
        txtName.setEnabled(true);
        txtEmpId.setEnabled(true);
        txtAge.setEnabled(true);
        //txtGender.setEnabled(true);
//        txtStrtDate.setEnabled(true);
        cbGender.setEnabled(true);
        dtStartDate.setEnabled(true);
        txtLevel.setEnabled(true);
        txtTeamInfo.setEnabled(true);
        txtPosTitle.setEnabled(true);
        txtPhoneNo.setEnabled(true);
        txtEmailAdd.setEnabled(true);
        
        DefaultTableModel model  = (DefaultTableModel) tblViewEmpData.getModel();
        Employee employee = (Employee) model.getValueAt(selectedRow, 0);
        
        txtName.setText(employee.getName());
        txtEmpId.setText(String.valueOf(employee.getEmpId()));
        txtAge.setText(String.valueOf(employee.getAge()));
        //txtGender.setText(String.valueOf(employee.getSex()));
//        txtStrtDate.setText(employee.getStrtDate());
        cbGender.setSelectedItem(String.valueOf(employee.getSex()));
        dtStartDate.setDate(employee.getStrtDate());
        txtLevel.setText(employee.getLevel());
        txtTeamInfo.setText(employee.getTeamInfo());
        txtPosTitle.setText(employee.getPosition());
        txtPhoneNo.setText(String.valueOf(employee.getPhNmbr()));
        txtEmailAdd.setText(employee.getEmail());
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnUpdateImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateImgActionPerformed
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
    }//GEN-LAST:event_btnUpdateImgActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblViewEmpData.getSelectedRow();
        
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this,"Please Select a row to update!");
            return;
        }
        
        String name = txtName.getText();
        int empId = Integer.parseInt(txtEmpId.getText());
        int age = Integer.parseInt(txtAge.getText());
        //char sex = txtGender.getText().charAt(0);
//        String strtDate = txtStrtDate.getText();
        char sex = cbGender.getSelectedItem().toString().charAt(0);
        Date strtDate = dtStartDate.getDate();
        String level = txtLevel.getText();
        String teamInfo = txtTeamInfo.getText();
        String position = txtPosTitle.getText();
        String email = txtEmailAdd.getText();
        long phNmbr = Long.parseLong(txtPhoneNo.getText());
        ImageIcon img = (ImageIcon) lblImage.getIcon();
        
        DefaultTableModel model  = (DefaultTableModel) tblViewEmpData.getModel();
        Employee emp = (Employee) model.getValueAt(selectedRow, 0);
        
        emp.setName(name);
        emp.setAge(age);
        emp.setEmpId(empId);
        emp.setSex(sex);
        emp.setStrtDate(strtDate);
        emp.setLevel(level);
        emp.setTeamInfo(teamInfo);
        emp.setPosition(position);
        emp.setEmail(email);
        emp.setPhNmbr(phNmbr);
        emp.setPhoto(img);
        
        JOptionPane.showMessageDialog(this,"Employee data updated successfully"); 
        
        txtName.setText("");
        txtEmpId.setText("");
        txtAge.setText("");
        //txtGender.setText("");
//        txtStrtDate.setText("");
        dtStartDate.setDate(null);
        txtLevel.setText("");
        txtTeamInfo.setText("");
        txtPosTitle.setText("");
        txtEmailAdd.setText("");
        txtPhoneNo.setText("");
        lblImage.setIcon(new ImageIcon());
        
        getTableData();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtSearchFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchFilterKeyReleased
        // TODO add your handling code here:
        String searchQuery = txtSearchFilter.getText().toLowerCase();
        searchFilter(searchQuery);
    }//GEN-LAST:event_txtSearchFilterKeyReleased

    private void txtSearchFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchFilterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateImg;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> cbGender;
    private com.toedter.calendar.JDateChooser dtStartDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblEmailAdd;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPosTitle;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblStrtDate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblViewEmpData;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmailAdd;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtPosTitle;
    private javax.swing.JTextField txtSearchFilter;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables

    private void getTableData() {
         
        btnUpdate.setVisible(false);
        btnUpdateImg.setVisible(false);
        
        DefaultTableModel model = (DefaultTableModel) tblViewEmpData.getModel(); 
        model.setRowCount(0); 
        
        for (Employee emp : employeeHistory.getEmployeeList()){
            
            Object[] row = new Object[10];
            
            row[0] = emp;
            row[1] = emp.getEmpId();
            row[2] = emp.getAge();
            row[3] = emp.getSex();
            row[4] = emp.getStrtDate();
            row[5] = emp.getLevel();
            row[6] = emp.getTeamInfo();
            row[7] = emp.getPosition();
            row[8] = emp.getPhNmbr();
            row[9] = emp.getEmail();
            
            model.addRow(row);
        }
    }
    
    private void searchFilter(String searchQuery){
        
        DefaultTableModel model  = (DefaultTableModel) tblViewEmpData.getModel();
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        tblViewEmpData.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(searchQuery));
    }
}
