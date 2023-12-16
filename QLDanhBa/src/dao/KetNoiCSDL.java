/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class KetNoiCSDL {
    
//    Connection connection =null;
   // Statement statement=null;
//    PreparedStatement preparedStatement=null;
//    ResultSet resultSet=null;
    

    
    public static Connection KetNoi() {
        Connection c = null;
        String strServer="HP090123\\SQLEXPRESS";
        String strDatabaseName="QLDanhBa";
        String strUser="sa";
        String strPassWord="123";
        
        String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        try {
            Class.forName(driver);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KetNoiCSDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String connectionURL="jdbc:sqlserver://"+strServer
                    +":1433;databaseName=" + strDatabaseName
//                    +";intergratedSecurity = true";
                    +";user ="+strUser +"; password=" +strPassWord;
            
        
        try {
            c = DriverManager.getConnection(connectionURL);
            //statement=connection.createStatement();
            if(c!=null){
                //JOptionPane.showConfirmDialog(null, "Kết nối thành công", "Thông báo",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
                
            }
            
            else{
                JOptionPane.showConfirmDialog(null, "Kết nối thất bại","Thông báo",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KetNoiCSDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
    
    public static void CloseConnection(Connection c){
        
    }
    
}
