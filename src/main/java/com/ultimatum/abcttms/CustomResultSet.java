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
public class CustomResultSet {
    ResultSet rs;
    
    public CustomResultSet(ResultSet res){
        rs = res;
    }
    
    public ResultSet getResultSet(){
        return rs;
    }
    
    public void setResultSet(ResultSet res){
        rs = res;
    }
}
