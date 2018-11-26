/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.app.ui.frames.quanly;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import poly.app.core.daoimpl.VeBanDaoImpl;
import poly.app.core.entities.VeBan;
import poly.app.ui.dialogs.thongtin.DialogXemChiTietVe;
import poly.app.ui.utils.TableRendererUtil;

/**
 *
 * @author vothanhtai
 */
public class FrameQLVeBan extends javax.swing.JFrame {

    /**
     * Creates new form FrameQLNhanVien
     */
    Map<String, VeBan> veBanMap = new HashMap<>();

    public FrameQLVeBan() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        setTitle("Quản lý vé bán");
        reRenderUI();
    }

    private void reRenderUI() {
        //        Render lại giao diện cho table
        TableRendererUtil tblRenderer = new TableRendererUtil(tblVeBan);
        tblRenderer.setCellEditable(false);
        tblRenderer.changeHeaderStyle();
        tblRenderer.setColoumnWidthByPersent(0, 5);
        tblRenderer.setColumnAlignment(1, TableRendererUtil.CELL_ALIGN_CENTER);
        tblRenderer.setColumnAlignment(2, TableRendererUtil.CELL_ALIGN_CENTER);
        tblRenderer.setColumnAlignment(3, TableRendererUtil.CELL_ALIGN_CENTER);
        tblRenderer.setColumnAlignment(4, TableRendererUtil.CELL_ALIGN_CENTER);
        tblRenderer.setColumnAlignment(5, TableRendererUtil.CELL_ALIGN_RIGHT);
        tblRenderer.setColumnAlignment(6, TableRendererUtil.CELL_ALIGN_CENTER);
    }

    public JPanel getMainPanel() {
        formWindowOpened(null);
        return this.pnlMain;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        chkTheoTenPhim = new javax.swing.JCheckBox();
        txtTheoMaVe = new javax.swing.JTextField();
        chkKhoangThoiGian = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        dcTuNgay = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        dcDenNgay = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnXemchitiet = new javax.swing.JButton();
        btnInve = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVeBan = new javax.swing.JTable();
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

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(52, 83, 104));
        jLabel1.setText("Tra cứu vé bán");

        chkTheoTenPhim.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        chkTheoTenPhim.setSelected(true);
        chkTheoTenPhim.setText("Theo mã vé bán");
        chkTheoTenPhim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTheoTenPhimActionPerformed(evt);
            }
        });

        txtTheoMaVe.setEditable(false);
        txtTheoMaVe.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
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

        chkKhoangThoiGian.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        chkKhoangThoiGian.setText("Theo khoảng thời gian");
        chkKhoangThoiGian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkKhoangThoiGianActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel2.setText("Từ ngày");

        dcTuNgay.setDateFormatString("dd-MM-yyyy");
        dcTuNgay.setEnabled(false);
        dcTuNgay.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        dcTuNgay.setOpaque(false);
        dcTuNgay.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dcTuNgayPropertyChange(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel3.setText("Đến ngày");

        dcDenNgay.setDateFormatString("dd-MM-yyyy");
        dcDenNgay.setEnabled(false);
        dcDenNgay.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        dcDenNgay.setOpaque(false);
        dcDenNgay.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dcDenNgayPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(chkKhoangThoiGian)
                                .addComponent(dcTuNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(dcDenNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(chkTheoTenPhim)
                            .addComponent(txtTheoMaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(chkTheoTenPhim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTheoMaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(chkKhoangThoiGian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dcTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dcDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setOpaque(false);

        btnXemchitiet.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        btnXemchitiet.setText("Xem chi tiết");
        btnXemchitiet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXemchitiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemchitietActionPerformed(evt);
            }
        });

        btnInve.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        btnInve.setText("In vé");
        btnInve.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnXemchitiet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInve)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXemchitiet, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInve, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel5.setOpaque(false);

        tblVeBan.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        tblVeBan.setModel(new javax.swing.table.DefaultTableModel(
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
        tblVeBan.setRowHeight(20);
        tblVeBan.setSelectionBackground(new java.awt.Color(96, 116, 129));
        tblVeBan.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblVeBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVeBanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVeBan);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addGap(10, 10, 10))
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(btnCollapse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnCollapse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void tblVeBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVeBanMouseClicked
        if (evt.getClickCount() >= 2) {
            int index = tblVeBan.getSelectedRow();
        }
    }//GEN-LAST:event_tblVeBanMouseClicked

    private void chkTheoTenPhimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTheoTenPhimActionPerformed
        // TODO add your handling code here:
        if (chkTheoTenPhim.isSelected()) {
            txtTheoMaVe.setEditable(true);
        } else {
            txtTheoMaVe.setEditable(false);
            txtTheoMaVe.setText("");
            loadDataToTable(search());
        }
    }//GEN-LAST:event_chkTheoTenPhimActionPerformed

    private void chkKhoangThoiGianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkKhoangThoiGianActionPerformed
        // TODO add your handling code here:
        if (chkKhoangThoiGian.isSelected()) {
            dcTuNgay.setEnabled(true);
            dcDenNgay.setEnabled(true);
        } else {
            dcTuNgay.setDate(null);
            dcDenNgay.setDate(null);
            dcTuNgay.setEnabled(false);
            dcDenNgay.setEnabled(false);
            loadDataToTable(search());
        }
    }//GEN-LAST:event_chkKhoangThoiGianActionPerformed

    private void txtTheoMaVeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTheoMaVeKeyReleased
        // TODO add your handling code here:
        loadDataToTable(search());
    }//GEN-LAST:event_txtTheoMaVeKeyReleased

    private void dcTuNgayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcTuNgayPropertyChange
        // TODO add your handling code here:
        if (chkKhoangThoiGian.isSelected()) {
            Date min = dcTuNgay.getDate();
            Date max = dcDenNgay.getDate();
            if (min != null && max != null) {
                if (min.compareTo(max) > 0) {
                    dcTuNgay.setDate(max);
                }
            }
            loadDataToTable(search());
        }
    }//GEN-LAST:event_dcTuNgayPropertyChange

    private void txtTheoMaVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTheoMaVeActionPerformed
        // TODO add your handling code here:
        if (chkKhoangThoiGian.isSelected()) {
            loadDataToTable(search());
        }
    }//GEN-LAST:event_txtTheoMaVeActionPerformed

    private void dcDenNgayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcDenNgayPropertyChange
        // TODO add your handling code here:
        if (chkKhoangThoiGian.isSelected()) {
            Date min = dcTuNgay.getDate();
            Date max = dcDenNgay.getDate();
            if (min != null && max != null) {
                if (min.compareTo(max) > 0) {
                    dcDenNgay.setDate(min);
                }
            }
            loadDataToTable(search());
        }
    }//GEN-LAST:event_dcDenNgayPropertyChange

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        loadAllDataToTable();
    }//GEN-LAST:event_formWindowActivated

    private void btnXemchitietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemchitietActionPerformed
        String id = (String) tblVeBan.getValueAt(tblVeBan.getSelectedRow(), 1);

        new DialogXemChiTietVe(this, true, veBanMap.get(id)).setVisible(true);
    }//GEN-LAST:event_btnXemchitietActionPerformed

    public Map<String, VeBan> searchByMa() {
        String tenTimKiem = txtTheoMaVe.getText().toLowerCase();
        Map<String, VeBan> veBanMapTheoTen = new HashMap();
        if (!tenTimKiem.equals("")) {

            for (Map.Entry<String, VeBan> entry : veBanMap.entrySet()) {
                VeBan veban = entry.getValue();

                if (veban.getId().toLowerCase().contains(tenTimKiem)) {
                    veBanMapTheoTen.put(veban.getId(), veban);
                }
            }
        }
        return veBanMapTheoTen;
    }

    public Map<String, VeBan> search() {

        String tenTimKiem = txtTheoMaVe.getText().toLowerCase();

        Map<String, VeBan> veBanMapTimKiem = new HashMap<>();
        Date min = dcTuNgay.getDate(), max = dcDenNgay.getDate();

        min = min == null ? dcTuNgay.getMinSelectableDate() : min;
        max = max == null ? dcDenNgay.getMaxSelectableDate() : max;

        LocalDate localDate = min.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        min = java.sql.Date.valueOf(localDate);

        localDate = max.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        max = java.sql.Date.valueOf(localDate);

        for (Map.Entry<String, VeBan> entry : veBanMap.entrySet()) {
            String key = entry.getKey();
            VeBan veban = entry.getValue();

            if (veban.getId().toLowerCase().contains(tenTimKiem)
                    && veban.getNgayBan().compareTo(min) >= 0
                    && veban.getNgayBan().compareTo(max) <= 0) {
                veBanMapTimKiem.put(veban.getId(), veban);
            }
        }
        return veBanMapTimKiem;
    }

    public void loadDataToTable(Map<String, VeBan> veBanMapHienThi) {
        DefaultTableModel modelTable = (DefaultTableModel) tblVeBan.getModel();
        modelTable.setRowCount(0);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        DecimalFormat df = new DecimalFormat("##,###,###");
        int i = 1;
        for (Map.Entry<String, VeBan> entry : veBanMapHienThi.entrySet()) {
            VeBan veban = entry.getValue();
            Object[] record = new Object[]{
                i++,
                veban.getId(),
                veban.getSuatChieu().getId(),
                veban.getGheNgoi().getViTriDay() + veban.getGheNgoi().getViTriCot(),
                sdf.format(veban.getNgayBan()),
                df.format(veban.getGiaVe().getDonGia()),
                veban.getNguoiDung().getHoTen()
            };
            modelTable.addRow(record);
        }
    }

    public void loadAllDataToTable() {
        List<VeBan> dataList = new VeBanDaoImpl().getAll();
        for (VeBan veBan : dataList) {
            veBanMap.put(veBan.getId(), veBan);
        }
        loadDataToTable(veBanMap);
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
    private javax.swing.JButton btnInve;
    private javax.swing.JButton btnXemchitiet;
    private javax.swing.JCheckBox chkKhoangThoiGian;
    private javax.swing.JCheckBox chkTheoTenPhim;
    private com.toedter.calendar.JDateChooser dcDenNgay;
    private com.toedter.calendar.JDateChooser dcTuNgay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JTable tblVeBan;
    private javax.swing.JTextField txtTheoMaVe;
    // End of variables declaration//GEN-END:variables
}
