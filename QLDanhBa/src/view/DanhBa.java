/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.DanhBa_dao;
import dao.KetNoiCSDL;
import dao.NguoiDung_dao;
import java.io.File;
import java.io.FileOutputStream;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;

import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import pojo.DanhBamodel;
import pojo.NguoiDungmodel;



/**
 *
 * @author HP
 */

public final class DanhBa extends javax.swing.JFrame {

    /**
     * Creates new form DanhBa
     */
     Connection connection=null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet=null;
    DefaultTableModel dtm = new DefaultTableModel();
    
    Object[] noidung = {"Họ","Tên","Số điện thoại","Chức vụ"};
    
    private String sdtlb;

    
    public DanhBa(String sdtlb) {
        initComponents();
        this.setTitle("Danh bạ");
        this.setLocationRelativeTo(null);
        this.sdtlb =sdtlb;
        //this.lbchao.setText(sdtlb);
        //btntimkiem.setVisible(false);
        
        dtm.setColumnIdentifiers(noidung);
        tbdanhba.setModel(dtm);
        
        connection = KetNoiCSDL.KetNoi();
        HienThiTenND(sdtlb);
        HienThi(sdtlb);
        
        
        
    }

    private DanhBa() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbchao = new javax.swing.JLabel();
        btnthemLH = new javax.swing.JButton();
        btndanhba = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btndangxuat = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pnmain = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txttimkiem = new javax.swing.JTextField();
        btntimkiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdanhba = new javax.swing.JTable();
        rdbchucvu = new javax.swing.JRadioButton();
        rdbten = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnxuatfile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        lbchao.setBackground(new java.awt.Color(255, 255, 255));
        lbchao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbchao.setForeground(new java.awt.Color(255, 255, 255));
        lbchao.setText("jLabel2");
        lbchao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbchaoMouseClicked(evt);
            }
        });

        btnthemLH.setBackground(new java.awt.Color(0, 102, 255));
        btnthemLH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnthemLH.setForeground(new java.awt.Color(255, 255, 255));
        btnthemLH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-add-30 (1).png"))); // NOI18N
        btnthemLH.setText("Thêm liên hệ");
        btnthemLH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemLHActionPerformed(evt);
            }
        });

        btndanhba.setBackground(new java.awt.Color(0, 102, 255));
        btndanhba.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btndanhba.setForeground(new java.awt.Color(255, 255, 255));
        btndanhba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-phonebook-30.png"))); // NOI18N
        btndanhba.setText("Danh bạ");
        btndanhba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndanhbaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-reset-password-30.png"))); // NOI18N
        jButton1.setText("Đổi mật khẩu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btndangxuat.setBackground(new java.awt.Color(0, 102, 255));
        btndangxuat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btndangxuat.setForeground(new java.awt.Color(255, 255, 255));
        btndangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-logout-30.png"))); // NOI18N
        btndangxuat.setText("Đăng xuất");
        btndangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangxuatActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-close-30.png"))); // NOI18N
        jButton2.setText("Đóng");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Tìm kiếm bằng:");

        txttimkiem.setEnabled(false);
        txttimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttimkiemKeyReleased(evt);
            }
        });

        btntimkiem.setText("Tìm kiếm");
        btntimkiem.setEnabled(false);
        btntimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemActionPerformed(evt);
            }
        });

        tbdanhba.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbdanhba.setShowHorizontalLines(true);
        tbdanhba.setShowVerticalLines(true);
        tbdanhba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdanhbaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbdanhba);

        buttonGroup1.add(rdbchucvu);
        rdbchucvu.setText("Chức vụ");
        rdbchucvu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbchucvuActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbten);
        rdbten.setText("Tên");
        rdbten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtenActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Thông tin danh bạ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("-");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnmainLayout = new javax.swing.GroupLayout(pnmain);
        pnmain.setLayout(pnmainLayout);
        pnmainLayout.setHorizontalGroup(
            pnmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnmainLayout.createSequentialGroup()
                .addGroup(pnmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnmainLayout.createSequentialGroup()
                        .addGroup(pnmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnmainLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(pnmainLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(pnmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdbten)
                                    .addComponent(rdbchucvu))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btntimkiem)))
                        .addGap(0, 74, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnmainLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        pnmainLayout.setVerticalGroup(
            pnmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnmainLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(pnmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnmainLayout.createSequentialGroup()
                        .addComponent(rdbten)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbchucvu))
                    .addGroup(pnmainLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(pnmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnmainLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnmainLayout.createSequentialGroup()
                                .addGroup(pnmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btntimkiem))
                                .addGap(11, 11, 11)))))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnxuatfile.setBackground(new java.awt.Color(0, 102, 255));
        btnxuatfile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnxuatfile.setForeground(new java.awt.Color(255, 255, 255));
        btnxuatfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-xls-export-30.png"))); // NOI18N
        btnxuatfile.setText("Xuất file");
        btnxuatfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxuatfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lbchao))
                    .addComponent(btnthemLH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndanhba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(btndangxuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnxuatfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbchao)
                .addGap(57, 57, 57)
                .addComponent(btnthemLH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndanhba)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnxuatfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndangxuat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnmain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtenActionPerformed
        if(rdbten.isSelected()){
            txttimkiem.setEnabled(true);
            btntimkiem.setEnabled(true);
        }
    }//GEN-LAST:event_rdbtenActionPerformed

    private void rdbchucvuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbchucvuActionPerformed
        if(rdbchucvu.isSelected()){
            txttimkiem.setEnabled(true);
            btntimkiem.setEnabled(true);
        }
    }//GEN-LAST:event_rdbchucvuActionPerformed

    private void btntimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemActionPerformed
        if(rdbten.isSelected()){
            if(txttimkiem.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Không được để trống ô tim kiếm");
                
            }
            ArrayList<DanhBamodel> dsdb = DanhBa_dao.timKiemTheoTen(sdtlb,txttimkiem.getText());
            dtm.setRowCount(0);
          
            for(DanhBamodel db: dsdb ){
                Vector<Object> v = new Vector<Object>();
                v.add(db.getHo());
                v.add(db.getTen());
                v.add(db.getsDTDB());
                v.add(db.getChucVu());
                dtm.addRow(v);

            }
            tbdanhba.setModel(dtm);
        }
        if(rdbchucvu.isSelected()){
            if(txttimkiem.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Không được để trống ô tim kiếm");
                
            }
            ArrayList<DanhBamodel> dsdb = DanhBa_dao.timKiemTheoChucVu(sdtlb,txttimkiem.getText());
            dtm.setRowCount(0);
          
            for(DanhBamodel db: dsdb ){
                Vector<Object> v = new Vector<Object>();
                v.add(db.getHo());
                v.add(db.getTen());
                v.add(db.getsDTDB());
                v.add(db.getChucVu());
                dtm.addRow(v);

            }
            tbdanhba.setModel(dtm);
        }
    }//GEN-LAST:event_btntimkiemActionPerformed

    private void tbdanhbaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdanhbaMouseClicked
        int row = tbdanhba.getSelectedRow();
        String sdt = (String)tbdanhba.getValueAt(row, 2);
        new TTDanhBa(sdt).setVisible(true);
    }//GEN-LAST:event_tbdanhbaMouseClicked

    private void btnthemLHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemLHActionPerformed
        ThemDanhBa themDanhBa = new ThemDanhBa(sdtlb);
        themDanhBa.setVisible(true);
    }//GEN-LAST:event_btnthemLHActionPerformed

    private void lbchaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbchaoMouseClicked
        new TTNguoiDung(sdtlb).setVisible(true);
    }//GEN-LAST:event_lbchaoMouseClicked

    private void btndanhbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndanhbaActionPerformed
        HienThi(sdtlb);
        HienThiTenND(sdtlb);
    }//GEN-LAST:event_btndanhbaActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setState(DanhBa.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btndangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangxuatActionPerformed
        this.dispose();
        new DangNhap().setVisible(true);
    }//GEN-LAST:event_btndangxuatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new DoiMatKhau_GUI(sdtlb).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnxuatfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxuatfileActionPerformed
        try {
            // Tạo kết nối đến cơ sở dữ liệu SQL Server
            //Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=mydb", "username", "password");

            // Tạo truy vấn lấy dữ liệu từ database (giả sử là table 'employees')
            String query = "select HoDB,TenDB,SDTDB,ChucVu,NgaySinhDB from NguoiDung nd, DanhBa db where nd.MaND=db.MaND and nd.SDTND = '"+sdtlb+"' ";
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            // Tạo file Excel mới
            XSSFWorkbook wb = new XSSFWorkbook();
            XSSFSheet sheet =  (XSSFSheet) wb.createSheet("DanhBa");

            // Tạo tiêu đề
            XSSFRow headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Họ");
            headerRow.createCell(1).setCellValue("Tên");
            headerRow.createCell(2).setCellValue("Số Điện Thoại");
            headerRow.createCell(3).setCellValue("Chức Vụ");
            headerRow.createCell(4).setCellValue("Ngày Sinh");

            // Thêm dữ liệu vào file Excel
            int rowNumber = 1;
            while (rs.next()) {
                Row row = sheet.createRow(rowNumber++);
                row.createCell(0).setCellValue(rs.getString("HoDB"));
                row.createCell(1).setCellValue(rs.getString("TenDB"));
                row.createCell(2).setCellValue(rs.getString("SDTDB"));
                row.createCell(3).setCellValue(rs.getString("ChucVu"));
                row.createCell(4).setCellValue(rs.getString("NgaySinhDB"));
            }

            try ( // Lưu file Excel
                    FileOutputStream fileOut = new FileOutputStream("D://DS_DanhBa.xlsx")) {
                wb.write(fileOut);
            }

            JOptionPane.showMessageDialog(this, "Tải File thành công!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Tải File thất bại: " + e.getMessage());
        }
    }//GEN-LAST:event_btnxuatfileActionPerformed

    private void txttimkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimkiemKeyReleased
        DefaultTableModel Model = (DefaultTableModel)tbdanhba.getModel(); 
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(Model);
        tbdanhba.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txttimkiem.getText().trim()));

    }//GEN-LAST:event_txttimkiemKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DanhBa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndangxuat;
    private javax.swing.JButton btndanhba;
    private javax.swing.JButton btnthemLH;
    private javax.swing.JButton btntimkiem;
    private javax.swing.JButton btnxuatfile;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbchao;
    private javax.swing.JPanel pnmain;
    private javax.swing.JRadioButton rdbchucvu;
    private javax.swing.JRadioButton rdbten;
    private javax.swing.JTable tbdanhba;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables

    public void HienThi(String sdt) {

        ArrayList<DanhBamodel> dsdb = DanhBa_dao.layDSDanhBa(sdt);
        
        dtm.setRowCount(0);
        
        for(DanhBamodel db: dsdb ){
            Vector<Object> v = new Vector<Object>();
            v.add(db.getHo());
            v.add(db.getTen());
            v.add(db.getsDTDB());
            v.add(db.getChucVu());
            dtm.addRow(v);

        }
        tbdanhba.setModel(dtm);
    }
    public void HienThiTenND(String sdt){
        ArrayList<NguoiDungmodel> dsng = NguoiDung_dao.layTTNguoiDung(sdt);
        for (NguoiDungmodel ng : dsng){
            lbchao.setText(ng.getHo() + " "+ng.getTen());
        }
    }
    
}
