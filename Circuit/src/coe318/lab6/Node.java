/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coe318.lab6;

/**
 *
 * @author kevin
 */
public class Node {
    private int node;
    private static int count = 0; 
    
    // Contructor
    public Node(){
       this.node = count;
       count++;
    }
    
 
    @Override
    public String toString(){
        
        return("" + this.node);
    }
    
} 

