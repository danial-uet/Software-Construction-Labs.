/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.university.lab.specificationlab;
import SpecsAndContracts.ArraySearcher;
/**
 *
 * @author Wholly Solly Store
 */
public class SpecificationLab {

    public static void main(String[] args) {
         int[] Numbers = {1,2,3,4,5};  
         int val = 3;
        System.out.println("Value: " + ArraySearcher.findExactlyOne(Numbers, val));
   
    }
}