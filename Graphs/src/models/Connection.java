/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.awt.Point;
import java.awt.Rectangle;

/**
 *
 * @author rick
 */
public class Connection 
{

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTORES">
    public Connection(Node start_point, Node end_point)
    {
        this.start_point = start_point;
        this.end_point = end_point;
        this.graph=(start_point.getGraph());
    }

    public Connection(Node start_point, Node end_point, int weight, String name)
    {
        this(start_point,end_point);
        this.weight = weight;
        this.name = name;
    }

    public Connection(Node start_point, Node end_point, Point start_graphic, Point end_graphic)
    {
        this(start_point,end_point);
        this.start_graphic = start_graphic;
        this.end_graphic = end_graphic;
    }

    public Connection(Node start_point, Node end_point, int weight, String name, Point start_graphic, Point end_graphic)
    {
        this(start_point,end_point,weight,name);
        this.start_graphic = start_graphic;
        this.end_graphic = end_graphic;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="ATRBUTOS">
    private Node    start_point,    //Nodo punto de salida
                    end_point;      //Nodo punto de llegada
    private int weight;             //peso o valor de la arista
    private String  name;           //en caso de nesesitar un identificador
    private DiGraph graph;
    private Point   start_graphic,
                    end_graphic;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GT & ST">
    public Node getStart_point()
    {
        return start_point;
    }

    public void setStart_point(Node start_point)
    {
        this.start_point = start_point;
    }

    public Node getEnd_point()
    {
        return end_point;
    }

    public void setEnd_point(Node end_point)
    {
        this.end_point = end_point;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public DiGraph getGraph()
    {
        return graph;
    }

    public void setGraph(DiGraph graph)
    {
        this.graph = graph;
    }
    
    public Point getStart_graphic()
    {
        return start_graphic;
    }

    public void setStart_graphic(Point start_graphic)
    {
        this.start_graphic = start_graphic;
    }

    public Point getEnd_graphic()
    {
        return end_graphic;
    }

    public void setEnd_graphic(Point end_graphic)
    {
        this.end_graphic = end_graphic;
    }

    //</editor-fold>

    
}
