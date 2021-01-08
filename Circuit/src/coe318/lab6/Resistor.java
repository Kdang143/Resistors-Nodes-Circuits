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
public class Resistor {
     public double resistance;
    public Node node1, node2;
    public int res;
    private static int count = 1;
    
    
    public Resistor(double resistance, Node node1, Node node2){
        
        
        
        if(resistance < 0){
            throw new IllegalArgumentException("Resitances cannot be negative.");}
        
        if(node1 == null || node2 == null){
            throw new IllegalArgumentException("The connecting nodes must both exist. (Null Error)");}
        
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.res = count; 
        count++; 
    }
    
    
    
    public Node[] getNodes(){
        Node[] nodes = {node1, node2};
        return nodes;
    }
    
   
    @Override
    public String toString(){
        return("R"+res + " " + node1 + " " + node2 + " " + resistance);
    }
}
