/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pojo.NguoiDungmodel;

/**
 *
 * @author HP
 */
public class NguoiDung_dao {
    public static ArrayList<NguoiDungmodel> layTTNguoiDung(String sdt){
        ArrayList<NguoiDungmodel> dsng = new ArrayList<>();
        try {
            String sql = "select * from NguoiDung where SDTND = '"+sdt+"'";
            SQLServerProvider provider = new SQLServerProvider();
            provider.open();
            ResultSet resultSet = provider.excuteQuery(sql);
            while(resultSet.next()){
                NguoiDungmodel b = new NguoiDungmodel();
                b.setHo(resultSet.getString(4));
                b.setTen(resultSet.getString(5));
                dsng.add(b);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsng;
    }
    
    public static ArrayList<NguoiDungmodel> layMaNguoiDung(String sdt){
        ArrayList<NguoiDungmodel> dsng = new ArrayList<NguoiDungmodel>();
        try {
            String sql = "select * from NguoiDung where SDTND = '"+sdt+"'";
            SQLServerProvider provider = new SQLServerProvider();
            provider.open();
            ResultSet resultSet = provider.excuteQuery(sql);
            while(resultSet.next()){
                NguoiDungmodel b = new NguoiDungmodel();
                b.setMaND(resultSet.getInt(1));
                dsng.add(b);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsng;
    }
    public static ArrayList<NguoiDungmodel> layInfoNguoiDung(String sdt){
        ArrayList<NguoiDungmodel> dsng = new ArrayList<NguoiDungmodel>();
        try {
            String sql = "select * from NguoiDung where SDTND = '"+sdt+"'";
            SQLServerProvider provider = new SQLServerProvider();
            provider.open();
            ResultSet resultSet = provider.excuteQuery(sql);
            while(resultSet.next()){
                NguoiDungmodel b = new NguoiDungmodel();
                b.setMaND(resultSet.getInt(1));
                b.setsDTND(resultSet.getString(2));
                b.setHo(resultSet.getString(4));
                b.setTen(resultSet.getString(5));
                b.setNgaySinh(resultSet.getString(6));
                dsng.add(b);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsng;
    }
    public static boolean capNhatNguoiDung(NguoiDungmodel nd){
        boolean kq = false;
        String sql = String.format("update NguoiDung set SDTND = '%s', Ho = N'%s', Ten = N'%s', NgaySinh = '%s' where MaND = '%d'"
                , nd.getsDTND(),nd.getHo(),nd.getTen(),nd.getNgaySinh(),nd.getMaND());
        SQLServerProvider provider = new SQLServerProvider();
        provider.open();
        int n = provider.executeUpdate(sql);
        if(n == 1){
            kq = true;
        }
        
        provider.close();
        
        return kq;
    }
    public static boolean themNguoiDung(NguoiDungmodel nd) throws SQLException {
        boolean kq = false;
        String sql = String.format("INSERT INTO NGUOIDUNG(SDTND, MatKhau, Ho, Ten, NgaySinh) VALUES('%s', '%S', N'%s', N'%s', '%s')", 
                nd.getsDTND(), nd.getMatKhau(), nd.getHo(), nd.getTen(), nd.getNgaySinh());
        SQLServerProvider provider = new SQLServerProvider();
        provider.open();
        int n = provider.executeUpdate(sql);
        
        if (n == 1) {
            kq = true;
        }
        provider.close();
        return kq;
    }
    
    public static boolean capNhatMatKhau(NguoiDungmodel nd) throws SQLException {
        boolean kq =  false;
        String sql = String.format("UPDATE NGUOIDUNG SET MATKHAU = '%s'" + "WHERE SDTND = '%s'",nd.getMatKhau(), nd.getsDTND());
        SQLServerProvider provider = new SQLServerProvider();
        provider.open();
        int n = provider.executeUpdate(sql);
        
        if (n == 1) {
            kq = true;
        }
        provider.close();
        return kq;
    }
    
    public static boolean KiemTraSDTND(String sdtND) {
        try {
            String sql = "select * from NGUOIDUNG where SDTND = " + sdtND;
            SQLServerProvider provider = new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.excuteQuery(sql);
            if (rs.next()) {               
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;   
    }
    
    public static boolean KiemTraMKCu(String matKhauCu, String taikhoan) {
        try {
            String sql = "select * from NGUOIDUNG where MatKhau =   '"+matKhauCu+"' and SDTND = '"+taikhoan+"' ";
            SQLServerProvider provider = new SQLServerProvider();
            provider.open();
            ResultSet rs = provider.excuteQuery(sql);
            if (rs.next()) {               
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;   
    }
    
}
