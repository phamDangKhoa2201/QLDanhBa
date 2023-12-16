/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import pojo.DanhBamodel;
import pojo.NguoiDungmodel;

/**
 *
 * @author HP
 */
public class DanhBa_dao {
    public static ArrayList<DanhBamodel> layDSDanhBa(String sdt){
        ArrayList<DanhBamodel> dsdb = new ArrayList<DanhBamodel>();
        try {
            String sql = "select * from NguoiDung nd, DanhBa db where nd.MaND=db.MaND and nd.SDTND = '"+sdt+"'";
            SQLServerProvider provider = new SQLServerProvider();
            provider.open();
            ResultSet resultSet = provider.excuteQuery(sql);
            while(resultSet.next()){
                DanhBamodel a = new DanhBamodel();
                a.setHo(resultSet.getString(9));
                a.setTen(resultSet.getString(10));
                a.setsDTDB(resultSet.getString(8));
                a.setChucVu(resultSet.getString(11));

                dsdb.add(a);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsdb;
    }
    
    public static ArrayList<DanhBamodel> timKiemTheoTen(String sdt, String ten){
        ArrayList<DanhBamodel> dsdb = new ArrayList<DanhBamodel>();
        try {
            String select="select * from NguoiDung nd, DanhBa db where nd.MaND=db.MaND and nd.SDTND = '"+sdt+"' and db.TenDB= N'"+ten+"'";
            SQLServerProvider provider = new SQLServerProvider();
            provider.open();
            ResultSet resultSet = provider.excuteQuery(select);
            while(resultSet.next()){
                DanhBamodel a = new DanhBamodel();
                a.setHo(resultSet.getString(9));
                a.setTen(resultSet.getString(10));
                a.setsDTDB(resultSet.getString(8));
                a.setChucVu(resultSet.getString(11));

                dsdb.add(a);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsdb;
    }
    
    public static ArrayList<DanhBamodel> timKiemTheoChucVu(String sdt, String chucvu){
        ArrayList<DanhBamodel> dsdb = new ArrayList<DanhBamodel>();
        try {
            String select="select * from NguoiDung nd, DanhBa db where nd.MaND=db.MaND and nd.SDTND = '"+sdt+"' and db.ChucVu= N'"+chucvu+"'";
            SQLServerProvider provider = new SQLServerProvider();
            provider.open();
            ResultSet resultSet = provider.excuteQuery(select);
            while(resultSet.next()){
                DanhBamodel a = new DanhBamodel();
                a.setHo(resultSet.getString(9));
                a.setTen(resultSet.getString(10));
                a.setsDTDB(resultSet.getString(8));
                a.setChucVu(resultSet.getString(11));

                dsdb.add(a);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsdb;
    }
    
    public static ArrayList<DanhBamodel> layTTDanhBa(String sdt){
        ArrayList<DanhBamodel> dsdb = new ArrayList<DanhBamodel>();
        try {
            String sql = "select * from DanhBa where SDTDB = '"+sdt+"'";
            SQLServerProvider provider = new SQLServerProvider();
            provider.open();
            ResultSet resultSet = provider.excuteQuery(sql);
            while(resultSet.next()){
                DanhBamodel a = new DanhBamodel();
                a.setHo(resultSet.getString(3));
                a.setTen(resultSet.getString(4));
                a.setChucVu(resultSet.getString(5));
                a.setNgaySinh((resultSet.getString(6)));
                a.setMaDB(resultSet.getInt(1));

                dsdb.add(a);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsdb;
    }
    
    public static boolean capNhatDanhBa(DanhBamodel db){
        boolean kq = false;
        String sql = String.format("update DanhBa set SDTDB = '%s', HoDB = N'%s', TenDB = N'%s', ChucVu = N'%s', NgaySinhDB = '%s' where MaDB = '%d'"
                , db.getsDTDB(),db.getHo(),db.getTen(),db.getChucVu(),db.getNgaySinh(),db.getMaDB());
        SQLServerProvider provider = new SQLServerProvider();
        provider.open();
        int n = provider.executeUpdate(sql);
        if(n == 1){
            kq = true;
        }
        
        provider.close();
        
        return kq;
    }
    
    public static boolean themDanhBa(DanhBamodel db){
        boolean kq = false;
        String sql = String.format("Insert into DanhBa(SDTDB,HoDB,TenDB,ChucVu,NgaySinhDB,MaND) values ('%s', N'%s', N'%s', N'%s', '%s', %d)"
                , db.getsDTDB(),db.getHo(),db.getTen(),db.getChucVu(),db.getNgaySinh(),db.getMaND());
        SQLServerProvider provider = new SQLServerProvider();
        provider.open();
        int n = provider.executeUpdate(sql);
        if(n == 1){
            kq = true;
        }
        provider.close();
        
        return kq;
        
    }
    public static boolean xoaDanhBa(DanhBamodel db){
        boolean kq = false;
        String sql = String.format("delete DanhBa where MaDB = '%s'", db.getMaDB());
        SQLServerProvider provider = new SQLServerProvider();
        provider.open();
        int n = provider.executeUpdate(sql);
        if(n == 1){
            kq = true;
        }
        provider.close();
        return kq;
    }
}
