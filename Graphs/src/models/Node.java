/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

/**
 *
 * @author rick
 * @param <T> _ cntent data type (must being comparable)
 */
public class Node <T extends Comparable>
{

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTORES">
    public Node(T data)
    {
        this.data = data;
        this.id= actid;
        actid++;
        connections = new ArrayList<Connection>();
    }

    public Node(T data, Point location, Rectangle space)
    {
        this(data);
        this.location = location;
        this.space = space;
    }
    
    public Node(Point location, T data)
    {
        this(data,graphs.Graphs.grafo,location,new Rectangle(location.x,location.y,diameter,diameter));
    }

    public Node(T data, DiGraph graph, Point location, Rectangle space)
    {
        this(data,location,space);
        this.graph = graph;
        //graph.add(this);
    }

    public Node(T data, DiGraph graph, ArrayList<Connection> connections, Point location, Rectangle space)
    {
        this.data = data;
        this.graph = graph;
        this.connections = connections;
        this.location = location;
        this.space = space;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="DEFAULT METHODS">
    
    @Override
    public boolean equals(Object ob)
    {
        if(!(ob instanceof Node)) return false;
        return this.id == ((Node)ob).id;
    }
    
    @Override
    public String toString()
    {
        return this.data+" "+this.id;
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">
    private T data;
    private DiGraph graph;
    private java.util.ArrayList<Connection> connections;
    private Point location;
    private Rectangle space;
    public int id;
    private static int actid = 0;
    public static int diameter = 50;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GT & ST">
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ArrayList<Connection> getConnections() {
        return connections;
    }

    public void setConnections(ArrayList<Connection> connections) {
        this.connections = connections;
    }
    
    public DiGraph getGraph()
    {
        return graph;
    }

    public void setGraph(DiGraph graph)
    {
        this.graph = graph;
    }
    
    public Point getLocation()
    {
        return location;
    }

    public void setLocation(Point location)
    {
        this.location = location;
    }

    public Rectangle getSpace()
    {
        return space;
    }

    public void setSpace(Rectangle space)
    {
        this.space = space;
    }
    
    public Point getCenter()
    {
        return new Point(this.location.x+diameter/2,this.location.y+diameter/2);
    }
    
    //</editor-fold>

    
}
