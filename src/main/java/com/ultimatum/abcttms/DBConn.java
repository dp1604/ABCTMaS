/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ultimatum.abcttms;

import java.sql.*;

/**
 *
 * @author dinithagamage
 */
public class DBConn {
    public Connection connect(){
        Connection con;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:8889/abcttms","root","root");
            return con;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    public void executeINSERT(String table, String[] values){
    }
    
    public void executeUpdate(String table, String pk, String pkVal, String[] values){
    }
    
    public void executeDelete(String table, String pk, String pkVal){
    }
    
    public ResultSet executeReadRow(String table, String pk, String pkVal){
        try{
            Connection con = connect();
            Statement stmt = con.createStatement();
            String queryString = "SELECT * FROM " + table + " WHERE " + pk + " = '" + pkVal + "'";
            ResultSet rs = stmt.executeQuery(queryString);
            con.close();
            return rs;
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public ResultSet executeReadAll(String table){
        try{
            Connection con = connect();
            Statement stmt = con.createStatement();
            String queryString = "SELECT * FROM " + table + "";
            ResultSet rs = stmt.executeQuery(queryString);
            con.close();
            return rs;
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
