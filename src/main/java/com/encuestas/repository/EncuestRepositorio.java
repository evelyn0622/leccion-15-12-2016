/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encuestas.repository;

import com.encuestas.domain.Producto;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author W ANDRADE M
 */
public interface EncuestRepositorio  extends CrudRepository<Producto, Integer>{
    
    
}
