
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nabila AAP
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bJK = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        NIS = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbP = new javax.swing.JRadioButton();
        rbL = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        Kelas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Alamat = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        Edit = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM BIODATA SISWA SMK TELKOM");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 20, 480, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("The Real Informatic Schools");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 60, 210, 17);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 840, 90);

        jPanel1.setBackground(new java.awt.Color(153, 255, 0));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("ISIAN DATA SISWA");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 10, 110, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 100, 300, 30);

        jPanel2.setBackground(new java.awt.Color(153, 255, 0));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("NIS");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 10, 110, 14);
        jPanel2.add(NIS);
        NIS.setBounds(10, 30, 150, 20);
        jPanel2.add(Nama);
        Nama.setBounds(10, 80, 150, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Jenis Kelamin");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 110, 110, 14);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Nama");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 60, 110, 14);

        rbP.setBackground(new java.awt.Color(153, 255, 0));
        bJK.add(rbP);
        rbP.setText("Perempuan");
        rbP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPActionPerformed(evt);
            }
        });
        jPanel2.add(rbP);
        rbP.setBounds(90, 130, 90, 23);

        rbL.setBackground(new java.awt.Color(153, 255, 0));
        bJK.add(rbL);
        rbL.setText("Laki-Laki");
        rbL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLActionPerformed(evt);
            }
        });
        jPanel2.add(rbL);
        rbL.setBounds(10, 130, 80, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Kelas");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 160, 110, 14);
        jPanel2.add(Kelas);
        Kelas.setBounds(10, 180, 150, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Alamat");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 260, 110, 14);
        jPanel2.add(Email);
        Email.setBounds(10, 230, 150, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Email");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 210, 110, 14);

        Alamat.setColumns(20);
        Alamat.setRows(5);
        jScrollPane1.setViewportView(Alamat);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 280, 250, 96);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 140, 300, 390);

        jPanel4.setBackground(new java.awt.Color(153, 255, 0));
        jPanel4.setLayout(null);

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        jPanel4.add(Edit);
        Edit.setBounds(410, 10, 90, 30);

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel4.add(Save);
        Save.setBounds(10, 10, 90, 30);

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel4.add(Delete);
        Delete.setBounds(110, 10, 90, 30);

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel4.add(Clear);
        Clear.setBounds(210, 10, 90, 30);

        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel4.add(Refresh);
        Refresh.setBounds(310, 10, 90, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(320, 100, 510, 50);

        jPanel5.setBackground(new java.awt.Color(153, 255, 0));
        jPanel5.setLayout(null);

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "NamaSiswa", "JenisKelamin", "Kelas", "Email", "Alamat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 490, 350);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(320, 160, 510, 370);

        setSize(new java.awt.Dimension(858, 579));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPActionPerformed

    private void rbLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbLActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        if ("".equals(NIS.getText()) || "".equals(Alamat.getText()) || "".equals(Kelas.getText()) || "".equals(Nama.getText()) || "".equals(Email.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
                String JK = "";
                    if (rbL.isSelected()) {
                        JK = "L";
                    } else {
                        JK = "P";
                    }
                String SQL = "INSERT INTO t_siswa (NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat) "
                        + "VALUES('"+NIS.getText()+"','"+Nama.getText()+"','"+JK+"','"
                        + "'"+Kelas.getText()+"','"+Email.getText()+"','"+Alamat.getText()+"')";
                int status = KoneksiDB.execute(SQL);
                if (status == 1) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                    selectData();
                } else {
                    JOptionPane.showMessageDialog(this, "Data Gagal Ditambahkan", "Sukses", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        int baris = tblData.getSelectedRow();
        if (baris != -1) {
            String NIS = tblData.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM t_siswa WHERE NIS='"+NIS+"'";
            int status = KoneksiDB.execute(SQL);
            if (status==1) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data Gagal Dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih Dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        Nama.setText("");
        NIS.setText("");
        Kelas.setText("");
        bJK.clearSelection();
        Email.setText("");
        Alamat.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        selectData();
    }//GEN-LAST:event_RefreshActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        if ("".equals(NIS.getText()) || "".equals(Alamat.getText()) || "".equals(Kelas.getText()) || "".equals(Nama.getText()) || "".equals(Email.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String JK = "";
                if(rbL.isSelected()) {
                    JK = "L";
                } else {
                    JK = "P";
                }
        String SQL = "UPDATE t_siswa SET" 
                + "WHERE NamaSiswa='"+Nama.getText()+"',"+"WHERE JenisKelamin='"+JK+"',"
                + "WHERE Kelas='"+Kelas.getText()+"',"+"WHERE Email='"+Email.getText()+"',"
                + "WHERE Alamat='"+Alamat.getText()+"'"
                + "WHERE NIS='"+NIS.getText()+"'";
        int status = KoneksiDB.execute(SQL);
        if (status == 0) {
            JOptionPane.showMessageDialog(this, "data Berhasil Diupdate", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            selectData();           
            } else {
            JOptionPane.showMessageDialog(this, "Data Gagal Diupdate", "Sukses", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_EditActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        int baris = tblData.getSelectedRow();
        if (baris != -1) {
            NIS.setText(tblData.getValueAt(baris, 0).toString());
            Nama.setText(tblData.getValueAt(baris, 1).toString());
            if ("Laki-Laki".equals(tblData.getValueAt(baris, 2).toString())) {
                rbL.setSelected(true);
            } else {
                rbP.setSelected(true);
            }
            Kelas.setText(tblData.getValueAt(baris, 3).toString());
            Email.setText(tblData.getValueAt(baris, 4).toString());
            Alamat.setText(tblData.getValueAt(baris, 5).toString());
        }
    }//GEN-LAST:event_tblDataMouseClicked

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Alamat;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Kelas;
    private javax.swing.JTextField NIS;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Save;
    private javax.swing.ButtonGroup bJK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbL;
    private javax.swing.JRadioButton rbP;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"NIS","NamaSiswa","JenisKelamin","Kelas","Email","Alamat"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM t_siswa";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try {
            while(rs.next()) {
                String NIS = rs.getString(1);
                String NamaSiswa = rs.getString(2);
                String JenisKelamin = "";
                if ("L".equals(rs.getString(3))) {
                    JenisKelamin = "Laki-Laki";
                } else {
                    JenisKelamin = "Perempuan";
                }
                String Kelas = rs.getString(4);
                String Email = rs.getString(5);
                String Alamat = rs.getString(6);
                String data[] = {NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat};
                dtm.addRow(data);
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
    tblData.setModel(dtm);
    }
}
