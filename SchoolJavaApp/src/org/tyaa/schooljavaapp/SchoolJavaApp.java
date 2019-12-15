/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.schooljavaapp;

import org.tyaa.schooljavaapp.entity.Dept;

/**
 *
 * @author student
 */
public class SchoolJavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        Dept d1 = new Dept();
        //System.out.println(d1.id + " " + d1.name);
        //d1.id = 10;
        // sales
        //d1.name = "sales";
        //System.out.println(d1.id + " " + d1.name);
        // Integer i1 = 10;
        
        System.out.println(d1.getId() + " " + d1.name);
        d1.setId(10);
        //d1.setId(-10);
        System.out.println(d1.getId() + " " + d1.name);
    }
    
}
