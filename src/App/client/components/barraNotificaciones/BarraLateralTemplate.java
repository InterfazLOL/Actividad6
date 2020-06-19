package client.components.barraNotificaciones;

import javax.swing.JPanel;

import services.ObjGraficosService;
import services.RecursosService;

public class BarraLateralTemplate extends JPanel{

    private BarraLateralComponent barraLateralComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    public BarraLateralTemplate(BarraLateralComponent barraLateralComponent){
        this.barraLateralComponent = barraLateralComponent;
        sRecursos = RecursosService.getService();
        sObjGraficos = ObjGraficosService.getService();

        this.setSize(223, 730);
        this.setLayout(null);
        this.setVisible(true);
    }

    private void crearJLabels(){

    }

    private void crearJPaneles(){
        
    }
}
