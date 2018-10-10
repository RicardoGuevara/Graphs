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
public class DiGraph <T extends Comparable>
{
    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTORES">
    public DiGraph(ArrayList<Node<T>> nodes, ArrayList<Connection> connections) 
    {
        this.nodes = nodes;
        this.connections = connections;
    }

    public DiGraph() 
    {
        nodes = new ArrayList<>();
        connections = new ArrayList();
    }
    
    public DiGraph(Node... n)
    {
        nodes = new ArrayList<>();
        connections = new ArrayList();
        for (Node node : n) 
        {
            nodes.add(node);
        }
    }
    
    //</editor-fold>´
    
    //<editor-fold defaultstate="collapsed" desc="DEFAULT METHODS">

    @Override
    public String toString()
    {
        return "___________________________\nGrafo:\ndata type: "
                +this.getClass().getCanonicalName()+"\nNodes: "
                +this.nodes+"\nConnections: "
                +this.connections
                +"\n___________________________\n";
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return new DiGraph((ArrayList)(this.nodes.clone()),(ArrayList)(this.connections.clone()));
    }
    
    //</editor-fold>
    
    public void add(Node<T>... n)
    {
    for (Node node : n) {
    this.nodes.add(node);
    node.setGraph(this);
    }
    }
    
    public void add(Connection... c)
    {
        for (Connection connection : c) {
            this.connections.add(connection);
            connection.getStart_point().getConnections().add(c);
            connection.getEnd_point().getConnections().add(c);
            connection.setGraph(this);
        }
    }
    
    public Node<T> getNodeAt(java.awt.Point p)
    {
        for (Node<T> node : nodes)
        {
            if(node.getSpace().contains(p)) return node;
        }
        return null;
    }
    
    public Node<T> searchNode(int id)
    {
        for (Node<T> node : nodes)
        {
            if(node.id == id) return node;
        }
        return null;
    }
    
    public void del(Node<T> node)
    {
        this.nodes.remove(node);
        /*ArrayList<Connection> c = node.getConnections();
        c.forEach((connection) ->
        {
        this.connections.remove(connection);
        });*/
        ArrayList<Connection> con = new ArrayList<>();
        for (Connection connection : connections)
        {
            if(connection.getStart_point().equals(node)||connection.getEnd_point().equals(node)) con.add(connection);
        }
        connections.removeAll(con);
        System.out.println(this);
    }
    
    //<editor-fold defaultstate="collapsed" desc="ATRBUTOS">
    protected java.util.ArrayList<Node<T>> nodes;
    protected java.util.ArrayList<Connection> connections;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GT & ST">
    public ArrayList<Node<T>> getNodes() {
        return nodes;
    }

    public void setNodes(ArrayList<Node<T>> nodes) {
        this.nodes = nodes;
    }

    public ArrayList<Connection> getConnections() {
        return connections;
    }

    public void setConnections(ArrayList<Connection> connections) {
        this.connections = connections;
    }
    //</editor-fold>    
}
