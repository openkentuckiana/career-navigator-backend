/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cfk.careernav.dao.mappers;

import com.cfk.careernav.model.TechTool;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author austynhill
 */
public class ToolMapper implements RowMapper<TechTool>{

    @Override
    public TechTool mapRow(ResultSet rs, int rowNum) throws SQLException {
        // onetsoc_code, t2_type, t2_example, commodity_code, hot_technology
        TechTool t = new TechTool();
            t.setCode(rs.getString("onetsoc_code"));
            t.setType(rs.getString("t2_type"));
            t.setExample(rs.getString("t2_example"));
            t.setCommodityCode(rs.getString("commodity_code"));
            t.setHotTech(rs.getBoolean("hot_technology"));
        return t;
    }
    
}
