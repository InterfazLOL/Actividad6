package client.components.coleccion;

import java.awt.Color;

import javax.swing.JPanel;

import services.ObjGraficosService;
import services.RecursosService;

public class ColeccionTemplate extends JPanel {

    private ColeccionComponent coleccionComponent;

    // Declaracion de servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    public ColeccionTemplate(ColeccionComponent coleccionComponent){

        this.coleccionComponent = coleccionComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        this.setBounds(0, 0, 1055, 638);
        this.setLayout(null);
        this.setBackground(Color.CYAN);
    }
    
}