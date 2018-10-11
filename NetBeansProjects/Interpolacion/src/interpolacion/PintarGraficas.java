package interpolacion;


import interpolacion.Graficar;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MANUEL
 */
public class PintarGraficas extends JFrame{

    public PintarGraficas(String funcion,String titulo,ArrayList<Double> x,ArrayList<Double> y) {
        
        Graficar gra=new Graficar(titulo);
         gra.agregarGraficasF(funcion, x, y);
         JPanel panel=gra.ObtenerPanelF();
         this.setSize(500,500);
         this.add(panel);
         panel.setVisible(true);
         this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
}
