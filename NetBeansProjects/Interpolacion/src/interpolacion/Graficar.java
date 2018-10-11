/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interpolacion;

import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author MANUEL
 */
public class Graficar {
    JFreeChart graficafuncion,graficavavv;
    XYSeriesCollection datosfuncion=new XYSeriesCollection();
    XYSeriesCollection datosvavv=new XYSeriesCollection();
    public Graficar(String titulo){
          graficafuncion=ChartFactory.createXYLineChart(titulo, "X", "Y", datosfuncion, PlotOrientation.VERTICAL, true, true, true);
          graficavavv=ChartFactory.createScatterPlot(titulo, "X", "Y", datosvavv, PlotOrientation.VERTICAL, true, true, true);
    }


    public void agregarGraficasF(String id,ArrayList<Double> x,ArrayList<Double> y){
        XYSeries s=new XYSeries(id);
        
        for(int i=0;i<x.size();i++){
            s.add(x.get(i),y.get(i));
        }
        datosfuncion.addSeries(s);
    }
    
     public void agregarGraficasvavv(double x,double va,double vv){
        XYSeries p1=new XYSeries("valor aproximado");
        p1.add(x,va);
        datosvavv.addSeries(p1);
        XYSeries p2=new XYSeries("valor verdadero");
        p2.add(x,va);
        datosvavv.addSeries(p2);
    }
    
    public JPanel ObtenerPanelF(){
        return new ChartPanel(graficafuncion);
    }
    
    public JPanel ObtenerPanelvavv(){
        return new ChartPanel(graficavavv);
    }

}
