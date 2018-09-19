/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author rick
 * @param <T> _ cntent data type (must being comparable)
 */
public class Node <T extends Comparable>
{
    
    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">
    private T data;
    private java.util.ArrayList<Connection> connections;
    //</editor-fold>
}
