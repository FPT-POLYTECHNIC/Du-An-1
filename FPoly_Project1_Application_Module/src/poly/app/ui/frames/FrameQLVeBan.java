/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.app.ui.frames;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import poly.app.core.daoimpl.PhimDaoImpl;
import poly.app.core.entities.Phim;
import poly.app.core.helper.DialogHelper;
import poly.app.ui.dialogs.DialogCapNhatPhim;
import poly.app.ui.dialogs.DialogThemPhim;
import poly.app.ui.utils.TableRendererUtil;

/**
 *
 * @author vothanhtai
 */
public class FrameQLVeBan extends javax.swing.JFrame {

    /**
     * Creates new form FrameQLNhanVien
     */
    
    List<Phim> listPhim;
    
    public FrameQLVeBan() {
        initComponents();
        setLocationRelativeTo(null);
        reRenderUI();
        loadAllDataToTable();
    }

    private void reRenderUI() {
        //        Render lại giao diện cho table
        TableRendererUtil tblRenderer1 = new TableRendererUtil(tblSuatChieu);
        tblRenderer1.setCellEditable(false);
        tblRenderer1.changeHeaderStyle();
    }
    
    public JPanel getMainPanel(){
        return pnMain;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        chkTheoTenPhim = new javax.swing.JCheckBox();
        txtTheoMaVe = new javax.swing.JTextField();
        chkKhoangThoiGian = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        dcTuNgay = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        dcDenNgay = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSuatChieu = new javax.swing.JTable();
        btnCollapse = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        pnMain.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setText("Tra cứu vé bán");

        chkTheoTenPhim.setText("Theo mã vé bán");
        chkTheoTenPhim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTheoTenPhimActionPerformed(evt);
            }
        });

        txtTheoMaVe.setEditable(false);
        txtTheoMaVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTheoMaVeActionPerformed(evt);
            }
        });
        txtTheoMaVe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTheoMaVeKeyReleased(evt);
            }
        });

        chkKhoangThoiGian.setText("Theo khoảng thời gian");
        chkKhoangThoiGian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkKhoangThoiGianActionPerformed(evt);
            }
        });

        jLabel2.setText("Từ ngày");

        dcTuNgay.setEnabled(false);
        dcTuNgay.setOpaque(false);
        dcTuNgay.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dcTuNgayPropertyChange(evt);
            }
        });

        jLabel3.setText("Đến ngày");

        dcDenNgay.setEnabled(false);
        dcDenNgay.setOpaque(false);
        dcDenNgay.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dcDenNgayPropertyChange(evt);
            }
        });

        jButton2.setText("Đặt lại");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Tìm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(chkKhoangThoiGian)
                                .addComponent(dcTuNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dcDenNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(chkTheoTenPhim)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                        .addComponent(txtTheoMaVe)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chkTheoTenPhim)
                .addGap(18, 18, 18)
                .addComponent(txtTheoMaVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(chkKhoangThoiGian)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dcTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dcDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setOpaque(false);

        jButton1.setText("Xem chi tiết");

        jButton4.setText("In vé");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        jPanel5.setOpaque(false);

        tblSuatChieu.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N
        tblSuatChieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã vé", "Mã suất chiếu", "Vị trí ghế", "Ngày bán", "Giá vé", "Nhân viên bán"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblSuatChieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSuatChieuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSuatChieu);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCollapse.setBackground(new java.awt.Color(52, 83, 104));
        btnCollapse.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnCollapse.setForeground(new java.awt.Color(255, 255, 255));
        btnCollapse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCollapse.setText("<<");
        btnCollapse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCollapse.setOpaque(true);
        btnCollapse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCollapseMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCollapse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCollapse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCollapseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCollapseMouseReleased
        if (btnCollapse.getText().equals("<<")) {
            jPanel2.setVisible(false);
            btnCollapse.setText(">>");
        } else {
            jPanel2.setVisible(true);
            btnCollapse.setText("<<");
        }
    }//GEN-LAST:event_btnCollapseMouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        loadAllDataToTable();
    }//GEN-LAST:event_formWindowOpened

    private void tblSuatChieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSuatChieuMouseClicked
        if ( evt.getClickCount() >= 2 ) {
            int index = tblSuatChieu.getSelectedRow();
            String id = tblSuatChieu.getValueAt(index, 0) + "";
            new DialogCapNhatPhim(this, true, id).setVisible(true);
            listPhim = new PhimDaoImpl().getPhimHienCo();
            loadDataToTable(searchAdvance());
        }
    }//GEN-LAST:event_tblSuatChieuMouseClicked

    private void chkTheoTenPhimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTheoTenPhimActionPerformed
        // TODO add your handling code here:
        if ( chkTheoTenPhim.isSelected() ) {
            txtTheoMaVe.setEditable(true);
        } else {
            txtTheoMaVe.setEditable(false);
            txtTheoMaVe.setText("");
            loadDataToTable(searchAdvance());
        }
    }//GEN-LAST:event_chkTheoTenPhimActionPerformed

    private void chkKhoangThoiGianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkKhoangThoiGianActionPerformed
        // TODO add your handling code here:
        if ( chkKhoangThoiGian.isSelected() ) {
            dcTuNgay.setEnabled(true);
            dcDenNgay.setEnabled(true);
        } else {
            dcTuNgay.setDate(null);
            dcDenNgay.setDate(null);
            dcTuNgay.setEnabled(false);
            dcDenNgay.setEnabled(false);
            loadDataToTable(searchAdvance());
        }
    }//GEN-LAST:event_chkKhoangThoiGianActionPerformed

    private void txtTheoMaVeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTheoMaVeKeyReleased
        // TODO add your handling code here:
        loadDataToTable(searchAdvance());
    }//GEN-LAST:event_txtTheoMaVeKeyReleased

    private void dcTuNgayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcTuNgayPropertyChange
        // TODO add your handling code here:
        if ( chkKhoangThoiGian.isSelected()) {
            Date min = dcTuNgay.getDate();
            Date max = dcDenNgay.getDate();
            if ( min != null && max != null ) {
                if ( min.compareTo(max) > 0 ) {
                    dcTuNgay.setDate(max);
                }
            }
            loadDataToTable(searchAdvance());
        }
    }//GEN-LAST:event_dcTuNgayPropertyChange

    private void txtTheoMaVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTheoMaVeActionPerformed
        // TODO add your handling code here:
        if ( chkKhoangThoiGian.isSelected()) {
            loadDataToTable(searchAdvance());
        }
    }//GEN-LAST:event_txtTheoMaVeActionPerformed

    private void dcDenNgayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcDenNgayPropertyChange
        // TODO add your handling code here:
        if ( chkKhoangThoiGian.isSelected()) {
            Date min = dcTuNgay.getDate();
            Date max = dcDenNgay.getDate();
            if ( min != null && max != null ) {
                if ( min.compareTo(max) > 0 ) {
                    dcDenNgay.setDate(min);
                }
            }
            loadDataToTable(searchAdvance());
        }
    }//GEN-LAST:event_dcDenNgayPropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtTheoMaVe.setText("");
        dcTuNgay.setDate(null);
        dcDenNgay.setDate(null);
        loadDataToTable(searchAdvance());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        loadAllDataToTable();
    }//GEN-LAST:event_formWindowActivated

    public List<Phim> searchByTen() {
        String tenTimKiem = txtTheoMaVe.getText().toLowerCase();
        if ( !tenTimKiem.equals("") ) {
            List<Phim> listPhimTheoTen = new ArrayList<>();
            for ( Phim phim : listPhim ) {
                if ( phim.getTen().toLowerCase().contains(tenTimKiem) ) {
                    listPhimTheoTen.add(phim);
                }
            }
            return listPhimTheoTen;
        }
        return listPhim;
    }
    
    public List<Phim> searchAdvance() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        List<Phim> listPhimTimKiem = new ArrayList<Phim>();
        Date min = dcTuNgay.getDate(), max = dcDenNgay.getDate();

        min = min==null? dcTuNgay.getMinSelectableDate() : min;
        max = max==null? dcDenNgay.getMaxSelectableDate() : max ;
        
        LocalDate localDate = min.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        min = java.sql.Date.valueOf(localDate);
        
        localDate = max.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        max = java.sql.Date.valueOf(localDate);
        
        for ( Phim phim : listPhim ) {
            if ( 
                    phim.getTen().toLowerCase().contains(txtTheoMaVe.getText().toLowerCase())
                    && phim.getNgayCongChieu().compareTo(min) >= 0
                    && phim.getNgayCongChieu().compareTo(max) <= 0
            ) {
                listPhimTimKiem.add(phim);
            }
        }
        return listPhimTimKiem;
    }
    
    public void loadDataToTable(List<Phim> listPhimHienThi) {
        DefaultTableModel modelTable = (DefaultTableModel) tblSuatChieu.getModel();
        modelTable.setRowCount(0);
        for ( Phim phim : listPhimHienThi ) {
            Object[] record = new Object[]{
                phim.getId(),
                phim.getTen(),
                phim.getThoiLuong(),
                phim.getGioiHanTuoi(),
                phim.getNgayCongChieu(),
                phim.getNgonNgu(),
                phim.getDienVien(),
                phim.getQuocGia(),
                phim.getNhaSanXuat(),
                phim.getTrangThai()
            };
            modelTable.addRow(record);
        }
    }
    
    public boolean deletePhim(int id) {
        Phim phim = listPhim.get(id);
        phim.setDaXoa(true);
        try {
            return new PhimDaoImpl().update(phim);
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }    
    }
    
    
    public void loadAllDataToTable(){
        listPhim = new PhimDaoImpl().getPhimHienCo();
        loadDataToTable(listPhim);
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameQLVeBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameQLVeBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameQLVeBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameQLVeBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameQLVeBan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCollapse;
    private javax.swing.JCheckBox chkKhoangThoiGian;
    private javax.swing.JCheckBox chkTheoTenPhim;
    private com.toedter.calendar.JDateChooser dcDenNgay;
    private com.toedter.calendar.JDateChooser dcTuNgay;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnMain;
    private javax.swing.JTable tblSuatChieu;
    private javax.swing.JTextField txtTheoMaVe;
    // End of variables declaration//GEN-END:variables
}
