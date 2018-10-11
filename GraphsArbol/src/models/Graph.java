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
    
    
    public Connection getMenorArco(ArrayList<Connection> ar)
    {
        Connection menor = new Connection(9999999);
        int i=0;
        
        for (Connection a : ar)
        {
            if (a.getWeight()<menor.getWeight())
            {
                menor = a;
                i= ar.indexOf(menor);
            }
        }
        return ar.remove(i);
    }
    
    public ArrayList<Connection> kruskal()
    {
        visitados();
        ArrayList<Connection> cola = (ArrayList<Connection>)connections.clone();
        ArrayList<Connection> t = new ArrayList<>();
        Connection temp;
        expansion=0;
        int n = nodes.size();
        
        while(t.size()<n && !cola.isEmpty())
        {
            temp = getMenorArco(cola);
            
                if(!genera_ciclos(temp)) 
                {
                    t.add(temp);
                    expansion+=temp.getWeight();
                    temp.getStart_point().visitado=true;
                    temp.getEnd_point().visitado=true;
                }
            
        }
        return t;
    }
    
    private boolean genera_ciclos(Connection a)
    {
        return a.getStart_point().visitado&&a.getEnd_point().visitado;
    }
    
    public void visitados()
    {
        nodes.forEach((node) ->
        {
            ((Node)node).visitado=false;
        });
    }
    
    public ArrayList<Connection> prim(Node v)
    {
        
        visitados();
        ArrayList<Connection> cola = new ArrayList<>();
        ArrayList<Connection> t = new ArrayList<>();
        Connection temp;
        expansion=0;
        int n = nodes.size();
        
        t.add(getMenorArco(cola));
        expansion+=t.get(0).getWeight();
        
        while(t.size()<n && !cola.isEmpty())
        {
            temp = getMenorArco(cola);
            
                if(!genera_ciclos(temp)) 
                {
                    t.add(temp);
                    expansion+=temp.getWeight();
                    t.add(getMenorArco(temp.getEnd_point().getConnections()));
                    temp.getEnd_point().visitado=true;
                    temp.getStart_point().visitado=true;
                    expansion+=temp.getWeight();
                }
        }
        return t;
    }
    
    public int expansion;
}
