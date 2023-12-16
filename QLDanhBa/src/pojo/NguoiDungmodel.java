/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author HP
 */
public class NguoiDungmodel {
    private int maND;
    private String sDTND;
    private String matKhau;
    private String ho,ten;
    private String ngaySinh;
    private ArrayList <DanhBamodel> dsDB;

    public NguoiDungmodel() {
        dsDB= new ArrayList<>();
    }

    public NguoiDungmodel(String sDTND, String matKhau) {
        this.sDTND = sDTND;
        this.matKhau = matKhau;
    }

    public NguoiDungmodel(String sDTND, String matKhau, String ho, String ten, String ngaySinh) {
        this.sDTND = sDTND;
        this.matKhau = matKhau;
        this.ho = ho;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        dsDB= new ArrayList<>();
    }
    public NguoiDungmodel(int ma,String sDTND, String ho, String ten, String ngaySinh) {
        this.maND = ma;
        this.sDTND = sDTND;
        this.ho = ho;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        
    }

    public ArrayList<DanhBamodel> getDsDB() {
        return dsDB;
    }

    public void setDsDB(ArrayList<DanhBamodel> dsDB) {
        this.dsDB = dsDB;
    }
   

    public int getMaND() {
        return maND;
    }

    public void setMaND(int maND) {
        this.maND = maND;
    }

    public String getsDTND() {
        return sDTND;
    }

    public void setsDTND(String sDTND) {
        this.sDTND = sDTND;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    
    
}
