/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojo;

import java.util.Date;

/**
 *
 * @author HP
 */
public class DanhBamodel {
    protected int maDB,maND;
    protected String sDTDB,ho,ten,chucVu;
    protected String ngaySinh;
    NguoiDungmodel nd;

    public DanhBamodel() {
    }

    public DanhBamodel(int maDB, int maND, String sDTDB, String ho, String ten, String chucVu, String ngaySinh) {
        this.maDB = maDB;
        this.maND = maND;
        this.sDTDB = sDTDB;
        this.ho = ho;
        this.ten = ten;
        this.chucVu = chucVu;
        this.ngaySinh = ngaySinh;
    }
    public DanhBamodel(int maDB, String sDTDB, String ho, String ten, String chucVu, String ngaySinh) {
        this.maDB = maDB;
        this.sDTDB = sDTDB;
        this.ho = ho;
        this.ten = ten;
        this.chucVu = chucVu;
        this.ngaySinh = ngaySinh;
    }

    public NguoiDungmodel getNd() {
        return nd;
    }

    public void setNd(NguoiDungmodel nd) {
        this.nd = nd;
    }

    public int getMaDB() {
        return maDB;
    }

    public void setMaDB(int maDB) {
        this.maDB = maDB;
    }

    public int getMaND() {
        return maND;
    }

    public void setMaND(int maND) {
        this.maND = maND;
    }

    public String getsDTDB() {
        return sDTDB;
    }

    public void setsDTDB(String sDTDB) {
        this.sDTDB = sDTDB;
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

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
}
