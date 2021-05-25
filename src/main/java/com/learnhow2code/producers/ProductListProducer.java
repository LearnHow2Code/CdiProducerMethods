/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learnhow2code.producers;

import com.learnhow2code.interfaces.ProductDao;
import com.learnhow2code.objects.ProductList;
import javax.enterprise.context.ApplicationScoped;

import javax.enterprise.inject.Produces;
//import javax.ws.rs.Produces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Alem
 */

public class ProductListProducer {
    
    private final Logger logger = LoggerFactory.getLogger(getClass());

    
    @Produces
//    @ApplicationScoped
    
    public ProductDao createProductList(){
        
       logger.info("---Creating a product List");
       return new ProductList("/fileDirectory");
    }   
}
