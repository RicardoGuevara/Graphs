/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author rick
 * @param <T> _ data type for all nodes
 */
public class Graph <T extends Comparable> extends DiGraph
{

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTORES">
    public Graph(){super();} 

    public Graph(ArrayList nodes, ArrayList connections) {super(nodes, connections);}
    
    public Graph(Node... n){super(n);}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="DEFAULT METHODS">
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return new Graph((ArrayList)(this.nodes.clone()),(ArrayList)(this.connections.clone()));
    }
    
    //</editor-fold>
    
    
    
}
