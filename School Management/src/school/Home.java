package school;

import db.MyConnection;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Polash
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu1
     */
    Color defaultColor = new Color(102, 153, 255);
    Color hoverColor = new Color(255,102,255);
    int xx, xy;

    public Home() {
        initComponents();
//        setImage();
//        setNumber();
    }

//    private void setImage() {
//        ImageIcon icon = new ImageIcon(getClass().getResource("/icons/school.jpg"));
//        Image img = icon.getImage().getScaledInstance(jLabelImage.getWidth(), jLabelImage.getHeight(), Image.SCALE_SMOOTH);
//        jLabelImage.setIcon(new ImageIcon(img));
//    }

//    private void setNumber() {
//        txtAdmin.setText(String.valueOf(totalAdmins()));
//        txtStudent.setText(String.valueOf(totalStudents()));
//        txtTeacher.setText(String.valueOf(totalTeachers()));
//        txtStaff.setText(String.valueOf(totalStaffs()));
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnManageStudents = new javax.swing.JButton();
        btnManageTeachers = new javax.swing.JButton();
        btnManageStaffs = new javax.swing.JButton();
        btnTeachersRecord = new javax.swing.JButton();
        btnStaffRecord = new javax.swing.JButton();
        btnStudentsRecord = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(740, 450));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        btnManageStudents.setBackground(new java.awt.Color(102, 153, 255));
        btnManageStudents.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnManageStudents.setText("Manage Students");
        btnManageStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageStudentsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageStudentsMouseExited(evt);
            }
        });
        btnManageStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStudentsButtonActionPerformed(evt);
            }
        });

        btnManageTeachers.setBackground(new java.awt.Color(102, 153, 255));
        btnManageTeachers.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnManageTeachers.setText("Manage Teachers");
        btnManageTeachers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageTeachersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageTeachersMouseExited(evt);
            }
        });
        btnManageTeachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTeacherButtonActionPerformed(evt);
            }
        });

        btnManageStaffs.setBackground(new java.awt.Color(255, 102, 255));
        btnManageStaffs.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnManageStaffs.setText("Manage Staffs");
        btnManageStaffs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageStaffsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageStaffsMouseExited(evt);
            }
        });
        btnManageStaffs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStaffButtonActionPerformed(evt);
            }
        });

        btnTeachersRecord.setBackground(new java.awt.Color(102, 153, 255));
        btnTeachersRecord.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnTeachersRecord.setText("Teachers Record");
        btnTeachersRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTeachersRecordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTeachersRecordMouseExited(evt);
            }
        });
        btnTeachersRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherListButtonActionPerformed(evt);
            }
        });

        btnStaffRecord.setBackground(new java.awt.Color(102, 153, 255));
        btnStaffRecord.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnStaffRecord.setText("Staffs Record");
        btnStaffRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStaffRecordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStaffRecordMouseExited(evt);
            }
        });
        btnStaffRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffListButtonActionPerformed(evt);
            }
        });

        btnStudentsRecord.setBackground(new java.awt.Color(102, 153, 255));
        btnStudentsRecord.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnStudentsRecord.setText("Students Record");
        btnStudentsRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStudentsRecordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStudentsRecordMouseExited(evt);
            }
        });
        btnStudentsRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentListButtonActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 102, 102));
        btnLogout.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogoutMouseExited(evt);
            }
        });
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(btnManageStudents, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(btnManageTeachers, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(btnManageStaffs, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(btnStaffRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(btnStudentsRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(btnTeachersRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnManageStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnManageTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnManageStaffs, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStudentsRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTeachersRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStaffRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 730));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SCHOOL MANAGEMENT SYSTEM");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 540, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 860, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1139, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void studentListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentListButtonActionPerformed
        StudentsRecord studentRecord = new StudentsRecord();
        studentRecord.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_studentListButtonActionPerformed

    private void staffListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffListButtonActionPerformed
        StaffsRecord record = new StaffsRecord();
        record.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_staffListButtonActionPerformed

    private void teacherListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherListButtonActionPerformed
        TeachersRecord record = new TeachersRecord();
        record.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_teacherListButtonActionPerformed

    private void addStaffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStaffButtonActionPerformed
        ManageStaffs manageStaffs = new ManageStaffs();
        manageStaffs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addStaffButtonActionPerformed

    private void addTeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTeacherButtonActionPerformed
        ManageTeachers manageTeachers = new ManageTeachers();
        manageTeachers.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addTeacherButtonActionPerformed

    private void btnManageStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStudentsButtonActionPerformed
        ManageStudents record = new ManageStudents();
        record.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnManageStudentsButtonActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "Do you want to logout now?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            new Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnManageStudentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageStudentsMouseEntered
        btnManageStudents.setBackground(hoverColor);
    }//GEN-LAST:event_btnManageStudentsMouseEntered

    private void btnManageStudentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageStudentsMouseExited
        btnManageStudents.setBackground(defaultColor);
    }//GEN-LAST:event_btnManageStudentsMouseExited

    private void btnManageTeachersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageTeachersMouseEntered
        btnManageTeachers.setBackground(hoverColor);
    }//GEN-LAST:event_btnManageTeachersMouseEntered

    private void btnManageStaffsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageStaffsMouseEntered
        btnManageStaffs.setBackground(hoverColor);
    }//GEN-LAST:event_btnManageStaffsMouseEntered

    private void btnStudentsRecordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStudentsRecordMouseEntered
        btnStudentsRecord.setBackground(hoverColor);
    }//GEN-LAST:event_btnStudentsRecordMouseEntered

    private void btnTeachersRecordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTeachersRecordMouseEntered
        btnTeachersRecord.setBackground(hoverColor);
    }//GEN-LAST:event_btnTeachersRecordMouseEntered

    private void btnStaffRecordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStaffRecordMouseEntered
        btnStaffRecord.setBackground(hoverColor);
    }//GEN-LAST:event_btnStaffRecordMouseEntered

    private void btnManageTeachersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageTeachersMouseExited
        btnManageTeachers.setBackground(defaultColor);
    }//GEN-LAST:event_btnManageTeachersMouseExited

    private void btnManageStaffsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageStaffsMouseExited
        btnManageStaffs.setBackground(defaultColor);
    }//GEN-LAST:event_btnManageStaffsMouseExited

    private void btnStudentsRecordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStudentsRecordMouseExited
        btnStudentsRecord.setBackground(defaultColor);
    }//GEN-LAST:event_btnStudentsRecordMouseExited

    private void btnTeachersRecordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTeachersRecordMouseExited
        btnTeachersRecord.setBackground(defaultColor);
    }//GEN-LAST:event_btnTeachersRecordMouseExited

    private void btnStaffRecordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStaffRecordMouseExited
        btnStaffRecord.setBackground(defaultColor);
    }//GEN-LAST:event_btnStaffRecordMouseExited

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void btnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseExited
        btnLogout.setBackground(new Color(255,102,102));
    }//GEN-LAST:event_btnLogoutMouseExited

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
        btnLogout.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_btnLogoutMouseEntered

    //get the total number of admins
//    public int totalAdmins() {
//        int total = 0;
//        Connection con = MyConnection.getConnection();
//        Statement st;
//        try {
//            st = con.createStatement();
//            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'total' FROM admin");
//            while (rs.next()) {
//                total = rs.getInt(1);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return total;
//
//    }

    //get the total number of students
//    public int totalStudents() {
//        int total = 0;
//        Connection con = MyConnection.getConnection();
//        Statement st;
//        try {
//            st = con.createStatement();
//            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'total' FROM student");
//            while (rs.next()) {
//                total = rs.getInt(1);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return total;
//    }
//
//    //get the total number of teachers
//    public int totalTeachers() {
//        int total = 0;
//        Connection con = MyConnection.getConnection();
//        Statement st;
//        try {
//            st = con.createStatement();
//            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'total' FROM teacher");
//            while (rs.next()) {
//                total = rs.getInt(1);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return total;
//    }
//
//    //get the total number of staffs
//    public int totalStaffs() {
//        int total = 0;
//        Connection con = MyConnection.getConnection();
//        Statement st;
//        try {
//            st = con.createStatement();
//            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'total' FROM staff");
//            while (rs.next()) {
//                total = rs.getInt(1);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return total;
//    }  
//    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageStaffs;
    private javax.swing.JButton btnManageStudents;
    private javax.swing.JButton btnManageTeachers;
    private javax.swing.JButton btnStaffRecord;
    private javax.swing.JButton btnStudentsRecord;
    private javax.swing.JButton btnTeachersRecord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    private static class stud extends Component {

        public stud() {
        }
    }
}