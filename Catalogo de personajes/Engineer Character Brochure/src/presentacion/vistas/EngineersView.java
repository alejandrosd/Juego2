/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.vistas;

import presentacion.controladores.EnginnerController;
import presentacion.modelo.Game;

/**
 *
 * @author David Bohorquez
 */
public class EngineersView extends javax.swing.JFrame {
    
    private Game modelo;
    private EnginnerController ctlEnginnerView;
    
    public EngineersView(Game modelo) {
        this.modelo = modelo;
        
        initComponents();
        
        fix();
        asignarListeners();
    }
    
    public void fix() {
        setSize(800,400);
        setLocationRelativeTo(null);
        
        getCtlEnginnerView();
    }
    
    public void asignarListeners() {
        
    }

    public Game getModelo() {
        return modelo;
    }

    public EnginnerController getCtlEnginnerView() {
        return ctlEnginnerView;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
