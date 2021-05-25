/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learnhow2code.objects;

import com.learnhow2code.interfaces.ProductDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Alem
 */
public class ProductList implements ProductDao {
    
    private final String baseDir;
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public ProductList(String baseDir) {
        this.baseDir = baseDir;
    }

    @Override
    public void getPorduct() {
        logger.info("getting a list of productswith baseDir {} baseDir: " + baseDir);
    }
    
}
