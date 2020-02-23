package com.cfk.careernav.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author austynhill
 */
@Data @NoArgsConstructor
public class Occupation {
    
    private String code;
    private String title;
    private String description;
    private List<String> alternateTitles = new ArrayList<>();
    
}
