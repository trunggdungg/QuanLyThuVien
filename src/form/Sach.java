package form;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import controler.SachModify;
import controler.StudentModify;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class Sach extends javax.swing.JFrame {

    DefaultTableModel tableModelSach;
    List<qltv.Sach> SachList = new ArrayList<>();

    public Sach() {
        initComponents();
        setLocationRelativeTo(null);
        tableModelSach = (DefaultTableModel) tblBangSach.getModel();
        showSach();
    }

    private void showSach() {
        SachList = SachModify.findAll();
        tableModelSach.setRowCount(0);

        SachList.forEach((sach) -> {
            tableModelSach.addRow(new Object[]{tableModelSach.getRowCount() + 1, sach.getMaSach(),
                sach.getTenSach(), sach.getTheLoai(), sach.getTenTacGia(), sach.getNamXuatBan()});
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btntimSAch = new javax.swing.JButton();
        btnXoaSAch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBangSach = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtTheLoai = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnRSSach = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtMasach = new javax.swing.JTextField();
        txttensach = new javax.swing.JTextField();
        txtTenTg = new javax.swing.JTextField();
        bntthemsach = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtNamXB = new javax.swing.JTextField();
        btnclose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(325, 125));

        btntimSAch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btntimSAch.setText("Tìm");
        btntimSAch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimSAchActionPerformed(evt);
            }
        });

        btnXoaSAch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        btnXoaSAch.setText("Xóa");
        btnXoaSAch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSAchActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã sách");

        tblBangSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã sách", "Tên sách", "Thể Loại", "Tên tác giả", "Năm xuất bản"
            }
        ));
        jScrollPane1.setViewportView(tblBangSach);

        jLabel2.setText("Tên sách");

        jLabel4.setText("Tên tác giả");

        btnRSSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rs.png"))); // NOI18N
        btnRSSach.setText("Reset");
        btnRSSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRSSachActionPerformed(evt);
            }
        });

        jLabel5.setText("Thể loại");

        txtMasach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMasachActionPerformed(evt);
            }
        });

        bntthemsach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        bntthemsach.setText("Thêm");
        bntthemsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntthemsachActionPerformed(evt);
            }
        });

        jLabel7.setText("Năm xuất bản");

        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close (1).png"))); // NOI18N
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamXB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenTg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTheLoai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttensach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMasach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(bntthemsach)
                        .addGap(75, 75, 75)
                        .addComponent(btntimSAch)
                        .addGap(55, 55, 55)
                        .addComponent(btnXoaSAch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnRSSach)
                        .addGap(22, 22, 22)))
                .addGap(14, 14, 14)
                .addComponent(btnclose)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMasach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttensach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTenTg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntthemsach)
                    .addComponent(btntimSAch)
                    .addComponent(btnXoaSAch)
                    .addComponent(btnRSSach)
                    .addComponent(btnclose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntimSAchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimSAchActionPerformed
        String input = JOptionPane.showInputDialog(this, "Nhập tên sách bạn muốn tìm");
        if (input != null && input.length() > 0) {
            SachList = SachModify.findByFullname(input);

            tableModelSach.setRowCount(0);

            SachList.forEach((sach) -> {
                tableModelSach.addRow(new Object[]{tableModelSach.getRowCount() + 1, sach.getMaSach(),
                    sach.getTenSach(), sach.getTheLoai(), sach.getTenTacGia(), sach.getNamXuatBan()});
            });
        } else {
            showSach();
        }
    }//GEN-LAST:event_btntimSAchActionPerformed

    private void btnXoaSAchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSAchActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblBangSach.getSelectedRow();
        if (selectedIndex >= 0) {
            qltv.Sach sach = SachList.get(selectedIndex);
            int option = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không ???");
            if (option == 0) {
                SachModify.delete(sach.getMaSach());
                showSach();
            }
        }

    }//GEN-LAST:event_btnXoaSAchActionPerformed

    private void btnRSSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRSSachActionPerformed
        txtMasach.setText("");
        txttensach.setText("");
        txtTenTg.setText("");
        txtTheLoai.setText("");
        txtNamXB.setText(" ");

    }//GEN-LAST:event_btnRSSachActionPerformed

    private void txtMasachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMasachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMasachActionPerformed

    private void bntthemsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntthemsachActionPerformed
   
///
String masach = txtMasach.getText();
    String inputDatA =  txtMasach.getText();
    String inputDatB =  txtNamXB.getText();
    String inputDatC =  txtTenTg.getText();
    String inputDatE =  txtTheLoai.getText();
     String inputDatF =  txttensach.getText();
    
  
try {
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "root");
    Statement st = conn.createStatement();

    ResultSet rs = st.executeQuery("SELECT * FROM Sach WHERE MaSach='" + masach + "'");

    if (rs.next() ) {
    JOptionPane.showMessageDialog(null, "Mã sách đã có trong danh sách!");

                

    } else if(inputDatA.isEmpty() || inputDatB.isEmpty() || inputDatC.isEmpty()|| inputDatE.isEmpty()||inputDatF.isEmpty()) {
        // Nếu không tìm thấy độc giả hoặc sách
             JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!");

      
    }else{
         int maSach = Integer.parseInt(txtMasach.getText());
        
        String tenSach = txttensach.getText();
        String theLoai = txtTheLoai.getText();
        String tenTg = txtTenTg.getText();
        int namXb = Integer.parseInt(txtNamXB.getText());

        qltv.Sach sach = new qltv.Sach(maSach, tenSach, theLoai, tenTg, namXb);
        SachModify.insert(sach);
        showSach();
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Lỗi thêm sách!");
}
    }//GEN-LAST:event_bntthemsachActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // TODO add your handling code here:
         setVisible(false);
             //   new Home().setVisible(true);

       // this.dispose();
        
    }//GEN-LAST:event_btncloseActionPerformed

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
            java.util.logging.Logger.getLogger(Sach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntthemsach;
    private javax.swing.JButton btnRSSach;
    private javax.swing.JButton btnXoaSAch;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btntimSAch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBangSach;
    private javax.swing.JTextField txtMasach;
    private javax.swing.JTextField txtNamXB;
    private javax.swing.JTextField txtTenTg;
    private javax.swing.JTextField txtTheLoai;
    private javax.swing.JTextField txttensach;
    // End of variables declaration//GEN-END:variables
}
