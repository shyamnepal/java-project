/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.dbconnecion;

import java.sql.Connection;
import java.sql.DriverManager;
import org.springframework.stereotype.Repository;

/**
 *
 * @author shyam
 */
@Repository("db")
public class util {
     public Connection ln=null;
    public util(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            ln=DriverManager.getConnection("jdbc:mysql://localhost:3306/spring","root","");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    
}
