/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO_TRAINING;

import SQLServerProvider.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.item;

/**
 *
 * @author ADMIN
 */
public class QuanLyData {
    public static ArrayList<item> getTatCaItem(){
        ArrayList<item> list = new ArrayList<>();
        
        Connection conn = DBConnection.getConnection();
        
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM DATA_TRAINING");
            
            while(rs.next()){
                
                int STT = rs.getInt("STT");
                String HOVATEN  = rs.getString("HOVATEN");
                int TUOI = rs.getInt("TUOI");
                String NHOMNGUOI  = rs.getString("NHOMNGUOI");
                String KHOIHOCYEUTHICH  = rs.getString("KHOIHOCYEUTHICH");
                String HOCLUC  = rs.getString("HOCLUC");
                String KINHTE  = rs.getString("KINHTE");
                String NGANHCHON  = rs.getString("NGANHCHON");
                
                
                item it = new item(STT,HOVATEN,TUOI,NHOMNGUOI,KHOIHOCYEUTHICH,HOCLUC,KINHTE,NGANHCHON);    
                list.add(it);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    
    public static int tinhToanXacXuat(String tenTruong,String nhomNguoi,String nhan){
        int ss=0;
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(STT)AS SL FROM DATA_TRAINING WHERE  "+tenTruong+" like N'"+nhomNguoi+"%' and NGANHCHON like N'"+nhan+"%'");
            while(rs.next()){
                ss = rs.getInt("SL");  
            }
        } catch (SQLException e) {
            Logger.getLogger(QuanLyData.class.getName()).log(Level.SEVERE, null, e);
        }

        return ss;
    }
    public static int tinhToanSoNhan(String tenNganh){
        int ss=0;
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(STT)AS SL FROM DATA_TRAINING WHERE  NGANHCHON like N'"+tenNganh+"%' ");
            while(rs.next()){
                ss = rs.getInt("SL");  
            }
        } catch (SQLException e) {
            Logger.getLogger(QuanLyData.class.getName()).log(Level.SEVERE, null, e);
        }

        return ss;
    }
    
    public static int tinhTong(){
        int ss=0;
        Connection conn = DBConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(STT)AS SL FROM DATA_TRAINING");
            while(rs.next()){
                ss = rs.getInt("SL");  
            }
        } catch (SQLException e) {
            Logger.getLogger(QuanLyData.class.getName()).log(Level.SEVERE, null, e);
        }
        return ss;
    }
}
