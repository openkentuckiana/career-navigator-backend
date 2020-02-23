/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cfk.careernav.dao.impl;

import com.cfk.careernav.dao.mappers.*;
import com.cfk.careernav.model.Occupation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author austynhill
 */

@Repository
public class NavigatorDAO{
    
    @Autowired
    private JdbcTemplate heySQL;

    public Occupation getOccupation(String onetCode) {
        return heySQL.queryForObject("SELECT * FROM occupation_data WHERE onetsoc_code = ?", new OccupationMapper(), onetCode);
    }

    public List<Occupation> getAllOccupations() {
        return heySQL.query("SELECT * FROM occupation_data", new OccupationMapper());
    }
    
}
