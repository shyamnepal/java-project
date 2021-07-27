/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.impl;

import com.spring.dbconnecion.util;
import com.spring.entity.stentity;
import com.spring.inter.stinterf;
import org.springframework.beans.factory.annotation.Autowired;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author shyam
 */
@Repository("dao")
public class stimpl implements stinterf {
@Autowired
util db;
    @Override
    public boolean register(stentity se) {
        boolean temp=false;
        try {
            PreparedStatement ps=db.ln.prepareStatement("insert into student values(null,?,?,?,?,?,?,?,?)");
            ps.setString(1, se.getName());
            ps.setString(2, se.getAddress());
            ps.setString(3, se.getPhone());
            ps.setString(4, se.getEmail());
            ps.setString(5, se.getUsername());
            ps.setString(6, se.getPassword());
            ps.setString(7, se.getGender());
            ps.setString(8, se.getFaculty());
            int i=ps.executeUpdate();
            if(i>0){
                temp=true;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return temp;
    }

    @Override
    public List<stentity> alldata() {
        List<stentity> getall=new ArrayList<>();
        try {
            PreparedStatement ps=db.ln.prepareStatement("select * from student");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                getall.add(new stentity(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getall;
    }

    @Override
    public boolean delete(int id) {
        boolean temp=false;
        try {
            PreparedStatement ps=db.ln.prepareStatement("delete from student where id=?");
            ps.setInt(1, id);
            int i=ps.executeUpdate();
            if(i>0){
                temp=true;
            }
        } catch (Exception e) {
          e.printStackTrace();
        }
        return temp;
    }

    @Override
    public stentity getById(int id) {
        stentity se=null;
        try {
            PreparedStatement ps=db.ln.prepareStatement("select * from student where id=?");
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                se=new stentity(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       return se;
    }

    @Override
    public boolean update(stentity se) {
        boolean temp=false;
        try {
            PreparedStatement ps=db.ln.prepareStatement("update student set name=?,address=?,phone=?,email=?,username=?,password=?,gender=?,faculty=? where id=?");
            ps.setString(1, se.getName());
            ps.setString(2, se.getAddress());
            ps.setString(3, se.getPhone());
            ps.setString(4, se.getEmail());
            ps.setString(5, se.getUsername());
            ps.setString(6, se.getPassword());
            ps.setString(7, se.getGender());
            ps.setString(8, se.getFaculty());
            ps.setInt(9, se.getId());
            int i=ps.executeUpdate();
            if(i>0){
                temp=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return temp;
    }

   
      
}
