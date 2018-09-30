/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author rick
 */
public class GraphicInput extends javax.swing.JPanel
{

    /**
     * Creates new form GraphicInput
     */
    public GraphicInput()
    {
        initComponents();
        label_fondo_mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/seleccion_mapa.jpg")));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        label_fondo_mapa = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(650, 615));
        addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                formMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_fondo_mapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_fondo_mapa, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_formMouseClicked
    {//GEN-HEADEREND:event_formMouseClicked
        drawPoint(this.getGraphics(),evt.getPoint());
    }//GEN-LAST:event_formMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_formMousePressed
    {//GEN-HEADEREND:event_formMousePressed
        
    }//GEN-LAST:event_formMousePressed

    private void drawPoint(Graphics g,Point p)
    {
        g.setColor(Color.red);
        //g.fillOval(p.x-point_diameter/2, p.y-point_diameter/2, point_diameter, point_diameter);
        g.fillOval(p.x, p.y, point_diameter, point_diameter);
    }
    
    
    public static int point_diameter=20;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_fondo_mapa;
    // End of variables declaration//GEN-END:variables
}
