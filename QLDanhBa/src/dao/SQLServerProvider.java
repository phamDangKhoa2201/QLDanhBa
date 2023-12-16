/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class SQLServerProvider {
    Connection connection=null;
    public void open(){
        String strServer="HP090123\\SQLEXPRESS";
        String strDatabaseName="QLDanhBa";
        String strUser="sa";
        String strPassWord="123";
        String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQLServerProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        String connectionURL="jdbc:sqlserver://"+strServer
                    +":1433;databaseName=" + strDatabaseName
//                    +";intergratedSecurity = true";
                    +";user ="+strUser +"; password=" +strPassWord;
        try {
            connection = DriverManager.getConnection(connectionURL);
            if(connection!=null){
                //JOptionPane.showConfirmDialog(null, "Kết nối thành công", "Thông báo",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
                
            }
            
            else{
                JOptionPane.showConfirmDialog(null, "Kết nối thất bại","Thông báo",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SQLServerProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public  void close(){
        try {
            this.connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLServerProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ResultSet excuteQuery(String sql){
        ResultSet resultSet = null;
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(SQLServerProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultSet;
    }
    public int executeUpdate(String sql){
        int n = -1; 
        try {
            Statement statement = connection.createStatement();
            n= statement.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(SQLServerProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return n;
    }
}
