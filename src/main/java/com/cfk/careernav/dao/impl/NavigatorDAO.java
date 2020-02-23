/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cfk.careernav.dao.impl;

import com.cfk.careernav.dao.mappers.*;
import com.cfk.careernav.model.Occupation;
import com.cfk.careernav.model.StringMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LilacLlama
 */

@Repository
public class NavigatorDAO{
    
    @Autowired
    private JdbcTemplate heySQL;

    public Occupation getOccupation(String onetCode) {
        Occupation o = heySQL.queryForObject("SELECT * FROM occupation_data WHERE onetsoc_code = ?", new OccupationMapper(), onetCode);
        if(o != null){
            o.setAlternateTitles(heySQL.query("SELECT * FROM alternate_titles WHERE onetsoc_code = ?", new StringMapper()));
        }
        return o;
    }

    public List<Occupation> getAllOccupations() {
        return heySQL.query("SELECT * FROM occupation_data", new OccupationMapper());
    }
    
}
