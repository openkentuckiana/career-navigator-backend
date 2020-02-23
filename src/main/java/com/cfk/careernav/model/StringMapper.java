/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cfk.careernav.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author LilacLlama
 */
public class StringMapper implements RowMapper<String>{
    
    private String colName;
    
    public StringMapper(){}
    
    public StringMapper(String colName){
        this.colName = colName;
    }

    @Override
    public String mapRow(ResultSet rs, int rowNum) throws SQLException {
        if(colName != null){
            return rs.getString(colName);
        }else{
            return rs.getString(1);
        }
    }
    
}
