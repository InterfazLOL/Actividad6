package client.components.barraNavegacion;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import services.ObjGraficosService;
import services.RecursosService;

public class BarraSuperiorTemplate extends JPanel{

    private BarraSuperiorComponent barraSuperiorComponent;
    // Declaracion de servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    private JButton bInicio, bPerfil, bColeccion, bTFT, bClash, bTienda, bBotin;

    public BarraSuperiorTemplate(BarraSuperiorComponent barraSuperiorComponent){
        this.barraSuperiorComponent = barraSuperiorComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        crearJLabels();
        crearJButtons();

        this.setSize(1055, 80);
        this.setLayout(null);
        this.setBackground(sRecursos.getColorBtnIngresar());
        this.setVisible(true);
    }

    private void crearJLabels(){

    }

    private void crearJButtons(){
        bInicio = sObjGraficos.crearJButton("INICIO", 220, 0, 80, 80, null, null, null, null, Color.WHITE, null, 
            "c", false, false);
        bInicio.addActionListener(barraSuperiorComponent);
        this.add(bInicio);
        bPerfil = sObjGraficos.crearJButton("PERFIL", 300, 0, 80, 80, null, null, null, null, null, null, "c", 
            false, false);
        bPerfil.addActionListener(barraSuperiorComponent);
        this.add(bPerfil);
        bColeccion = sObjGraficos.crearJButton("COLECCION", 380, 0, 80, 80, null, null, null, null, null, null, "c", 
            false, false);
        bColeccion.addActionListener(barraSuperiorComponent);
        this.add(bColeccion);
        bTFT = sObjGraficos.crearJButton("TFT", 460, 0, 80, 80, null, null, null, null, null, null, "c", 
            false, false);
        bTFT.addActionListener(barraSuperiorComponent);
        this.add(bTFT);
        bClash = sObjGraficos.crearJButton("CLASH", 540, 0, 80, 80, null, null, null, null, null, null, "c", 
            false, false);
        bClash.addActionListener(barraSuperiorComponent);
        this.add(bClash);
    }

    public JButton gBInicio(){
        return bInicio;
    }

}
