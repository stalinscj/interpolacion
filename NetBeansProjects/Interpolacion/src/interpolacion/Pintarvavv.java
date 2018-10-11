/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interpolacion;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author MANUEL
 */
public class Pintarvavv extends JFrame{

    public Pintarvavv(String titulo,double x,double va,double vv) {
        
        Graficar gra=new Graficar(titulo);
         gra.agregarGraficasvavv( x, va, vv);
         JPanel panel=gra.ObtenerPanelvavv();
         this.setSize(500,500);
         this.add(panel);
         panel.setVisible(true);
         this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
    
}
