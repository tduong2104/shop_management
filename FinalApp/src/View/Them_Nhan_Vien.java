/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Model.NhanVien;
import Controller.NhanVienDAO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author trong
 */
public class Them_Nhan_Vien extends javax.swing.JDialog {
    private DefaultTableModel tableModel;
    private QuanLy_UI quanli_ui;
    public int maNV_sql;
    public Them_Nhan_Vien(JFrame parent, DefaultTableModel tableModel) {
        super(parent, "Thêm Nhân Viên mới", true);
        this.tableModel = tableModel;
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        quanli_ui = (QuanLy_UI) parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        info_panel = new javax.swing.JPanel();
        HoTen_label = new javax.swing.JLabel();
        SDT_label = new javax.swing.JLabel();
        Tuoi_label = new javax.swing.JLabel();
        NgayVaoLam_label = new javax.swing.JLabel();
        Luong_label = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtTuoi = new javax.swing.JTextField();
        txtNgayVL = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        CbTime = new javax.swing.JCheckBox();
        btn_panel = new javax.swing.JPanel();
        btn_Them = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();
        form = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sửa");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        HoTen_label.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        HoTen_label.setText("Họ Tên");

        SDT_label.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        SDT_label.setText("Số Điện thoại");

        Tuoi_label.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Tuoi_label.setText("Tuổi");

        NgayVaoLam_label.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        NgayVaoLam_label.setText("Ngày vào làm");

        Luong_label.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Luong_label.setText("Lương");

        txtHoTen.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoTenActionPerformed(evt);
            }
        });

        txtSDT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtTuoi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtNgayVL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtLuong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        CbTime.setText("Full Time");
        CbTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbTimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout info_panelLayout = new javax.swing.GroupLayout(info_panel);
        info_panel.setLayout(info_panelLayout);
        info_panelLayout.setHorizontalGroup(
            info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_panelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Luong_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NgayVaoLam_label, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(Tuoi_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SDT_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HoTen_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addComponent(txtTuoi, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(txtNgayVL, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(txtLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        info_panelLayout.setVerticalGroup(
            info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HoTen_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHoTen))
                .addGap(9, 9, 9)
                .addGroup(info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSDT)
                    .addComponent(SDT_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTuoi)
                    .addComponent(Tuoi_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgayVL)
                    .addComponent(NgayVaoLam_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLuong)
                    .addComponent(Luong_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CbTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_Them.setBackground(new java.awt.Color(153, 255, 255));
        btn_Them.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_Them.setText("Thêm");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_Reset.setBackground(new java.awt.Color(255, 0, 0));
        btn_Reset.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_Reset.setForeground(new java.awt.Color(255, 255, 255));
        btn_Reset.setText("Thoát");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btn_panelLayout = new javax.swing.GroupLayout(btn_panel);
        btn_panel.setLayout(btn_panelLayout);
        btn_panelLayout.setHorizontalGroup(
            btn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_panelLayout.setVerticalGroup(
            btn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        form.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        form.setText("THÊM NHÂN VIÊN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(info_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 165, Short.MAX_VALUE)
                        .addComponent(form)
                        .addGap(0, 166, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(form)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(info_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        String HoTen = txtHoTen.getText();
        if(HoTen == null){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập Tên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        String SDT = txtSDT.getText();
        
        int tuoi;
        if(txtTuoi.getText().trim().isEmpty()){
            tuoi = 0;
        }else{
            tuoi = Integer.parseInt(txtTuoi.getText());
        }
        String NgayVL = txtNgayVL.getText();
        if(NgayVL.trim().isEmpty()){
             DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
             LocalDate ngayThangHienTai = LocalDate.now();
             NgayVL = ngayThangHienTai.format(formatter);
        } 
        int luong;
        if(txtLuong.getText().trim().isEmpty()){
            luong = 0;
        }else{
            luong = Integer.parseInt(txtLuong.getText());
        }
        
        String loai;
        boolean isSelected = CbTime.isSelected();
        if(isSelected){
            loai = "FullTime";
        }else {
            loai = "PartTime";
        }
        
        NhanVien NV = new NhanVien(HoTen, SDT, tuoi, NgayVL, luong, loai);
        
        maNV_sql = NhanVienDAO.ThemNV(NV);
        
        if(maNV_sql > 0){
            addNV(NV);
            JOptionPane.showMessageDialog(null, "Nhân Viên đã được thêm!","Thêm Thành Công", JOptionPane.OK_OPTION);
            txtHoTen.setText("");
            txtSDT.setText("");
            txtTuoi.setText("");
            txtNgayVL.setText("");
            txtLuong.setText("");
            CbTime.setSelected(false);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }         
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void addNV(NhanVien NV) {
        Object[] rowData = {maNV_sql, NV.getHoten(), NV.getLuong(), NV.getNgVL()};
        tableModel.addRow(rowData);
    }
     
    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_ResetActionPerformed

    private void txtHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenActionPerformed

    private void CbTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbTimeActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CbTime;
    private javax.swing.JLabel HoTen_label;
    private javax.swing.JLabel Luong_label;
    private javax.swing.JLabel NgayVaoLam_label;
    private javax.swing.JLabel SDT_label;
    private javax.swing.JLabel Tuoi_label;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JButton btn_Them;
    private javax.swing.JPanel btn_panel;
    private javax.swing.JLabel form;
    private javax.swing.JPanel info_panel;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtNgayVL;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}