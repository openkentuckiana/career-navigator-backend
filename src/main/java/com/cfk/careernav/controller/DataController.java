package com.cfk.careernav.controller;
import com.cfk.careernav.dao.impl.NavigatorDAO;
import com.cfk.careernav.model.Occupation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author austynhill
 */
@RestController
public class DataController {
    
    @Autowired
    private NavigatorDAO dataLayer;
    
    @GetMapping("/occupation/all")
    public List<Occupation> getOccupations(){
        return dataLayer.getAllOccupations();
    }
    
}
