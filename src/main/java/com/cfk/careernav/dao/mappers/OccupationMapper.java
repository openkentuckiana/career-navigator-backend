/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cfk.careernav.dao.mappers;

import com.cfk.careernav.model.Occupation;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author LilacLlama
 */
public class OccupationMapper implements RowMapper<Occupation>{
    
    @Override
    public Occupation mapRow(ResultSet rs, int rowNum) throws SQLException {
        
        // onetsoc_code, title, description
        Occupation o = new Occupation();
            o.setCode(rs.getString("onetsoc_code"));
            o.setTitle(rs.getString("title"));
            o.setDescription(rs.getString("description"));
        return o;
    }
    
}
