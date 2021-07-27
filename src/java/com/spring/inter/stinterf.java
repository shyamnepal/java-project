/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.inter;

import com.spring.entity.stentity;
import java.util.List;

/**
 *
 * @author shyam
 */
public interface stinterf {
    public boolean register(stentity se);
     public List<stentity> alldata();
     public boolean delete(int id);
     public stentity getById(int id);
     public boolean update(stentity se);
     
    
    
}
